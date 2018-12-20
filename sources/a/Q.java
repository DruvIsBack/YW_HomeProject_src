/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

final class Q
implements ActionListener {
    private final /* synthetic */ String q;
    private final /* synthetic */ int b;

    Q(GDashboard gDashboard, String string, int n2) {
        this.q = string;
        this.b = n2;
    }

    @Override
    public final void actionPerformed(ActionEvent object) {
        SwingUtilities.invokeLater(new R(this));
        object = String.valueOf(this.q.split(":", -1)[2]) + "\u00a4iqstartorpause" + "\u00a4" + this.b;
        object = bi.g((String)object, this.q.split(":", -1)[0], this.q.split(":", -1)[1]);
        bi.b((String)object, this.q);
        SwingUtilities.invokeLater(new S(this));
    }
}

