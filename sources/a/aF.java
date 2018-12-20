/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class aF
extends WindowAdapter {
    private /* synthetic */ GUI c;

    aF(GUI gUI) {
        this.c = gUI;
    }

    @Override
    public final void windowClosing(WindowEvent windowEvent) {
        GUI.a(this.c, "mainWindows").dispose();
        System.exit(0);
    }
}

