/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.mozilla.universalchardet.CharsetListener
 *  org.mozilla.universalchardet.UniversalDetector
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.mozilla.universalchardet.CharsetListener;
import org.mozilla.universalchardet.UniversalDetector;

public class Library {
    public static void startApplication(String path, String stringclass, Runnable runBeforeStart) throws IOException {
        Log.log(Level.FINEST, "Bibliotheque.restartApplication: start");
        try {
            String cmdJavaPath = Library.getJavaHome();
            final String cmdJavaCmdMac1 = "-Xdock:name=" + Main.globalAppName;
            String cmdJavaCmdMac2 = "-Dprism.order=sw";
            String cmdJavaCmd1 = "-Dfile.encoding=utf-8";
            String cmdJavaCmd2 = "-Djava.net.preferIPv4Stack=true";
            String cmdJavaCmd3 = "-cp";
            final String cmdAppPath = path;
            final String cmdClass = stringclass;
            Runtime.getRuntime().addShutdownHook(new Thread(){

                @Override
                public void run() {
                    try {
                        String OS = Library.getOS();
                        if (OS.contentEquals("mac")) {
                            Object[] stringBuffer = new String[]{String.this, cmdJavaCmdMac1, "-Dprism.order=sw", "-Dfile.encoding=utf-8", "-Djava.net.preferIPv4Stack=true", "-cp", cmdAppPath, cmdClass};
                            Log.log(Level.FINEST, "Bibliotheque.restartApplication: commande finale : " + Arrays.toString(stringBuffer).replace(",", ""));
                            Runtime.getRuntime().exec((String[])stringBuffer);
                        } else {
                            Object[] stringBuffer = new String[]{String.this, "-Dfile.encoding=utf-8", "-Djava.net.preferIPv4Stack=true", "-cp", cmdAppPath, cmdClass};
                            Log.log(Level.FINEST, "Bibliotheque.restartApplication: commande finale : " + Arrays.toString(stringBuffer).replace(",", ""));
                            Runtime.getRuntime().exec((String[])stringBuffer);
                        }
                    }
                    catch (Throwable e) {
                        e.printStackTrace();
                        Log.log(Level.SEVERE, "An exception was thrown", e);
                    }
                }
            });
            if (runBeforeStart != null) {
                runBeforeStart.run();
            }
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
            Log.log(Level.SEVERE, "An exception was thrown", e);
            throw new IOException("Error while trying to restart the application", e);
        }
    }

    public static String getJavaHome() {
        String result;
        block7 : {
            Log.log(Level.FINEST, "Bibliotheque.getJavaHome: start");
            result = "";
            try {
                result = String.valueOf(System.getProperty("java.home")) + File.separator + "bin" + File.separator + "java";
                String OS = Library.getOS();
                String javaVersion = System.getProperty("java.version");
                Log.log(Level.FINEST, "Bibliotheque.getJavaHome: java version +" + javaVersion);
                String cmdJavaHome1 = "/usr/libexec/java_home";
                String cmdJavaHome2 = "-V";
                if (!OS.contentEquals("mac")) break block7;
                Log.log(Level.FINEST, "Bibliotheque.getJavaHome: mac");
                if (!javaVersion.contains("1.6")) break block7;
                Log.log(Level.FINEST, "Bibliotheque.getJavaHome: java 6, trying to find java 7+");
                String[] stringBuffer = new String[]{cmdJavaHome1, cmdJavaHome2};
                List<String> home_t = Library.executeCommand(stringBuffer);
                for (String home : home_t) {
                    if (home.contains("1.9")) {
                        Log.log(Level.FINEST, "Bibliotheque.getJavaHome: java 9 detected");
                        result = String.valueOf(File.separator) + home.substring(home.indexOf("/") + 1) + File.separator + "bin" + File.separator + "java";
                        Log.log(Level.FINEST, "Bibliotheque.getJavaHome: home : " + result);
                    } else if (home.contains("1.8")) {
                        Log.log(Level.FINEST, "Bibliotheque.getJavaHome: java 8 detected");
                        result = String.valueOf(File.separator) + home.substring(home.indexOf("/") + 1) + File.separator + "bin" + File.separator + "java";
                        Log.log(Level.FINEST, "Bibliotheque.getJavaHome: home : " + result);
                    } else {
                        if (!home.contains("1.7")) continue;
                        Log.log(Level.FINEST, "Bibliotheque.getJavaHome: java 7 detected");
                        result = String.valueOf(File.separator) + home.substring(home.indexOf("/") + 1) + File.separator + "bin" + File.separator + "java";
                        Log.log(Level.FINEST, "Bibliotheque.getJavaHome: home : " + result);
                    }
                    break;
                }
            }
            catch (Throwable e) {
                e.printStackTrace();
                Log.log(Level.FINEST, "An exception was thrown", e);
            }
        }
        return result;
    }

    public static List<String> executeCommand(String[] cmd_t) {
        Log.log(Level.FINEST, "Bibliotheque.executeCommand: start");
        ArrayList<String> result_t = new ArrayList<String>();
        try {
            String line;
            Log.log(Level.FINEST, "Bibliotheque.executeCommand: warning, do not use to restart application or system.exit(0) won t work");
            Log.log(Level.FINEST, "Bibliotheque.executeCommand: executing command : " + Arrays.toString(cmd_t).replace(",", ""));
            Process p = Runtime.getRuntime().exec(cmd_t);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            while ((line = reader.readLine()) != null) {
                Log.log(Level.FINEST, "Bibliotheque.executeCommand: result : " + line);
                result_t.add(line);
            }
            while ((line = stdError.readLine()) != null) {
                Log.log(Level.FINEST, "Bibliotheque.executeCommand: error result : " + line);
                result_t.add(line);
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.SEVERE, "An exception was thrown", e);
        }
        return result_t;
    }

    public static void showDialog(String string, String title) {
        System.out.println("Interface.setDialogLicence: start");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JOptionPane.showConfirmDialog(null, string, String.valueOf(Main.globalAppName) + " - " + title, -1);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Object> setDialogLoadingStatic(final String string) {
        Log.log(Level.FINEST, "Interface.setDialogLoadingStatic: method start");
        HashMap<String, Object> result_t = new HashMap<String, Object>();
        try {
            String id = "dialog" + string;
            result_t.put(id, new MyDialog());
            ((JDialog)result_t.get(id)).setIconImage(new ImageIcon(String.valueOf(Main.globalSystemImagePath) + Main.globalAppIcon).getImage());
            ((JDialog)result_t.get(id)).setTitle(String.valueOf(Main.globalAppName) + " - " + "Update");
            ((JDialog)result_t.get(id)).setSize(490, 260);
            ((JDialog)result_t.get(id)).setModal(true);
            id = "panel" + string;
            result_t.put(id, new JPanel());
            String logo = "<html><br><h2>" + Main.globalAppName + "</h2></html>";
            id = "logo" + string;
            result_t.put(id, new JLabel(logo));
            ((JLabel)result_t.get(id)).setIcon(new ImageIcon(String.valueOf(Main.globalSystemImagePath) + "logo.png"));
            String text = "<html><br />English : updating...<br />Fran\u00e7ais : mise \u00e0 jour en cours...<br />Deutsch : aktualisierung...<br />Espa\u00f1ol : actualizaci\u00f3n...<br />Italiano : aggiornamento...<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /></html>";
            id = "text" + string;
            result_t.put(id, new JLabel(text));
            ((JLabel)result_t.get(id)).setIcon(new ImageIcon(String.valueOf(Main.globalSystemImagePath) + "splashscreen.gif"));
            ((JLabel)result_t.get(id)).setHorizontalTextPosition(0);
            JButton component = new JButton();
            ImageIcon buttonicon = new ImageIcon(String.valueOf(Main.globalSystemImagePath) + "splashscreencancel.png");
            component.setIcon(buttonicon);
            component.setPreferredSize(new Dimension(20, 20));
            component.setOpaque(false);
            component.setContentAreaFilled(false);
            component.setBorderPainted(false);
            component.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    Log.log(Level.FINEST, "Interface.setDialogLoadingStatic: cancel button pressed");
                    ((JDialog)HashMap.this.get("dialog" + string)).dispose();
                    System.exit(0);
                }
            });
            id = "button" + string;
            result_t.put(id, component);
            result_t.put("buttontext" + string, "ok");
            ((JPanel)result_t.get("panel" + string)).add((JLabel)result_t.get("logo" + string));
            ((JPanel)result_t.get("panel" + string)).add((JLabel)result_t.get("text" + string));
            ((JPanel)result_t.get("panel" + string)).add((JButton)result_t.get("button" + string));
            ((JDialog)result_t.get("dialog" + string)).add((JPanel)result_t.get("panel" + string));
            ((JDialog)result_t.get("dialog" + string)).setLocationRelativeTo(null);
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result_t;
    }

    public static String getOS() {
        System.out.println("Bibliotheque.getOS: start");
        String result = "unknown OS";
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.indexOf("win") >= 0) {
                System.out.println("This is Windows");
                result = "windows";
            } else if (os.indexOf("mac") >= 0) {
                System.out.println("This is Mac");
                result = "mac";
            } else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") >= 0) {
                System.out.println("This is Unix or Linux");
                result = "linux";
            } else if (os.indexOf("sunos") >= 0) {
                System.out.println("This is Solaris");
            } else {
                System.out.println("Your OS is not support!!");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean copyFileFromURL(String srcurl, String destpath) {
        Log.log(Level.FINEST, "Bibliotheque.copyFileFromURL: start");
        boolean result = false;
        try {
            Log.log(Level.FINEST, "Bibliotheque.copyFileFromURL: copie de " + srcurl + " vers " + destpath);
            URL website = new URL(srcurl);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(destpath);
            fos.getChannel().transferFrom(rbc, 0L, Long.MAX_VALUE);
            fos.close();
            result = true;
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result;
    }

    public static boolean copyFile(File src, File dest) {
        Log.log(Level.FINEST, "Bibliotheque.copyFile: start");
        boolean result = false;
        try {
            int length;
            FileInputStream in = new FileInputStream(src);
            FileOutputStream out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            Log.log(Level.FINEST, "Bibliotheque.copyFile: file copied from " + src + " to " + dest);
            result = true;
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result;
    }

    public static boolean DeleteFile(String path) {
        Log.log(Level.FINEST, "Bibliotheque.DeleteFile: start");
        boolean result = false;
        try {
            File fileDelete = new File(path);
            if (fileDelete.delete()) {
                Log.log(Level.FINEST, "Bibliotheque.DeleteFile: " + fileDelete.getName() + " is deleted!");
                result = true;
            } else {
                Log.log(Level.FINEST, "Bibliotheque.DeleteFile: impossible de supprimer le fichier " + fileDelete.getAbsolutePath());
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result;
    }

    public static List<String> fileRead(File file) {
        Log.log(Level.FINEST, "Bibliotheque.fileRead: start");
        ArrayList<String> result_t = new ArrayList<String>();
        try {
            String strLine;
            String encoding = Library.getEncodind(file);
            if (encoding.contentEquals("")) {
                Log.log(Level.FINEST, "Bibliotheque.fileInsert: no encoding detected");
                return result_t;
            }
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), encoding));
            while ((strLine = in.readLine()) != null) {
                result_t.add(strLine);
            }
            in.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        Log.log(Level.FINEST, "Bibliotheque.fileInsert: chemin du fichier " + file.getAbsolutePath());
        return result_t;
    }

    public static String getEncodind(File file) {
        Log.log(Level.FINEST, "Bibliotheque.getEncodind: start");
        String encoding = "UTF-8";
        try {
            int nread;
            String DEFAULT_ENCODING = "UTF-8";
            byte[] buf = new byte[4096];
            FileInputStream fis = new FileInputStream(file);
            UniversalDetector detector = new UniversalDetector(null);
            while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
                detector.handleData(buf, 0, nread);
            }
            detector.dataEnd();
            encoding = detector.getDetectedCharset();
            if (encoding != null) {
                Log.log(Level.FINEST, "Bibliotheque.getEncodind: detected encoding : " + encoding);
            } else {
                Log.log(Level.FINEST, "Bibliotheque.getEncodind: no encoding detected");
                encoding = DEFAULT_ENCODING;
            }
            detector.reset();
            fis.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return encoding;
    }

    public static void makeDir(String path) {
        Log.log(Level.FINEST, "Bibliotheque.makeDir: start");
        try {
            File theDir = new File(path);
            if (!theDir.exists()) {
                if (!theDir.mkdirs()) {
                    Log.log(Level.FINEST, "Impossible de cr\u00e9er le repertoire ou il existe d\u00e9j\u00e0 " + path);
                } else {
                    Log.log(Level.FINEST, "Bibliotheque.makeDir: DIR created");
                }
            } else {
                Log.log(Level.FINEST, "Bibliotheque.makeDir: le repertoire existe d\u00e9j\u00e0 " + path);
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
    }

    public static boolean DeleteDirectory(File file) {
        Log.log(Level.FINEST, "Bibliotheque.DeleteDirectory: start");
        boolean result = true;
        try {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    file.delete();
                    Log.log(Level.FINEST, "Bibliotheque.DeleteDirectory: directory is deleted : " + file.getAbsolutePath());
                } else {
                    String[] files;
                    String[] arrstring = files = file.list();
                    int n = arrstring.length;
                    int n2 = 0;
                    while (n2 < n) {
                        String temp = arrstring[n2];
                        File fileDelete = new File(file, temp);
                        Library.DeleteDirectory(fileDelete);
                        ++n2;
                    }
                    if (file.list().length == 0) {
                        file.delete();
                        Log.log(Level.FINEST, "Bibliotheque.DeleteDirectory:  directory is deleted : " + file.getAbsolutePath());
                    }
                }
            } else {
                file.delete();
                Log.log(Level.FINEST, "Bibliotheque.DeleteDirectory: file is deleted : " + file.getAbsolutePath());
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result;
    }

    public static boolean copyFolder(File src, File dest) {
        Log.log(Level.FINEST, "Bibliotheque.copyFolder: start");
        boolean result = false;
        try {
            if (src.isDirectory()) {
                String[] files;
                if (!dest.exists()) {
                    dest.mkdir();
                    Log.log(Level.FINEST, "Bibliotheque.copyFolder: directory copied from " + src + "  to " + dest);
                }
                String[] arrstring = files = src.list();
                int n = arrstring.length;
                int n2 = 0;
                while (n2 < n) {
                    String file = arrstring[n2];
                    File srcFile = new File(src, file);
                    File destFile = new File(dest, file);
                    result = Library.copyFolder(srcFile, destFile);
                    ++n2;
                }
            } else {
                int length;
                FileInputStream in = new FileInputStream(src);
                FileOutputStream out = new FileOutputStream(dest);
                byte[] buffer = new byte[1024];
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                in.close();
                out.close();
                Log.log(Level.FINEST, "Bibliotheque.copyFolder: file copied from " + src + " to " + dest);
                result = true;
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result;
    }

    public static boolean file_write_new(String path, String string, String encoding) {
        Log.log(Level.FINEST, "Bibliotheque.file_write_new: start");
        boolean result = false;
        Log.log(Level.FINEST, "Bibliotheque.file_write_new: debut de la methode, chemin " + path);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(path));
            out.write(string);
            out.close();
            result = true;
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result;
    }

}

