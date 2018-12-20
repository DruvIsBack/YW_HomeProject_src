/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Container;
import java.io.File;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class g
implements Runnable {
    private File file;
    private JDialog a;
    private JLabel a;
    private HashMap a;
    private String type;

    public g(File file, JDialog jDialog, HashMap hashMap, JLabel jLabel, String string) {
        this.file = file;
        this.a = jDialog;
        this.a = jLabel;
        this.a = hashMap;
        this.type = string;
    }

    @Override
    public final void run() {
        try {
            if (this.type.contentEquals("blacklist")) {
                boolean bl2 = aI.a(this.file);
                if (bl2) {
                    GUI.d(aM.G("dlg_stg_ok"), aM.G("dlg_start"));
                } else {
                    GUI.d(aM.G("dlg_stg_ko"), aM.G("dlg_start"));
                }
            } else if (this.type.contentEquals("blacklistdelete")) {
                boolean bl3 = aI.q();
                if (bl3) {
                    GUI.d(aM.G("dlg_stg_ok"), aM.G("dlg_start"));
                } else {
                    GUI.d(aM.G("dlg_stg_ko"), aM.G("dlg_start"));
                }
            } else if (!this.type.contentEquals("blacklistexport")) {
                if (this.type.contentEquals("mail")) {
                    bn.d(GUI.D(), "mailattachment", this.file.getAbsolutePath());
                } else if (this.type.contentEquals("importfilelisttemp")) {
                    String string = ";";
                    bi.c(this.file, string);
                } else {
                    String string = ";";
                    bi.d(this.file, string);
                    this.a.put("id", "filesearch");
                    this.a.setText(aM.G("dlg_man_file_text"));
                    GUI.d(aM.G("dlg_stg_ok"), aM.G("dlg_start"));
                    this.a.getParent().getParent().getParent().repaint();
                }
            }
            this.a.setVisible(false);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

