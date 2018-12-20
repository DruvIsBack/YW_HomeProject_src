/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JScrollPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class at
implements ActionListener {
    private /* synthetic */ GUI c;
    private final /* synthetic */ String[] b;
    private final /* synthetic */ String[] c;
    private final /* synthetic */ String[] d;
    private final /* synthetic */ JScrollPane a;
    private final /* synthetic */ JDialog c;

    at(GUI gUI, String[] arrstring, String[] arrstring2, String[] arrstring3, JScrollPane jScrollPane, JDialog jDialog) {
        this.c = gUI;
        this.b = arrstring;
        this.c = arrstring2;
        this.d = arrstring3;
        this.a = jScrollPane;
        this.c = jDialog;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        GUI.b(this.c, this.b, this.c, this.d);
        GUI.a("mailcontainer16").remove(GUI.a("mailclose"));
        GUI.a("mailcontainer16").invalidate();
        GUI.a("_setting_container_12_0b").remove(GUI.a("mailattachment"));
        GUI.a("_setting_container_12_0b").invalidate();
        GUI.a("_setting_container_13_0b").remove(GUI.a("mailsend"));
        GUI.a("_setting_container_13_0b").invalidate();
        GUI.a("_setting_container_14_0b").remove(GUI.a("mailblacklist"));
        GUI.a("_setting_container_14_0b").invalidate();
        GUI.a("mailcontainer15").remove(this.a);
        GUI.a("mailcontainer15").invalidate();
        this.c.dispose();
    }
}

