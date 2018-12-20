/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

final class ai
implements ActionListener {
    private final /* synthetic */ JRadioButton a;
    private final /* synthetic */ JRadioButton b;
    private final /* synthetic */ JTextField d;
    private final /* synthetic */ JTextField e;
    private final /* synthetic */ JTextField f;
    private final /* synthetic */ JTextField g;
    private final /* synthetic */ JTextField h;
    private final /* synthetic */ JDialog c;

    ai(JRadioButton jRadioButton, JRadioButton jRadioButton2, JTextField jTextField, JTextField jTextField2, JTextField jTextField3, JTextField jTextField4, JTextField jTextField5, JDialog jDialog) {
        this.a = jRadioButton;
        this.b = jRadioButton2;
        this.d = jTextField;
        this.e = jTextField2;
        this.f = jTextField3;
        this.g = jTextField4;
        this.h = jTextField5;
        this.c = jDialog;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        try {
            boolean bl2 = false;
            if (this.a.isSelected()) {
                String string = "TRIAL";
                bl2 = GUI.i("TRIAL");
            } else if (this.b.isSelected()) {
                String string = this.d.getText();
                String string2 = this.e.getText();
                String string3 = this.f.getText();
                String string4 = this.g.getText();
                String string5 = this.h.getText();
                if ((string = String.valueOf(string) + "-" + string2 + "-" + string3 + "-" + string4 + "-" + string5).length() == 29) {
                    bl2 = GUI.i(string);
                }
            }
            if (bl2) {
                this.c.dispose();
                return;
            }
        }
        catch (Throwable throwable) {}
    }
}

