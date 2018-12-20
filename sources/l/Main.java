/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  com.apple.eawt.Application
 */
import com.apple.eawt.Application;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Level global_log_level = Level.INFO;
    public static String globalAppVersion = "v1.098.97.34";
    public static String globalAppPath;
    public static String globalAppRessourcePath;
    public static String globalAppImagePath;
    public static String globalAppCountryPath;
    public static String globalSystemTempPath;
    public static String globalSystemAppPath;
    public static String globalSystemRessourcePath;
    public static String globalSystemImagePath;
    public static String globalSystemCountryPath;
    public static String globalAppClass;
    public static String globalAppName;
    public static String globalAppJAR;
    public static String globalLaunchJAR;
    public static String globalSystemDir;
    public static String globalAppRequireDir;
    public static String globalRessourceDir;
    public static String globalImageDir;
    public static String globalCountryDir;
    public static String globalOkFileNew;
    public static String globalAppIcon;
    public static String globalOS;
    public static String globalAppNameFile;
    public static String globalGetDownFile;
    public static String globalGetDownFileAdress;

    static {
        globalAppClass = "Main";
        globalAppName = "IQUALIF";
        globalAppJAR = "a.jar";
        globalLaunchJAR = "l.jar";
        globalSystemDir = "Application Data";
        globalAppRequireDir = "a_lib";
        globalRessourceDir = "r";
        globalImageDir = "i";
        globalCountryDir = "c";
        globalOkFileNew = "n1";
        globalAppIcon = "icon.png";
        globalOS = "unknown";
        globalAppNameFile = "a";
        globalGetDownFile = "getdown.txt";
        globalGetDownFileAdress = "http://www.iqualif.com/nojoo/dl/iqualif/";
    }

    public static void main(String[] args) {
        System.out.println("Main.main: start");
        try {
            Main.getGlobalPath();
            globalOS = Library.getOS();
            Main.loadMacIcon();
            globalOS.contentEquals("windows");
            File theDir = new File(globalSystemTempPath);
            if (!theDir.exists() && !theDir.mkdirs()) {
                System.out.println("Main.main : Impossible de cr\u00e9er le repertoire ou il existe d\u00e9j\u00e0 " + globalSystemTempPath);
            }
            new Log();
            Main.iniApp();
            Main.startApp();
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.SEVERE, "An exception was thrown", e);
        }
    }

    public static void iniApp() {
        Log.log(Level.FINEST, "Main.iniApp: start");
        try {
            File file = new File(String.valueOf(globalSystemRessourcePath) + globalOkFileNew);
            if (file.exists()) {
                Log.log(Level.FINEST, "Main.iniApp: l'application a d\u00e9j\u00e0 \u00e9t\u00e9 copi\u00e9e dans le repertoire " + globalSystemRessourcePath);
                return;
            }
            Library.DeleteDirectory(new File(globalSystemAppPath));
            Log.log(Level.FINEST, "Main.iniApp: suppression des anciennes installation et copie de l'application dans le repertoire " + globalSystemRessourcePath);
            String[] path_t = new String[]{globalSystemCountryPath, globalSystemImagePath, String.valueOf(globalSystemAppPath) + globalAppRequireDir};
            int i = 0;
            while (i < path_t.length) {
                Library.makeDir(path_t[i]);
                ++i;
            }
            boolean handle = false;
            String[][] path_t_t = new String[][]{{globalAppRessourcePath, globalSystemRessourcePath}, {String.valueOf(globalAppPath) + globalAppRequireDir, String.valueOf(globalSystemAppPath) + globalAppRequireDir}};
            int i2 = 0;
            while (i2 < path_t_t.length) {
                File srcFolder = new File(path_t_t[i2][0]);
                File destFolder = new File(path_t_t[i2][1]);
                handle = Library.copyFolder(srcFolder, destFolder);
                ++i2;
            }
            Library.copyFile(new File(String.valueOf(globalAppPath) + globalAppJAR), new File(String.valueOf(globalSystemAppPath) + globalAppJAR));
            Library.copyFile(new File(String.valueOf(globalAppPath) + globalLaunchJAR + ".temp"), new File(String.valueOf(globalSystemAppPath) + globalLaunchJAR));
            Library.copyFile(new File(String.valueOf(globalAppPath) + globalGetDownFile), new File(String.valueOf(globalSystemAppPath) + globalGetDownFile));
            Library.copyFile(new File(String.valueOf(globalAppPath) + globalAppNameFile), new File(String.valueOf(globalSystemAppPath) + globalAppNameFile));
            if (handle) {
                Library.file_write_new(String.valueOf(globalSystemRessourcePath) + globalOkFileNew, "", "UTF-8");
                File theDir = new File(globalAppRessourcePath);
                Library.DeleteDirectory(theDir);
                Library.DeleteDirectory(new File(String.valueOf(globalAppPath) + globalAppRequireDir));
                Library.DeleteFile(String.valueOf(globalAppPath) + globalAppJAR);
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
    }

    public static void startApp() {
        Log.log(Level.FINEST, "Main.startApp: start");
        try {
            Library.startApplication(String.valueOf(globalSystemAppPath) + globalAppJAR, globalAppClass, null);
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
    }

    public static boolean loadMacIcon() {
        Log.log(Level.FINEST, "Main.loadMacIcon: start");
        boolean result = false;
        try {
            if (globalOS.contentEquals("mac")) {
                System.out.println("Interface.main: display icon and appname in dock");
                Application application = Application.getApplication();
                Image image = Toolkit.getDefaultToolkit().getImage(String.valueOf(globalSystemImagePath) + globalAppIcon);
                application.setDockIconImage(image);
                System.setProperty("com.apple.mrj.application.apple.menu.about.name", globalAppName);
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
        return result;
    }

    public static String getGlobalPath() {
        System.out.println("Main.getGlobalPath: start");
        String result = "";
        try {
            String path = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            System.out.println("Main.getGlobalPath: racine de l'application avant : " + path);
            result = URLDecoder.decode(path, "UTF-8");
            String os = Library.getOS();
            if (os.contentEquals("windows") && result.startsWith("/")) {
                result = result.substring(1);
            }
            if (result.endsWith(globalLaunchJAR)) {
                result = result.substring(0, result.length() - 5);
            }
            result = result.replace("/", File.separator);
            System.out.println("Main.getGlobalPath: racine de l'application apres : " + result);
            globalAppPath = result;
            globalAppRessourcePath = String.valueOf(globalAppPath) + globalRessourceDir + File.separator;
            globalAppImagePath = String.valueOf(globalAppRessourcePath) + globalImageDir + File.separator;
            globalAppCountryPath = String.valueOf(globalAppRessourcePath) + globalCountryDir + File.separator;
            Main.getGlobalAppName();
            globalSystemTempPath = String.valueOf(System.getProperty("java.io.tmpdir")) + globalSystemDir + File.separator + globalAppName + File.separator;
            globalSystemAppPath = String.valueOf(System.getProperty("user.home")) + File.separator + globalSystemDir + File.separator + globalAppName + File.separator;
            globalSystemRessourcePath = String.valueOf(globalSystemAppPath) + globalRessourceDir + File.separator;
            globalSystemImagePath = String.valueOf(globalSystemRessourcePath) + globalImageDir + File.separator;
            globalSystemCountryPath = String.valueOf(globalSystemRessourcePath) + globalCountryDir + File.separator;
            Log.log(Level.FINEST, "globalAppPath " + globalAppPath);
            Log.log(Level.FINEST, "globalAppRessourcePath " + globalAppRessourcePath);
            Log.log(Level.FINEST, "globalAppImagePath " + globalAppImagePath);
            Log.log(Level.FINEST, "globalAppCountryPath " + globalAppCountryPath);
            Log.log(Level.FINEST, "globalSystemTempPath " + globalSystemTempPath);
            Log.log(Level.FINEST, "globalSystemRessourcePath " + globalSystemRessourcePath);
            Log.log(Level.FINEST, "globalSystemImagePath " + globalSystemImagePath);
            Log.log(Level.FINEST, "globalSystemCountryPath " + globalSystemCountryPath);
        }
        catch (Throwable e) {
            e.printStackTrace();
            System.out.println("An exception was thrown");
        }
        return result;
    }

    public static void getGlobalAppName() {
        System.out.println("Main.getGlobalAppName: start");
        try {
            String pathlocalAppName = String.valueOf(globalAppPath) + globalAppNameFile;
            System.out.println("Main.getGlobalAppName: chemin du fichier pathlocalAppName : " + pathlocalAppName);
            List<String> getdownLocalAppName = Library.fileRead(new File(pathlocalAppName));
            int i = 0;
            while (i < getdownLocalAppName.size()) {
                String line = getdownLocalAppName.get(i);
                if (line.contains("title:")) {
                    System.out.println("Main.getGlobalAppName: titre de la fenete : title: " + globalAppName);
                    Pattern pattern = Pattern.compile("title:(.*)");
                    Matcher matches = pattern.matcher(line);
                    while (matches.find()) {
                        String string;
                        globalAppName = string = matches.group(1);
                        System.out.println("Main.getGlobalAppName: title trouv\u00e9 : " + globalAppName);
                    }
                }
                ++i;
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
            System.out.println("An exception was thrown");
        }
    }

    public static void update() {
        Log.log(Level.FINEST, "Updater.ini: d\u00e9but de la m\u00e9thode");
        try {
            String main = globalGetDownFile;
            String url = globalGetDownFileAdress;
            String pathLocal = String.valueOf(globalSystemAppPath) + main;
            String pathDistant = String.valueOf(globalSystemAppPath) + main + ".temp";
            File fileLocal = new File(pathLocal);
            File fileDistant = new File(pathDistant);
            Library.copyFileFromURL(String.valueOf(url) + main, pathDistant);
            List<String> getdownLocal = Library.fileRead(fileLocal);
            List<String> getdownDistant = Library.fileRead(fileDistant);
            ArrayList<String> fileToUpdate = new ArrayList<String>();
            int i = 0;
            while (i < getdownDistant.size()) {
                String line = getdownDistant.get(i);
                if (i == 0 && !line.startsWith("url:")) {
                    Log.log(Level.FINEST, "Updater.ini: le fichier fileDistant semble corrompu, on interrompt la mise \u00e0 jour, v\u00e9rifier la connexion Internet");
                    System.exit(0);
                }
                if (line.contains("url:")) {
                    System.out.println("Main.getGlobalAppName: url de t\u00e9l\u00e9chargement : url: " + globalGetDownFileAdress);
                    Pattern pattern = Pattern.compile("url:(.*)\u00a4.*");
                    Matcher matches = pattern.matcher(line);
                    while (matches.find()) {
                        String string;
                        globalGetDownFileAdress = string = matches.group(1);
                        System.out.println("Main.getGlobalAppName: url trouv\u00e9e : " + globalGetDownFileAdress);
                    }
                } else if (line.startsWith("file:")) {
                    boolean found = false;
                    int j = 0;
                    while (j < getdownLocal.size()) {
                        if (!found && getdownDistant.get(i).contentEquals(getdownLocal.get(j))) {
                            found = true;
                        }
                        ++j;
                    }
                    if (!found) {
                        String file = line.split("\u00a4")[0];
                        file = file.substring(5);
                        String filePath = file.replace("/", File.separator);
                        Log.log(Level.FINEST, "Updater.ini: telechargmeent du fichier " + file + " chaine " + line);
                        Library.copyFileFromURL(String.valueOf(url) + file, String.valueOf(globalSystemAppPath) + filePath + "_update");
                        fileToUpdate.add(String.valueOf(globalSystemAppPath) + filePath);
                    } else {
                        Log.log(Level.FINEST, "Updater.ini: ne pas le fichier " + line);
                    }
                } else {
                    Log.log(Level.FINEST, "Updater.ini: aucun traitement associ\u00e9 pour " + line);
                }
                ++i;
            }
            i = 0;
            while (i < fileToUpdate.size()) {
                String filepath = (String)fileToUpdate.get(i);
                Library.copyFile(new File(String.valueOf(filepath) + "_update"), new File(filepath));
                ++i;
            }
            Library.copyFile(fileDistant, fileLocal);
            Library.DeleteFile(pathDistant);
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.FINEST, "An exception was thrown", e);
        }
    }
}

