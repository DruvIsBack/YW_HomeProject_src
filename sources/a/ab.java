/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

final class ab
implements TableCellRenderer {
    private DefaultTableCellRenderer a;

    public ab(JTable jTable) {
        this.a = (DefaultTableCellRenderer)jTable.getTableHeader().getDefaultRenderer();
        this.a.setHorizontalAlignment(0);
    }

    @Override
    public final Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl2, boolean bl3, int n2, int n3) {
        return this.a.getTableCellRendererComponent(jTable, object, bl2, bl3, n2, n3);
    }
}

