/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JTable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ag
implements Runnable {
    private /* synthetic */ GUI c;
    private final /* synthetic */ int g;
    private final /* synthetic */ JTable a;
    private final /* synthetic */ JTable b;
    private final /* synthetic */ JTable c;

    ag(GUI gUI, int n2, JTable jTable, JTable jTable2, JTable jTable3) {
        this.c = gUI;
        this.g = n2;
        this.a = jTable;
        this.b = jTable2;
        this.c = jTable3;
    }

    @Override
    public final void run() {
        try {
            while (this.g == this.a.getSelectedRowCount() && this.b.getSelectedRowCount() <= 0) {
                if (this.b.getRowCount() != 0 && GUI.a("_container0_2a").getText().contentEquals(aM.G("dlg_man_select"))) {
                    this.b.selectAll();
                    break;
                }
                Thread.sleep(500L);
            }
            int n2 = this.b.getSelectedRowCount();
            while (this.g == this.a.getSelectedRowCount() && n2 == this.b.getSelectedRowCount() && (this.c.getRowCount() == 0 || this.c.getRowCount() != this.c.getSelectedRowCount())) {
                Thread.sleep(500L);
            }
            bq.T("fastsearch");
            GUI.c(this.c);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

