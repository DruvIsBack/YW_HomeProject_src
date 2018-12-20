/*
 * Decompiled with CFR 0_132.
 */
final class aY {
    private static String OS = System.getProperty("os.name").toLowerCase();

    static boolean isWindows() {
        return OS.contains("win");
    }

    static boolean isMac() {
        return OS.contains("mac");
    }

    static boolean isUnix() {
        if (!OS.contains("nix") && !OS.contains("nux") && OS.indexOf("aix") <= 0) {
            return false;
        }
        return true;
    }
}

