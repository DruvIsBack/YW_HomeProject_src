/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JDialog;

final class i
implements Runnable {
    private final /* synthetic */ JDialog b;

    i(h h2, JDialog jDialog) {
        this.b = jDialog;
    }

    @Override
    public final void run() {
        this.b.setVisible(true);
    }
}

