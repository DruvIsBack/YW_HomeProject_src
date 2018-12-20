/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public final class aP
implements KeyListener {
    @Override
    public final void keyReleased(KeyEvent object) {
        block8 : {
            try {
                Object object2;
                Object object3;
                if (!object.getSource().getClass().toString().contains("javax.swing.JTextField")) break block8;
                JTextField jTextField = (JTextField)object.getSource();
                String string = jTextField.getName();
                String string2 = jTextField.getText();
                if (string.contains("lic_txt")) {
                    object3 = (JPanel)jTextField.getParent().getParent().getComponent(1);
                    object2 = (JRadioButton)object3.getComponent(1);
                    object2.setSelected(true);
                }
                if (object.getKeyCode() == 69) break block8;
                if (string != null && (string.contentEquals("_container1a_col2a") || string.contentEquals("_container1c_col0") || string.contentEquals("_container1c_col1") || string.contentEquals("_container1c_col2"))) {
                    if (object.getKeyCode() == 10) {
                        GUI.a().n();
                        return;
                    }
                    break block8;
                }
                if (string.contentEquals("lic_txt1") && string2.length() >= 29) {
                    string2 = string2.replace(" ", "");
                    object3 = string2.substring(0, 5).toUpperCase();
                    object2 = string2.substring(6, 11).toUpperCase();
                    object = string2.substring(12, 17).toUpperCase();
                    string = string2.substring(18, 23).toUpperCase();
                    string2 = string2.substring(24, 29).toUpperCase();
                    JTextField jTextField2 = (JTextField)jTextField.getParent().getComponent(1);
                    JTextField jTextField3 = (JTextField)jTextField.getParent().getComponent(2);
                    JTextField jTextField4 = (JTextField)jTextField.getParent().getComponent(3);
                    JTextField jTextField5 = (JTextField)jTextField.getParent().getComponent(4);
                    jTextField.setText((String)object3);
                    jTextField2.setText((String)object2);
                    jTextField3.setText((String)object);
                    jTextField4.setText(string);
                    jTextField5.setText(string2);
                    return;
                }
                if (string2.length() >= 5) {
                    jTextField.setText(string2.substring(0, 5).toUpperCase());
                    jTextField.transferFocus();
                    return;
                }
                if (string2.length() == 0 && !string.contentEquals("lic_txt1")) {
                    jTextField.transferFocusBackward();
                    return;
                }
                jTextField.setText(string2.toUpperCase());
                return;
            }
            catch (Throwable throwable) {}
        }
    }

    @Override
    public final void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public final void keyPressed(KeyEvent keyEvent) {
    }
}

