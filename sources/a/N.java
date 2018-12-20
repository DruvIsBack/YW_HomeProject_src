/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class N
implements ActionListener {
    private /* synthetic */ GDashboard a;
    private final /* synthetic */ JTextField a;
    private final /* synthetic */ JTextField b;
    private final /* synthetic */ JTextField c;
    private final /* synthetic */ JPanel a;

    N(GDashboard gDashboard, JTextField jTextField, JTextField jTextField2, JTextField jTextField3, JPanel jPanel) {
        this.a = gDashboard;
        this.a = jTextField;
        this.b = jTextField2;
        this.c = jTextField3;
        this.a = jPanel;
    }

    @Override
    public final void actionPerformed(ActionEvent object) {
        object = this.a.getText();
        String string = this.b.getText();
        String string2 = this.c.getText();
        String string3 = aH.D("srv_list");
        if (!string3.contains(String.valueOf(object) + ":" + string)) {
            string3 = string3.length() == 0 ? String.valueOf(object) + ":" + string + ":" + string2 : String.valueOf(string3) + ";" + (String)object + ":" + string + ":" + string2;
        }
        aH.b(GUI.D(), "srv_list", string3);
        this.a.removeAll();
        GDashboard.a(this.a, this.a);
        this.a.revalidate();
    }
}

