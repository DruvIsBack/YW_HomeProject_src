/*
 * Decompiled with CFR 0_132.
 */
final class aG
implements Runnable {
    private /* synthetic */ GUI c;

    aG(GUI gUI) {
        this.c = gUI;
    }

    @Override
    public final void run() {
        ((bo)GUI.a(this.c).get("splashscreen")).close();
    }
}

