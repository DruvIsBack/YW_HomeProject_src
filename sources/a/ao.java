/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ao
implements ActionListener {
    private /* synthetic */ GUI c;
    private final /* synthetic */ String[] b;
    private final /* synthetic */ String[] c;
    private final /* synthetic */ String[] d;
    private final /* synthetic */ JDialog c;

    ao(GUI gUI, String[] arrstring, String[] arrstring2, String[] arrstring3, JDialog jDialog) {
        this.c = gUI;
        this.b = arrstring;
        this.c = arrstring2;
        this.d = arrstring3;
        this.c = jDialog;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        GUI.a(this.c, this.b, this.c, this.d);
        GUI.a(this.c, "menudialogsettingadvanced").removeAll();
        GUI.b(this.c).remove("menudialogsettingadvanced");
        this.c.dispose();
    }
}

