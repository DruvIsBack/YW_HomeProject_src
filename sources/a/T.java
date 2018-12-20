/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class T
implements ActionListener {
    private /* synthetic */ GDashboard a;
    private final /* synthetic */ String q;
    private final /* synthetic */ JPanel a;

    T(GDashboard gDashboard, String string, JPanel jPanel) {
        this.a = gDashboard;
        this.q = string;
        this.a = jPanel;
    }

    @Override
    public final void actionPerformed(ActionEvent object) {
        object = aH.D("srv_list");
        if ((object = object.replace(";" + this.q, "")).startsWith(String.valueOf(this.q) + ";")) {
            object = object.replace(String.valueOf(this.q) + ";", "");
        } else if (object.contentEquals(this.q)) {
            object = object.replace(this.q, "");
        }
        aH.b(GUI.D(), "srv_list", (String)object);
        this.a.removeAll();
        GDashboard.a(this.a, this.a);
        this.a.revalidate();
    }
}

