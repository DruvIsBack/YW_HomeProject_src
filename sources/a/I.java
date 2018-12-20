/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.dnd.DragSource;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.Objects;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class I
extends MouseAdapter {
    private static final Rectangle a = new Rectangle();
    private static final Rectangle b = new Rectangle();
    private static Rectangle c;
    private final JWindow a;
    private Component a;
    private int index = -1;
    private Component b;
    private Point a;
    private Point b;
    private final int a = DragSource.getDragThreshold();

    public I() {
        I i2 = this;
        i2.a.setBackground(new Color(0, true));
    }

    @Override
    public final void mousePressed(MouseEvent object) {
        Serializable serializable = (JComponent)object.getComponent();
        if (serializable.getComponentCount() <= 1) {
            serializable = null;
            object = this;
            this.a = serializable;
            return;
        }
        serializable = object.getPoint();
        object = this;
        this.a = serializable;
    }

    private void a(Point point, JComponent jComponent) {
        I i2 = this;
        I i3 = i2;
        i3 = this;
        point = new Point(point.x - i2.b.x, point.y - i3.b.y);
        SwingUtilities.convertPointToScreen(point, jComponent);
        i3 = this;
        i3.a.setLocation(point);
    }

    private static int a(Rectangle rectangle, Point point, int n2) {
        int n3 = (int)(0.5 + (double)rectangle.height * 0.5);
        a.setBounds(rectangle.x, rectangle.y, rectangle.width, n3);
        b.setBounds(rectangle.x, rectangle.y + n3, rectangle.width, n3);
        if (a.contains(point)) {
            c = rectangle = a;
            if (n2 - 1 > 0) {
                return n2;
            }
            return 0;
        }
        if (b.contains(point)) {
            c = rectangle = b;
            return n2;
        }
        return -1;
    }

    private static void a(Container container, Component component, Component component2, int n2) {
        container.remove(component);
        container.add(component2, n2);
        container.revalidate();
        container.repaint();
    }

    @Override
    public final void mouseDragged(MouseEvent serializable) {
        I i2;
        Point point;
        block14 : {
            block13 : {
                block10 : {
                    Component component;
                    Object object;
                    I i3;
                    block12 : {
                        block11 : {
                            point = serializable.getPoint();
                            serializable = (JComponent)serializable.getComponent();
                            i2 = this;
                            double d2 = Math.pow(point.x - i2.a.x, 2.0);
                            i2 = this;
                            double d3 = Math.pow(point.y - i2.a.y, 2.0);
                            i2 = this;
                            if (i2.a != null) break block10;
                            i3 = this;
                            if (Math.sqrt(d2 + d3) <= (double)i3.a) break block10;
                            i3 = this;
                            component = serializable.getComponentAt(point);
                            int n2 = serializable.getComponentZOrder(component);
                            object = i3;
                            i3.index = n2;
                            if (Objects.equals(component, serializable)) break block11;
                            i2 = i3;
                            if (i2.index >= 0) break block12;
                        }
                        return;
                    }
                    Serializable serializable2 = component;
                    i2 = i3;
                    i3.a = serializable2;
                    i2 = i3;
                    object = i2.a.getSize();
                    i2 = i3;
                    serializable2 = i2.a.getLocation();
                    serializable2 = new Point(point.x - serializable2.x, point.y - serializable2.y);
                    i2 = i3;
                    i3.b = serializable2;
                    serializable2 = Box.createRigidArea((Dimension)object);
                    object = i3;
                    i3.b = serializable2;
                    I i4 = i3;
                    i2 = i4;
                    i2 = i3;
                    I.a((Container)serializable, component, i4.b, i2.index);
                    I i5 = i3;
                    i2 = i5;
                    i2 = i3;
                    i5.a.add(i2.a);
                    i2 = i3;
                    i2.a.pack();
                    i3.a(point, (JComponent)serializable);
                    i2 = i3;
                    i2.a.setVisible(true);
                    return;
                }
                i2 = this;
                if (!i2.a.isVisible()) break block13;
                i2 = this;
                if (i2.a != null) break block14;
            }
            return;
        }
        this.a(point, (JComponent)serializable);
        if (c != null && c.contains(point)) {
            return;
        }
        int n3 = 0;
        while (n3 < serializable.getComponentCount()) {
            Component component = serializable.getComponent(n3);
            Rectangle rectangle = component.getBounds();
            i2 = this;
            if (Objects.equals(component, i2.b) && rectangle.contains(point)) {
                return;
            }
            int n4 = I.a(rectangle, point, n3);
            if (n4 >= 0) {
                I i6 = this;
                i2 = i6;
                i2 = this;
                I.a((Container)serializable, i6.b, i2.b, n4);
                return;
            }
            ++n3;
        }
        i2 = this;
        serializable.remove(i2.b);
        serializable.revalidate();
    }

    @Override
    public final void mouseReleased(MouseEvent serializable) {
        I i2;
        Object var4_2;
        block8 : {
            block7 : {
                var4_2 = null;
                i2 = this;
                this.a = var4_2;
                i2 = this;
                if (!i2.a.isVisible()) break block7;
                i2 = this;
                if (i2.a != null) break block8;
            }
            return;
        }
        Point point = serializable.getPoint();
        serializable = (JComponent)serializable.getComponent();
        i2 = this;
        Component component = i2.a;
        var4_2 = null;
        i2 = this;
        this.a = var4_2;
        i2 = null;
        c = null;
        var4_2 = null;
        i2 = this;
        this.a = var4_2;
        var4_2 = null;
        i2 = this;
        this.b = var4_2;
        i2 = this;
        i2.a.setVisible(false);
        int n2 = 0;
        while (n2 < serializable.getComponentCount()) {
            Component component2 = serializable.getComponent(n2);
            i2 = this;
            if (Objects.equals(component2, i2.b)) {
                i2 = this;
                I.a((Container)serializable, i2.b, component, n2);
                return;
            }
            int n3 = I.a(component2.getBounds(), point, n2);
            if (n3 >= 0) {
                i2 = this;
                I.a((Container)serializable, i2.b, component, n3);
                return;
            }
            ++n2;
        }
        if (serializable.getParent().getBounds().contains(point)) {
            i2 = this;
            I.a((Container)serializable, i2.b, component, serializable.getComponentCount());
            return;
        }
        I i3 = this;
        i2 = i3;
        i2 = this;
        I.a((Container)serializable, i3.b, component, i2.index);
    }
}

