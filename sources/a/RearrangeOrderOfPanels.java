/*
 * Decompiled with CFR 0_132.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class RearrangeOrderOfPanels {
    public static JComponent a(List object) {
        try {
            Box box = Box.createVerticalBox();
            I i2 = new I();
            box.addMouseListener(i2);
            box.addMouseMotionListener(i2);
            int n2 = 0;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (JComponent)iterator.next();
                int n3 = n2++;
                Object object2 = object;
                int n4 = n3;
                object = new JLabel(String.format(" %04d ", n4));
                object.setOpaque(true);
                object.setBackground(Color.gray);
                JPanel jPanel = new JPanel(new BorderLayout());
                jPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createLineBorder(Color.gray, 2)));
                jPanel.add((Component)object, "West");
                jPanel.add((Component)object2);
                jPanel.setOpaque(false);
                box.add(jPanel);
            }
            object = new JPanel(new BorderLayout());
            object.add((Component)box, "North");
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static List a(JComponent arrcomponent) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            arrcomponent = ((Box)arrcomponent.getComponent(0)).getComponents();
            int n2 = 0;
            while (n2 < arrcomponent.length) {
                ((JComponent)arrcomponent[n2]).getComponents();
                arrayList.add(((JLabel)((JComponent)arrcomponent[n2]).getComponent(0)).getText());
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static /* varargs */ void main(String ... arrstring) {
        new aR();
        EventQueue.invokeLater(new bh());
    }

    public static void E() {
        ArrayList<JComponent> arrayList = new ArrayList<JComponent>();
        arrayList.add(new JLabel("<html>111<br>22<br>11"));
        arrayList.add(new JButton("2"));
        arrayList.add(new JCheckBox("3"));
        arrayList.add(new JTextField(14));
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(3);
        jFrame.getContentPane().add(RearrangeOrderOfPanels.a(arrayList));
        jFrame.setSize(320, 240);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}

