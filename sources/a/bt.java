/*
 * Decompiled with CFR 0_132.
 */
public final class bt
extends Enum {
    private static /* enum */ bt a = new bt("1");
    private static /* enum */ bt b = new bt("2");
    private static /* enum */ bt c = new bt("3");
    private static /* enum */ bt d = new bt("4");
    private static /* enum */ bt e = new bt("5");
    private String bd;

    static {
        bt[] arrbt = new bt[]{a, b, c, d, e};
    }

    private bt(String string2) {
        this.bd = string2;
    }

    public final String aB() {
        return this.bd;
    }

    public static bt a(String string) {
        return Enum.valueOf(bt.class, string);
    }
}

