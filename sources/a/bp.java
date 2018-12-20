/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class bp
extends WindowAdapter {
    private int x;
    private int y;
    private /* synthetic */ bo a;
    private final /* synthetic */ Dimension b;

    bp(bo bo2, Dimension dimension) {
        this.a = bo2;
        this.b = dimension;
        this.x = bo2.getLocation().x;
        this.y = bo2.getLocation().y;
    }

    @Override
    public final void windowActivated(WindowEvent windowEvent) {
        this.a.setVisible(true);
        this.a.toFront();
    }

    @Override
    public final void windowIconified(WindowEvent windowEvent) {
        this.x = this.a.getLocation().x;
        this.y = this.a.getLocation().y;
        this.a.setLocation(this.x, this.b.height + 10 + this.y);
    }

    @Override
    public final void windowDeiconified(WindowEvent windowEvent) {
        this.a.setVisible(true);
        this.a.setLocation(this.x, this.y);
    }
}

