/*
 * Decompiled with CFR 0_132.
 */
final class bc
implements Runnable {
    private final /* synthetic */ String ax;
    private final /* synthetic */ String ay;
    private final /* synthetic */ String az;

    bc(String string, String string2, String string3) {
        this.ax = string;
        this.ay = string2;
        this.az = string3;
    }

    @Override
    public final void run() {
        String string = "";
        if (this.ax.contentEquals("browser") && GUI.D().contentEquals("IQUALIF Italy Yellow")) {
            string = "function get_custom() {" + this.ay + this.az + this.ay + "}" + this.ay + " var result1 = get_custom();" + this.ay + " return result1; ";
        }
        string = o.d("browser", string);
        o.d(string.toString());
    }
}

