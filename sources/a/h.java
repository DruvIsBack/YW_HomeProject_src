/*
 * Decompiled with CFR 0_132.
 */
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

public final class h
implements Runnable {
    @Override
    public final void run() {
        try {
            HashMap hashMap = GUI.a("0");
            JDialog jDialog = (JDialog)hashMap.get("dialog0");
            SwingUtilities.invokeLater(new i(this, jDialog));
            boolean bl2 = bi.a("manual", hashMap, (Integer)1);
            GUI.d(aM.G("dlg_stg_proxy_update"), aM.G("dlg_start"));
            SwingUtilities.invokeLater(new j(this, jDialog));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

