/*
 * Decompiled with CFR 0_132.
 */
import java.io.File;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class bd {
    public static boolean t() {
        try {
            try {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                Object object5 = bn.i();
                int n2 = 0;
                while (n2 < object5.size()) {
                    object3 = (String)object5.get(n2);
                    object2 = new Date();
                    object4 = new SimpleDateFormat("yyyy-MM-dd kk-mm-ss");
                    object = object4.format((Date)object2);
                    aH.b((String)object3, "created_on", "");
                    aH.b((String)object3, "last_app_update", (String)object);
                    aH.b((String)object3, "adv_sql", "0");
                    aH.b((String)object3, "adv_sql_host", "127.0.0.1");
                    aH.b((String)object3, "adv_sql_db", "iqualif");
                    aH.b((String)object3, "adv_sql_user", "root");
                    aH.b((String)object3, "adv_sql_password", "");
                    aH.b((String)object3, "srv_list", "127.0.0.1:13267:iqualif");
                    aH.b((String)object3, "srv_pass", "iqualif");
                    aH.b((String)object3, "srv_port", "13267");
                    aH.b((String)object3, "srv_distant", "0");
                    aH.b((String)object3, "adv_update", "1");
                    GUI.a();
                    aH.b((String)object3, "softwareExport", GUI.B((String)object3));
                    aH.b((String)object3, "multithread_number", "0");
                    aH.b((String)object3, "capturebcoinminprice", "0");
                    bn.d((String)object3, "mailtype", "0");
                    bn.d((String)object3, "mailauth", "0");
                    bn.d((String)object3, "mailcrypt", "0");
                    bn.d((String)object3, "mailhost", "smtp.gmail.com");
                    bn.d((String)object3, "mailport", "25");
                    bn.d((String)object3, "mailuser", "account@gmail.com");
                    bn.d((String)object3, "mailpass", "");
                    bn.d((String)object3, "mailfrom", "account@gmail.com");
                    bn.d((String)object3, "mailto", "");
                    bn.d((String)object3, "mailcc", "");
                    bn.d((String)object3, "mailcci", "");
                    bn.d((String)object3, "mailsubject", "Subject");
                    bn.d((String)object3, "mailbody", "This is a test mail");
                    bn.d((String)object3, "mailattachment", "empty");
                    bn.d((String)object3, "detailcapture", "0");
                    bn.d((String)object3, "mailCapture", "0");
                    bn.d((String)object3, "delete_duplicate", "1");
                    bn.d((String)object3, "professionnalMark", "1");
                    bn.d((String)object3, "genderDeduct", "1");
                    bn.d((String)object3, "separateforename", "1");
                    bn.d((String)object3, "housingDeduct", "1");
                    bn.d((String)object3, "ageDeduct", "1");
                    bn.d((String)object3, "show_page", "1");
                    bn.d((String)object3, "show_contact", "1");
                    bn.d((String)object3, "show_tBList", "1");
                    bn.d((String)object3, "show_tBSemiAuto", "1");
                    bn.d((String)object3, "show_tBManual", "1");
                    bn.d((String)object3, "show_tBBrowser", "1");
                    bn.d((String)object3, "proxy_use", "0");
                    if (object3.contains("White and Yellow")) {
                        aH.b((String)object3, "defaultdisplaymode", aM.G("dlg_man_browser"));
                        bn.d((String)object3, "delete_duplicate", "0");
                        bn.d((String)object3, "mailCapture", "1");
                        bn.d((String)object3, "professionnalMark", "0");
                    } else if (object3.contains("Yellow")) {
                        aH.b((String)object3, "defaultdisplaymode", aM.G("dlg_man_browser"));
                        bn.d((String)object3, "mailCapture", "1");
                        bn.d((String)object3, "professionnalMark", "0");
                    } else if (object3.contains("White")) {
                        aH.b((String)object3, "defaultdisplaymode", aM.G("dlg_man_list"));
                        bn.d((String)object3, "mailCapture", "0");
                        bn.d((String)object3, "professionnalMark", "1");
                    }
                    if (object3.contentEquals("IQUALIF Anbis White and Yellow")) {
                        bn.d((String)object3, "detailcapture", "1");
                        bn.d((String)object3, "show_tBList", "0");
                        bn.d((String)object3, "show_tBSemiAuto", "0");
                        bn.d((String)object3, "show_tBManual", "0");
                        bn.d((String)object3, "show_tBBrowser", "1");
                    } else if (object3.contentEquals("IQUALIF Austria White")) {
                        bn.d((String)object3, "show_tBList", "1");
                        bn.d((String)object3, "show_tBSemiAuto", "0");
                        bn.d((String)object3, "show_tBManual", "1");
                        bn.d((String)object3, "show_tBBrowser", "1");
                    } else if (object3.contentEquals("IQUALIF Austria Yellow")) {
                        bn.d((String)object3, "detailcapture", "1");
                        bn.d((String)object3, "show_tBList", "1");
                        bn.d((String)object3, "show_tBSemiAuto", "0");
                        bn.d((String)object3, "show_tBManual", "1");
                        bn.d((String)object3, "show_tBBrowser", "1");
                    } else if (object3.contentEquals("IQUALIF Auto24 White and Yellow")) {
                        bn.d((String)object3, "detailcapture", "1");
                        bn.d((String)object3, "show_tBList", "0");
                        bn.d((String)object3, "show_tBSemiAuto", "0");
                        bn.d((String)object3, "show_tBManual", "0");
                        bn.d((String)object3, "show_tBBrowser", "1");
                    } else if (object3.contentEquals("IQUALIF Bangladesh Yellow")) {
                        bn.d((String)object3, "detailcapture", "1");
                        bn.d((String)object3, "show_tBList", "0");
                        bn.d((String)object3, "show_tBSemiAuto", "0");
                        bn.d((String)object3, "show_tBManual", "1");
                        bn.d((String)object3, "show_tBBrowser", "1");
                    } else if (object3.contentEquals("IQUALIF BCoin White and Yellow")) {
                        bn.d((String)object3, "detailcapture", "1");
                        bn.d((String)object3, "mailCapture", "0");
                        bn.d((String)object3, "show_tBList", "1");
                        bn.d((String)object3, "show_tBSemiAuto", "0");
                        bn.d((String)object3, "show_tBManual", "1");
                        bn.d((String)object3, "show_tBBrowser", "1");
                    } else if (!object3.contentEquals("IQUALIF Belgium White")) {
                        if (object3.contentEquals("IQUALIF Belgium 07 Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Belgium Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Canada 41 White")) {
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Denmark Yellow")) {
                            bn.d((String)object3, "show_tBList", "1");
                            bn.d((String)object3, "show_tBSemiAuto", "1");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "0");
                        } else if (object3.contentEquals("IQUALIF Italy Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Finland Yellow")) {
                            bn.d((String)object3, "show_tBList", "1");
                            bn.d((String)object3, "show_tBSemiAuto", "1");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "0");
                        } else if (object3.contentEquals("IQUALIF France Yellow")) {
                            bn.d((String)object3, "custom_list_use", "1");
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Germany Yellow")) {
                            bn.d((String)object3, "custom_list_use", "1");
                        } else if (object3.contentEquals("IQUALIF Germany GS Yellow")) {
                            bn.d((String)object3, "custom_list_use", "1");
                        } else if (object3.contentEquals("IQUALIF Immo24 White and Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Kapa White and Yellow")) {
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Netherlands Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Norway Yellow")) {
                            bn.d((String)object3, "show_tBList", "1");
                            bn.d((String)object3, "show_tBSemiAuto", "1");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "0");
                        } else if (object3.contentEquals("IQUALIF Oedkniss White and Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF PAnnonces White and Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Peru Yellow")) {
                            bn.d((String)object3, "show_tBList", "1");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Philippines Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Portugal White")) {
                            bn.d((String)object3, "show_tBList", "1");
                            bn.d((String)object3, "show_tBSemiAuto", "1");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "0");
                        } else if (object3.contentEquals("IQUALIF Sbito White and Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Singapore Yellow")) {
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Slovakia Yellow")) {
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Spain Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Sweden Yellow")) {
                            bn.d((String)object3, "show_tBList", "1");
                            bn.d((String)object3, "show_tBSemiAuto", "1");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "0");
                        } else if (object3.contentEquals("IQUALIF Switzerland CH Yellow")) {
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                            bn.d((String)object3, "detailcapture", "1");
                        } else if (object3.contentEquals("IQUALIF Switzerland ZP Yellow")) {
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF TAdvisor Yellow") || object3.contentEquals("IQUALIF TAdvisor White and Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "delete_duplicate", "0");
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Tuti White and Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "show_tBList", "0");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "0");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        } else if (object3.contentEquals("IQUALIF Viva White and Yellow")) {
                            bn.d((String)object3, "detailcapture", "1");
                            bn.d((String)object3, "delete_duplicate", "0");
                            bn.d((String)object3, "show_tBList", "1");
                            bn.d((String)object3, "show_tBSemiAuto", "0");
                            bn.d((String)object3, "show_tBManual", "1");
                            bn.d((String)object3, "show_tBBrowser", "1");
                        }
                    }
                    ++n2;
                }
                bi.w();
                Connection connection = SQL.a(String.valueOf(GUI.x()) + bn.I());
                object3 = SQL.a(String.valueOf(GUI.x()) + aH.I());
                object2 = SQL.a(String.valueOf(GUI.x()) + aM.N());
                object4 = SQL.a(String.valueOf(GUI.A()) + bi.ap());
                object = SQL.a(String.valueOf(GUI.A()) + bi.aq());
                object5 = new String[][]{new String[0]};
                SQL.a(GUI.a(), bi.av(), (String[][])object5, "");
                SQL.a(GUI.a(), bi.aw(), (String[][])object5, "");
                SQL.a(GUI.a(), bi.ax(), (String[][])object5, "");
                SQL.a(GUI.b(), bi.ay(), (String[][])object5, "");
                SQL.a(GUI.c(), bi.ay(), (String[][])object5, "");
                SQL.a(GUI.d(), bi.ay(), (String[][])object5, "");
                SQL.a(GUI.g(), bi.ay(), (String[][])object5, "");
                SQL.a(GUI.f(), bi.ay(), (String[][])object5, "");
                SQL.a(GUI.e(), bi.ay(), (String[][])object5, "");
                object5 = String.valueOf(aM.G("file_column")) + "\n";
                a.a(String.valueOf(GUI.A()) + bi.al(), (String)object5);
                a.a(String.valueOf(GUI.x()) + GUI.t(), "");
                SQL.a(connection, "VACUUM");
                SQL.a((Connection)object3, "VACUUM");
                SQL.a((Connection)object2, "VACUUM");
                SQL.a((Connection)object4, "VACUUM");
                SQL.a((Connection)object, "VACUUM");
                SQL.a(GUI.a(), "VACUUM");
                SQL.a(GUI.b(), "VACUUM");
                SQL.a(GUI.c(), "VACUUM");
                SQL.a(GUI.d(), "VACUUM");
                SQL.a(GUI.e(), "VACUUM");
                SQL.a(GUI.f(), "VACUUM");
                SQL.a(GUI.g(), "VACUUM");
                SQL.G();
                connection.close();
                object3.close();
                object2.close();
                object4.close();
                object.close();
                object5 = new ArrayList<String>();
                object5.add(String.valueOf(System.getProperty("user.home")) + File.separator + GUI.r() + File.separator + GUI.D());
                object5.add(GUI.x());
                object5.add(GUI.y());
                object5.add(GUI.z());
                object5.add(GUI.A());
                int n3 = 0;
                while (n3 < object5.size()) {
                    object3 = a.a((String)object5.get(n3), "_update");
                    int n4 = 0;
                    while (n4 < object3.size()) {
                        a.DeleteFile((String)object3.get(n4));
                        ++n4;
                    }
                    object3 = a.a((String)object5.get(n3), ".DS_Store");
                    n4 = 0;
                    while (n4 < object3.size()) {
                        a.DeleteFile((String)object3.get(n4));
                        ++n4;
                    }
                    object3 = a.a((String)object5.get(n3), "Thumbs.db");
                    n4 = 0;
                    while (n4 < object3.size()) {
                        a.DeleteFile((String)object3.get(n4));
                        ++n4;
                    }
                    ++n3;
                }
            }
            catch (Throwable throwable) {}
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            throw throwable;
        }
        System.exit(0);
        return false;
    }
}

