/*
 * Decompiled with CFR 0_132.
 */
import javax.swing.JScrollBar;

final class af
implements Runnable {
    private /* synthetic */ GUI c;

    af(GUI gUI) {
        this.c = gUI;
    }

    @Override
    public final void run() {
        GUI.a(this.c, "mainFrame").getVerticalScrollBar().setValue(0);
    }
}

