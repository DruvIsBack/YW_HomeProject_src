/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JDialog;

final class bj
implements Runnable {
    private final /* synthetic */ JDialog b;

    bj(JDialog jDialog) {
        this.b = jDialog;
    }

    @Override
    public final void run() {
        this.b.dispose();
    }
}

