/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c
implements Runnable {
    private String c;
    private String d;
    private JDialog a;
    private JLabel a;
    private String type;

    public c(String object, String string, JDialog jDialog, JLabel jLabel, String string2) {
        Object object2 = object;
        object = this;
        this.c = object2;
        object2 = string;
        object = this;
        this.d = object2;
        object2 = jDialog;
        object = this;
        this.a = object2;
        object2 = jLabel;
        object = this;
        this.a = object2;
        object2 = string2;
        object = this;
        this.type = object2;
    }

    @Override
    public final void run() {
        try {
            SwingUtilities.invokeLater(new d(this));
            c c2 = this;
            if (c2.type.contentEquals("blacklistexport")) {
                c c3 = this;
                c2 = c3;
                c2 = this;
                aI.a(c3.c, c2.a);
            } else {
                c2 = this;
                if (c2.d.contains(";")) {
                    c2 = this;
                    c2 = this;
                    bi.a(String.valueOf(c2.c) + ".csv", ";", c2.a);
                } else {
                    c2 = this;
                    if (c2.d.contains(",")) {
                        c2 = this;
                        c2 = this;
                        bi.a(String.valueOf(c2.c) + ".csv", ",", c2.a);
                    } else {
                        c2 = this;
                        if (c2.d.contains("xlsx")) {
                            c2 = this;
                            c2 = this;
                            bi.a(String.valueOf(c2.c) + ".xlsx", "", c2.a);
                        } else {
                            c2 = this;
                            if (c2.d.contains("xls")) {
                                c2 = this;
                                c2 = this;
                                bi.a(String.valueOf(c2.c) + ".xls", "", c2.a);
                            }
                        }
                    }
                }
            }
            SwingUtilities.invokeLater(new e(this));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static /* synthetic */ JDialog a(c c2) {
        return c2.a;
    }
}

