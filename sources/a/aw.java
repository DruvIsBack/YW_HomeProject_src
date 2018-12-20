/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JTable;
import javax.swing.table.TableModel;

final class aw
extends JTable {
    private int h = -1;

    aw(GUI gUI, TableModel tableModel) {
        super(tableModel);
    }

    @Override
    public final void changeSelection(int n2, int n3, boolean bl2, boolean bl3) {
        if (n2 != this.h) {
            this.h = n2;
            super.changeSelection(n2, n3, true, false);
            return;
        }
        if (!bl3) {
            super.changeSelection(n2, n3, true, false);
        }
    }

    @Override
    public final boolean isCellEditable(int n2, int n3) {
        return false;
    }
}

