/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JDialog;

final class az
implements Runnable {
    private final /* synthetic */ JDialog b;

    az(JDialog jDialog) {
        this.b = jDialog;
    }

    @Override
    public final void run() {
        this.b.setVisible(true);
    }
}

