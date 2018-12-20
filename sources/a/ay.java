/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

final class ay
implements ListSelectionListener {
    private /* synthetic */ GUI c;
    private final /* synthetic */ JTable d;

    ay(GUI gUI, JTable jTable) {
        this.c = gUI;
        this.d = jTable;
    }

    @Override
    public final void valueChanged(ListSelectionEvent listSelectionEvent) {
        GUI.a(this.c, listSelectionEvent, this.d);
    }
}

