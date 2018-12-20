/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public final class aQ
implements MouseListener {
    @Override
    public final void mouseEntered(MouseEvent serializable) {
        try {
            if (serializable.getSource().getClass().toString().contains("javax.swing.JButton")) {
                serializable = (JButton)serializable.getSource();
                serializable.setOpaque(false);
                serializable.setFocusPainted(true);
                serializable.setBorderPainted(true);
                serializable.setContentAreaFilled(true);
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    @Override
    public final void mouseExited(MouseEvent serializable) {
        try {
            if (serializable.getSource().getClass().toString().contains("javax.swing.JButton")) {
                serializable = (JButton)serializable.getSource();
                serializable.setOpaque(false);
                serializable.setFocusPainted(false);
                serializable.setBorderPainted(false);
                serializable.setContentAreaFilled(false);
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    @Override
    public final void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public final void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public final void mouseClicked(MouseEvent serializable) {
        try {
            String string;
            JComponent jComponent;
            if (serializable.getSource().getClass().toString().contains("javax.swing.JTextField") && ((string = (jComponent = (JTextField)serializable.getSource()).getName()).contentEquals("_container1c_col0") || string.contentEquals("_container1c_col1") || string.contentEquals("_container1c_col2") || string.contentEquals("_container1a_col2a")) && jComponent.getText().contains(":")) {
                jComponent.setText("");
            }
            if (serializable.getSource().getClass().toString().contains("javax.swing.JLabel") && (string = (jComponent = (JLabel)serializable.getSource()).getName()).contentEquals("_trial") && serializable.isControlDown()) {
                serializable = (JPanel)jComponent.getParent().getParent().getComponent(1);
                serializable = (JRadioButton)serializable.getComponent(0);
                serializable.setSelected(true);
                serializable.setVisible(true);
                return;
            }
        }
        catch (Throwable throwable) {}
    }
}

