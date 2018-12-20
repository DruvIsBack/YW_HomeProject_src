/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

final class ah
implements ActionListener {
    private final /* synthetic */ JDialog c;

    ah(GUI gUI, JDialog jDialog) {
        this.c = jDialog;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        this.c.dispose();
    }
}

