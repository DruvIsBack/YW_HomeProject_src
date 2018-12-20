/*
 * Decompiled with CFR 0_132.
 */
import java.util.HashMap;
import javax.swing.JLabel;

final class bk
implements Runnable {
    private final /* synthetic */ HashMap v;

    bk(HashMap hashMap) {
        this.v = hashMap;
    }

    @Override
    public final void run() {
        ((JLabel)this.v.get("text0")).setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step").toLowerCase().trim()) + " 3 / 4<br /><br /></html>");
    }
}

