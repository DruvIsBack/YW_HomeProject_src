/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class U
implements ActionListener {
    private final /* synthetic */ String q;
    private final /* synthetic */ int b;

    U(GDashboard gDashboard, String string, int n2) {
        this.q = string;
        this.b = n2;
    }

    @Override
    public final void actionPerformed(ActionEvent object) {
        object = new V(this, this.q, this.b);
        object = new Thread((Runnable)object);
        object.start();
    }
}

