/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.SwingUtilities;

final class V
implements Runnable {
    private final /* synthetic */ String q;
    private final /* synthetic */ int b;

    V(U u2, String string, int n2) {
        this.q = string;
        this.b = n2;
    }

    @Override
    public final void run() {
        SwingUtilities.invokeLater(new W(this));
        String string = String.valueOf(this.q.split(":", -1)[2]) + "\u00a4iqstatus" + "\u00a4" + this.b;
        string = bi.g(string, this.q.split(":", -1)[0], this.q.split(":", -1)[1]);
        bi.b(string, this.q);
        SwingUtilities.invokeLater(new X(this));
    }
}

