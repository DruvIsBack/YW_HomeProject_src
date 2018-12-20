/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class aq
implements ActionListener {
    private /* synthetic */ GUI c;

    aq(GUI gUI) {
        this.c = gUI;
    }

    @Override
    public final void actionPerformed(ActionEvent object) {
        object = aI.c();
        if (object.intValue() == 0) {
            GUI.z("blacklist");
            object = aI.c();
            GUI.a("mailblacklist").setText(aM.G("mailblacklist_btn1"));
            GUI.a("mailblacklist").setText(String.valueOf(aM.G("mailblacklist")) + " " + object);
            return;
        }
        object = aM.G("dlg_blacklist_start").split(";", -1);
        int n2 = GUI.a(object, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
        if (n2 == 0) {
            GUI.z("blacklist");
            Integer n3 = aI.c();
            GUI.a("mailblacklist").setText(String.valueOf(aM.G("mailblacklist")) + " " + n3);
            return;
        }
        if (n2 == 1) {
            GUI.z("blacklistdelete");
            Integer n4 = aI.c();
            if (n4 == 0) {
                GUI.a("mailblacklist").setText(aM.G("mailblacklist_btn"));
                GUI.a("mailblacklist").setText(String.valueOf(aM.G("mailblacklist")) + " " + n4);
                return;
            }
        } else if (n2 == 2) {
            this.c.i("blacklistexport");
        }
    }
}

