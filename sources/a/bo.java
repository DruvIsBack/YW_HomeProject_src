/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.io.Serializable;
import javax.accessibility.Accessible;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bo
extends JWindow
implements MouseListener {
    private JWindow a;
    private JFrame a;

    @Override
    public final void mouseEntered(MouseEvent serializable) {
        if (serializable.getSource().getClass().toString().contains("javax.swing.JButton")) {
            serializable = (JButton)serializable.getSource();
            serializable.setOpaque(false);
            serializable.setFocusPainted(true);
            serializable.setBorderPainted(true);
            serializable.setContentAreaFilled(true);
        }
    }

    @Override
    public final void mouseExited(MouseEvent serializable) {
        if (serializable.getSource().getClass().toString().contains("javax.swing.JButton")) {
            serializable = (JButton)serializable.getSource();
            serializable.setOpaque(false);
            serializable.setFocusPainted(false);
            serializable.setBorderPainted(false);
            serializable.setContentAreaFilled(false);
        }
    }

    @Override
    public final void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public final void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public final void mouseClicked(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public bo(String object, JLabel jLabel) {
        try {
            Container container = this;
            Serializable serializable = this;
            this.a = container;
            GUI.u().contentEquals("mac");
            container = new JFrame((String)object);
            serializable = this;
            this.a = container;
            bo bo2 = this;
            bo2.a.setResizable(false);
            this.setBounds(300, 300, 300, 300);
            object = Toolkit.getDefaultToolkit().getScreenSize();
            bo2 = this;
            bo2.a.setBounds(-30, -30, 20, 20);
            bo2 = this;
            bo2.a.setIconImage(new ImageIcon(String.valueOf(GUI.y()) + GUI.s()).getImage());
            serializable = new Dimension(400, 300);
            serializable = new aK(new ImageIcon(String.valueOf(GUI.y()) + "splashscreen.png").getImage(), (Dimension)serializable);
            container = new JButton();
            container.addMouseListener(this);
            Accessible accessible = new ImageIcon(String.valueOf(GUI.y()) + "splashscreencancel.png");
            container.setIcon((Icon)((Object)accessible));
            container.setPreferredSize(new Dimension(20, 20));
            container.setOpaque(false);
            container.setContentAreaFilled(false);
            container.setBorderPainted(false);
            accessible = new JLabel("");
            Serializable serializable2 = new ImageIcon(String.valueOf(GUI.y()) + "splashscreen.gif");
            accessible.setIcon((Icon)((Object)serializable2));
            bo2 = this;
            bo2.a.setLayout(new FlowLayout());
            serializable2 = new Dimension(410, 340);
            bo2 = this;
            bo2.a.setSize((Dimension)serializable2);
            this.getContentPane().add((Component)serializable);
            this.getContentPane().add((Component)((Object)accessible));
            this.getContentPane().add(jLabel);
            this.getContentPane().add(container);
            bo2 = this;
            bo2.a.addWindowListener(new bp(this, (Dimension)object));
            bo2 = this;
            bo2.a.setLocationRelativeTo(null);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void H() {
        try {
            bo bo2 = this;
            bo2.a.setVisible(true);
            this.setVisible(true);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void close() {
        try {
            bo bo2 = this;
            bo2.a.setVisible(false);
            bo2 = this;
            bo2.a.dispose();
            bo2 = this;
            bo2.a.setVisible(false);
            bo2 = this;
            bo2.a.dispose();
            this.dispose();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

