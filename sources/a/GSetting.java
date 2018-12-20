/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class GSetting {
    private static JPanel b = null;
    private static List e = new ArrayList();
    private static List f;

    public GSetting() {
        try {
            Object object = this;
            try {
                JDialog jDialog = new JDialog();
                jDialog.setIconImage(new ImageIcon(String.valueOf(GUI.y()) + GUI.s()).getImage());
                jDialog.setTitle(String.valueOf(GUI.D()) + " - " + aM.G("dlg_stg"));
                jDialog.setModal(true);
                jDialog.setSize(new Dimension(530, 400));
                Serializable serializable = new Dimension(500, 350);
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    serializable = new Dimension(500, 16970);
                }
                serializable = new aK(new ImageIcon(String.valueOf(GUI.y()) + "backgroundsetting.jpg").getImage(), (Dimension)serializable);
                serializable.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                serializable.setOpaque(false);
                serializable.setLayout(new BoxLayout((Container)serializable, 3));
                JPanel jPanel = new JPanel();
                JPanel jPanel2 = new JPanel();
                JPanel jPanel3 = new JPanel();
                JPanel jPanel4 = new JPanel();
                JPanel jPanel5 = new JPanel();
                JPanel jPanel6 = new JPanel();
                JPanel jPanel7 = new JPanel();
                JPanel jPanel8 = new JPanel();
                JPanel jPanel9 = new JPanel();
                JPanel jPanel10 = new JPanel();
                JPanel jPanel11 = new JPanel();
                JPanel jPanel12 = new JPanel();
                JPanel jPanel13 = new JPanel();
                JPanel jPanel14 = new JPanel();
                JPanel jPanel15 = new JPanel();
                JPanel jPanel16 = new JPanel();
                JPanel jPanel17 = new JPanel();
                JPanel jPanel18 = new JPanel();
                JPanel jPanel19 = new JPanel();
                JPanel jPanel20 = new JPanel();
                JPanel jPanel21 = new JPanel();
                JPanel jPanel22 = new JPanel();
                JPanel jPanel23 = new JPanel();
                JPanel jPanel24 = new JPanel();
                JPanel jPanel25 = new JPanel();
                JPanel jPanel26 = new JPanel();
                JPanel jPanel27 = new JPanel();
                JPanel jPanel28 = new JPanel();
                JPanel jPanel29 = new JPanel();
                JPanel jPanel30 = new JPanel();
                JPanel jPanel31 = new JPanel();
                JPanel jPanel32 = new JPanel();
                JPanel jPanel33 = new JPanel();
                JPanel jPanel34 = new JPanel();
                JPanel jPanel35 = new JPanel();
                JPanel jPanel36 = new JPanel();
                JPanel jPanel37 = new JPanel();
                JPanel jPanel38 = new JPanel();
                JPanel jPanel39 = new JPanel();
                JPanel jPanel40 = new JPanel();
                JPanel jPanel41 = new JPanel();
                JPanel jPanel42 = new JPanel();
                String[] arrstring = new Color(1.0f, 1.0f, 1.0f, 0.6f);
                jPanel.setBackground((Color)arrstring);
                jPanel2.setBackground((Color)arrstring);
                jPanel3.setBackground((Color)arrstring);
                jPanel4.setBackground((Color)arrstring);
                jPanel5.setBackground((Color)arrstring);
                jPanel6.setBackground((Color)arrstring);
                jPanel7.setBackground((Color)arrstring);
                jPanel8.setBackground((Color)arrstring);
                arrstring = new LineBorder(Color.gray, 2, true);
                jPanel.setBorder((Border)arrstring);
                jPanel2.setBorder((Border)arrstring);
                jPanel3.setBorder((Border)arrstring);
                jPanel4.setBorder((Border)arrstring);
                jPanel5.setBorder((Border)arrstring);
                jPanel6.setBorder((Border)arrstring);
                jPanel7.setBorder((Border)arrstring);
                jPanel8.setBorder((Border)arrstring);
                jPanel.setLayout(new GridLayout(0, 2));
                jPanel2.setLayout(new GridLayout(0, 2));
                jPanel3.setLayout(new GridLayout(0, 2));
                jPanel4.setLayout(new GridLayout(0, 2));
                jPanel5.setLayout(new GridLayout(0, 2));
                jPanel6.setLayout(new GridLayout(0, 2));
                jPanel7.setLayout(new GridLayout(0, 2));
                jPanel8.setLayout(new GridLayout(0, 2));
                jPanel9.setLayout(new FlowLayout(2));
                jPanel10.setLayout(new FlowLayout(2));
                jPanel11.setLayout(new FlowLayout(2));
                jPanel12.setLayout(new FlowLayout(2));
                jPanel13.setLayout(new FlowLayout(2));
                jPanel14.setLayout(new FlowLayout(2));
                jPanel15.setLayout(new FlowLayout(2));
                jPanel16.setLayout(new FlowLayout(2));
                jPanel17.setLayout(new FlowLayout(2));
                jPanel18.setLayout(new FlowLayout(2));
                jPanel19.setLayout(new FlowLayout(2));
                jPanel20.setLayout(new FlowLayout(2));
                jPanel21.setLayout(new FlowLayout(2));
                jPanel22.setLayout(new FlowLayout(2));
                jPanel23.setLayout(new FlowLayout(2));
                jPanel24.setLayout(new FlowLayout(2));
                jPanel25.setLayout(new FlowLayout(2));
                jPanel26.setLayout(new FlowLayout(2));
                jPanel27.setLayout(new FlowLayout(2));
                jPanel28.setLayout(new FlowLayout(2));
                jPanel29.setLayout(new FlowLayout(2));
                jPanel30.setLayout(new FlowLayout(2));
                jPanel31.setLayout(new FlowLayout(2));
                jPanel32.setLayout(new FlowLayout(2));
                jPanel33.setLayout(new FlowLayout(2));
                jPanel34.setLayout(new FlowLayout(2));
                jPanel35.setLayout(new FlowLayout(2));
                jPanel36.setLayout(new FlowLayout(2));
                jPanel37.setLayout(new FlowLayout(2));
                jPanel38.setLayout(new FlowLayout(2));
                jPanel39.setLayout(new FlowLayout(2));
                jPanel40.setLayout(new FlowLayout(2));
                jPanel41.setLayout(new FlowLayout(2));
                jPanel42.setLayout(new FlowLayout(2));
                GUI.a("_setting_deleteSoftware", bn.i().toArray(new String[bn.i().size()]), 120, 25, 0);
                GUI.e("_setting_deleteSoftware", "Delete a software");
                jPanel10.add(GUI.a("_setting_deleteSoftware"));
                jPanel2.add(GUI.a("_setting_deleteSoftware"));
                jPanel2.add(jPanel10);
                GUI.e("_setting_deleteSoftware1", "");
                GUI.a("_setting_deleteSoftware1", "Delete a software", 150, 25);
                jPanel11.add(GUI.a("_setting_deleteSoftware1"));
                jPanel2.add(GUI.a("_setting_deleteSoftware1"));
                jPanel2.add(jPanel11);
                GUI.a("_setting_deleteSoftware1").addActionListener(GUI.a());
                GUI.e("_setting_addSoftware", "Add a software");
                GUI.a("_setting_addSoftware", "", 17);
                jPanel12.add(GUI.a("_setting_addSoftware"));
                jPanel2.add(GUI.a("_setting_addSoftware"));
                jPanel2.add(jPanel12);
                GUI.e("_setting_addSoftware1", "");
                GUI.a("_setting_addSoftware1", "Add", 150, 25);
                jPanel13.add(GUI.a("_setting_addSoftware1"));
                jPanel2.add(GUI.a("_setting_addSoftware1"));
                jPanel2.add(jPanel13);
                GUI.a("_setting_addSoftware1").addActionListener(GUI.a());
                GUI.a("_setting_language", aM.b(), 120, 25, aH.D("language").contentEquals("") ? 0 : Integer.valueOf(aH.D("language")));
                GUI.e("_setting_language", aM.G("dlg_stg_language"));
                jPanel14.add(GUI.a("_setting_language"));
                jPanel3.add(GUI.a("_setting_language"));
                jPanel3.add(jPanel14);
                GUI.e("_setting_detailcapture", aM.G("dlg_stg_detailcapture_text1"));
                GUI.b("_setting_detailcapture", aM.G("dlg_stg_checkbox"), bn.Q("detailcapture"));
                jPanel16.add(GUI.a("_setting_detailcapture"));
                if (!(!GUI.a().equals(Level.FINEST) && !GUI.a().equals(Level.CONFIG) && !GUI.D().contentEquals("IQUALIF Switzerland White") && !GUI.D().contentEquals("IQUALIF Belgium 07 Yellow") && !GUI.D().contentEquals("IQUALIF Croatia Yellow") && !GUI.D().contentEquals("IQUALIF Canada Yellow") && (GUI.D().contains("Belgium Yellow") || GUI.D().contentEquals("IQUALIF Germany GS Yellow") || GUI.D().contentEquals("IQUALIF Germany Yellow") || GUI.D().contains("Hungary Yellow") || GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow") || GUI.D().contentEquals("IQUALIF Poland Yellow") || GUI.D().contains("Portugal Yellow") || GUI.D().contains("United Kingdom YL Yellow") || GUI.D().contains("United Kingdom Yellow") || GUI.D().contains(" Australia ") || GUI.D().contains(" Kapa ") || GUI.D().contains(" Viva ") || GUI.D().contains("BCoin ") || GUI.D().contains("Canada ") || GUI.D().contains("England ") || GUI.D().contains("Madagascar ") || GUI.D().contains("Luxembourg White") || GUI.D().contains("Morocco ") || GUI.D().contentEquals("IQUALIF Tunisia Yellow") || !GUI.D().contains(" Yellow")))) {
                    jPanel4.add(GUI.a("_setting_detailcapture"));
                    jPanel4.add(jPanel16);
                }
                GUI.e("_setting_capturebcoinminprice", aM.G("dlg_stg_capturebcoinminprice_text1"));
                GUI.b("_setting_capturebcoinminprice", aM.G("dlg_stg_checkbox"), aH.D("capturebcoinminprice"));
                jPanel17.add(GUI.a("_setting_capturebcoinminprice"));
                if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                    jPanel4.add(GUI.a("_setting_capturebcoinminprice"));
                    jPanel4.add(jPanel17);
                }
                arrstring = new String[]{aM.G("dlg_stg_off"), aM.G("dlg_stg_mail_txt1"), aM.G("dlg_stg_mail_txt2")};
                GUI.a("_setting_mailCapture", arrstring, 120, 25, bn.Q("mailCapture").contentEquals("") ? 0 : Integer.valueOf(bn.Q("mailCapture")));
                GUI.e("_setting_mailCapture", aM.G("dlg_stg_mail"));
                jPanel18.add(GUI.a("_setting_mailCapture"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG) || !GUI.D().contains(" Kapa ") && !GUI.D().contains(" Viva ") && !GUI.D().contains("BCoin ") && !GUI.D().contains("England ") && GUI.D().contains(" Yellow")) {
                    jPanel4.add(GUI.a("_setting_mailCapture"));
                    jPanel4.add(jPanel18);
                }
                arrstring = new String[]{aM.G("dlg_stg_off"), aM.G("dlg_stg_duplicate_txt1")};
                GUI.a("_setting_delete_duplicate", arrstring, 120, 25, bn.Q("delete_duplicate").contentEquals("") ? 0 : Integer.valueOf(bn.Q("delete_duplicate")));
                GUI.e("_setting_delete_duplicate", aM.G("dlg_stg_duplicate"));
                jPanel19.add(GUI.a("_setting_delete_duplicate"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG) || !GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                    jPanel4.add(GUI.a("_setting_delete_duplicate"));
                    jPanel4.add(jPanel19);
                }
                GUI.e("_setting_professionnalMark", aM.G("dlg_stg_professionnal"));
                GUI.b("_setting_professionnalMark", aM.G("dlg_stg_checkbox"), bn.Q("professionnalMark"));
                jPanel20.add(GUI.a("_setting_professionnalMark"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG) || !GUI.D().contains(" Kapa ") && !GUI.D().contains(" Viva ") && !GUI.D().contains("BCoin ") && GUI.D().contains(" White")) {
                    jPanel4.add(GUI.a("_setting_professionnalMark"));
                    jPanel4.add(jPanel20);
                }
                arrstring = new String[]{aM.G("dlg_stg_coldcallingok"), aM.G("dlg_stg_coldcallingko")};
                if (bn.Q("coldcalling") == null) {
                    bn.d(GUI.D(), "coldcalling", "1");
                }
                GUI.a("_setting_coldcalling", arrstring, 120, 25, bn.Q("coldcalling").contentEquals("") ? 0 : Integer.valueOf(bn.Q("coldcalling")));
                GUI.e("_setting_coldcalling", String.valueOf(aM.G("dlg_stg_coldcalling").replace(":", "")) + " :");
                jPanel24.add(GUI.a("_setting_coldcalling"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel4.add(GUI.a("_setting_coldcalling"));
                    jPanel4.add(jPanel24);
                }
                GUI.e("_setting_genderDeduct", aM.G("dlg_stg_genderDeduct"));
                GUI.b("_setting_genderDeduct", aM.G("dlg_stg_checkbox"), bn.Q("genderDeduct"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel25.add(GUI.a("_setting_genderDeduct"));
                    jPanel4.add(GUI.a("_setting_genderDeduct"));
                    jPanel4.add(jPanel25);
                }
                GUI.e("_setting_separateforename", aM.G("dlg_stg_separateforename"));
                GUI.b("_setting_separateforename", aM.G("dlg_stg_checkbox"), bn.Q("separateforename"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel23.add(GUI.a("_setting_separateforename"));
                    jPanel4.add(GUI.a("_setting_separateforename"));
                    jPanel4.add(jPanel23);
                }
                GUI.e("_setting_housingDeduct", aM.G("dlg_stg_housingDeduct"));
                GUI.b("_setting_housingDeduct", aM.G("dlg_stg_checkbox"), bn.Q("housingDeduct"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel27.add(GUI.a("_setting_housingDeduct"));
                    jPanel4.add(GUI.a("_setting_housingDeduct"));
                    jPanel4.add(jPanel27);
                }
                GUI.e("_setting_ageDeduct", aM.G("dlg_stg_ageDeduct"));
                GUI.b("_setting_ageDeduct", aM.G("dlg_stg_checkbox"), bn.Q("ageDeduct"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel26.add(GUI.a("_setting_ageDeduct"));
                    jPanel4.add(GUI.a("_setting_ageDeduct"));
                    jPanel4.add(jPanel26);
                }
                GUI.e("_setting_show_page", aM.G("dlg_stg_preview"));
                GUI.b("_setting_show_page", aM.G("dlg_stg_checkbox"), bn.Q("show_page"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel21.add(GUI.a("_setting_show_page"));
                    jPanel4.add(GUI.a("_setting_show_page"));
                    jPanel4.add(jPanel21);
                }
                GUI.e("_setting_show_contact", aM.G("dlg_stg_show_contact"));
                GUI.b("_setting_show_contact", aM.G("dlg_stg_checkbox"), bn.Q("show_contact"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel22.add(GUI.a("_setting_show_contact"));
                    jPanel4.add(GUI.a("_setting_show_contact"));
                    jPanel4.add(jPanel22);
                }
                GUI.e("_setting_show_tBList", aM.G("dlg_man_list"));
                GUI.b("_setting_show_tBList", aM.G("dlg_stg_checkbox"), bn.Q("show_tBList"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel28.add(GUI.a("_setting_show_tBList"));
                    jPanel4.add(GUI.a("_setting_show_tBList"));
                    jPanel4.add(jPanel28);
                }
                GUI.e("_setting_show_tBSemiAuto", aM.G("dlg_man_semiauto"));
                GUI.b("_setting_show_tBSemiAuto", aM.G("dlg_stg_checkbox"), bn.Q("show_tBSemiAuto"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel29.add(GUI.a("_setting_show_tBSemiAuto"));
                    jPanel4.add(GUI.a("_setting_show_tBSemiAuto"));
                    jPanel4.add(jPanel29);
                }
                GUI.e("_setting_show_tBManual", aM.G("dlg_man_manual"));
                GUI.b("_setting_show_tBManual", aM.G("dlg_stg_checkbox"), bn.Q("show_tBManual"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel30.add(GUI.a("_setting_show_tBManual"));
                    jPanel4.add(GUI.a("_setting_show_tBManual"));
                    jPanel4.add(jPanel30);
                }
                GUI.e("_setting_show_tBBrowser", aM.G("dlg_man_browser"));
                GUI.b("_setting_show_tBBrowser", aM.G("dlg_stg_checkbox"), bn.Q("show_tBBrowser"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel31.add(GUI.a("_setting_show_tBBrowser"));
                    jPanel4.add(GUI.a("_setting_show_tBBrowser"));
                    jPanel4.add(jPanel31);
                }
                arrstring = new String[]{aM.G("dlg_stg_speed_txt1"), aM.G("dlg_stg_speed_txt2"), aM.G("dlg_stg_speed_txt3")};
                GUI.a("_setting_connectionSpeed", arrstring, 120, 25, bn.Q("connectionSpeed").contentEquals("") ? 0 : Integer.valueOf(bn.Q("connectionSpeed")));
                GUI.e("_setting_connectionSpeed", aM.G("dlg_stg_speed"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel32.add(GUI.a("_setting_connectionSpeed"));
                    jPanel5.add(GUI.a("_setting_connectionSpeed"));
                    jPanel5.add(jPanel32);
                }
                GUI.a("_settingtabimportproxy", aM.G("dlg_stg_antiblacklist_update_btn"), 150, 25);
                GUI.e("_settingtabimportproxy", aM.G("dlg_stg_antiblacklist_update"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    jPanel34.add(GUI.a("_settingtabimportproxy"));
                    jPanel5.add(GUI.a("_settingtabimportproxy"));
                    jPanel5.add(jPanel34);
                }
                arrstring = aM.G("dlg_stg_custom_list_use").split(",", -1);
                GUI.a("_setting_custom_list_use", arrstring, 120, 25, bn.Q("custom_list_use").contentEquals("") ? 0 : Integer.valueOf(bn.Q("custom_list_use")));
                GUI.e("_setting_custom_list_use", aM.G("dlg_stg_checkbox_custom_list_use"));
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG) || !GUI.D().contains("United Kingdom White") && !GUI.D().contains("Hungary Yellow")) {
                    jPanel35.add(GUI.a("_setting_custom_list_use"));
                    jPanel6.add(GUI.a("_setting_custom_list_use"));
                    jPanel6.add(jPanel35);
                }
                arrstring = aM.G("dlg_stg_custom_list_use_act").split(",", -1);
                GUI.e("_setting_custom_list_use_act", aM.G("dlg_stg_checkbox_custom_list_use_act"));
                GUI.a("_setting_custom_list_use_act", arrstring, 120, 25, bn.Q("custom_list_use_act").contentEquals("") ? 0 : Integer.valueOf(bn.Q("custom_list_use_act")));
                jPanel36.add(GUI.a("_setting_custom_list_use_act"));
                jPanel6.add(GUI.a("_setting_custom_list_use_act"));
                jPanel6.add(jPanel36);
                GUI.e("_setting_mailer_param_act", aM.G("dlg_stg_mailer_param"));
                GUI.a("_setting_mailer_param_act", aM.G("dlg_stg_mailer_param_btn"), 150, 25);
                jPanel40.add(GUI.a("_setting_mailer_param_act"));
                jPanel7.add(GUI.a("_setting_mailer_param_act"));
                jPanel7.add(jPanel40);
                GUI.e("_setting_advanced", aM.G("dlg_stg_advanced"));
                GUI.a("_setting_advanced", aM.G("dlg_stg_advanced_btn"), 150, 25);
                jPanel41.add(GUI.a("_setting_advanced"));
                jPanel8.add(GUI.a("_setting_advanced"));
                jPanel8.add(jPanel41);
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    GUI.a("setting_save", aM.G("dlg_stg_save"), 150, 25);
                    GUI.a("setting_close", aM.G("dlg_stg_cancel"), 150, 25);
                    jPanel9.add(GUI.a("setting_save"));
                    jPanel9.add(GUI.a("setting_close"));
                } else {
                    GUI.e("_setting_container_6", aM.G("dlg_stg_txt1"));
                    jPanel9.add(GUI.a("_setting_container_6"));
                    GUI.a("setting_close", aM.G("dlg_stg_cancel"), 150, 25);
                    jPanel9.add(GUI.a("setting_close"));
                }
                jPanel.setOpaque(false);
                jPanel2.setOpaque(true);
                jPanel3.setOpaque(true);
                jPanel4.setOpaque(true);
                jPanel5.setOpaque(true);
                jPanel6.setOpaque(true);
                jPanel7.setOpaque(true);
                jPanel8.setOpaque(true);
                jPanel9.setOpaque(false);
                jPanel10.setOpaque(false);
                jPanel11.setOpaque(false);
                jPanel12.setOpaque(false);
                jPanel13.setOpaque(false);
                jPanel14.setOpaque(false);
                jPanel15.setOpaque(false);
                jPanel16.setOpaque(false);
                jPanel17.setOpaque(false);
                jPanel18.setOpaque(false);
                jPanel19.setOpaque(false);
                jPanel20.setOpaque(false);
                jPanel21.setOpaque(false);
                jPanel22.setOpaque(false);
                jPanel23.setOpaque(false);
                jPanel24.setOpaque(false);
                jPanel25.setOpaque(false);
                jPanel26.setOpaque(false);
                jPanel27.setOpaque(false);
                jPanel28.setOpaque(false);
                jPanel29.setOpaque(false);
                jPanel30.setOpaque(false);
                jPanel31.setOpaque(false);
                jPanel32.setOpaque(false);
                jPanel33.setOpaque(false);
                jPanel34.setOpaque(false);
                jPanel35.setOpaque(false);
                jPanel36.setOpaque(false);
                jPanel37.setOpaque(false);
                jPanel38.setOpaque(false);
                jPanel39.setOpaque(false);
                jPanel40.setOpaque(false);
                jPanel41.setOpaque(false);
                jPanel42.setOpaque(false);
                GUI.a("_setting_detailcapture").setOpaque(false);
                GUI.a("_setting_capturebcoinminprice").setOpaque(false);
                GUI.a("_setting_professionnalMark").setOpaque(false);
                GUI.a("_setting_genderDeduct").setOpaque(false);
                GUI.a("_setting_separateforename").setOpaque(false);
                GUI.a("_setting_ageDeduct").setOpaque(false);
                GUI.a("_setting_housingDeduct").setOpaque(false);
                GUI.a("_setting_show_page").setOpaque(false);
                GUI.a("_setting_show_contact").setOpaque(false);
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    serializable.add(GSetting.a(jPanel));
                    serializable.add(object.a());
                }
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    serializable.add(jPanel2);
                }
                serializable.add(jPanel3);
                serializable.add(jPanel4);
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG)) {
                    serializable.add(jPanel5);
                }
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG) || GUI.D().contains("Yellow")) {
                    serializable.add(jPanel7);
                }
                if (GUI.a().equals(Level.FINEST) || GUI.a().equals(Level.CONFIG) || GUI.D().contentEquals("IQUALIF France Yellow") || GUI.D().contentEquals("IQUALIF Hungary Yellow")) {
                    serializable.add(jPanel6);
                }
                serializable.add(jPanel8);
                serializable.add(jPanel9);
                object = new JScrollPane((Component)serializable);
                object.getVerticalScrollBar().setUnitIncrement(13);
                jDialog.add((Component)object);
                jDialog.setLocationRelativeTo(null);
                jDialog.setVisible(true);
            }
            catch (Throwable throwable) {
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    private static JPanel a(JPanel jPanel) {
        try {
            String[] arrstring = new String[]{"httpmethod", "url_search", "url_next_page", "url_browser", "url_browser_next_page", "parseUrlDetail", "urldetailClass", "urldetailprefix", "parseHasNextPage", "hasNextPageClass", "hasNextPageString", "parseNextPageNumber", "nextPageNumberClass", "nextPageNumberString", "addToNextPageNumber", "useLastPageNumber", "parseLastPageNumber", "lastPageNumberClass", "lastPageNumberString", "addToLastPageNumber", "phone_tClass", "excludesearchPhone", "searchMarketingAccept", "searchMarketingAcceptFound", "mobile_tClass", "fax_tClass", "phone_tDetailClass", "excludesearchPhoneDetail", "searchMarketingAcceptDetail", "searchMarketingAcceptFoundDetail", "mobile_tDetailClass", "fax_tDetailClass", "parseBrowserStreet", "parseBrowserCity", "parseBrowserZip", "parsePhoneOcr", "phoneOcrClass", "parsePhoneOcrType", "phoneOcrClassType", "phoneOcrGlobalSearch", "isPhoneOcr", "phoneOcrPrefix", "parseMailOcr", "mailOcrClass", "parseMailOcrType", "mailOcrClassType", "mailOcrGlobalSearch", "isMailOcr", "mailOcrPrefix"};
            int n2 = 0;
            while (n2 < arrstring.length) {
                String string = arrstring[n2];
                if (string.contentEquals("url_search") || string.contentEquals("url_next_page") || string.contentEquals("url_browser") || string.contentEquals("url_browser_next_page") || string.startsWith("parse") && !string.endsWith("Type") && !string.endsWith("TypeDetail")) {
                    GUI.e("_option_dev_" + string, "<html><b>" + string + "</b></html>");
                    GUI.a("_option_dev_" + string).setOpaque(true);
                    GUI.a("_option_dev_" + string).setBackground(Color.gray);
                } else {
                    GUI.e("_option_dev_" + string, string);
                }
                GUI.a("_option_dev_" + string, bn.Q(string), 50);
                jPanel.add(GUI.a("_option_dev_" + string));
                jPanel.add(GUI.a("_option_dev_" + string));
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return jPanel;
    }

    public static List b() {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            if (bn.Q("order") == null) {
                return arrayList;
            }
            if (bn.Q("order").contentEquals("")) {
                return arrayList;
            }
            Object object = Arrays.asList(bn.Q("order").split(";"));
            Iterator<String> iterator = object.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                String string = a.m(object.split(",")[1]);
                if (object.endsWith("0")) {
                    string = String.valueOf(string) + "Detail";
                }
                arrayList.add(string);
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    private JPanel a() {
        Object object = null;
        b = null;
        try {
            e.clear();
            object = bi.h();
            List<Object> list = new ArrayList();
            f = list;
            if (2 * object.size() != bn.Q("order").split(";").length) {
                bn.d(GUI.D(), "order", "");
            }
            if (bn.Q("order") == null || bn.Q("order").contentEquals("")) {
                String string;
                int n2 = 0;
                while (n2 < object.size()) {
                    string = (String)object.get(n2);
                    f.add(new ac(n2, string, true));
                    GSetting.c(string, "");
                    ++n2;
                }
                n2 = 0;
                while (n2 < object.size()) {
                    string = (String)object.get(n2);
                    f.add(new ac(n2 + object.size(), string, false));
                    GSetting.c(string, "Detail");
                    ++n2;
                }
            } else {
                list = Arrays.asList(bn.Q("order").split(";"));
                int n3 = 0;
                while (n3 < list.size()) {
                    object = (String)list.get(n3);
                    if (((String[])(object = object.split(","))).length == 3) {
                        f.add(new ac(Integer.parseInt(object[0].trim()), object[1], object[2].trim().equals("1")));
                    }
                    ++n3;
                }
                Collections.sort(f);
                n3 = 0;
                while (n3 < f.size()) {
                    object = (ac)f.get(n3);
                    if (object.b) {
                        GSetting.c(object.columnName, "");
                    } else {
                        GSetting.c(object.columnName, "Detail");
                    }
                    ++n3;
                }
            }
            object = (JPanel)RearrangeOrderOfPanels.a(e);
            b = object;
            RearrangeOrderOfPanels.a((JComponent)object);
        }
        catch (Throwable throwable) {}
        return b;
    }

    private static void c(String string, String string2) {
        try {
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new GridLayout(0, 2));
            jPanel.setOpaque(false);
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("parse\u00a4id\u00a4" + string2);
            arrayList.add("\u00a4id\u00a4" + string2 + "Class");
            arrayList.add("parse\u00a4id\u00a4Type" + string2);
            arrayList.add("\u00a4id\u00a4" + string2 + "ClassType");
            arrayList.add("\u00a4id\u00a4" + string2 + "GlobalSearch");
            arrayList.add("\u00a4id\u00a4" + string2 + "Column");
            int n2 = 0;
            while (n2 < arrayList.size()) {
                String string3 = a.m(((String)arrayList.get(n2)).replace("\u00a4id\u00a4", a.n(string)));
                if (string3.contentEquals("url_search") || string3.contentEquals("url_next_page") || string3.contentEquals("url_browser") || string3.contentEquals("url_browser_next_page") || string3.startsWith("parse") && !string3.endsWith("Type") && !string3.endsWith("Type" + string2)) {
                    GUI.e("_option_dev_" + string3, "<html><b>" + string3.replace("parse", "") + "</b></html>");
                    GUI.a("_option_dev_" + string3).setOpaque(true);
                    if (string2.contentEquals("Detail")) {
                        GUI.a("_option_dev_" + string3).setBackground(Color.lightGray);
                    } else {
                        GUI.a("_option_dev_" + string3).setBackground(Color.gray);
                    }
                } else if (string3.contentEquals(String.valueOf(string) + string2 + "Class")) {
                    GUI.e("_option_dev_" + string3, "selector");
                } else if (string3.contentEquals(String.valueOf(string) + string2 + "ClassType")) {
                    GUI.e("_option_dev_" + string3, "applyRegExpOn");
                } else if (string3.contentEquals(String.valueOf(string) + string2 + "GlobalSearch")) {
                    GUI.e("_option_dev_" + string3, "globalSearch");
                } else if (string3.contentEquals(String.valueOf(string) + string2 + "Column")) {
                    GUI.e("_option_dev_" + string3, "column");
                } else if (string3.contentEquals("parse" + a.n(string) + "Type" + string2)) {
                    GUI.e("_option_dev_" + string3, "selectorType");
                } else {
                    GUI.e("_option_dev_" + string3, string3);
                }
                if (string3.endsWith("Type") || string3.endsWith("Type" + string2) || string3.endsWith("GlobalSearch") || string3.endsWith(String.valueOf(string2) + "Column")) {
                    String[] arrstring = new String[]{"css-selector+regexp", "regexp"};
                    if (string3.endsWith("ClassType")) {
                        arrstring = new String[]{"html", "text"};
                    } else if (string3.endsWith("GlobalSearch")) {
                        arrstring = new String[]{"contact", "global"};
                    } else if (string3.endsWith(String.valueOf(string2) + "Column")) {
                        arrstring = aM.c();
                    }
                    String string4 = bn.Q(string3);
                    if (string4 == null) {
                        string4 = "0";
                    }
                    if (string4.contentEquals("")) {
                        string4 = "0";
                    }
                    if ((string3.endsWith("Type" + string2) || string3.endsWith("ClassType") || string3.endsWith("GlobalSearch")) && !string4.contentEquals("0") && !string4.contentEquals("1")) {
                        string4 = !string4.contains("html") && string4.contains("text") ? "1" : "0";
                    }
                    GUI.a("_option_dev_" + string3, arrstring, 120, 25, (int)aM.a(string4));
                    jPanel.add(GUI.a("_option_dev_" + string3));
                    jPanel.add(GUI.a("_option_dev_" + string3));
                } else {
                    GUI.a("_option_dev_" + string3, bn.Q(string3), 50);
                    jPanel.add(GUI.a("_option_dev_" + string3));
                    jPanel.add(GUI.a("_option_dev_" + string3));
                }
                ++n2;
            }
            e.add(jPanel);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void f() {
        try {
            int n2;
            if (bn.Q("order") == null) {
                bn.d(GUI.D(), "order", "");
            }
            Object object = RearrangeOrderOfPanels.a(b);
            int n3 = 0;
            while (n3 < object.size()) {
                n2 = Integer.parseInt(((String)object.get(n3)).trim());
                ((ac)GSetting.f.get((int)n2)).c = n3++;
            }
            Collections.sort(f);
            String string = "";
            n2 = 0;
            while (n2 < f.size()) {
                object = (ac)f.get(n2);
                string = string.contentEquals("") ? String.valueOf(n2) + "," + object.columnName + "," + (object.b ? "1" : "0") : String.valueOf(string) + ";" + n2 + "," + object.columnName + "," + (object.b ? "1" : "0");
                ++n2;
            }
            bn.d(GUI.D(), "order", string);
            GUI.p("contact");
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void main(String[] arrstring) {
        try {
            Main.main(arrstring);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

