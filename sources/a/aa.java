/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

final class aa
implements ActionListener {
    private final /* synthetic */ JDialog c;

    aa(GFileDialog gFileDialog, JDialog jDialog) {
        this.c = jDialog;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        this.c.dispose();
    }
}

