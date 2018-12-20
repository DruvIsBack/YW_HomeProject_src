/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JDialog;

final class ak
implements ActionListener {
    private final /* synthetic */ HashMap t;
    private final /* synthetic */ String S;

    ak(HashMap hashMap, String string) {
        this.t = hashMap;
        this.S = string;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        this.t.put("buttontext" + this.S, "canceled");
        ((JDialog)this.t.get("dialog" + this.S)).dispose();
    }
}

