/*
 * Decompiled with CFR 0_132.
 */
final class bm
implements Runnable {
    private final /* synthetic */ String aQ;
    private final /* synthetic */ int l;
    private final /* synthetic */ int m;

    bm(String string, int n2, int n3) {
        this.aQ = string;
        this.l = n2;
        this.m = n3;
    }

    @Override
    public final void run() {
        GUI.a().setText("<html>" + this.aQ + aM.G("dlg_man_search_continue8") + this.l + " / " + this.m + "</html>");
    }
}

