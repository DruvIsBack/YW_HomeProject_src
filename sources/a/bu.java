/*
 * Decompiled with CFR 0_132.
 */
public final class bu
extends Enum {
    private static /* enum */ bu a = new bu("1");
    private static /* enum */ bu b = new bu("2");
    private String be;

    static {
        bu[] arrbu = new bu[]{a, b};
    }

    private bu(String string2) {
        this.be = string2;
    }

    public final String aC() {
        return this.be;
    }

    public static bu a(String string) {
        return Enum.valueOf(bu.class, string);
    }
}

