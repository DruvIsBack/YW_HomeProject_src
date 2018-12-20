/*
 * Decompiled with CFR 0_132.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class GFileDialog {
    public GFileDialog() {
        try {
            Object object = this;
            try {
                JDialog jDialog = new JDialog();
                jDialog.setDefaultCloseOperation(2);
                jDialog.setIconImage(new ImageIcon(String.valueOf(GUI.y()) + GUI.s()).getImage());
                jDialog.setTitle(String.valueOf(GUI.D()) + " - " + aM.G("dlg_hlp"));
                jDialog.setSize(700, 680);
                jDialog.setModal(true);
                JPanel jPanel = new JPanel();
                jPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
                jPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridBagConstraints = new GridBagConstraints();
                JComponent jComponent = new JLabel("<html><br><h2>" + GUI.D() + "</h2></html>");
                jComponent.setIcon(new ImageIcon(String.valueOf(GUI.y()) + "logo.png"));
                JComponent jComponent2 = new JLabel("<html><br><br>" + aM.G("dlg_file1") + "<br><br></html>");
                jComponent2.setFont(new Font("Arial", 0, 14));
                JLabel jLabel = new JLabel("<html><br><br>" + aM.G("dlg_file2") + "<br><br></html>");
                jLabel.setFont(new Font("Arial", 0, 14));
                JLabel jLabel2 = new JLabel("<html><br><br>" + aM.G("dlg_file3") + "<br><br></html>");
                jLabel2.setFont(new Font("Arial", 0, 14));
                Object object2 = new String[]{aM.G("word_zip")};
                Object object3 = new String[]{aM.G("word_city")};
                Object object4 = new String[]{aM.G("word_street")};
                Object object5 = aM.G("dlg_import_q1").split(",", -1);
                if (!GUI.D().contains("White and Yellow") && GUI.D().contains("Yellow")) {
                    object4[0] = aM.G("word_category");
                }
                GUI.a("_zipimportfile", (String[])object2, 120, 25, 0);
                GUI.a("_cityimportfile", (String[])object3, 120, 25, 0);
                GUI.a("_streetimportfile", (String[])object4, 120, 25, 0);
                GUI.a("_setting_streetimportfilebyname", (String[])object5, 120, 25, bn.Q("streetimportfilebyname").contentEquals("") ? 0 : Integer.valueOf(bn.Q("streetimportfilebyname")));
                object2 = new String[]{aM.G("word_zip"), aM.G("word_city"), aM.G("word_street")};
                if (!GUI.D().contains("White and Yellow") && GUI.D().contains("Yellow")) {
                    object2[2] = aM.G("word_category");
                }
                object2 = new JTable(GUI.a(), (Object[])object2);
                object3 = object2.getTableHeader();
                object3.setDefaultRenderer(new ab((JTable)object2));
                GUI.c().put("filelistimport", object2);
                object3 = new JButton(aM.G("mailattachment_btn"));
                object3.setPreferredSize(new Dimension(80, 25));
                object4 = new JButton(aM.G("menu_start"));
                object4.setPreferredSize(new Dimension(80, 25));
                object5 = new JButton(aM.G("dlg_hlp_close"));
                object5.setPreferredSize(new Dimension(80, 25));
                object3.addActionListener(new Y((GFileDialog)object));
                object4.addActionListener(new Z((GFileDialog)object));
                object5.addActionListener(new aa((GFileDialog)object, jDialog));
                object = new JPanel();
                object.setLayout(new FlowLayout(2, 20, 0));
                object.add(GUI.a("_zipimportfile"));
                object.add(GUI.a("_cityimportfile"));
                object.add(GUI.a("_streetimportfile"));
                gridBagConstraints.fill = 2;
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.weighty = 1.0;
                JPanel jPanel2 = new JPanel(new FlowLayout());
                jPanel2.add(jComponent);
                jPanel.add((Component)jPanel2, gridBagConstraints);
                gridBagConstraints.weighty = 0.0;
                gridBagConstraints.gridy = 1;
                jComponent = new JPanel();
                jComponent.setLayout(new BoxLayout(jComponent, 0));
                jComponent.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
                jComponent.add(jComponent2);
                jComponent.add(Box.createHorizontalGlue());
                jComponent.add((Component)object3);
                jPanel.add((Component)jComponent, gridBagConstraints);
                gridBagConstraints.gridy = 2;
                jComponent = new JPanel();
                jComponent.setLayout(new BoxLayout(jComponent, 0));
                jComponent.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
                if (GUI.D().contentEquals("IQUALIF France White")) {
                    jComponent.add(jLabel);
                    jComponent.add(Box.createHorizontalGlue());
                    jComponent2 = GUI.a("_setting_streetimportfilebyname");
                    jComponent2.setMaximumSize(new Dimension(80, 25));
                    jComponent.add(jComponent2);
                }
                jPanel.add((Component)jComponent, gridBagConstraints);
                gridBagConstraints.gridy = 3;
                jComponent2 = new JPanel();
                jComponent2.add(jLabel2);
                jComponent2.setLayout(new FlowLayout(0, 20, 0));
                jPanel.add((Component)jComponent2, gridBagConstraints);
                gridBagConstraints.gridy = 4;
                gridBagConstraints.weighty = 1.0;
                jPanel.add((Component)object, gridBagConstraints);
                object = new JPanel(new BorderLayout());
                object.add((Component)object2.getTableHeader(), "North");
                object.add((Component)object2, "Center");
                gridBagConstraints.gridy = 5;
                jPanel.add((Component)object, gridBagConstraints);
                jPanel.add(Box.createRigidArea(new Dimension(0, 20)));
                gridBagConstraints.gridy = 6;
                gridBagConstraints.weighty = 1.0;
                object = new JPanel();
                object.setLayout(new FlowLayout(2, 20, 0));
                object.add((Component)object4);
                object.add((Component)object5);
                jPanel.add((Component)object, gridBagConstraints);
                jDialog.add(jPanel);
                jDialog.setLocationRelativeTo(null);
                jDialog.setVisible(true);
            }
            catch (Throwable throwable) {
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static void main(String[] arrstring) {
        try {
            new aR();
            new GFileDialog();
            GUI.main(arrstring);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

