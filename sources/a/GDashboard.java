/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GDashboard {
    public GDashboard() {
        try {
            Object object = this;
            try {
                Object object2 = aH.D("srv_list");
                if (!object2.contains(";")) {
                    new StringBuilder(String.valueOf(object2)).append(";");
                }
                object2 = new JDialog();
                object2.setIconImage(new ImageIcon(String.valueOf(GUI.y()) + GUI.s()).getImage());
                object2.setTitle(String.valueOf(GUI.D()) + " - " + aM.G("dlg_dashboard"));
                object2.setSize(800, 550);
                object2.setModal(true);
                JPanel jPanel = new JPanel();
                jPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                jPanel.setLayout(new GridBagLayout());
                JPanel jPanel2 = new JPanel();
                jPanel2.setLayout(new GridBagLayout());
                GridBagConstraints gridBagConstraints = new GridBagConstraints();
                new GridBagConstraints().fill = 1;
                gridBagConstraints.anchor = 19;
                gridBagConstraints.insets = new Insets(5, 10, 5, 5);
                JPanel jPanel3 = new JPanel();
                JPanel jPanel4 = new JPanel(new FlowLayout(2, 10, 10));
                JComponent jComponent = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_ip") + "</h2></html>", 0);
                JComponent jComponent2 = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_port") + "</h2></html>", 0);
                JLabel jLabel = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_pass") + "</h2></html>", 0);
                JLabel jLabel2 = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_add") + "</h2></html>", 0);
                jLabel2.setPreferredSize(new Dimension(150, 30));
                JTextField jTextField = new JTextField("127.0.0.1", 10);
                jTextField.setPreferredSize(new Dimension(150, 30));
                JTextField jTextField2 = new JTextField(aH.D("srv_port"), 10);
                JTextField jTextField3 = new JTextField(aH.D("srv_pass"), 10);
                JButton jButton = new JButton(aM.G("dlg_dashboard_add"));
                JPanel jPanel5 = new JPanel();
                jButton.setPreferredSize(new Dimension(70, 25));
                jPanel5.add(jButton);
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                jPanel2.add((Component)jComponent, gridBagConstraints);
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                jPanel2.add((Component)jComponent2, gridBagConstraints);
                gridBagConstraints.gridx = 2;
                jPanel2.add((Component)jLabel, gridBagConstraints);
                gridBagConstraints.gridx = 3;
                jPanel2.add((Component)jLabel2, gridBagConstraints);
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                jPanel2.add((Component)jTextField, gridBagConstraints);
                gridBagConstraints.gridx = 1;
                jPanel2.add((Component)jTextField2, gridBagConstraints);
                gridBagConstraints.gridx = 2;
                jPanel2.add((Component)jTextField3, gridBagConstraints);
                gridBagConstraints.gridx = 3;
                jPanel2.add((Component)jPanel5, gridBagConstraints);
                object.a(jPanel3);
                jComponent = new JButton(aM.G("menu_start"));
                jComponent.setPreferredSize(new Dimension(80, 25));
                jComponent.addActionListener(new L((GDashboard)object));
                jComponent2 = new JButton(aM.G("dlg_hlp_close"));
                jComponent2.setPreferredSize(new Dimension(80, 25));
                object2.setDefaultCloseOperation(2);
                jComponent2.addActionListener(new M((GDashboard)object, (JDialog)object2));
                jButton.addActionListener(new N((GDashboard)object, jTextField, jTextField2, jTextField3, jPanel3));
                object = new JScrollPane(jPanel3);
                object.setPreferredSize(new Dimension(450, 110));
                jPanel4.add(jComponent);
                jPanel4.add(jComponent2);
                gridBagConstraints.insets = new Insets(10, 0, 0, 0);
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.weighty = 1.0;
                jPanel.add((Component)jPanel2, gridBagConstraints);
                gridBagConstraints.weighty = 7.0;
                gridBagConstraints.gridy = 1;
                jPanel.add((Component)object, gridBagConstraints);
                gridBagConstraints.weighty = 1.0;
                gridBagConstraints.gridy = 2;
                jPanel.add((Component)jPanel4, gridBagConstraints);
                object2.add(jPanel);
                object2.setLocationRelativeTo(null);
                object2.setVisible(true);
            }
            catch (Throwable throwable) {
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    private void a(JPanel jPanel) {
        try {
            Object object = aH.D("srv_list");
            if (!object.contains(";")) {
                object = String.valueOf(object) + ";";
            }
            object = object.split(";", -1);
            jPanel.setLayout(new GridBagLayout());
            jPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            jPanel.setAlignmentY(0.0f);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            new GridBagConstraints().fill = 3;
            gridBagConstraints.anchor = 10;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.insets = new Insets(5, 10, 5, 5);
            JLabel jLabel = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_tick") + "</h2></html>", 0);
            Object object2 = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_del_all") + "</h2></html>", 0);
            JLabel jLabel2 = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_ip") + "</h2></html>", 0);
            JLabel jLabel3 = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_search") + "</h2></html>", 0);
            JLabel jLabel4 = new JLabel("<html><br><h2>" + aM.G("menu_start") + "</h2></html>", 0);
            JLabel jLabel5 = new JLabel("<html><br><h2>" + aM.G("dlg_dashboard_sync_all") + "</h2></html>", 0);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            jPanel.add((Component)jLabel, gridBagConstraints);
            gridBagConstraints.gridx = 1;
            jPanel.add((Component)object2, gridBagConstraints);
            gridBagConstraints.gridx = 2;
            jPanel.add((Component)jLabel2, gridBagConstraints);
            gridBagConstraints.gridx = 3;
            jPanel.add((Component)jLabel3, gridBagConstraints);
            gridBagConstraints.gridx = 4;
            jPanel.add((Component)jLabel4, gridBagConstraints);
            gridBagConstraints.gridx = 5;
            jPanel.add(jLabel5);
            int n2 = 0;
            while (n2 < ((String[])object).length) {
                object2 = object[n2];
                int n3 = n2;
                GUI.m(String.valueOf(n2) + "srv_updatelicence");
                GUI.a(String.valueOf(n2) + "srv_updatelicence", aM.G("dlg_dashboard_reset"), 80, 25);
                GUI.a(String.valueOf(n2) + "srv_updatelicence").addActionListener(new O(this));
                GUI.m(String.valueOf(n2) + "srv_setting");
                GUI.a(String.valueOf(n2) + "srv_setting", aM.G("menu_file_setting"), 80, 25);
                GUI.a(String.valueOf(n2) + "srv_setting").addActionListener(new P(this));
                GUI.m(String.valueOf(n2) + "srv_start");
                GUI.a(String.valueOf(n2) + "srv_start", String.valueOf(aM.G("menu_start")) + " / " + aM.G("menu_pause"), 80, 25);
                GUI.a(String.valueOf(n2) + "srv_start").addActionListener(new Q(this, (String)object2, n3));
                GUI.m(String.valueOf(n2) + "srv_delete");
                GUI.a(String.valueOf(n2) + "srv_delete", aM.G("mailattachment_del_btn"), 80, 25);
                GUI.a(String.valueOf(n2) + "srv_delete").addActionListener(new T(this, (String)object2, jPanel));
                GUI.m(String.valueOf(n2) + "srv_synchro");
                GUI.a(String.valueOf(n2) + "srv_synchro", aM.G("dlg_man_refresh"), 80, 25);
                GUI.a(String.valueOf(n2) + "srv_synchro").addActionListener(new U(this, (String)object2, n3));
                GUI.s(String.valueOf(n2) + "srv_contact");
                GUI.s(String.valueOf(n2) + "srv_ip");
                GUI.e(String.valueOf(n2) + "srv_ip", (String)object2);
                GUI.e(String.valueOf(n2) + "srv_contact", "nc");
                GUI.a(String.valueOf(n2) + "srv_contact").setOpaque(true);
                GUI.q(String.valueOf(n2) + "srv_selected");
                GUI.b(String.valueOf(n2) + "srv_selected", "", "0");
                gridBagConstraints.gridy = n2 + 1;
                gridBagConstraints.gridx = 0;
                jPanel.add((Component)GUI.a(String.valueOf(n2) + "srv_selected"), gridBagConstraints);
                gridBagConstraints.gridx = 1;
                jPanel.add((Component)GUI.a(String.valueOf(n2) + "srv_delete"), gridBagConstraints);
                gridBagConstraints.gridx = 2;
                jPanel.add((Component)GUI.a(String.valueOf(n2) + "srv_ip"), gridBagConstraints);
                gridBagConstraints.gridx = 3;
                jPanel.add((Component)GUI.a(String.valueOf(n2) + "srv_contact"), gridBagConstraints);
                gridBagConstraints.gridx = 4;
                jPanel.add((Component)GUI.a(String.valueOf(n2) + "srv_start"), gridBagConstraints);
                gridBagConstraints.gridx = 5;
                jPanel.add((Component)GUI.a(String.valueOf(n2) + "srv_synchro"), gridBagConstraints);
                ++n2;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void main(String[] arrstring) {
        try {
            new aR();
            new GDashboard();
            GUI.main(arrstring);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static /* synthetic */ void a(GDashboard gDashboard, JPanel jPanel) {
        gDashboard.a(jPanel);
    }
}

