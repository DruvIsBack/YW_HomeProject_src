/*
 * Decompiled with CFR 0_132.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public final class aO
implements ActionListener {
    @Override
    public final void actionPerformed(ActionEvent serializable) {
        try {
            if (serializable.getSource().getClass().toString().contains("javax.swing.JButton")) {
                String string = (serializable = (JButton)serializable.getSource()).getActionCommand();
                if (string.equals("_capture")) {
                    GUI.a().n();
                    return;
                }
                if (string.equals("_stop")) {
                    GUI.a();
                    GUI.f();
                    return;
                }
                if (string.equals("_file")) {
                    new GFileDialog();
                    return;
                }
                if (string.equals("_export")) {
                    GUI.a().i("csv");
                    return;
                }
                if (string.equals("_buy") || string.equals("_buy2")) {
                    GUI.j();
                    return;
                }
                if (string.equals("_error")) {
                    GUI.a().i();
                    return;
                }
                if (string.equals("setting_save")) {
                    GUI.a();
                    GUI.o();
                    GSetting.f();
                    return;
                }
                if (string.equals("setting_close")) {
                    SwingUtilities.getWindowAncestor(GUI.a("setting_close")).dispose();
                    return;
                }
                if (string.equals("_close_about")) {
                    SwingUtilities.getWindowAncestor(GUI.a("_close_about")).dispose();
                    return;
                }
                if (!string.equals("_close_licence") && !string.equals("_close_help")) {
                    if (string.equals("_close_update")) {
                        SwingUtilities.getWindowAncestor(GUI.a("_close_update")).dispose();
                        return;
                    }
                    if (string.equals("_setting_btn_update") || string.equals("_setting_adv_btn_update")) {
                        a.a(null);
                        return;
                    }
                    if (!string.equals("_valid_licence")) {
                        if (string.equals("_setting_proxy_import")) {
                            GUI.a();
                            GUI.k();
                            return;
                        }
                        if (string.equals("_setting_deleteSoftware1")) {
                            GUI.f(String.valueOf(GUI.a("_setting_deleteSoftware").getSelectedItem()));
                            return;
                        }
                        if (string.equals("_setting_addSoftware1")) {
                            GUI.g(GUI.a("_setting_addSoftware").getText());
                            return;
                        }
                        if (string.equals("_settingtabimportproxy")) {
                            GUI.a();
                            GUI.l();
                            return;
                        }
                        if (string.equals("_container0_1b3")) {
                            GUI.a().k("department");
                            return;
                        }
                        if (string.equals("_container0_2b3")) {
                            GUI.a().k("zipcity");
                            return;
                        }
                        if (string.equals("_container0_3b2")) {
                            GUI.a().k("street");
                            return;
                        }
                        if (string.equals("_container0_1b4")) {
                            GUI.a().j("department");
                            return;
                        }
                        if (string.equals("_container0_2b4")) {
                            GUI.a().j("zipcity");
                            return;
                        }
                        if (string.equals("_container0_3b3")) {
                            GUI.a().j("street");
                            return;
                        }
                        if (!(string.equals("_container0_1b1") || string.equals("_container0_2b1") || string.equals("_container0_3b1") || string.equals("_container0_1b2") || string.equals("_container0_2b2"))) {
                            if (string.equals("_setting_mailer_param_act")) {
                                GUI.a().y();
                                return;
                            }
                            if (string.equals("_setting_advanced")) {
                                GUI.a().x();
                                return;
                            }
                            if (string.equals("_searchbuttonlist")) {
                                GUI.a().l(aM.G("dlg_man_list"));
                                return;
                            }
                            if (string.equals("_searchbuttonsemiauto")) {
                                GUI.a().l(aM.G("dlg_man_semiauto"));
                                return;
                            }
                            if (string.equals("_searchbuttonmanual")) {
                                GUI.a().l(aM.G("dlg_man_manual"));
                                return;
                            }
                            if (string.equals("_searchbuttonbrowser")) {
                                GUI.a().l(aM.G("dlg_man_browser"));
                                return;
                            }
                        }
                    }
                }
            } else if (serializable.getSource().getClass().toString().contains("javax.swing.JMenuItem")) {
                String string = (serializable = (JMenuItem)serializable.getSource()).getActionCommand();
                if (string.contentEquals("menuFileStart")) {
                    GUI.a().n();
                    return;
                }
                if (string.contentEquals("menuFileStartExpert")) {
                    new GDashboard();
                    return;
                }
                if (string.contentEquals("menuFileImport")) {
                    new GFileDialog();
                    return;
                }
                if (string.contentEquals("exportfichier")) {
                    GUI.a();
                    GUI.u();
                    return;
                }
                if (string.contentEquals("parametre")) {
                    new GSetting();
                    return;
                }
                if (string.contentEquals("menuHelp")) {
                    GUI.a().t();
                    return;
                }
                if (string.contentEquals("menuAbout")) {
                    GUI.a().z();
                    return;
                }
                if (string.contentEquals("menuLicence")) {
                    GUI.a().v();
                    return;
                }
                if (!string.contentEquals("menuUpdate")) {
                    if (string.contentEquals("menuClose")) {
                        GUI.a().s();
                        return;
                    }
                    if (string.contentEquals("menuClosePreProd")) {
                        bd.t();
                        return;
                    }
                    if (string.contentEquals("menuFileExport")) {
                        GUI.a().i("csv");
                        return;
                    }
                }
            } else if (serializable.getSource().getClass().toString().contains("javax.swing.JCheckBox")) {
                serializable = (JCheckBox)serializable.getSource();
                String string = serializable.getActionCommand();
                Object object = new String[]{"show_tBList", "show_tBSemiAuto", "show_tBManual", "show_tBBrowser", "detailcapture", "professionnalMark", "genderDeduct", "separateforename", "ageDeduct", "housingDeduct", "show_page", "show_contact", "proxy_use", "custom_list_use", "custom_list_use_act", "mailer_use", "capturebcoinminprice"};
                String[] arrstring = new String[]{"listevide"};
                if (string.startsWith("_setting_")) {
                    string = string.substring(9);
                }
                if (("_setting_" + Arrays.asList(object)).contains(string)) {
                    object = "0";
                    if (GUI.a("_setting_" + string).isSelected()) {
                        object = "1";
                    }
                    if (string.contentEquals("capturebcoinminprice")) {
                        aH.b(GUI.D(), string, (String)object);
                    } else {
                        bn.d(GUI.D(), string, (String)object);
                    }
                    if (GUI.D().contentEquals("IQUALIF France Yellow") && serializable.isSelected()) {
                        GUI.d().put("zipcity", 10);
                    } else {
                        GUI.d().put("zipcity", 700);
                    }
                    if (string.contentEquals("show_page") && serializable.isSelected()) {
                        GUI.a("_container5").setVisible(true);
                        return;
                    }
                    if (string.contentEquals("show_page") && !serializable.isSelected()) {
                        GUI.a("_container5").setVisible(false);
                        return;
                    }
                    if (string.contentEquals("show_contact") && serializable.isSelected()) {
                        GUI.a("_container4").setVisible(true);
                        return;
                    }
                    if (string.contentEquals("show_contact") && !serializable.isSelected()) {
                        GUI.a("_container4").setVisible(false);
                        return;
                    }
                    if (string.contentEquals("detailcapture")) {
                        GUI.a().q();
                        return;
                    }
                    if (string.contentEquals("proxy_use") && serializable.isSelected()) {
                        GUI.d(aM.G("dlg_stg_antiblacklist_txt1"), aM.G("dlg_start"));
                        return;
                    }
                } else {
                    if (Arrays.asList(arrstring).contains(string)) {
                        GUI.d(aM.G("dlg_man_warning"), aM.G("dlg_start"));
                        serializable.setSelected(false);
                        return;
                    }
                    if (!string.contains("srv_selected")) {
                        GUI.d(aM.G("dlg_man_warning1"), aM.G("dlg_start"));
                        return;
                    }
                }
            } else if (serializable.getSource().getClass().toString().contains("javax.swing.JComboBox")) {
                GUI.a().a((ActionEvent)serializable);
                return;
            }
        }
        catch (Throwable throwable) {}
    }
}

