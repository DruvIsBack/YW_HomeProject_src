/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class ap
implements ActionListener {
    ap(GUI gUI) {
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        if (GUI.a("mailattachment").getText().contentEquals(aM.G("mailattachment_del_btn"))) {
            bn.d(GUI.G(), "mailattachment", "empty");
            GUI.a("mailattachment").setText(aM.G("mailattachment_btn"));
            GUI.a("mailattachment").setText(aM.G("mailattachment"));
            return;
        }
        GUI.z("mail");
        if (!bn.Q("mailattachment").contentEquals("empty")) {
            GUI.a("mailattachment").setText(aM.G("mailattachment_del_btn"));
            GUI.a("mailattachment").setText(String.valueOf(aM.G("mailattachment_file")) + bn.Q("mailattachment"));
        }
    }
}

