/*
 * Decompiled with CFR 0_132.
 */
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    public Log() {
        try {
            String path_temp = String.valueOf(Main.globalSystemTempPath) + "updater_%g_%u.txt";
            FileHandler fh = new FileHandler(path_temp, 10485760, 5, true);
            fh.setFormatter(new LogFormatter());
            ConsoleHandler ch = new ConsoleHandler();
            ch.setFormatter(new LogFormatter());
            Logger.global.setUseParentHandlers(false);
            fh.setLevel(Level.ALL);
            ch.setLevel(Level.ALL);
            Logger.global.setLevel(Level.ALL);
            Logger.global.addHandler(fh);
            Logger.global.addHandler(ch);
        }
        catch (Throwable e) {
            Date actuelle = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String dat = dateFormat.format(actuelle);
            System.out.println(String.valueOf(dat) + " # ERROR CustomLogger.CustomLogger: erreur lors de la creation du CustomLogger ");
            e.printStackTrace();
        }
    }

    public static void log(Level log_level, String string) {
        try {
            if (Main.global_log_level.equals(Level.FINEST)) {
                Logger.global.log(log_level, string);
            }
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void log(Level log_level, String string, Throwable e) {
        try {
            if (Main.global_log_level.equals(Level.FINEST)) {
                Logger.global.log(log_level, string, e);
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
}

