/*
 * Decompiled with CFR 0_132.
 */
import java.io.File;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.logging.Level;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public class Updater {
    public static void main(String[] args) {
        System.out.println("Updater.Updater: d\u00e9but du constructeur");
        int port = 10;
        try {
            File theDir;
            Main.getGlobalPath();
            Main.globalOS = Library.getOS();
            Main.loadMacIcon();
            if (Main.globalOS.contentEquals("windows")) {
                if (Main.globalAppName.contentEquals("IQUALIF 712 White and Yellow")) {
                    port = 45;
                } else if (Main.globalAppName.contentEquals("IQUALIF France White")) {
                    port = 11;
                } else if (Main.globalAppName.contentEquals("IQUALIF France Yellow")) {
                    port = 12;
                } else if (Main.globalAppName.contentEquals("IQUALIF Australia White")) {
                    port = 13;
                } else if (Main.globalAppName.contentEquals("IQUALIF Australia Yellow")) {
                    port = 14;
                } else if (Main.globalAppName.contentEquals("IQUALIF BCoin White and Yellow")) {
                    port = 15;
                } else if (Main.globalAppName.contentEquals("IQUALIF Belgium White")) {
                    port = 16;
                } else if (Main.globalAppName.contentEquals("IQUALIF Belgium Yellow")) {
                    port = 17;
                } else if (Main.globalAppName.contentEquals("IQUALIF Canada White")) {
                    port = 18;
                } else if (Main.globalAppName.contentEquals("IQUALIF Canada Yellow")) {
                    port = 19;
                } else if (Main.globalAppName.contentEquals("IQUALIF Germany White")) {
                    port = 20;
                } else if (Main.globalAppName.contentEquals("IQUALIF Germany Yellow")) {
                    port = 21;
                } else if (Main.globalAppName.contentEquals("IQUALIF Hungary White")) {
                    port = 22;
                } else if (Main.globalAppName.contentEquals("IQUALIF Hungary Yellow")) {
                    port = 23;
                } else if (Main.globalAppName.contentEquals("IQUALIF Italy White")) {
                    port = 24;
                } else if (Main.globalAppName.contentEquals("IQUALIF Italy Yellow")) {
                    port = 25;
                } else if (Main.globalAppName.contentEquals("IQUALIF Kapa White and Yellow")) {
                    port = 26;
                } else if (Main.globalAppName.contentEquals("IQUALIF Luxembourg White")) {
                    port = 27;
                } else if (Main.globalAppName.contentEquals("IQUALIF Luxembourg Yellow")) {
                    port = 28;
                } else if (Main.globalAppName.contentEquals("IQUALIF Morocco White")) {
                    port = 29;
                } else if (Main.globalAppName.contentEquals("IQUALIF Morocco Yellow")) {
                    port = 30;
                } else if (Main.globalAppName.contentEquals("IQUALIF Netherlands White")) {
                    port = 31;
                } else if (Main.globalAppName.contentEquals("IQUALIF Netherlands Yellow")) {
                    port = 32;
                } else if (Main.globalAppName.contentEquals("IQUALIF Portugal White")) {
                    port = 33;
                } else if (Main.globalAppName.contentEquals("IQUALIF Portugal Yellow")) {
                    port = 34;
                } else if (Main.globalAppName.contentEquals("IQUALIF Spain White")) {
                    port = 35;
                } else if (Main.globalAppName.contentEquals("IQUALIF Spain Yellow")) {
                    port = 36;
                } else if (Main.globalAppName.contentEquals("IQUALIF Switzerland White")) {
                    port = 37;
                } else if (Main.globalAppName.contentEquals("IQUALIF Switzerland Yellow")) {
                    port = 38;
                } else if (Main.globalAppName.contentEquals("IQUALIF Tunisia White")) {
                    port = 46;
                } else if (Main.globalAppName.contentEquals("IQUALIF Tunisia Yellow")) {
                    port = 47;
                } else if (Main.globalAppName.contentEquals("IQUALIF United Kingdom White")) {
                    port = 39;
                } else if (Main.globalAppName.contentEquals("IQUALIF United Kingdom Yellow")) {
                    port = 40;
                } else if (Main.globalAppName.contentEquals("IQUALIF United Kingdom YL Yellow")) {
                    port = 44;
                } else if (Main.globalAppName.contentEquals("IQUALIF United States White")) {
                    port = 41;
                } else if (Main.globalAppName.contentEquals("IQUALIF United States Yellow")) {
                    port = 42;
                } else if (Main.globalAppName.contentEquals("IQUALIF Viva White and Yellow")) {
                    port = 43;
                }
                ServerSocket ss = new ServerSocket(port);
                if (ss.getLocalPort() == -1) {
                    System.exit(0);
                }
            }
            if (!(theDir = new File(Main.globalSystemTempPath)).exists() && !theDir.mkdirs()) {
                System.out.println("Impossible de cr\u00e9er le repertoire ou il existe d\u00e9j\u00e0 " + Main.globalSystemTempPath);
            }
            new Log();
            HashMap<String, Object> dialogloadingstatic_t = Library.setDialogLoadingStatic("0");
            JDialog dialog = (JDialog)dialogloadingstatic_t.get("dialog0");
            SwingUtilities.invokeLater(new Runnable(){

                @Override
                public void run() {
                    JDialog.this.setVisible(true);
                }
            });
            Main.update();
            Main.startApp();
            Thread.sleep(3000L);
            SwingUtilities.invokeLater(new Runnable(){

                @Override
                public void run() {
                    JDialog.this.setVisible(false);
                }
            });
        }
        catch (BindException e) {
            System.out.println("An exception was thrown : une autre instance du programme est d\u00e9j\u00e0 lanc\u00e9e ou le port " + port + " est d\u00e9j\u00e0 utilis\u00e9");
            e.printStackTrace();
            Log.log(Level.SEVERE, "An exception was thrown", e);
        }
        catch (Throwable e) {
            e.printStackTrace();
            Log.log(Level.SEVERE, "An exception was thrown", e);
        }
        System.exit(0);
    }

}

