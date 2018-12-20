/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class o {
    private static String a = "";

    public static String a(String string) {
        String string2 = "";
        a = "";
        try {
            if (GUI.c() == 1) {
                a = string2 = a.a(string);
            } else if (GUI.c() == 2) {
                a = string2 = ((BrowserFX)((Object)GUI.b().get(string))).i();
            }
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String d(String string, String string2) {
        String string3 = "";
        a = "";
        try {
            if (GUI.c() == 1) {
                a = string3 = a.b(string2);
            } else if (GUI.c() == 2) {
                GUI.b().get(string);
                a = string3 = BrowserFX.l();
            }
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String c(String string) {
        String string2 = "";
        a = "";
        try {
            if (GUI.c() == 1) {
                a = string2 = a.c(string);
            } else if (GUI.c() == 2) {
                a = string2 = ((BrowserFX)((Object)GUI.b().get(string))).j();
            }
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String d(String string) {
        String string2 = "";
        a = "";
        try {
            if (GUI.c() == 1) {
                a = string2 = a.d(string);
            } else if (GUI.c() == 2) {
                a = string2 = ((BrowserFX)((Object)GUI.b().get(string))).k();
            }
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String e(String string) {
        String string2 = "";
        a = "";
        try {
            if (GUI.c() == 1) {
                a = string2 = a.e(string);
            } else if (GUI.c() == 2) {
                GUI.b().get(string);
                a = string2 = BrowserFX.m();
            }
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static String f(String string) {
        String string2 = "";
        a = "";
        try {
            if (GUI.c() == 1) {
                a = string2 = a.f(string);
            } else if (GUI.c() == 2) {
                a = string2 = ((BrowserFX)((Object)GUI.b().get(string))).h();
            }
        }
        catch (Throwable throwable) {}
        return a;
    }

    public static void a(String string, String string2) {
        block8 : {
            try {
                if (GUI.c() == 1) {
                    try {
                        SwingUtilities.invokeAndWait(new x(string, string2));
                        break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            ((JWebBrowser)GUI.b().get(string)).navigate(string2);
                            break block8;
                        }
                        catch (Throwable throwable2) {
                            return;
                        }
                    }
                }
                if (GUI.c() == 2) {
                    ((BrowserFX)((Object)GUI.b().get(string))).a(string2, (HashMap)null, (HashMap)null);
                    return;
                }
            }
            catch (Throwable throwable) {}
        }
    }

    public static void a(String string, String string2, HashMap hashMap) {
        block6 : {
            try {
                if (GUI.c() == 1) {
                    try {
                        WebBrowserNavigationParameters webBrowserNavigationParameters = new WebBrowserNavigationParameters();
                        webBrowserNavigationParameters.setPostData((Map)hashMap);
                        SwingUtilities.invokeLater(new q(string, string2, webBrowserNavigationParameters));
                        break block6;
                    }
                    catch (Throwable throwable) {
                        return;
                    }
                }
                if (GUI.c() == 2) {
                    ((BrowserFX)((Object)GUI.b().get(string))).b(string2, null, null);
                    return;
                }
            }
            catch (Throwable throwable) {}
        }
    }

    public static void b(String object, String string) {
        block7 : {
            try {
                if (GUI.c() == 0) {
                    return;
                }
                if (GUI.c() == 1) {
                    try {
                        object = (JWebBrowser)GUI.b().get(object);
                        object = (JPanel)object.getParent();
                        TitledBorder titledBorder = (TitledBorder)object.getBorder();
                        titledBorder.setTitle(string);
                        object.repaint();
                        break block7;
                    }
                    catch (Throwable throwable) {
                        return;
                    }
                }
                if (GUI.c() == 2) {
                    BrowserFX.b((String)object, string);
                    return;
                }
            }
            catch (Throwable throwable) {}
        }
    }

    public static JPanel a(String string, String string2, String string3) {
        JPanel jPanel;
        jPanel = new JPanel(new BorderLayout());
        try {
            if (GUI.c() == 0) {
                return jPanel;
            }
            if (GUI.c() == 1) {
                jPanel = a.a(string, string2, string3);
            } else if (GUI.c() == 2) {
                jPanel = BrowserFX.a(string, string2, string3);
            }
        }
        catch (Throwable throwable) {}
        return jPanel;
    }

    public static String g() {
        return a;
    }

    public static void d(String string) {
        a = string;
    }
}

