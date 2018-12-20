/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ar
implements ActionListener {
    private /* synthetic */ GUI c;
    private final /* synthetic */ String[] b;
    private final /* synthetic */ String[] c;
    private final /* synthetic */ String[] d;

    ar(GUI gUI, String[] arrstring, String[] arrstring2, String[] arrstring3) {
        this.c = gUI;
        this.b = arrstring;
        this.c = arrstring2;
        this.d = arrstring3;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        GUI.b(this.c, this.b, this.c, this.d);
        GUI.g("");
    }
}

