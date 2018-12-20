/*
 * Decompiled with CFR 0_132.
 */
final class e
implements Runnable {
    private /* synthetic */ c a;

    e(c c2) {
        this.a = c2;
    }

    @Override
    public final void run() {
        c.a(this.a).setVisible(false);
    }
}

