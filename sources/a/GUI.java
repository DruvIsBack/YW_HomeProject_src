/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  com.apple.eawt.Application
 */
import com.apple.eawt.Application;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.accessibility.Accessible;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListSelectionModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GUI {
    private static Level a = Level.INFO;
    private static String r = "v1.098.99.57";
    private static String s = "a.jar";
    private static String t = "IQUALIF";
    private static String u = "Application Data";
    private static String v = "icon.png";
    private static String w = "a_lib";
    private static String x = "r";
    private static String y = "i";
    private static String z = "c";
    private static String A = "k";
    private static String B = "unknown";
    private static String C = "unknown";
    private static String D;
    private static String E;
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    private static String J;
    private static int d;
    private static int e;
    private static aQ a;
    private static aO a;
    private static aP a;
    public static HashMap c;
    private static JOptionPane a;
    private static String K;
    private static String L;
    private static String M;
    private static String N;
    private static long b;
    private static Connection a;
    private static Connection b;
    private static Connection c;
    private static Connection d;
    private static Connection e;
    private static Connection f;
    private static Connection g;
    private static Integer a;
    private HashMap d;
    private static HashMap e;
    private static HashMap f;
    private static HashMap g;
    private static HashMap h;
    private static HashMap i;
    private static HashMap j;
    private static HashMap k;
    private HashMap l;
    private HashMap m;
    private HashMap n;
    private static HashMap o;
    private static DefaultTableModel a;
    private static JLabel b;
    private static GUI b;
    private HashMap p;
    private static DecimalFormat a;
    private static JLabel c;
    private static HashMap q;
    private static HashMap a;
    private static String O;
    private HashMap r;
    private String P;
    private static String Q;
    private int f;
    private static String R;
    private static HashMap s;
    private static String[][] a;
    private static List g;
    private static String[] a;
    private Crawler a = new Crawler();

    static {
        d = 0;
        e = 1;
        a = null;
        a = null;
        a = null;
        c = new HashMap();
        K = "";
        L = "https://www.creationfichierclient.com/nojoo/script/e15.php";
        M = "https://www.creationfichierclient.com/nojoo/script/e15.php";
        N = "a";
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        a = 30000;
        e = new HashMap();
        f = new HashMap();
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        o = new HashMap();
        a = null;
        b = new JLabel("");
        b = null;
        a = new DecimalFormat("###");
        c = new JLabel("status");
        a = new HashMap();
        O = null;
        R = "auto";
        a = new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}};
        g = new ArrayList();
        a = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "20", "25", "30", "35", "40", "45", "50", "60", "70", "80", "90", "100"};
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

    public static void launch(String[] arrstring) {
        Object object = 10;
        try {
            GUI gUI;
            long l2;
            new aR();
            Object object2 = Executors.newCachedThreadPool();
            GUI.c();
            if (B.contentEquals("windows")) {
                if (t.contentEquals("IQUALIF 712 White and Yellow")) {
                    object = 45;
                } else if (t.contentEquals("IQUALIF France White")) {
                    object = 11;
                } else if (t.contentEquals("IQUALIF France Yellow")) {
                    object = 12;
                } else if (t.contentEquals("IQUALIF Australia White")) {
                    object = 13;
                } else if (t.contentEquals("IQUALIF Australia Yellow")) {
                    object = 14;
                } else if (t.contentEquals("IQUALIF BCoin White and Yellow")) {
                    object = 15;
                } else if (t.contentEquals("IQUALIF Belgium White")) {
                    object = 16;
                } else if (t.contentEquals("IQUALIF Belgium Yellow")) {
                    object = 17;
                } else if (t.contentEquals("IQUALIF Canada White")) {
                    object = 18;
                } else if (t.contentEquals("IQUALIF Canada Yellow")) {
                    object = 19;
                } else if (t.contentEquals("IQUALIF Germany White")) {
                    object = 20;
                } else if (t.contentEquals("IQUALIF Germany Yellow")) {
                    object = 21;
                } else if (t.contentEquals("IQUALIF Hungary White")) {
                    object = 22;
                } else if (t.contentEquals("IQUALIF Hungary Yellow")) {
                    object = 23;
                } else if (t.contentEquals("IQUALIF Italy White")) {
                    object = 24;
                } else if (t.contentEquals("IQUALIF Italy Yellow")) {
                    object = 25;
                } else if (t.contentEquals("IQUALIF Kapa White and Yellow")) {
                    object = 26;
                } else if (t.contentEquals("IQUALIF Luxembourg White")) {
                    object = 27;
                } else if (t.contentEquals("IQUALIF Luxembourg Yellow")) {
                    object = 28;
                } else if (t.contentEquals("IQUALIF Morocco White")) {
                    object = 29;
                } else if (t.contentEquals("IQUALIF Morocco Yellow")) {
                    object = 30;
                } else if (t.contentEquals("IQUALIF Netherlands White")) {
                    object = 31;
                } else if (t.contentEquals("IQUALIF Netherlands Yellow")) {
                    object = 32;
                } else if (t.contentEquals("IQUALIF Portugal White")) {
                    object = 33;
                } else if (t.contentEquals("IQUALIF Portugal Yellow")) {
                    object = 34;
                } else if (t.contentEquals("IQUALIF Spain White")) {
                    object = 35;
                } else if (t.contentEquals("IQUALIF Spain Yellow")) {
                    object = 36;
                } else if (t.contentEquals("IQUALIF Switzerland White")) {
                    object = 37;
                } else if (t.contentEquals("IQUALIF Switzerland Yellow")) {
                    object = 38;
                } else if (t.contentEquals("IQUALIF Tunisia White")) {
                    object = 46;
                } else if (t.contentEquals("IQUALIF Tunisia Yellow")) {
                    object = 47;
                } else if (t.contentEquals("IQUALIF United Kingdom White")) {
                    object = 39;
                } else if (t.contentEquals("IQUALIF United Kingdom Yellow")) {
                    object = 40;
                } else if (t.contentEquals("IQUALIF United Kingdom YL Yellow")) {
                    object = 44;
                } else if (t.contentEquals("IQUALIF United States White")) {
                    object = 41;
                } else if (t.contentEquals("IQUALIF United States Yellow")) {
                    object = 42;
                } else if (t.contentEquals("IQUALIF Viva White and Yellow")) {
                    object = 43;
                } else if (t.contentEquals("IQUALIF Belgium 07 Yellow")) {
                    object = 44;
                } else if (t.contentEquals("IQUALIF Dominica White")) {
                    object = 45;
                } else if (t.contentEquals("IQUALIF Lucia White")) {
                    object = 46;
                } else if (t.contentEquals("IQUALIF Sweden Yellow")) {
                    object = 47;
                } else if (t.contentEquals("IQUALIF Finland Yellow")) {
                    object = 48;
                } else if (t.contentEquals("IQUALIF Norway Yellow")) {
                    object = 49;
                } else if (t.contentEquals("IQUALIF Denmark Yellow")) {
                    object = 50;
                } else if (t.contentEquals("IQUALIF United States WP White")) {
                    object = 51;
                } else if (t.contentEquals("IQUALIF TAdvisor Yellow")) {
                    object = 52;
                }
                ServerSocket serverSocket = new ServerSocket((int)object);
                if (serverSocket.getLocalPort() == -1) {
                    GUI.d("Application already started, please exit it before to restart it / Application est d\u00e9j\u00e0 lanc\u00e9e, veuillez la quitter avant de la relancer", aM.G("dlg_start"));
                    System.exit(0);
                }
            }
            SQL.j("SQLite");
            SQL.j("MySQL");
            a.b(F);
            b = l2 = System.nanoTime();
            new aH(t);
            new bn(t);
            GUI.a();
            new aI();
            if (!t.contains(" Kapa ") && !t.contains(" Viva ") && !t.contains(" BCoin") && t.contains(" White")) {
                object = new ad();
                Thread thread = new Thread((Runnable)object);
                object = thread;
                thread.start();
            }
            SQL.F();
            b = gUI = new GUI();
            DisableCertificateValidation.main(null);
            object = new am();
            object2.submit((Runnable)object);
            boolean bl2 = false;
            String[] arrstring2 = arrstring;
            int n2 = arrstring2.length;
            int n3 = 0;
            while (n3 < n2) {
                object2 = arrstring2[n3];
                if (object2.contentEquals("test")) {
                    bl2 = true;
                } else if (object2.contentEquals("preprod")) {
                    bd.t();
                } else if (object2.contentEquals("updatefixed")) {
                    a.b(arrstring[1]);
                    System.exit(0);
                }
                ++n3;
            }
            if (bl2) {
                new bq(arrstring);
                return;
            }
        }
        catch (BindException bindException) {
            GUI.d("Application already started, please exit and restart it / Application est d\u00e9j\u00e0 lanc\u00e9e, veuillez la quitter avant de la relancer", aM.G("dlg_start"));
            System.exit(0);
            return;
        }
        catch (Throwable throwable) {
            GUI.d("Try to uninstall and reinstall software. An exception occured, please contact us for further information / Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Une exception est survenue, veuillez nous contacter sur www.iqualif.com pour plus de d\u00e9tails", aM.G("dlg_start"));
            System.exit(0);
        }
    }

    public GUI() {
        new Inserter();
        try {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            if (B.contentEquals("mac")) {
                if (d == 0) {
                    aH.b(t, "defaultdisplaymode", aM.G("dlg_man_list"));
                } else if (d == 1) {
                    System.setProperty("apple.laf.useScreenMenuBar", "true");
                } else if (d == 2) {
                    System.setProperty("apple.laf.useScreenMenuBar", "true");
                } else {
                    aH.b(t, "defaultdisplaymode", aM.G("dlg_man_list"));
                }
            }
            try {
                object = new Date();
                object4 = new SimpleDateFormat("yyyy-MM-dd kk-mm-ss");
                object3 = object4.format((Date)object);
                object4 = object4.parse(aH.D("last_app_update"));
                long l2 = a.a((Date)object4, (Date)object, TimeUnit.DAYS);
                object2 = aH.D("adv_update");
                if (object2.contentEquals("0") && l2 >= 1L || object2.contentEquals("1") && l2 >= 2L || object2.contentEquals("2") && l2 >= 7L || object2.contentEquals("3") && l2 >= 30L) {
                    aH.b(t, "last_app_update", (String)object3);
                    a.a(null);
                }
            }
            catch (Throwable throwable) {}
            this.d = new HashMap();
            k = new HashMap();
            j = new HashMap();
            this.m = new HashMap();
            this.n = new HashMap();
            this.l = new HashMap();
            new java.util.HashMap();
            o = new HashMap();
            new java.util.HashMap();
            q = new HashMap();
            this.p = new HashMap();
            a = new HashMap();
            this.r = new LinkedHashMap();
            s = new HashMap();
            this.r.put(0, "ASC");
            this.r.put(1, "DESC");
            this.r.put(2, "ASC");
            this.r.put(3, "DESC");
            this.r.put(4, "ASC");
            this.P = "";
            Q = "";
            this.f = 0;
            s.put("department", 20);
            s.put("zipcity", 2000);
            s.put("street", 80000);
            s.put("getzipcitystreet", 200);
            s.put("getformlist", 20);
            GUI.e("splashscreen", aM.G("loading"));
            this.p.put("splashscreen", new bo(t, GUI.a("splashscreen")));
            GUI.e("dialogloading", aM.G("dialogloading"));
            q.put("setting", "none");
            ((bo)this.p.get("splashscreen")).H();
            a.put("id", "none");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            object2 = this;
            try {
                GUI.super.w();
            }
            catch (Throwable throwable) {}
            this.h();
            object2 = this;
            try {
                if (!t.contentEquals("IQUALIF France White")) {
                    if (t.contentEquals("IQUALIF France Yellow")) {
                        s.put("department", 10);
                        if (bn.Q("custom_list_use").contentEquals("1")) {
                            s.put("zipcity", 10);
                        } else {
                            s.put("zipcity", 600);
                        }
                        s.put("street", 50000);
                        s.put("getzipcitystreet", 200);
                        s.put("getformlist", 1);
                    } else if (t.contentEquals("IQUALIF Belgique White") || t.contentEquals("IQUALIF Belgium White")) {
                        s.put("department", 100);
                        s.put("zipcity", 500);
                        s.put("street", 50000);
                        s.put("getzipcitystreet", 200);
                        s.put("getformlist", 50);
                    } else if (t.contentEquals("IQUALIF Germany White") || t.contentEquals("IQUALIF Germany CH Yellow") || t.contentEquals("IQUALIF Germany Yellow") || t.contentEquals("IQUALIF Germany ZP Yellow")) {
                        s.put("zipcity", 3000);
                    } else if (t.contentEquals("IQUALIF Switzerland White")) {
                        s.put("department", 100);
                        s.put("zipcity", 1000);
                        s.put("street", 50000);
                        s.put("getzipcitystreet", 200);
                        s.put("getformlist", 50);
                    } else if (t.contentEquals("IQUALIF Switzerland Yellow") || t.contentEquals("IQUALIF Swiss Yellow") || t.contentEquals("IQUALIF Suisse Yellow")) {
                        s.put("department", 100);
                        s.put("zipcity", 500);
                        s.put("street", 50000);
                        s.put("getzipcitystreet", 200);
                        s.put("getformlist", 50);
                    } else if (t.contentEquals("IQUALIF United Kingdom White")) {
                        s.put("department", 20);
                        s.put("zipcity", 20000);
                        s.put("street", 50000);
                        s.put("getzipcitystreet", 200);
                        s.put("getformlist", 1);
                    }
                }
                GUI.super.setFrame("mainWindows");
                object = GUI.super.a("mainWindows");
                object.setLayout(new BorderLayout());
                object.setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
                object.setTitle(t);
                object.addWindowListener(new aF((GUI)object2));
                object4 = GraphicsEnvironment.getLocalGraphicsEnvironment();
                object3 = object4.getMaximumWindowBounds();
                object.setBounds((Rectangle)object3);
                object.setLocation(0, 0);
                object.setResizable(true);
                object4 = new JPanel();
                object4.setPreferredSize(new Dimension(object.getWidth(), 16));
                object4.setLayout(new BoxLayout((Container)object4, 0));
                c.setHorizontalAlignment(2);
                object4.add(c);
                GUI.super.r();
                object.setJMenuBar(GUI.super.a());
                object.add((Component)GUI.super.a(), "North");
                object.add(GUI.super.b("mainFrame"));
                object.add((Component)object4, "South");
                String string = aH.D("defaultdisplaymode");
                if (string == null) {
                    string = "";
                }
                if (!(string.contentEquals(aM.G("dlg_man_list")) || string.contentEquals(aM.G("dlg_man_semiauto")) || string.contentEquals(aM.G("dlg_man_manual")) || string.contentEquals(aM.G("dlg_man_browser")))) {
                    string = aM.G("dlg_man_searchmode").split(";", -1)[0];
                }
                GUI.a("_settingtool_searchmode").setSelectedItem(string);
                object2.l(string);
                string = aH.D("defaultdisplaymode");
                if (string.contentEquals(aM.G("dlg_man_list")) || string.contentEquals(aM.G("dlg_man_semiauto"))) {
                    object2.k("department");
                }
                GUI.super.p();
                SwingUtilities.invokeLater(new aG((GUI)object2));
                object.setVisible(true);
            }
            catch (Throwable throwable) {
                GUI.d("Cannot initialize display, please contact us for more information", aM.G("dlg_start"));
            }
            if (aH.D("srv_distant").contentEquals("1")) {
                object2 = this;
                try {
                    object = new ax((GUI)object2);
                    object4 = new Thread((Runnable)object);
                    object4.start();
                }
                catch (Throwable throwable) {}
            }
            if (aH.D("created_on").contentEquals("")) {
                object2 = new Date();
                object = new SimpleDateFormat("yyyyMMdd kk-mm-ss");
                object2 = object.format((Date)object2);
                aH.b(t, "created_on", (String)object2);
                return;
            }
        }
        catch (Throwable throwable) {
            GUI.d("Try to uninstall and reinstall software. An exception occured, please contact us for further information / Essayer de d\u00e9sinstaller et r\u00e9installer le logiciel. Une exception est survenue, veuillez nous contacter sur www.iqualif.com pour plus de d\u00e9tails", aM.G("dlg_start"));
            System.exit(0);
        }
    }

    private static boolean c() {
        try {
            if (B.contentEquals("mac")) {
                Application application = Application.getApplication();
                Image image = Toolkit.getDefaultToolkit().getImage(String.valueOf(H) + v);
                application.setDockIconImage(image);
                System.setProperty("com.apple.mrj.application.apple.menu.about.name", t);
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static String[] a() {
        String[] arrstring = new String[]{};
        try {
            List list = bn.i();
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList2 = new ArrayList<String>();
            arrayList2.add("IQUALIF 712 White and Yellow");
            arrayList2.add("IQUALIF Africa Yellow");
            arrayList2.add("IQUALIF Australia White");
            arrayList2.add("IQUALIF Belgium Yellow");
            arrayList2.add("IQUALIF Dominica White");
            arrayList2.add("IQUALIF England White");
            arrayList2.add("IQUALIF First Name White");
            arrayList2.add("IQUALIF France PI Yellow");
            arrayList2.add("IQUALIF Hungary White");
            arrayList2.add("IQUALIF Lucia White");
            arrayList2.add("IQUALIF Madagascar White");
            arrayList2.add("IQUALIF Madagascar Yellow");
            arrayList2.add("IQUALIF Multi White and Yellow");
            arrayList2.add("IQUALIF Netherlands White");
            arrayList2.add("IQUALIF Polynesia White");
            arrayList2.add("IQUALIF Polynesia Yellow");
            arrayList2.add("IQUALIF PP Yellow");
            arrayList2.add("IQUALIF Spain White");
            arrayList2.add("IQUALIF United Kingdom White");
            arrayList2.add("IQUALIF United States White");
            int n2 = 0;
            while (n2 < list.size()) {
                if (a == Level.FINEST) {
                    arrayList.add((String)list.get(n2));
                } else if (t.contentEquals("IQUALIF Canada 41 White") || t.contentEquals("IQUALIF Canada White")) {
                    if (((String)list.get(n2)).contentEquals("IQUALIF Canada 41 White") || ((String)list.get(n2)).contentEquals("IQUALIF Canada White")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contentEquals("IQUALIF Germany GS Yellow") || t.contentEquals("IQUALIF Germany Yellow")) {
                    if (((String)list.get(n2)).contentEquals("IQUALIF Germany GS Yellow") || ((String)list.get(n2)).contentEquals("IQUALIF Germany Yellow")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contentEquals("IQUALIF Italy PG Yellow") || t.contentEquals("IQUALIF Italy Yellow")) {
                    if (((String)list.get(n2)).contentEquals("IQUALIF Italy PG Yellow") || ((String)list.get(n2)).contentEquals("IQUALIF Italy Yellow")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contentEquals("IQUALIF Switzerland CH White") || t.contentEquals("IQUALIF Switzerland White")) {
                    if (((String)list.get(n2)).contentEquals("IQUALIF Switzerland CH White") || ((String)list.get(n2)).contentEquals("IQUALIF Switzerland White")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contentEquals("IQUALIF Switzerland CH Yellow") || t.contentEquals("IQUALIF Switzerland Yellow") || t.contentEquals("IQUALIF Switzerland ZP Yellow")) {
                    if (((String)list.get(n2)).contentEquals("IQUALIF Switzerland CH Yellow") || ((String)list.get(n2)).contentEquals("IQUALIF Switzerland Yellow") || ((String)list.get(n2)).contentEquals("IQUALIF Switzerland ZP Yellow")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contentEquals("IQUALIF United Kingdom YL Yellow") || t.contentEquals("IQUALIF United Kingdom Yellow")) {
                    if (((String)list.get(n2)).contentEquals("IQUALIF United Kingdom YL Yellow") || ((String)list.get(n2)).contentEquals("IQUALIF United Kingdom Yellow")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contentEquals("IQUALIF Multi White and Yellow")) {
                    arrayList.add((String)list.get(n2));
                } else if (t.contains("White and Yellow")) {
                    if (((String)list.get(n2)).contains("White and Yellow")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contains("Yellow")) {
                    if (!((String)list.get(n2)).contains("White and Yellow") && ((String)list.get(n2)).contains("Yellow")) {
                        arrayList.add((String)list.get(n2));
                    }
                } else if (t.contains("White") && !((String)list.get(n2)).contains("White and Yellow") && ((String)list.get(n2)).contains("White")) {
                    arrayList.add((String)list.get(n2));
                }
                ++n2;
            }
            Collections.sort(arrayList);
            String[] arrstring2 = a.a(arrayList);
            return arrstring2;
        }
        catch (Throwable throwable) {
            return arrstring;
        }
    }

    public static String n() {
        String string;
        string = "";
        try {
            String string2 = GUI.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            string = URLDecoder.decode(string2, "UTF-8");
            if (B.contentEquals("windows") && string.startsWith("/")) {
                string = string.substring(1);
            }
            if (string.length() > 5 && string.endsWith(s)) {
                string = string.substring(0, string.length() - 5);
            }
            string2 = string = string.replace("/", File.separator);
            D = string;
            E = string2 = String.valueOf(D) + x + File.separator;
            new StringBuilder(String.valueOf(E)).append(y).append(File.separator);
            new StringBuilder(String.valueOf(E)).append(z).append(File.separator);
            GUI.g();
            F = string2 = String.valueOf(System.getProperty("java.io.tmpdir")) + File.separator + t + File.separator;
            G = string2 = String.valueOf(System.getProperty("user.home")) + File.separator + u + File.separator + t + File.separator + x + File.separator;
            I = string2 = String.valueOf(System.getProperty("user.home")) + File.separator + u + File.separator + t + File.separator + w + File.separator;
            H = string2 = String.valueOf(G) + y + File.separator;
            J = string2 = String.valueOf(G) + z + File.separator;
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static void g() {
        Object object;
        Object object2 = String.valueOf(D) + N;
        object2 = new File((String)object2);
        object2 = a.a((File)object2);
        int n2 = 0;
        while (n2 < object2.size()) {
            Object object3 = (String)object2.get(n2);
            if (object3.contains("title:")) {
                object = Pattern.compile("title:(.*)");
                object3 = object.matcher((CharSequence)object3);
                while (object3.find()) {
                    String string = object3.group(1);
                    object = string;
                    object = string;
                    t = string;
                }
            }
            ++n2;
        }
        if (t.contentEquals("IQUALIF")) {
            object = "IQUALIF France White";
            t = "IQUALIF France White";
        }
    }

    private void h() {
        block14 : {
            String string = "Erreur lors de l'initialisation, veuillez r\u00e9essayer ou r\u00e9installer " + t;
            try {
                String string2 = L;
                q.put("setting", "invalid");
                String string3 = GUI.o();
                String string4 = GUI.q();
                String[] arrstring = new String[2];
                Object object = arrstring;
                arrstring[0] = "";
                object[1] = "";
                String string5 = "";
                object = "";
                if (string3.contentEquals("TRIAL") || string3.length() == 29) {
                    int n2 = 0;
                    while (n2 <= 0) {
                        object = K.a(string2, string3, string4);
                        string5 = object[0];
                        object = object[1];
                        String string6 = "";
                        if (string5.endsWith(" Multi")) {
                            string6 = "Multi";
                            string5 = string5.substring(0, string5.length() - 6);
                        }
                        if (string5.contentEquals((CharSequence)object)) {
                            string = "Licence valide";
                            if (string3.contentEquals("TRIAL")) {
                                q.put("setting", "validTRIAL");
                                return;
                            }
                            q.put("setting", "validLicence");
                            K = string6;
                            return;
                        }
                        if (string5.contentEquals("expiredTRIAL")) {
                            q.put("setting", "expiredTRIAL");
                            string = aM.G("dlg_lic_expiredTRIAL");
                            GUI.d(string, aM.G("dlg_lic_error"));
                            this.v();
                            return;
                        }
                        if (string5.contentEquals("expiredLicence")) {
                            q.put("setting", "expiredLicence");
                            string = aM.G("dlg_lic_expiredLicence");
                            GUI.d(string, aM.G("dlg_lic_error"));
                            this.v();
                            return;
                        }
                        if (string5.contentEquals("alreadyActivatedLicence")) {
                            q.put("setting", "alreadyActivatedLicence");
                            string = String.valueOf(aM.G("dlg_lic_error4")) + " " + string3;
                            GUI.d(string, aM.G("dlg_lic_error"));
                            this.v();
                            return;
                        }
                        if (string5.contentEquals("invalid")) {
                            q.put("setting", "invalid");
                            string = aM.G("dlg_lic_error3");
                            GUI.d(string, aM.G("dlg_lic_error"));
                            this.v();
                            return;
                        }
                        string = string5.contains(aM.G("dlg_lic_error8")) ? string5 : (!a.b() ? aM.G("dlg_lic_error2") : aM.G("dlg_lic_error1"));
                        ++n2;
                    }
                    if (!string5.contentEquals((CharSequence)object)) {
                        q.put("setting", "invalid");
                        GUI.d(string, aM.G("dlg_lic_error"));
                        return;
                    }
                    break block14;
                }
                if (string3.contentEquals("")) {
                    q.put("setting", "none");
                    if (aH.D("created_on").contentEquals("")) {
                        String string7 = "TRIAL";
                        GUI.f("TRIAL");
                        return;
                    }
                    break block14;
                }
                q.put("setting", "invalid");
                GUI.d(string, aM.G("dlg_lic_error"));
                return;
            }
            catch (Throwable throwable) {
                GUI.d(string, aM.G("dlg_lic_error"));
            }
        }
    }

    private static boolean a(String string, Integer n2) {
        try {
            if (string.contentEquals("_zipimportfile")) {
                int n3 = 0;
                while (n3 < g.size()) {
                    String[] arrstring = (String[])g.get(n3);
                    if (n3 != 0) {
                        GUI.a[n3 - 1][0] = arrstring[n2];
                    }
                    ++n3;
                }
            } else if (string.contentEquals("_cityimportfile")) {
                int n4 = 0;
                while (n4 < g.size()) {
                    String[] arrstring = (String[])g.get(n4);
                    if (n4 != 0) {
                        GUI.a[n4 - 1][1] = arrstring[n2];
                    }
                    ++n4;
                }
            } else if (string.contentEquals("_streetimportfile")) {
                int n5 = 0;
                while (n5 < g.size()) {
                    String[] arrstring = (String[])g.get(n5);
                    if (n5 != 0) {
                        GUI.a[n5 - 1][2] = arrstring[n2];
                    }
                    ++n5;
                }
                ((JTable)o.get("filelistimport")).getTableHeader().getColumnModel().getColumn(2).setHeaderValue(aM.G("word_street"));
            } else if (string.contentEquals("_nameimportfile")) {
                int n6 = 0;
                while (n6 < g.size()) {
                    String[] arrstring = (String[])g.get(n6);
                    if (n6 != 0) {
                        GUI.a[n6 - 1][2] = arrstring[n2];
                    }
                    ++n6;
                }
                ((JTable)o.get("filelistimport")).getTableHeader().getColumnModel().getColumn(2).setHeaderValue(aM.G("word_name"));
            }
            ((JTable)o.get("filelistimport")).getTableHeader().repaint();
            ((JTable)o.get("filelistimport")).repaint();
        }
        catch (Throwable throwable) {}
        return false;
    }

    public final void a(ActionEvent object) {
        try {
            if (object.getSource().getClass().toString().contains("javax.swing.JComboBox")) {
                object = (JComboBox)object.getSource();
                String[] arrstring = object.getActionCommand();
                Integer n2 = object.getSelectedIndex();
                String string = object.getSelectedItem().toString();
                String[] arrstring2 = new String[]{"multithread_number", "softwareExport", "coldcalling", "ageExport", "housingExport", "language", "delete_duplicate", "mailCapture", "connectionSpeed", "adv_update", "adv_sql", "custom_list_use", "custom_list_use_act", "srv_distant", "streetimportfilebyname"};
                String[] arrstring3 = new String[]{"_setting_nondefiniazerty", "custom_list_use", "custom_list_use_act"};
                if (arrstring.startsWith("_setting_")) {
                    arrstring = arrstring.substring(9);
                }
                if (arrstring.contentEquals("_settingtool_searchmode")) {
                    this.l(string);
                    return;
                }
                if (("_setting_" + Arrays.asList(arrstring2)).contains((CharSequence)arrstring) || arrstring.toLowerCase().endsWith("type") || arrstring.toLowerCase().endsWith("typedetail") || arrstring.toLowerCase().endsWith("globalsearch") || arrstring.toLowerCase().endsWith("column")) {
                    if (arrstring.contentEquals("multithread_number") || arrstring.contentEquals("softwareExport") || arrstring.contentEquals("srv_distant") || arrstring.contentEquals("adv_update") || arrstring.contentEquals("adv_sql") || arrstring.contentEquals("language")) {
                        aH.b(t, (String)arrstring, String.valueOf(GUI.a("_setting_" + (String)arrstring).getSelectedIndex()));
                        if (arrstring.contentEquals("language")) {
                            this.q();
                        }
                        if (arrstring.contentEquals("srv_distant")) {
                            GUI.d(aM.G("dlg_language_save"), aM.G("dlg_start"));
                        }
                        if (arrstring.contentEquals("softwareExport")) {
                            this.a(GUI.a("_setting_" + (String)arrstring).getSelectedIndex());
                        }
                        if (arrstring.contentEquals("multithread_number")) {
                            GUI.d("It's recommended to import a proxy list when enabled", aM.G("dlg_start"));
                            MRThreadPool.D();
                            return;
                        }
                    } else {
                        if (GUI.a("_setting_" + (String)arrstring) != null) {
                            bn.d(t, (String)arrstring, String.valueOf(GUI.a("_setting_" + (String)arrstring).getSelectedIndex()));
                        } else if (arrstring.startsWith("_option_dev_")) {
                            object = String.valueOf(GUI.a((String)arrstring).getSelectedIndex());
                            if (arrstring.toLowerCase().endsWith("column")) {
                                object = aM.c()[GUI.a((String)arrstring).getSelectedIndex()];
                            }
                            bn.d(t, arrstring.substring(12), (String)object);
                        }
                        if (arrstring.contentEquals("custom_list_use") || arrstring.contentEquals("custom_list_use_act")) {
                            GUI.d(aM.G("dlg_language_save"), aM.G("dlg_start"));
                        }
                        if (arrstring.contentEquals("streetimportfilebyname")) {
                            if (n2 == 0) {
                                int n3 = 0;
                                while (n3 < g.size()) {
                                    arrstring = (String[])g.get(n3);
                                    int n4 = 0;
                                    while (n4 < arrstring.length) {
                                        string = arrstring[n4];
                                        if (string.toLowerCase().contentEquals("nom") || string.toLowerCase().contentEquals("name")) {
                                            GUI.a("_nameimportfile", n4);
                                            GUI.a("_streetimportfile").setSelectedIndex(n4);
                                            break;
                                        }
                                        ++n4;
                                    }
                                    ++n3;
                                }
                                return;
                            }
                            int n5 = 0;
                            while (n5 < g.size()) {
                                arrstring = (String[])g.get(n5);
                                int n6 = 0;
                                while (n6 < arrstring.length) {
                                    string = arrstring[n6];
                                    if (string.toLowerCase().contentEquals("street") || string.toLowerCase().contentEquals("adresse") || string.toLowerCase().contentEquals("rue")) {
                                        GUI.a("_streetimportfile", n6);
                                        GUI.a("_streetimportfile").setSelectedIndex(n6);
                                        break;
                                    }
                                    ++n6;
                                }
                                ++n5;
                            }
                            return;
                        }
                    }
                } else {
                    if (Arrays.asList(arrstring3).contains(arrstring)) {
                        GUI.d(aM.G("dlg_man_warning"), aM.G("dlg_start"));
                        object.setSelectedIndex(0);
                        return;
                    }
                    if (arrstring.contentEquals("_zipimportfile") || arrstring.contentEquals("_cityimportfile") || arrstring.contentEquals("_streetimportfile")) {
                        GUI.a((String)arrstring, n2);
                        return;
                    }
                }
            }
        }
        catch (Throwable throwable) {}
    }

    private static boolean f(String object) {
        boolean bl2;
        bl2 = false;
        try {
            String string = L;
            String string2 = GUI.q();
            String[] arrstring = new String[2];
            Object object2 = arrstring;
            arrstring[0] = "";
            object2[1] = "";
            if (object.contentEquals("TRIAL")) {
                object2 = K.b(string, (String)object, string2);
            } else if (object.length() == 29) {
                object2 = K.b(string, (String)object, string2);
            }
            string = object2[0];
            string2 = object2[1];
            object2 = "";
            if (string.endsWith(" Multi")) {
                object2 = "Multi";
                string = string.substring(0, string.length() - 6);
            }
            if (string.contentEquals(string2)) {
                a.a(String.valueOf(G) + "k", (String)object);
                if (object.contentEquals("TRIAL")) {
                    q.put("setting", "validTRIAL");
                } else {
                    q.put("setting", "validLicence");
                    K = object = object2;
                }
                object = aM.G("dlg_lic_get_txt1");
                bl2 = true;
            } else {
                object = object.contentEquals("TRIAL") && string.contentEquals("already activated") ? aM.G("dlg_lic_get_txt2") : (string.contentEquals("already activated") ? aM.G("dlg_lic_get_txt3") : (string.contentEquals("invalid license") ? aM.G("dlg_lic_get_txt4") : (string.contentEquals("activationlimitexceededLicence") ? aM.G("dlg_lic_get_txt5") : (string.contentEquals("expiredLicence") ? aM.G("dlg_lic_get_txt6") : (!a.b() ? aM.G("dlg_lic_get_txt7") : aM.G("dlg_lic_get_txt8"))))));
            }
            GUI.d((String)object, aM.G("dlg_lic_error"));
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static Integer a() {
        var0 = 1;
        try {
            block24 : {
                block26 : {
                    block28 : {
                        block27 : {
                            block25 : {
                                if (!aH.D("created_on").contentEquals("")) break block24;
                                var1_1 = Locale.getDefault();
                                var2_2 = var1_1.getLanguage().toLowerCase();
                                if (!(var1_1 = var1_1.getCountry().toLowerCase()).equals("br")) break block25;
                                var0 = 5;
                                break block26;
                            }
                            if (!var1_1.equals("tw") && !var1_1.equals("hk") && !var1_1.equals("mo")) break block27;
                            var0 = 14;
                            break block26;
                        }
                        if (!var2_2.equals(new Locale("de").getLanguage())) break block28;
                        var0 = 0;
                        break block26;
                    }
                    if (var2_2.equals(new Locale("en").getLanguage())) ** GOTO lbl-1000
                    if (var2_2.equals(new Locale("es").getLanguage())) {
                        var0 = 2;
                    } else if (var2_2.equals(new Locale("fr").getLanguage())) {
                        var0 = 3;
                    } else if (var2_2.equals(new Locale("it").getLanguage())) {
                        var0 = 4;
                    } else if (var2_2.equals(new Locale("pt").getLanguage())) {
                        var0 = 6;
                    } else if (var2_2.equals(new Locale("tr").getLanguage())) {
                        var0 = 7;
                    } else if (var2_2.equals(new Locale("ru").getLanguage())) {
                        var0 = 8;
                    } else if (var2_2.equals(new Locale("ar").getLanguage())) {
                        var0 = 9;
                    } else if (var2_2.equals(new Locale("hi").getLanguage())) {
                        var0 = 10;
                    } else if (var2_2.equals(new Locale("bn").getLanguage())) {
                        var0 = 11;
                    } else if (var2_2.equals(new Locale("zh").getLanguage())) {
                        var0 = 12;
                    } else if (var2_2.equals(new Locale("ja").getLanguage())) {
                        var0 = 13;
                    } else lbl-1000: // 2 sources:
                    {
                        var0 = 1;
                    }
                }
                aH.b(GUI.t, "language", String.valueOf(var0));
            }
            new aM(GUI.t, aM.b()[Integer.valueOf(aH.D("language"))]);
            return var0;
        }
        catch (Throwable v0) {}
        return var0;
    }

    private static String o() {
        String string;
        string = "";
        try {
            Object object = new File(String.valueOf(G) + A);
            if (!object.isFile()) {
                a.a(String.valueOf(G) + A, "");
            }
            object = a.a((File)object);
            string = a.a((List)object);
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String z(String string) {
        String string2;
        string2 = "";
        try {
            if (string.contentEquals("blacklistdelete")) {
                g g2 = new g(null, GUI.a("dialogloading"), a, GUI.a("_recherche"), string);
                new Thread(g2).start();
                GUI.a("dialogloading").setVisible(true);
                return string2;
            }
            if (string.contentEquals("file_t")) {
                if (Q.contentEquals("")) {
                    Q = string = GUI.z("importfilelisttemp");
                    GUI.d("V\u00e9rifier la correspondance des colonnes avant de D\u00e9marrer la recherche", aM.G("dlg_start"));
                } else {
                    g g3 = new g(new File(Q), GUI.a("dialogloading"), a, GUI.a("_recherche"), string);
                    new Thread(g3).start();
                    GUI.a("dialogloading").setVisible(true);
                }
                return string2;
            }
            File[] arrfile = new FileDialog(null);
            arrfile.setVisible(true);
            arrfile = new File(arrfile.getDirectory(), arrfile.getFile());
            arrfile = new File[]{arrfile};
            int n2 = 0;
            while (n2 < arrfile.length) {
                File file = arrfile[n2];
                g g4 = new g(file, GUI.a("dialogloading"), a, GUI.a("_recherche"), string);
                new Thread(g4).start();
                string2 = file.getPath();
                GUI.a("dialogloading").setVisible(true);
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static void a(String string, String string2, String string3) {
        try {
            if (string.contentEquals("ini")) {
                GUI.a("_container0_1a").setText(string2);
                if (string3 == null) {
                    GUI.a("_container0_1a").setIcon(null);
                    return;
                }
                GUI.a("_container0_1a").setIcon(new ImageIcon(string3));
                return;
            }
            if (string.contentEquals("department")) {
                GUI.a("_container0_2a").setText(string2);
                if (string3 == null) {
                    GUI.a("_container0_2a").setIcon(null);
                    return;
                }
                GUI.a("_container0_2a").setIcon(new ImageIcon(string3));
                return;
            }
            if (string.contentEquals("zipcity")) {
                GUI.a("_container0_3a").setText(string2);
                if (string3 == null) {
                    GUI.a("_container0_3a").setIcon(null);
                    return;
                }
                GUI.a("_container0_3a").setIcon(new ImageIcon(string3));
                return;
            }
            if (string.contentEquals("city")) {
                GUI.a("_container0_4a").setText(string2);
                if (string3 == null) {
                    GUI.a("_container0_4a").setIcon(null);
                    return;
                }
                GUI.a("_container0_4a").setIcon(new ImageIcon(string3));
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static void f(String arrstring) {
        try {
            int n2 = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", null, 0);
            if (n2 == 0) {
                Connection connection = SQL.a(String.valueOf(G) + aM.N());
                arrstring = new String[]{arrstring};
                for (String string : Arrays.asList(aM.b())) {
                    SQL.a(connection, string, arrstring);
                }
                connection.close();
                connection = SQL.a(String.valueOf(G) + bn.I());
                SQL.a(connection, bn.H(), arrstring);
                connection.close();
                connection = SQL.a(String.valueOf(G) + aH.I());
                SQL.a(connection, aH.H(), arrstring);
                connection.close();
                a.a(null);
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static void g(String string) {
        try {
            a.a(string);
            a.a(null);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void h(String string) {
        Object object;
        JTable jTable;
        String[] arrstring;
        Object object2;
        String string2;
        Serializable serializable;
        int n2;
        block41 : {
            ++this.f;
            n2 = this.f;
            Thread.currentThread().getStackTrace();
            object2 = new int[]{};
            arrstring = new String[]();
            serializable = null;
            jTable = null;
            if (string.contentEquals("street")) {
                jTable = (JTable)o.get(string);
                serializable = (JTable)o.get("zipcity");
                string = "zipcity";
                if (R.contentEquals("auto") && ((int[])(object2 = serializable.getSelectedRows())).length <= 0) {
                    return;
                }
            } else if (string.contentEquals("zipcity")) {
                jTable = (JTable)o.get(string);
                serializable = (JTable)o.get("department");
                object2 = serializable.getSelectedRows();
                string = "department";
            } else if (string.contentEquals("department")) {
                jTable = (JTable)o.get(string);
                string = "ini";
            }
            int n3 = 0;
            while (n3 < ((int[])object2).length) {
                object = serializable.getValueAt(object2[n3], 0).toString();
                arrstring.add(object);
                ++n3;
            }
            if (this.f != n2) {
                return;
            }
            string2 = "";
            if (jTable != null) break block41;
            return;
        }
        try {
            Object object3;
            object = (DefaultTableModel)jTable.getModel();
            object.setRowCount(0);
            object2 = new ArrayList();
            serializable = new LinkedHashMap();
            int n4 = 1000;
            if (string.equals("department")) {
                n4 = (Integer)s.get("department");
            } else if (string.equals("zipcity")) {
                n4 = (Integer)s.get("zipcity");
            } else if (string.equals("street")) {
                n4 = (Integer)s.get("street");
            }
            if (string.equals("ini")) {
                string2 = "department";
            }
            if (this.f != n2) {
                return;
            }
            GUI.a(string, a.n(aM.G("dlg_list_txt1").toLowerCase().trim()), String.valueOf(H) + "progress_bar.gif");
            int n5 = 0;
            while (n5 < arrstring.size()) {
                object3 = (String)arrstring.get(n5);
                if (this.f != n2) {
                    return;
                }
                if (string.equals("department")) {
                    string2 = "zipcity";
                    object2.add(object3);
                } else if (string.equals("zipcity")) {
                    string2 = "street";
                    object2.add(object3);
                }
                ++n5;
            }
            if (string.equals("department") || string.equals("zipcity")) {
                Thread.sleep(3000L);
            }
            if (this.f != n2) {
                return;
            }
            e.get("splashscreen");
            LinkedHashMap linkedHashMap = bi.a(this, string2, (List)object2, this, n2, n4, (Integer)s.get("getformlist"));
            object3 = linkedHashMap.keySet().iterator();
            while (object3.hasNext()) {
                if (this.f != n2) {
                    return;
                }
                object2 = object3.next();
                object2 = (String)linkedHashMap.get(object2);
                arrstring = object2.split("\u00a4", -1);
                String string3 = "";
                String string4 = "";
                String string5 = "";
                String string6 = "";
                String string7 = "";
                if (arrstring.length == 6 || arrstring.length == 5) {
                    string3 = arrstring[0];
                    string4 = arrstring[1];
                    string5 = arrstring[2];
                    string6 = arrstring[3];
                    string7 = arrstring[4];
                } else if (arrstring.length == 4) {
                    string3 = arrstring[0];
                    string4 = arrstring[1];
                    string5 = arrstring[2];
                    string6 = arrstring[3];
                } else if (arrstring.length == 3) {
                    string3 = arrstring[0];
                    string4 = arrstring[1];
                    string5 = arrstring[2];
                } else if (arrstring.length == 2) {
                    string3 = arrstring[0];
                    string4 = arrstring[1];
                } else if (arrstring.length == 1) {
                    string3 = arrstring[0];
                }
                if (t.contains("Canada ") || t.contains("Luxembourg ") || t.contains("Switzerland ") || t.contains("Belgium ") || t.contains("Portugal ")) {
                    if (string5.contentEquals("*")) {
                        string5 = aM.G("dlg_man_city");
                    }
                    if (string7.contentEquals("*")) {
                        string7 = aM.G("dlg_man_street");
                    }
                }
                serializable.put(string3, object2);
                object.addRow(new Object[]{string3, string4, string5, string6, string7});
            }
            jTable.setModel((TableModel)object);
            if (this.f == n2) {
                GUI.a(string, aM.G("dlg_man_select"), null);
            }
            if (string2.contentEquals("street")) {
                jTable.selectAll();
            }
            GUI.d();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void i() {
        this.t();
    }

    public static void j() {
        try {
            a.c(aM.G("buylink"));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void i(String object) {
        try {
            Object object2 = new Date();
            Object object3 = new SimpleDateFormat("yyyyMMdd kk-mm-ss");
            object2 = object3.format((Date)object2);
            object3 = "export_" + (String)object2;
            if (object.contentEquals("blacklistexport")) {
                object3 = "blacklistexport_" + (String)object2 + ".csv";
            }
            object2 = new JFileChooser(new File(this.P));
            object2.addChoosableFileFilter(new FileNameExtensionFilter("CSV (;) (*.csv)", "csv"));
            object2.addChoosableFileFilter(new FileNameExtensionFilter("CSV (,) (*.csv)", "csv"));
            object2.addChoosableFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
            object2.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
            object3 = new File((String)object3);
            object2.setSelectedFile((File)object3);
            int n2 = object2.showSaveDialog(null);
            if (n2 == 0) {
                this.P = object2.getSelectedFile().getAbsolutePath();
                object = new c(object2.getSelectedFile().getAbsolutePath(), object2.getFileFilter().toString(), GUI.a("dialogloading"), GUI.a("dialogloading"), (String)object);
                new Thread((Runnable)object).start();
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    private String A(String arrstring) {
        String string;
        string = "";
        try {
            arrstring = arrstring.split("\u00a4", -1);
            String string2 = arrstring[0];
            String string3 = arrstring[1];
            String string4 = arrstring[2];
            String string5 = "";
            boolean bl2 = false;
            while (bl2 < arrstring.length) {
                if (bl2 > BADBOOL 2) {
                    string5 = String.valueOf(arrstring[bl2]) + "\u00a4" + string5;
                }
                bl2 += 1;
            }
            if (string5.endsWith("\u00a4")) {
                string5 = string5.substring(0, string5.length() - 1);
            }
            if (!string2.contentEquals(aH.D("srv_pass"))) {
                return string;
            }
            if (string3.contentEquals("iqstatus")) {
                string = String.valueOf(string2) + "\u00a4" + string3 + "\u00a4" + string4 + "\u00a4" + bi.af();
            } else if (string3.contentEquals("iqstart")) {
                string = String.valueOf(string2) + "\u00a4" + string3 + "\u00a4" + string4 + "\u00a4" + this.a(null, true, "table_t");
            } else if (string3.contentEquals("iqstartorpause")) {
                string = String.valueOf(string2) + "\u00a4" + string3 + "\u00a4" + string4 + "\u00a4" + this.e();
            } else if (string3.contentEquals("iqpause")) {
                string = String.valueOf(string2) + "\u00a4" + string3 + "\u00a4" + string4 + "\u00a4" + GUI.f();
            } else if (string3.contentEquals("iqreplacedb")) {
                bl2 = (boolean)(bi.m(string5) ? 1 : 0);
                string = String.valueOf(string2) + "\u00a4" + string3 + "\u00a4" + string4 + "\u00a4" + bl2;
            } else if (string3.contentEquals("iqreplacezipcitystreetdb")) {
                bi.l(string5);
                string = String.valueOf(string2) + "\u00a4" + string3 + "\u00a4" + string4 + "\u00a4false";
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static boolean d() {
        boolean bl2;
        bl2 = false;
        try {
            boolean bl3 = GUI.k();
            if (((String)q.get("setting")).contentEquals("validTRIAL")) {
                if (!(t.contentEquals("IQUALIF Belgium White") || t.contentEquals("IQUALIF Luxembourg White") || t.contentEquals("IQUALIF Luxembourg Yellow") || t.contentEquals("IQUALIF Morocco White") || t.contentEquals("IQUALIF Morocco Yellow") || t.contentEquals("IQUALIF Switzerland White") || t.contentEquals("IQUALIF Switzerland Yellow"))) {
                    if (bl3) {
                        bl2 = true;
                    } else {
                        GUI.d(aM.G("dlg_lic_expiredTRIAL"), aM.G("dlg_lic_error"));
                        GUI.a().v();
                    }
                }
            } else if (((String)q.get("setting")).contentEquals("validLicence")) {
                bl2 = true;
            } else if (((String)q.get("setting")).contentEquals("expiredTRIAL")) {
                GUI.d(aM.G("dlg_lic_expiredTRIAL"), aM.G("dlg_lic_error"));
                GUI.a().v();
            } else if (!((String)q.get("setting")).contentEquals("none")) {
                if (((String)q.get("setting")).contentEquals("alreadyActivatedLicence")) {
                    GUI.d(aM.G("dlg_lic_get_txt5"), aM.G("dlg_lic_error"));
                } else {
                    GUI.d(aM.G("dlg_lic_error6"), aM.G("dlg_lic_error"));
                }
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public final void j(String object) {
        try {
            ++this.f;
            object = (JTable)o.get(object);
            int n2 = object.getSelectedRowCount();
            if (n2 > 0) {
                object.clearSelection();
                return;
            }
            object.selectAll();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void k(String object) {
        try {
            object = new f(this, (String)object);
            new Thread((Runnable)object).start();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void k() {
        try {
            File[] arrfile = new FileDialog(null);
            arrfile.setVisible(true);
            arrfile = new File(arrfile.getDirectory(), arrfile.getFile());
            arrfile = new File[]{arrfile};
            int n2 = 0;
            while (n2 < arrfile.length) {
                File file = arrfile[n2];
                if (!(file.getName().endsWith(".csv") || file.getName().endsWith(".xls") || file.getName().endsWith(".xlsx") || file.getName().endsWith(".txt"))) {
                    GUI.d(aM.G("dlg_file_format"), aM.G("dlg_start"));
                    return;
                }
                bi.b(new File(file.getPath()), null);
                ++n2;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void l() {
        try {
            h h2 = new h();
            new Thread(h2).start();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private boolean e() {
        try {
            if (bi.az().contentEquals("continue")) {
                GUI.f();
            } else {
                this.a(null, true, "table_t");
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static boolean f() {
        boolean bl2;
        bl2 = false;
        try {
            if (bi.az().contentEquals("continue")) {
                ((JLabel)e.get("_recherche")).setText(a.n(aM.G("dlg_man_search_pausing").trim()));
                bi.P("stop");
                MRThreadPool.r();
                bl2 = true;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public final void m() {
        try {
            Object object = aH.D("srv_list");
            if (!object.contains(";")) {
                object = String.valueOf(object) + ";";
            }
            object = object.split(";", -1);
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = 0;
            while (n2 < ((String[])object).length) {
                if (GUI.a(String.valueOf(n2) + "srv_selected").isSelected()) {
                    arrayList.add(GUI.a(String.valueOf(n2) + "srv_ip").getText());
                }
                ++n2;
            }
            if (arrayList.size() == 0) {
                GUI.d("Selectionner un ou plusieurs PC", "Information");
                return;
            }
            this.a(arrayList, false, "");
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void n() {
        try {
            if (bi.az() == "ini" || bi.az() == "stop") {
                boolean bl2 = this.g();
                if (bl2) {
                    ImageIcon imageIcon = new ImageIcon(String.valueOf(H) + "pausebutton.png");
                    GUI.a("_capture").setIcon(imageIcon);
                    GUI.a("_capture").setText(aM.G("menu_pause"));
                    c.setText("status");
                    return;
                }
            } else {
                boolean bl3 = GUI.f();
                if (bl3) {
                    ImageIcon imageIcon = new ImageIcon(String.valueOf(H) + "startbutton.png");
                    GUI.a("_capture").setIcon(imageIcon);
                    GUI.a("_capture").setText(aM.G("menu_start"));
                    return;
                }
            }
        }
        catch (Throwable throwable) {}
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(List list, boolean bl2, String string) {
        boolean bl3 = false;
        try {
            Object object;
            Object object2;
            String string2;
            Object object3;
            int n2;
            Object object4;
            Object object5;
            Object object6;
            String string3;
            if (bl2) {
                aH.b(t, "defaultdisplaymode", aM.G("dlg_man_list"));
                if (!GUI.a("_settingtool_searchmode").getSelectedItem().toString().contentEquals(aM.G("dlg_man_list"))) {
                    GUI.a("_settingtool_searchmode").setSelectedItem(aM.G("dlg_man_list"));
                }
                bn.d(t, "lastSearchHistory", string);
            }
            String string4 = aM.G("dlg_man_start_noselection");
            GUI.d();
            boolean bl4 = false;
            if (((String)a.get("id")).contentEquals("filesearch")) {
                bl4 = true;
            }
            String string5 = "";
            int n3 = 0;
            ArrayList<String> arrayList = new ArrayList<String>();
            String string6 = bi.af().split("\u00a4", -1)[0];
            if (R.contentEquals("auto")) {
                object3 = (JTable)o.get("zipcity");
                object = (JTable)o.get("street");
                object2 = object.getSelectedRows();
                object4 = object3.getSelectedRows();
                string3 = "table_t";
                if (((int[])object2).length > 0) {
                    n2 = 0;
                    while (n2 < ((int[])object2).length) {
                        string = (String)object.getValueAt((int)object2[n2], 0);
                        object5 = "";
                        string2 = "";
                        object6 = "";
                        if (t.contentEquals("IQUALIF United Kingdom White") || t.contentEquals("IQUALIF United States White") || t.contentEquals("IQUALIF United States WP White") || t.contains("Yellow")) {
                            if (((int[])object4).length > 0) {
                                n3 = 0;
                                while (n3 < ((int[])object4).length) {
                                    string = String.valueOf((String)object3.getValueAt(object4[n3], 0)) + string;
                                    object5 = (String)object3.getValueAt(object4[n3], 1);
                                    string2 = (String)object3.getValueAt(object4[n3], 2);
                                    object6 = (String)object.getValueAt((int)object2[n2], 4);
                                    if ((t.contains("Switzerland ") || t.contains("Belgium ") || t.contains("Portugal ")) && string2.contentEquals(aM.G("dlg_man_city"))) {
                                        string2 = "";
                                    }
                                    arrayList.add(n2 + n3, String.valueOf(string) + "\u00a4" + (String)object5 + "\u00a4" + string2 + "\u00a4" + (String)object6);
                                    ++n3;
                                }
                                n3 = 1;
                            }
                        } else {
                            arrayList.add(n2, String.valueOf(string) + "\u00a4" + (String)object5 + "\u00a4" + string2 + "\u00a4" + (String)object6);
                            n3 = 1;
                        }
                        ++n2;
                    }
                }
            } else if (R.contentEquals("half")) {
                object3 = (JTable)o.get("zipcity");
                object = GUI.a("_container1a_col2a").getText();
                object2 = object3.getSelectedRows();
                if (((int[])object2).length > 0) {
                    if (object.startsWith("Ex : ")) {
                        string4 = aM.G("dlg_man_start_noselection_half1");
                    } else {
                        string5 = "\u00a4\u00a4" + (String)object;
                        n3 = 1;
                    }
                } else {
                    string4 = aM.G("dlg_man_start_noselection_half2");
                }
                string3 = "half";
            } else if (R.contentEquals("manual")) {
                object3 = GUI.a("_container1c_col0").getText();
                object = GUI.a("_container1c_col1").getText();
                object2 = GUI.a("_container1c_col2").getText();
                if (object3.contains(":")) {
                    string4 = aM.G("dlg_man_start_noselection_manual1");
                } else if (object.contains(":")) {
                    string4 = aM.G("dlg_man_start_noselection_manual2");
                } else if (object2.contains(":")) {
                    string4 = aM.G("dlg_man_start_noselection_manual3");
                } else {
                    string5 = String.valueOf(object3) + "\u00a4" + (String)object + "\u00a4" + (String)object2;
                    n3 = 1;
                }
                string3 = "manual";
            } else {
                if (!R.contentEquals("browser")) return false;
                n3 = 1;
                string3 = "browser";
            }
            string = "";
            object3 = "0";
            boolean bl5 = false;
            if (string6.contains("true")) {
                if (n3 != 0 && bl4) {
                    object2 = aM.G("dlg_man_start_q5").split(";", -1);
                    int n4 = GUI.a((String[])object2, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    if (n4 == 0) {
                        bl5 = true;
                    } else if (n4 == 1) {
                        string = "file_t";
                    } else {
                        if (n4 != 2) return false;
                        string = string3;
                    }
                } else if (n3 != 0) {
                    void var15_23;
                    object2 = aM.G("dlg_man_start_q4").split(";", -1);
                    if (bl2) {
                        boolean bl6 = true;
                    } else {
                        int n5 = GUI.a((String[])object2, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    }
                    if (var15_23 == false) {
                        bl5 = true;
                    } else {
                        if (!bq.aA().contentEquals("testing") && var15_23 != true) return false;
                        string = string3;
                    }
                } else if (bl4) {
                    object2 = aM.G("dlg_man_start_q3").split(";", -1);
                    int n6 = GUI.a((String[])object2, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    if (n6 == 0) {
                        bl5 = true;
                    } else {
                        if (n6 != 1) return false;
                        string = "file_t";
                    }
                } else {
                    void var15_27;
                    object2 = aM.G("dlg_man_start_q2").split(";", -1);
                    if (bl2) {
                        boolean bl7 = false;
                    } else {
                        int n7 = GUI.a((String[])object2, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    }
                    if (var15_27 != false) return false;
                    bl5 = true;
                }
            } else {
                bl5 = false;
                if (n3 != 0 && bl4) {
                    object2 = aM.G("dlg_man_start_q1").split(";", -1);
                    int n8 = GUI.a((String[])object2, aM.G("dlg_start"), aM.G("dlg_man_start_q1_txt"));
                    if (n8 == 0) {
                        string = "file_t";
                    } else {
                        if (n8 != 1) return false;
                        string = string3;
                    }
                } else if (n3 != 0) {
                    string = string3;
                } else if (bl4) {
                    string = "file_t";
                }
            }
            if (bl5) {
                ((JLabel)e.get("_recherche")).setText(a.n(aM.G("dlg_man_search_resume").trim()));
                ((JLabel)e.get("_recherche")).setIcon(new ImageIcon(String.valueOf(H) + "loading.gif"));
                if (bl2) {
                    object2 = new ImageIcon(String.valueOf(H) + "pausebutton.png");
                    GUI.a("_capture").setIcon((Icon)object2);
                    GUI.a("_capture").setText(aM.G("menu_pause"));
                    DefaultTableModel defaultTableModel = (DefaultTableModel)((JTable)o.get("contact")).getModel();
                    if (defaultTableModel.getRowCount() > 0) {
                        n2 = defaultTableModel.getRowCount() - 1;
                        while (n2 >= 0) {
                            defaultTableModel.removeRow(n2);
                            --n2;
                        }
                    }
                    bi.x();
                }
                if (string.contentEquals("")) {
                    bn.Q("lastSearchHistory");
                }
                if (bl2) {
                    object2 = new Thread(new aB(this));
                    object2.start();
                } else {
                    GUI.d("La reprise du t\u00e9l\u00e9chargement n'est pas disponible dans ce mode", "Information");
                }
                bl3 = true;
            } else if (!bl5 && n3 == 0 && !bl4) {
                GUI.d(string4, aM.G("dlg_start"));
            } else {
                DefaultTableModel defaultTableModel;
                object2 = aM.G("dlg_man_start_q6").split(";", -1);
                int n9 = GUI.a((String[])object2, aM.G("dlg_start"), aM.G("dlg_man_start_q6_txt"));
                object4 = n9;
                if (n9 == 0) {
                    object3 = "1";
                } else if (!bq.aA().contentEquals("testing") && object4 != true) {
                    return false;
                }
                if (object3.contentEquals("0") && (defaultTableModel = (DefaultTableModel)((JTable)o.get("contact")).getModel()).getRowCount() > 0) {
                    int n10 = defaultTableModel.getRowCount() - 1;
                    while (n10 >= 0) {
                        defaultTableModel.removeRow(n10);
                        --n10;
                    }
                }
                ArrayList<String> arrayList2 = arrayList;
                boolean bl8 = bl5;
                object5 = object3;
                string2 = string5;
                object6 = list;
                Thread thread = new Thread(new aC(this, arrayList2, bl8, (String)object5, string2, (List)object6));
                thread.start();
                bl3 = true;
            }
            if (list == null) return bl3;
            int n11 = 0;
            while (n11 < list.size()) {
                ++n11;
            }
            return bl3;
        }
        catch (Throwable throwable) {}
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean g() {
        boolean bl2 = false;
        try {
            String string;
            Object object;
            Object object2;
            DefaultTableModel defaultTableModel;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            String string2;
            String string3 = aM.G("dlg_man_start_noselection");
            GUI.d();
            boolean bl3 = false;
            if (((String)a.get("id")).contentEquals("filesearch")) {
                bl3 = true;
            }
            String string4 = "";
            int n2 = 0;
            ArrayList<String> arrayList = new ArrayList<String>();
            String string5 = bi.af().split("\u00a4", -1)[0];
            if (R.contentEquals("auto")) {
                object6 = (JTable)o.get("zipcity");
                object5 = (JTable)o.get("street");
                object = object5.getSelectedRows();
                object4 = object6.getSelectedRows();
                string2 = "table_t";
                if (((int[])object).length > 0) {
                    int n3 = 0;
                    while (n3 < ((int[])object).length) {
                        String string6 = (String)object5.getValueAt((int)object[n3], 0);
                        object3 = "";
                        string = "";
                        object2 = "";
                        if (t.contentEquals("IQUALIF United Kingdom White") || t.contentEquals("IQUALIF United States White") || t.contentEquals("IQUALIF United States WP White") || t.contains("Yellow")) {
                            if (((int[])object4).length > 0) {
                                n2 = 0;
                                while (n2 < ((int[])object4).length) {
                                    string6 = String.valueOf((String)object6.getValueAt(object4[n2], 0)) + string6;
                                    object3 = (String)object6.getValueAt(object4[n2], 1);
                                    string = (String)object6.getValueAt(object4[n2], 2);
                                    object2 = (String)object5.getValueAt((int)object[n3], 4);
                                    if ((t.contains("Switzerland ") || t.contains("Belgium ") || t.contains("Portugal ")) && string.contentEquals(aM.G("dlg_man_city"))) {
                                        string = "";
                                    }
                                    arrayList.add(n3 + n2, String.valueOf(string6) + "\u00a4" + (String)object3 + "\u00a4" + string + "\u00a4" + (String)object2);
                                    ++n2;
                                }
                                n2 = 1;
                            }
                        } else {
                            arrayList.add(n3, String.valueOf(string6) + "\u00a4" + (String)object3 + "\u00a4" + string + "\u00a4" + (String)object2);
                            n2 = 1;
                        }
                        ++n3;
                    }
                }
            } else if (R.contentEquals("half")) {
                object6 = (JTable)o.get("zipcity");
                object5 = GUI.a("_container1a_col2a").getText();
                object = object6.getSelectedRows();
                if (((int[])object).length > 0) {
                    if (object5.startsWith("Ex : ")) {
                        string3 = aM.G("dlg_man_start_noselection_half1");
                    } else {
                        string4 = "\u00a4\u00a4" + (String)object5;
                        n2 = 1;
                    }
                } else {
                    string3 = aM.G("dlg_man_start_noselection_half2");
                }
                string2 = "half";
            } else if (R.contentEquals("manual")) {
                object6 = GUI.a("_container1c_col0").getText();
                object5 = GUI.a("_container1c_col1").getText();
                object = GUI.a("_container1c_col2").getText();
                if (object6.contains(":")) {
                    string3 = aM.G("dlg_man_start_noselection_manual1");
                } else if (object5.contains(":")) {
                    string3 = aM.G("dlg_man_start_noselection_manual2");
                } else if (object.contains(":")) {
                    string3 = aM.G("dlg_man_start_noselection_manual3");
                } else {
                    string4 = String.valueOf(object6) + "\u00a4" + (String)object5 + "\u00a4" + (String)object;
                    n2 = 1;
                }
                string2 = "manual";
            } else {
                if (!R.contentEquals("browser")) return false;
                n2 = 1;
                string2 = "browser";
            }
            O = "";
            object6 = "0";
            boolean bl4 = false;
            if (string5.contains("true")) {
                if (n2 != 0 && bl3) {
                    int n4;
                    object = aM.G("dlg_man_start_q5").split(";", -1);
                    int n5 = 2;
                    if (!bq.aA().contentEquals("fastsearch")) {
                        n4 = GUI.a((String[])object, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    }
                    if (n4 == 0) {
                        bl4 = true;
                    } else if (n4 == 1) {
                        O = "file_t";
                    } else {
                        if (n4 != 2) return false;
                        O = string2;
                    }
                } else if (n2 != 0) {
                    int n6;
                    object = aM.G("dlg_man_start_q4").split(";", -1);
                    boolean bl5 = true;
                    if (!bq.aA().contentEquals("fastsearch")) {
                        n6 = GUI.a((String[])object, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    }
                    if (n6 == 0) {
                        bl4 = true;
                    } else {
                        if (!bq.aA().contentEquals("testing")) {
                            if (n6 != true) return false;
                        }
                        O = string2;
                    }
                } else if (bl3) {
                    int n7;
                    object = aM.G("dlg_man_start_q3").split(";", -1);
                    boolean bl6 = true;
                    if (!bq.aA().contentEquals("fastsearch")) {
                        n7 = GUI.a((String[])object, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    }
                    if (n7 == 0) {
                        bl4 = true;
                    } else {
                        if (n7 != true) return false;
                        O = "file_t";
                    }
                } else {
                    object = aM.G("dlg_man_start_q2").split(";", -1);
                    int n8 = GUI.a((String[])object, aM.G("dlg_start"), aM.G("dlg_man_start_q2_txt"));
                    if (n8 != 0) return false;
                    bl4 = true;
                }
            } else {
                bl4 = false;
                if (n2 != 0 && bl3) {
                    object = aM.G("dlg_man_start_q1").split(";", -1);
                    int n9 = GUI.a((String[])object, aM.G("dlg_start"), aM.G("dlg_man_start_q1_txt"));
                    if (n9 == 0) {
                        O = "file_t";
                    } else {
                        if (n9 != 1) return false;
                        O = string2;
                    }
                } else if (n2 != 0) {
                    O = string2;
                } else if (bl3) {
                    O = "file_t";
                }
            }
            if (bl4) {
                ((JLabel)e.get("_recherche")).setText(a.n(aM.G("dlg_man_search_resume").trim()));
                ((JLabel)e.get("_recherche")).setIcon(new ImageIcon(String.valueOf(H) + "loading.gif"));
                if (O.contentEquals("")) {
                    O = bn.Q("lastSearchHistory");
                }
                if (e == 1 && GUI.b() > 1) {
                    object = new String[][]{{"locked", "0"}};
                    String[][] arrstring = new String[][]{{"locked", "1"}};
                    SQL.a(a, bi.au(), (String[][])object, arrstring, "AND");
                    SQL.a(a, bi.av(), (String[][])object, arrstring, "AND");
                    SQL.a(a, bi.aw(), (String[][])object, arrstring, "AND");
                }
                object = new Thread(new aD(this));
                object.start();
                return true;
            }
            if (!bl4 && n2 == 0 && !bl3) {
                GUI.d(string3, aM.G("dlg_start"));
                return bl2;
            }
            object = aM.G("dlg_man_start_q6").split(";", -1);
            object4 = true;
            if (!bq.aA().contentEquals("fastsearch")) {
                object4 = GUI.a((String[])object, aM.G("dlg_start"), aM.G("dlg_man_start_q6_txt"));
            }
            if (object4 == false) {
                object6 = "1";
            } else if (!bq.aA().contentEquals("testing") && object4 != true) {
                return false;
            }
            if (object6.contentEquals("0") && (defaultTableModel = (DefaultTableModel)((JTable)o.get("contact")).getModel()).getRowCount() > 0) {
                int n10 = defaultTableModel.getRowCount() - 1;
                while (n10 >= 0) {
                    defaultTableModel.removeRow(n10);
                    --n10;
                }
            }
            ArrayList<String> arrayList2 = arrayList;
            boolean bl7 = bl4;
            object3 = object6;
            string = string4;
            object2 = new Thread(new aE(this, arrayList2, bl7, (String)object3, string));
            object2.start();
            return true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static String p() {
        String string;
        string = "false\u00a40\u00a40 / 0\u00a40 / 0\u00a40 / 0";
        try {
            string = bi.af();
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static void o() {
        try {
            String string;
            boolean bl2 = true;
            String[] arrstring = new String[]{"httpmethod", "url_search", "url_next_page", "url_browser", "url_browser_next_page", "parseUrlDetail", "urldetailClass", "urldetailprefix", "parseHasNextPage", "hasNextPageClass", "hasNextPageString", "parseNextPageNumber", "nextPageNumberClass", "nextPageNumberString", "addToNextPageNumber", "useLastPageNumber", "parseLastPageNumber", "lastPageNumberClass", "lastPageNumberString", "addToLastPageNumber", "parsePageError", "pageErrorClass", "parsePageErrorType", "pageErrorClassType", "pageErrorGlobalSearch", "parseContact", "contactClass", "parseContactType", "contactClassType", "parseGlobalSearch", "parseName", "nameClass", "parseNameType", "nameClassType", "parseZip", "zipClass", "parseZipType", "zipClassType", "parseCity", "cityClass", "parseCityType", "cityClassType", "parseStreet", "streetClass", "parseStreetType", "streetClassType", "parsePhone", "phone_tClass", "excludesearchPhone", "parseMobile", "mobile_tClass", "parseFax", "fax_tClass", "searchMarketingAccept", "searchMarketingAcceptFound", "parseCategory", "categoryClass", "parseCategoryType", "categoryClassType", "categoryGlobalSearch", "parseSite", "siteClass", "parseSiteType", "siteClassType", "parseMail", "mailClass", "parseMailType", "mailClassType", "parseComment", "commentClass", "parseCommentType", "commentClassType", "parseIsCompany", "isCompanyClass", "parseIsCompanyType", "isCompanyClassType", "isCompanyGlobalSearch", "parseSpecial1", "special1Class", "parseSpecial1Type", "special1ClassType", "special1GlobalSearch", "parseSpecial2", "special2Class", "parseSpecial2Type", "special2ClassType", "special2GlobalSearch", "parseSpecial3", "special3Class", "parseSpecial3Type", "special3ClassType", "special3GlobalSearch", "parseSpecial4", "special4Class", "parseSpecial4Type", "special4ClassType", "special4GlobalSearch", "parseSpecial5", "special5Class", "parseSpecial5Type", "special5ClassType", "special5GlobalSearch", "parseSpecial6", "special6Class", "parseSpecial6Type", "special6ClassType", "special6GlobalSearch", "parseSpecial7", "special7Class", "parseSpecial7Type", "special7ClassType", "special7GlobalSearch", "parsePageErrorDetail", "pageErrorDetailClass", "parsePageErrorTypeDetail", "pageErrorDetailClassType", "pageErrorDetailGlobalSearch", "parseContactDetail", "contactDetailClass", "parseContactTypeDetail", "contactDetailClassType", "contactDetailGlobalSearch", "parseNameDetail", "nameDetailClass", "parseNameTypeDetail", "nameDetailClassType", "nameDetailGlobalSearch", "parseZipDetail", "zipDetailClass", "parseZipTypeDetail", "zipDetailClassType", "zipDetailGlobalSearch", "parseCityDetail", "cityDetailClass", "parseCityTypeDetail", "cityDetailClassType", "cityDetailGlobalSearch", "parseStreetDetail", "streetDetailClass", "parseStreetTypeDetail", "streetDetailClassType", "streetDetailGlobalSearch", "parsePhoneDetail", "phone_tDetailClass", "excludesearchPhoneDetail", "parseMobileDetail", "mobile_tDetailClass", "parseFaxDetail", "fax_tDetailClass", "searchMarketingAcceptDetail", "searchMarketingAcceptFoundDetail", "parseCategoryDetail", "categoryDetailClass", "parseCategoryTypeDetail", "categoryDetailClassType", "categoryDetailGlobalSearch", "parseSiteDetail", "siteDetailClass", "parseSiteTypeDetail", "siteDetailClassType", "siteDetailGlobalSearch", "parseMailDetail", "mailDetailClass", "parseMailTypeDetail", "mailDetailClassType", "mailDetailGlobalSearch", "parseCommentDetail", "commentDetailClass", "parseCommentTypeDetail", "commentDetailClassType", "commentDetailGlobalSearch", "parseIsCompanyDetail", "isCompanyDetailClass", "parseIsCompanyTypeDetail", "isCompanyDetailClassType", "isCompanyDetailGlobalSearch", "parseSpecial1Detail", "special1DetailClass", "parseSpecial1TypeDetail", "special1DetailClassType", "special1DetailGlobalSearch", "parseSpecial2Detail", "special2DetailClass", "parseSpecial2TypeDetail", "special2DetailClassType", "special2DetailGlobalSearch", "parseSpecial3Detail", "special3DetailClass", "parseSpecial3TypeDetail", "special3DetailClassType", "special3DetailGlobalSearch", "parseSpecial4Detail", "special4DetailClass", "parseSpecial4TypeDetail", "special4DetailClassType", "special4DetailGlobalSearch", "parseSpecial5Detail", "special5DetailClass", "parseSpecial5TypeDetail", "special5DetailClassType", "special5DetailGlobalSearch", "parseSpecial6Detail", "special6DetailClass", "parseSpecial6TypeDetail", "special6DetailClassType", "special6DetailGlobalSearch", "parseSpecial7Detail", "special7DetailClass", "parseSpecial7TypeDetail", "special7DetailClassType", "special7DetailGlobalSearch", "parseSpecial8Detail", "special8DetailClass", "parseSpecial8TypeDetail", "special8DetailClassType", "special8DetailGlobalSearch", "parseSpecial9Detail", "special9DetailClass", "parseSpecial9TypeDetail", "special9DetailClassType", "special9DetailGlobalSearch", "parseSpecial10Detail", "special10DetailClass", "parseSpecial10TypeDetail", "special10DetailClassType", "special10DetailGlobalSearch", "parseSpecial11Detail", "special11DetailClass", "parseSpecial11TypeDetail", "special11DetailClassType", "special11DetailGlobalSearch", "parseSpecial12Detail", "special12DetailClass", "parseSpecial12TypeDetail", "special12DetailClassType", "special12DetailGlobalSearch", "parseSpecial13Detail", "special13DetailClass", "parseSpecial13TypeDetail", "special13DetailClassType", "special13DetailGlobalSearch", "parseSpecial14Detail", "special14DetailClass", "parseSpecial14TypeDetail", "special14DetailClassType", "special14DetailGlobalSearch", "parseSpecial15Detail", "special15DetailClass", "parseSpecial15TypeDetail", "special15DetailClassType", "special15DetailGlobalSearch", "parseSpecial16Detail", "special16DetailClass", "parseSpecial16TypeDetail", "special16DetailClassType", "special16DetailGlobalSearch", "parseBrowserStreet", "parseBrowserCity", "parseBrowserZip", "parsePhoneOcr", "phoneOcrClass", "parsePhoneOcrType", "phoneOcrClassType", "phoneOcrGlobalSearch", "isPhoneOcr", "phoneOcrPrefix", "parseMailOcr", "mailOcrClass", "parseMailOcrType", "mailOcrClassType", "mailOcrGlobalSearch", "isMailOcr", "mailOcrPrefix"};
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("");
            arrayList.add("detail");
            for (String string2 : arrayList) {
                ArrayList<String> arrayList2 = new ArrayList<String>();
                arrayList2.add("parse\u00a4id\u00a4" + string2);
                arrayList2.add("\u00a4id\u00a4" + string2 + "Class");
                Iterator object2 = arrayList2.iterator();
                while (object2.hasNext()) {
                    string = (String)object2.next();
                    for (String string22 : bi.h()) {
                        boolean bl3 = bn.d(t, string22 = string.replace("\u00a4id\u00a4", string22), GUI.a("_option_dev_" + string22).getText());
                        if (bl3) continue;
                        bl2 = false;
                    }
                }
            }
            String[] arrstring2 = new String[]{"language", "delete_duplicate", "mailCapture", "connectionSpeed"};
            String[] arrstring22 = new String[]{"detailcapture", "professionnalMark", "show_page"};
            int n2 = 0;
            while (n2 < arrstring22.length) {
                boolean bl4;
                string = "0";
                if (GUI.a("_setting_" + arrstring22[n2]).isSelected()) {
                    string = "1";
                }
                if (!(bl4 = bn.d(t, arrstring22[n2], string))) {
                    bl2 = false;
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring2.length) {
                GUI.a("_setting_" + arrstring2[n2]);
                boolean bl5 = bn.d(t, arrstring2[n2], String.valueOf(GUI.a("_setting_" + arrstring2[n2]).getSelectedIndex()));
                if (!bl5) {
                    bl2 = false;
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring.length) {
                boolean bl6;
                if (!(arrstring[n2].endsWith("Type") || arrstring[n2].endsWith("TypeDetail") || arrstring[n2].endsWith("GlobalSearch") || (bl6 = bn.d(t, arrstring[n2], GUI.a("_option_dev_" + arrstring[n2]).getText())))) {
                    bl2 = false;
                }
                ++n2;
            }
            if (!bl2) {
                GUI.d(aM.G("dlg_stg_save_error"), aM.G("dlg_stg"));
                return;
            }
            GUI.d(aM.G("dlg_stg_save_ok"), aM.G("dlg_stg"));
            SwingUtilities.getWindowAncestor(GUI.a("setting_close")).dispose();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private JMenuBar a() {
        JMenuBar jMenuBar;
        jMenuBar = new JMenuBar();
        try {
            JMenu jMenu = new JMenu(aM.G("menu_file"));
            jMenuBar.add(jMenu);
            Accessible accessible = new ImageIcon(String.valueOf(H) + "menustartbutton.png");
            accessible = new JMenuItem(aM.G("menu_file_start"), (Icon)((Object)accessible));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuFileStart");
            this.d.put("menuFileStart", accessible);
            jMenu.add((JMenuItem)accessible);
            accessible = new ImageIcon(String.valueOf(H) + "menumultibutton.png");
            accessible = new JMenuItem(aM.G("menu_file_start_expert"), (Icon)((Object)accessible));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuFileStartExpert");
            this.d.put("menuFileStartExpert", accessible);
            jMenu.add((JMenuItem)accessible);
            accessible = new ImageIcon(String.valueOf(H) + "menuimport.png");
            accessible = new JMenuItem(aM.G("menu_file_import"), (Icon)((Object)accessible));
            accessible.setAccelerator(KeyStroke.getKeyStroke(73, 2));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuFileImport");
            this.d.put("menuFileImport", accessible);
            jMenu.add((JMenuItem)accessible);
            accessible = new ImageIcon(String.valueOf(H) + "menusavebutton.png");
            accessible = new JMenuItem(aM.G("menu_file_export"), (Icon)((Object)accessible));
            accessible.setAccelerator(KeyStroke.getKeyStroke(83, 2));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuFileExport");
            this.d.put("menuFileExport", accessible);
            jMenu.add((JMenuItem)accessible);
            accessible = new ImageIcon(String.valueOf(H) + "settings.png");
            accessible = new JMenuItem(aM.G("menu_file_setting"), (Icon)((Object)accessible));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("parametre");
            this.d.put("parametre", accessible);
            jMenu.add((JMenuItem)accessible);
            accessible = new JMenuItem(aM.G("menu_file_close"));
            accessible.setAccelerator(KeyStroke.getKeyStroke(81, 2));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuClose");
            this.d.put("menuClose", accessible);
            jMenu.add((JMenuItem)accessible);
            if (a == Level.FINEST) {
                accessible = new JMenuItem("Close and reset settings for production");
                accessible.addActionListener(GUI.a());
                accessible.setActionCommand("menuClosePreProd");
                this.d.put("menuClosePreProd", accessible);
                jMenu.add((JMenuItem)accessible);
            }
            jMenu = new JMenu("?");
            jMenuBar.add(jMenu);
            accessible = new JMenuItem(aM.G("menu_help"));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuHelp");
            this.d.put("menuHelp", accessible);
            jMenu.add((JMenuItem)accessible);
            accessible = new JMenuItem(aM.G("menu_licence"));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuLicence");
            this.d.put("menuLicence", accessible);
            jMenu.add((JMenuItem)accessible);
            accessible = new JMenuItem(aM.G("menu_about"));
            accessible.addActionListener(GUI.a());
            accessible.setActionCommand("menuAbout");
            this.d.put("menuAbout", accessible);
            jMenu.add((JMenuItem)accessible);
        }
        catch (Throwable throwable) {}
        return jMenuBar;
    }

    private boolean a(int n2) {
        try {
            Object object = GUI.a();
            object = object[n2];
            String string = this.a("mainWindows").getTitle();
            t = object;
            bn.x((String)t);
            aH.b(string, "softwareExport", String.valueOf(n2));
            this.q();
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static String B(String string) {
        String string2;
        string2 = "0";
        try {
            string2 = String.valueOf(Arrays.asList(GUI.a()).indexOf(string));
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private void p() {
        try {
            Toolkit.getDefaultToolkit().addAWTEventListener(new ae(this), 8L);
            return;
        }
        catch (Throwable throwable) {
            GUI.d("Il y a eu une erreur au lancement du programme, veuillez nous contacter pour plus de details", aM.G("dlg_start"));
            return;
        }
    }

    public final void q() {
        try {
            String string = aH.D("defaultdisplaymode");
            String string2 = aM.G("dlg_man_list");
            String string3 = aM.G("dlg_man_semiauto");
            String string4 = aM.G("dlg_man_manual");
            String string5 = aM.G("dlg_man_browser");
            new aM(t, aM.b()[Integer.valueOf(aH.D("language"))]);
            ((JMenuItem)this.d.get("menuFileStart")).setText(aM.G("menu_file_start"));
            ((JMenuItem)this.d.get("menuFileStartExpert")).setText(aM.G("menu_file_start_expert"));
            ((JMenuItem)this.d.get("menuFileImport")).setText(aM.G("menu_file_import"));
            ((JMenuItem)this.d.get("menuFileExport")).setText(aM.G("menu_file_export"));
            ((JMenuItem)this.d.get("parametre")).setText(aM.G("menu_file_setting"));
            ((JMenuItem)this.d.get("menuClose")).setText(aM.G("menu_file_close"));
            ((JMenuItem)this.d.get("menuHelp")).setText(aM.G("menu_help"));
            ((JMenuItem)this.d.get("menuLicence")).setText(aM.G("menu_licence"));
            ((JMenuItem)this.d.get("menuAbout")).setText(aM.G("menu_about"));
            GUI.a("_capture").setText(aM.G("menu_start"));
            GUI.a("_file").setText(aM.G("menu_import"));
            GUI.a("_export").setText(aM.G("menu_export"));
            GUI.a("_buy").setText(aM.G("menu_buy"));
            GUI.a("_error").setText(aM.G("menu_help"));
            GUI.a("_settingtool_software").setText(aM.G("dlg_stg_software"));
            GUI.a("_settingtool_searchmode").setText(aM.G("dlg_stg_searchmode"));
            this.B();
            GUI.a("_container0_1b").setText(aM.G("dlg_man_refresh"));
            GUI.a("ini", aM.G("dlg_man_list_select"), null);
            GUI.a("department", "", null);
            GUI.a("zipcity", "", null);
            GUI.p("department");
            GUI.p("zipcity");
            GUI.p("street");
            GUI.p("contact");
            GUI.A();
            GUI.a("_container1a_col2a").setText(aM.G("dlg_man_manual_street"));
            GUI.a("_container1a_col2a").setText(aM.G("dlg_man_manual_street_jlabel"));
            if (string.contentEquals(string2)) {
                this.l(aM.G("dlg_man_list"));
            }
            if (string.contentEquals(string3)) {
                this.l(aM.G("dlg_man_semiauto"));
            }
            if (string.contentEquals(string4)) {
                this.l(aM.G("dlg_man_manual"));
            }
            if (string.contentEquals(string5)) {
                this.l(aM.G("dlg_man_browser"));
            }
            GUI.a("_container4a").setText("  " + a.n(aM.G("dlg_man_preview_contact").replace(":", "").trim()));
            o.b("overview", a.n(aM.G("dlg_man_preview").replace(":", "").trim()));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void l(String string) {
        try {
            if (B.contentEquals("windows") || B.contentEquals("linux")) {
                SwingUtilities.invokeLater(new af(this));
            }
            if (string.contentEquals(aM.G("dlg_man_list"))) {
                if (GUI.a("_searchbuttonlist") == null) {
                    if (GUI.a("_searchbuttonbrowser") != null) {
                        this.l(aM.G("dlg_man_browser"));
                        return;
                    }
                    if (GUI.a("_searchbuttonsemiauto") != null) {
                        this.l(aM.G("dlg_man_semiauto"));
                        return;
                    }
                    if (GUI.a("_searchbuttonmanual") != null) {
                        this.l(aM.G("dlg_man_manual"));
                    }
                    return;
                }
                aH.b(t, "defaultdisplaymode", string);
                ++this.f;
                R = "auto";
                ((DefaultTableModel)((JTable)o.get("street")).getModel()).setRowCount(0);
                ((DefaultTableModel)((JTable)o.get("zipcity")).getModel()).setRowCount(0);
                this.k("department");
                GUI.a("_container0_1a").setVisible(true);
                GUI.a("_container0_1b").setVisible(true);
                GUI.a("_container0_2a").setVisible(true);
                GUI.a("_container0_2b").setVisible(true);
                GUI.a("_container0_3a").setVisible(true);
                GUI.a("_container0_3b").setVisible(true);
                GUI.a("_container1a").setVisible(true);
                GUI.a("_container1b").setVisible(false);
                GUI.a("_container1c").setVisible(false);
                GUI.a("_container1d").setVisible(false);
                GUI.a("_container1a_col2a").setVisible(false);
                GUI.a("_container1a_col2b").setVisible(false);
                this.b("street").setVisible(true);
                if (GUI.a("_searchbuttonlist") != null) {
                    GUI.a("_searchbuttonlist").setFont(GUI.a("_searchbuttonlist").getFont().deriveFont(1));
                }
                if (GUI.a("_searchbuttonsemiauto") != null) {
                    GUI.a("_searchbuttonsemiauto").setFont(GUI.a("_searchbuttonsemiauto").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonmanual") != null) {
                    GUI.a("_searchbuttonmanual").setFont(GUI.a("_searchbuttonmanual").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonbrowser") != null) {
                    GUI.a("_searchbuttonbrowser").setFont(GUI.a("_searchbuttonbrowser").getFont().deriveFont(0));
                }
                if (bi.az() == "ini") {
                    GUI.a("_recherche").setText(aM.G("dlg_man_list_text"));
                }
            } else if (string.contentEquals(aM.G("dlg_man_semiauto"))) {
                if (GUI.a("_searchbuttonsemiauto") == null) {
                    if (GUI.a("_searchbuttonlist") != null) {
                        this.l(aM.G("dlg_man_list"));
                        return;
                    }
                    if (GUI.a("_searchbuttonbrowser") != null) {
                        this.l(aM.G("dlg_man_browser"));
                        return;
                    }
                    if (GUI.a("_searchbuttonmanual") != null) {
                        this.l(aM.G("dlg_man_manual"));
                    }
                    return;
                }
                aH.b(t, "defaultdisplaymode", string);
                ++this.f;
                R = "half";
                GUI.a("_container0_1a").setVisible(true);
                GUI.a("_container0_1b").setVisible(true);
                GUI.a("_container0_2a").setVisible(true);
                GUI.a("_container0_2b").setVisible(true);
                GUI.a("_container0_3a").setVisible(false);
                GUI.a("_container0_3b").setVisible(false);
                GUI.a("_container1a").setVisible(true);
                GUI.a("_container1b").setVisible(false);
                GUI.a("_container1c").setVisible(false);
                GUI.a("_container1d").setVisible(false);
                GUI.a("_container1a_col2a").setVisible(true);
                GUI.a("_container1a_col2b").setVisible(true);
                this.b("street").setVisible(false);
                if (GUI.a("_searchbuttonlist") != null) {
                    GUI.a("_searchbuttonlist").setFont(GUI.a("_searchbuttonlist").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonsemiauto") != null) {
                    GUI.a("_searchbuttonsemiauto").setFont(GUI.a("_searchbuttonsemiauto").getFont().deriveFont(1));
                }
                if (GUI.a("_searchbuttonmanual") != null) {
                    GUI.a("_searchbuttonmanual").setFont(GUI.a("_searchbuttonmanual").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonbrowser") != null) {
                    GUI.a("_searchbuttonbrowser").setFont(GUI.a("_searchbuttonbrowser").getFont().deriveFont(0));
                }
                if (bi.az() == "ini") {
                    GUI.a("_recherche").setText(aM.G("dlg_man_semiauto_text"));
                }
                ((DefaultTableModel)((JTable)o.get("zipcity")).getModel()).setRowCount(0);
                this.k("department");
            } else if (string.contentEquals(aM.G("dlg_man_manual"))) {
                if (GUI.a("_searchbuttonmanual") == null) {
                    if (GUI.a("_searchbuttonbrowser") != null) {
                        this.l(aM.G("dlg_man_browser"));
                        return;
                    }
                    if (GUI.a("_searchbuttonlist") != null) {
                        this.l(aM.G("dlg_man_list"));
                        return;
                    }
                    if (GUI.a("_searchbuttonsemiauto") != null) {
                        this.l(aM.G("dlg_man_semiauto"));
                    }
                    return;
                }
                aH.b(t, "defaultdisplaymode", string);
                ++this.f;
                R = "manual";
                GUI.a("_container0_1a").setVisible(false);
                GUI.a("_container0_1b").setVisible(false);
                GUI.a("_container0_2a").setVisible(false);
                GUI.a("_container0_2b").setVisible(false);
                GUI.a("_container0_3a").setVisible(false);
                GUI.a("_container0_3b").setVisible(false);
                GUI.a("_container1a").setVisible(false);
                GUI.a("_container1b").setVisible(false);
                GUI.a("_container1c").setVisible(true);
                GUI.a("_container1d").setVisible(false);
                if (GUI.a("_searchbuttonlist") != null) {
                    GUI.a("_searchbuttonlist").setFont(GUI.a("_searchbuttonlist").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonsemiauto") != null) {
                    GUI.a("_searchbuttonsemiauto").setFont(GUI.a("_searchbuttonsemiauto").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonmanual") != null) {
                    GUI.a("_searchbuttonmanual").setFont(GUI.a("_searchbuttonmanual").getFont().deriveFont(1));
                }
                if (GUI.a("_searchbuttonbrowser") != null) {
                    GUI.a("_searchbuttonbrowser").setFont(GUI.a("_searchbuttonbrowser").getFont().deriveFont(0));
                }
                if (bi.az() == "ini") {
                    GUI.a("_recherche").setText(aM.G("dlg_man_manual_text"));
                }
            } else {
                if (GUI.a("_searchbuttonbrowser") == null) {
                    if (GUI.a("_searchbuttonlist") != null) {
                        this.l(aM.G("dlg_man_list"));
                        return;
                    }
                    if (GUI.a("_searchbuttonsemiauto") != null) {
                        this.l(aM.G("dlg_man_semiauto"));
                        return;
                    }
                    if (GUI.a("_searchbuttonmanual") != null) {
                        this.l(aM.G("dlg_man_manual"));
                    }
                    return;
                }
                aH.b(t, "defaultdisplaymode", string);
                ++this.f;
                R = "browser";
                string = bn.Q("url_browser");
                if (t.contentEquals("IQUALIF aPost Yellow")) {
                    HashMap<String, String> hashMap = new HashMap<String, String>();
                    hashMap.put("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; InfoPath.2; .NET CLR 2.0.50727; .NET CLR 3.0.04506.648; .NET CLR 3.5.21022)");
                    hashMap.put("method", "get");
                    o.a("browser", string, hashMap);
                } else {
                    o.a("browser", string);
                }
                GUI.a("_container0_1a").setVisible(false);
                GUI.a("_container0_1b").setVisible(false);
                GUI.a("_container0_2a").setVisible(false);
                GUI.a("_container0_2b").setVisible(false);
                GUI.a("_container0_3a").setVisible(false);
                GUI.a("_container0_3b").setVisible(false);
                GUI.a("_container1a").setVisible(false);
                GUI.a("_container1b").setVisible(false);
                GUI.a("_container1c").setVisible(false);
                GUI.a("_container1d").setVisible(true);
                if (GUI.a("_searchbuttonlist") != null) {
                    GUI.a("_searchbuttonlist").setFont(GUI.a("_searchbuttonlist").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonsemiauto") != null) {
                    GUI.a("_searchbuttonsemiauto").setFont(GUI.a("_searchbuttonsemiauto").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonmanual") != null) {
                    GUI.a("_searchbuttonmanual").setFont(GUI.a("_searchbuttonmanual").getFont().deriveFont(0));
                }
                if (GUI.a("_searchbuttonbrowser") != null) {
                    GUI.a("_searchbuttonbrowser").setFont(GUI.a("_searchbuttonbrowser").getFont().deriveFont(1));
                }
                if (bi.az() == "ini") {
                    GUI.a("_recherche").setText(aM.G("dlg_man_browser_text"));
                }
            }
            GUI.a("_mainpanel").repaint();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void e(bb bb2) {
        try {
            if (bn.Q("show_page").contentEquals("0")) {
                return;
            }
            if (bn.Q("show_page").contentEquals("1") && (!R.contentEquals("browser") || R.contentEquals("browser") && !bb2.O().contentEquals("firstpage"))) {
                bb2.getHtml();
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static void a(Object[] arrobject) {
        try {
            a.insertRow(0, arrobject);
            int n2 = a.getRowCount();
            if (n2 > 100) {
                a.removeRow(100);
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static boolean h() {
        boolean bl2;
        bl2 = false;
        try {
            Object object = GSetting.b();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                String string = bn.Q(String.valueOf(object) + "Column");
                if ((object = GUI.a(string, (String)object)).intValue() <= 0) continue;
                bl2 = true;
                break;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static Integer a(String string, String string2) {
        Integer n2;
        n2 = 0;
        try {
            if (string == null || string.contentEquals("") || string.contentEquals("0")) {
                return n2;
            }
            if (bn.Q("detailcapture").contentEquals("1") && !string2.endsWith("Detail")) {
                return n2;
            }
            if (!bn.Q("detailcapture").contentEquals("1") && string2.endsWith("Detail")) {
                return n2;
            }
            n2 = aM.a(string);
        }
        catch (Throwable throwable) {}
        return n2;
    }

    private void r() {
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            int n2 = (int)toolkit.getScreenSize().getWidth();
            int n3 = (int)toolkit.getScreenSize().getHeight();
            int n4 = n2 - 30;
            int n5 = n3 * 160 / 100;
            Dimension dimension = new Dimension(n4, n5);
            GUI.a("_mainpanel", String.valueOf(H) + "background.gif", dimension);
            GUI.a("_mainpanel").setOpaque(false);
            GUI.a("_mainpanel").setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            GUI.a("_mainpanel").setLayout(new BoxLayout(GUI.a("_mainpanel"), 3));
            GUI.r("_container0a");
            GUI.r("_container1a");
            GUI.r("_container1b");
            GUI.r("_container1c");
            GUI.r("_container1d");
            GUI.r("_container2");
            GUI.r("_container3");
            GUI.r("_container3_1");
            GUI.r("_container3_2");
            GUI.r("_container34");
            GUI.r("_container4");
            GUI.r("_container4a");
            GUI.r("_container4b");
            GUI.r("_container45");
            GUI.r("_container5");
            GUI.r("_container0_1b");
            GUI.r("_container0_2b");
            GUI.r("_container0_3b");
            GUI.a("_container0a").setOpaque(false);
            GUI.a("_container1a").setOpaque(false);
            GUI.a("_container1b").setOpaque(true);
            GUI.a("_container1d").setOpaque(true);
            GUI.a("_container2").setOpaque(false);
            GUI.a("_container3").setOpaque(true);
            GUI.a("_container3_1").setOpaque(false);
            GUI.a("_container3_2").setOpaque(false);
            GUI.a("_container34").setOpaque(false);
            GUI.a("_container4").setOpaque(false);
            GUI.a("_container4a").setOpaque(false);
            GUI.a("_container4b").setOpaque(false);
            GUI.a("_container45").setOpaque(false);
            GUI.a("_container5").setOpaque(false);
            GUI.a("_container0_1b").setOpaque(false);
            GUI.a("_container0_2b").setOpaque(false);
            GUI.a("_container0_3b").setOpaque(false);
            GUI.a("_container0a").setPreferredSize(new Dimension(n2, 30));
            GUI.a("_container0a").setMaximumSize(new Dimension(n2, 30));
            GUI.a("_container1a").setPreferredSize(new Dimension(n2, (n3 -= 170) * 60 / 100));
            GUI.a("_container1a").setMaximumSize(new Dimension(n2, n3 * 60 / 100));
            GUI.a("_container1b").setPreferredSize(new Dimension(n2, n3 * 60 / 100));
            GUI.a("_container1b").setMaximumSize(new Dimension(n2, n3 * 60 / 100));
            GUI.a("_container1c").setPreferredSize(new Dimension(n2, n3 * 60 / 100));
            GUI.a("_container1c").setMaximumSize(new Dimension(n2, n3 * 60 / 100));
            GUI.a("_container1d").setPreferredSize(new Dimension(n2, n3 * 60 / 100));
            GUI.a("_container1d").setMaximumSize(new Dimension(n2, n3 * 60 / 100));
            GUI.a("_container2").setPreferredSize(new Dimension(n2, 15));
            GUI.a("_container2").setMaximumSize(new Dimension(n2, 15));
            GUI.a("_container3").setPreferredSize(new Dimension(n2, n3 * 20 / 100));
            GUI.a("_container3").setMaximumSize(new Dimension(n2, n3 * 20 / 100));
            GUI.a("_container34").setPreferredSize(new Dimension(n2, 15));
            GUI.a("_container34").setMaximumSize(new Dimension(n2, 15));
            GUI.a("_container4a").setPreferredSize(new Dimension(n2, 15));
            GUI.a("_container4a").setMaximumSize(new Dimension(n2, 15));
            GUI.a("_container4").setPreferredSize(new Dimension(n2, n3 * 50 / 100));
            GUI.a("_container4").setMaximumSize(new Dimension(n2, n3 * 50 / 100));
            GUI.a("_container45").setPreferredSize(new Dimension(n2, 15));
            GUI.a("_container45").setMaximumSize(new Dimension(n2, 15));
            GUI.a("_container5").setPreferredSize(new Dimension(n2, n3 * 55 / 100));
            GUI.a("_container5").setMaximumSize(new Dimension(n2, n3 * 55 / 100));
            Object object = new LineBorder(Color.gray, 2, true);
            GUI.a("_container1a").setBorder((Border)object);
            GUI.a("_container1b").setBorder((Border)object);
            GUI.a("_container1c").setBorder((Border)object);
            GUI.a("_container1d").setBorder((Border)object);
            GUI.a("_container1b").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_container1c").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_container1d").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_container3").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_container4").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_container5").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_container3").setBorder((Border)object);
            GUI.a("_container4").setBorder((Border)object);
            GUI.a("_container5").setBorder((Border)object);
            GUI.a("_container0a").setLayout(new GridLayout(0, 6));
            GUI.a("_container1a").setLayout(new GridLayout(0, 3));
            GUI.a("_container1b").setLayout(new GridLayout(0, 3));
            GUI.a("_container1c").setLayout(new GridLayout(0, 3));
            GUI.a("_container1d").setLayout(new GridLayout(0, 1));
            GUI.a("_container3").setLayout(new GridLayout(0, 2));
            GUI.a("_container4").setLayout(new BoxLayout(GUI.a("_container4"), 3));
            GUI.a("_container4a").setLayout(new GridLayout(0, 1));
            GUI.a("_container4b").setLayout(new GridLayout(0, 1));
            GUI.a("_container5").setLayout(new GridLayout(0, 1));
            GUI.a("_container3_1").setLayout(new FlowLayout(0));
            GUI.a("_container3_2").setLayout(new FlowLayout(0));
            GUI.e("_container0_1a", aM.G("dlg_man_list_select"));
            GUI.e("_container0_2a", " ");
            GUI.e("_container0_3a", " ");
            GUI.e("_container0_1b", "           ");
            GUI.a("_container0_1b3", "", String.valueOf(H) + "reload.png", 25, 25);
            GUI.a("_container0_1b4", "", String.valueOf(H) + "tick.png", 25, 25);
            GUI.a("_container0_2b3", "", String.valueOf(H) + "reload.png", 25, 25);
            GUI.a("_container0_2b4", "", String.valueOf(H) + "tick.png", 25, 25);
            GUI.a("_container0_3b2", "", String.valueOf(H) + "reload.png", 25, 25);
            GUI.a("_container0_3b3", "", String.valueOf(H) + "tick.png", 25, 25);
            GUI.a("_container0_1b3").setOpaque(false);
            GUI.a("_container0_1b3").setContentAreaFilled(false);
            GUI.a("_container0_1b3").setBorderPainted(false);
            GUI.a("_container0_1b4").setOpaque(false);
            GUI.a("_container0_1b4").setContentAreaFilled(false);
            GUI.a("_container0_1b4").setBorderPainted(false);
            GUI.a("_container0_2b3").setOpaque(false);
            GUI.a("_container0_2b3").setContentAreaFilled(false);
            GUI.a("_container0_2b3").setBorderPainted(false);
            GUI.a("_container0_2b4").setOpaque(false);
            GUI.a("_container0_2b4").setContentAreaFilled(false);
            GUI.a("_container0_2b4").setBorderPainted(false);
            GUI.a("_container0_3b2").setOpaque(false);
            GUI.a("_container0_3b2").setContentAreaFilled(false);
            GUI.a("_container0_3b2").setBorderPainted(false);
            GUI.a("_container0_3b3").setOpaque(false);
            GUI.a("_container0_3b3").setContentAreaFilled(false);
            GUI.a("_container0_3b3").setBorderPainted(false);
            if (B.contentEquals("windows")) {
                GUI.e("_container0_1b", aM.G("dlg_man_refresh"));
            }
            GUI.a("_container0_1b").add(GUI.a("_container0_1b"));
            if (B.contentEquals("windows")) {
                GUI.a("_container0_1b").add(GUI.a("_container0_1b"));
            }
            GUI.a("_container0_1b").add(GUI.a("_container0_1b3"));
            GUI.a("_container0_1b").add(GUI.a("_container0_1b4"));
            GUI.a("_container0_2b").add(GUI.a("_container0_1b"));
            if (B.contentEquals("windows")) {
                GUI.a("_container0_2b").add(GUI.a("_container0_1b"));
            }
            GUI.a("_container0_2b").add(GUI.a("_container0_2b3"));
            GUI.a("_container0_2b").add(GUI.a("_container0_2b4"));
            GUI.a("_container0_3b").add(GUI.a("_container0_1b"));
            if (B.contentEquals("windows")) {
                GUI.a("_container0_3b").add(GUI.a("_container0_1b"));
            }
            GUI.a("_container0_3b").add(GUI.a("_container0_3b2"));
            GUI.a("_container0_3b").add(GUI.a("_container0_3b3"));
            GUI.a("_container0a").add(GUI.a("_container0_1a"));
            GUI.a("_container0a").add(GUI.a("_container0_1b"));
            GUI.a("_container0a").add(GUI.a("_container0_2a"));
            GUI.a("_container0a").add(GUI.a("_container0_2b"));
            GUI.a("_container0a").add(GUI.a("_container0_3a"));
            GUI.a("_container0a").add(GUI.a("_container0_3b"));
            GUI.a("_container1a").add(this.a("department"));
            GUI.a("_container1a").add(this.a("zipcity"));
            GUI.r("_container1a_col2");
            GUI.r("_container1a_col2a");
            GUI.r("_container1a_col2b");
            GUI.e("_container1a_col2a", aM.G("dlg_man_manual_street"));
            GUI.a("_container1a_col2a", aM.G("dlg_man_manual_street_jlabel"), 50);
            GUI.a("_container1a_col2a").addKeyListener(GUI.a());
            GUI.a("_container1a_col2a").addMouseListener(GUI.a());
            GUI.a("_container1a_col2").setLayout(new BoxLayout(GUI.a("_container1a_col2"), 2));
            GUI.a("_container1a_col2b").setLayout(new BoxLayout(GUI.a("_container1a_col2b"), 3));
            GUI.a("_container1a_col2a").setLayout(new FlowLayout(0));
            GUI.a("_container1a_col2").setOpaque(false);
            GUI.a("_container1a_col2a").setOpaque(true);
            GUI.a("_container1a_col2b").setOpaque(true);
            GUI.a("_container1a_col2a").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.95f));
            GUI.a("_container1a_col2b").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.95f));
            GUI.a("_container1a_col2a").setFont(new Font("Serif", 0, 18));
            GUI.a("_container1a_col2a").add(GUI.a("_container1a_col2a"));
            GUI.a("_container1a_col2a").add(GUI.a("_container1a_col2a"));
            GUI.a("_container1a_col2b").add(new JSeparator(1));
            GUI.a("_container1a_col2").add(this.a("street"));
            GUI.a("_container1a_col2").add(GUI.a("_container1a_col2b"));
            GUI.a("_container1a_col2").add(GUI.a("_container1a_col2a"));
            GUI.a("_container1a").add(GUI.a("_container1a_col2"));
            GUI.a("_container1a_col2a").setVisible(false);
            GUI.a("_container1a_col2b").setVisible(false);
            GUI.a("_container1b").add(this.a("department2"));
            GUI.a("_container1b").add(this.a("zipcity2"));
            GUI.a("_container1b").add(this.a("street2"));
            GUI.r("_container1c_col0");
            GUI.r("_container1c_col1");
            GUI.r("_container1c_col2");
            GUI.e("_container1c_col0", aM.G("dlg_man_manual_zip"));
            GUI.e("_container1c_col1", aM.G("dlg_man_manual_city"));
            GUI.e("_container1c_col2", aM.G("dlg_man_manual_street"));
            GUI.a("_container1c_col0", GUI.C("zipsample"), 50);
            GUI.a("_container1c_col1", GUI.C("citysample"), 50);
            GUI.a("_container1c_col2", GUI.C("streetsample"), 50);
            GUI.a("_container1c_col0").addKeyListener(GUI.a());
            GUI.a("_container1c_col1").addKeyListener(GUI.a());
            GUI.a("_container1c_col2").addKeyListener(GUI.a());
            GUI.a("_container1c_col0").addMouseListener(GUI.a());
            GUI.a("_container1c_col1").addMouseListener(GUI.a());
            GUI.a("_container1c_col2").addMouseListener(GUI.a());
            GUI.a("_container1c_col0").setFont(new Font("Serif", 0, 18));
            GUI.a("_container1c_col1").setFont(new Font("Serif", 0, 18));
            GUI.a("_container1c_col2").setFont(new Font("Serif", 0, 18));
            GUI.a("_container1c_col0").setLayout(new FlowLayout(0));
            GUI.a("_container1c_col1").setLayout(new FlowLayout(0));
            GUI.a("_container1c_col2").setLayout(new FlowLayout(0));
            GUI.a("_container1c_col0").setOpaque(false);
            GUI.a("_container1c_col0").setOpaque(false);
            GUI.a("_container1c_col1").setOpaque(false);
            GUI.a("_container1c_col1").setOpaque(false);
            GUI.a("_container1c_col2").setOpaque(false);
            GUI.a("_container1c_col2").setOpaque(false);
            GUI.a("_container1c_col0").add(GUI.a("_container1c_col0"));
            GUI.a("_container1c_col0").add(GUI.a("_container1c_col0"));
            GUI.a("_container1c_col1").add(GUI.a("_container1c_col1"));
            GUI.a("_container1c_col1").add(GUI.a("_container1c_col1"));
            GUI.a("_container1c_col2").add(GUI.a("_container1c_col2"));
            GUI.a("_container1c_col2").add(GUI.a("_container1c_col2"));
            GUI.A();
            if (d == 1 || d == 2) {
                GUI.a("_container1d").add(o.a("browser", t, "<html><p>" + aM.G("loading") + "</p></html>"));
            } else {
                GUI.e("_container1_browser_error", aM.G("dlg_man_browser_txt"));
                GUI.a("_container1_browser_error").setFont(new Font("Serif", 0, 25));
                GUI.a("_container1d").add(GUI.a("_container1_browser_error"));
                GUI.a("_container5").setVisible(false);
            }
            object = "";
            GUI.e("_recherche", (String)object);
            GUI.e("_compteur", "");
            GUI.a("_recherche").setFont(new Font("Serif", 0, 22));
            GUI.a("_compteur").setFont(new Font("Serif", 0, 22));
            b = GUI.a("_recherche");
            GUI.a("_container3_1").add(GUI.a("_recherche"));
            GUI.a("_container3_2").add(GUI.a("_compteur"));
            GUI.a("_container3").add(GUI.a("_container3_1"));
            GUI.a("_container3").add(GUI.a("_container3_2"));
            GUI.e("_container4a", "  " + a.n(aM.G("dlg_man_preview_contact").replace(":", "").trim()));
            GUI.a("_container4a").add(GUI.a("_container4a"));
            GUI.a("_container4b").add(this.a("contact"));
            GUI.a("_container4").add(GUI.a("_container4a"));
            GUI.a("_container4").add(GUI.a("_container4b"));
            if (bn.Q("show_contact").contentEquals("0")) {
                GUI.a("_container4").setVisible(false);
            }
            if (d == 1 || d == 2) {
                GUI.a("_container5").add(o.a("overview", a.n(aM.G("dlg_man_preview").replace(":", "").trim()), "<html><p></p></html>"));
            } else {
                GUI.e("_container5_browser_error", aM.G("dlg_man_browser_txt"));
                GUI.a("_container5_browser_error").setFont(new Font("Serif", 0, 25));
                GUI.a("_container5").add(GUI.a("_container5_browser_error"));
            }
            GUI.a("_container1b").setVisible(false);
            GUI.a("_container1c").setVisible(false);
            GUI.a("_container1d").setVisible(false);
            if (bn.Q("show_page").contentEquals("0")) {
                GUI.a("_container5").setVisible(false);
            }
            GUI.a("_mainpanel").add(GUI.a("_container0a"));
            GUI.a("_mainpanel").add(GUI.a("_container1a"));
            GUI.a("_mainpanel").add(GUI.a("_container1b"));
            GUI.a("_mainpanel").add(GUI.a("_container1c"));
            GUI.a("_mainpanel").add(GUI.a("_container1d"));
            GUI.a("_mainpanel").add(GUI.a("_container2"));
            GUI.a("_mainpanel").add(GUI.a("_container3"));
            GUI.a("_mainpanel").add(GUI.a("_container34"));
            GUI.a("_mainpanel").add(GUI.a("_container4"));
            GUI.a("_mainpanel").add(GUI.a("_container45"));
            GUI.a("_mainpanel").add(GUI.a("_container5"));
            this.a("mainFrame", GUI.a("_mainpanel"));
            this.b("mainFrame").getVerticalScrollBar().setUnitIncrement(13);
            this.b("mainFrame").setOpaque(false);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static String C(String string) {
        String string2;
        string2 = "";
        try {
            String string3 = "";
            String string4 = "";
            String string5 = "";
            if (t.contentEquals("IQUALIF 712 White and Yellow")) {
                string4 = "Paris";
                string5 = "Boulevard haussmann";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF AConcession Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF Africa Yellow")) {
                string4 = "Madagascar";
                string5 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Anbis White and Yellow")) {
                string5 = "auto";
            } else if (t.contentEquals("IQUALIF Australia White")) {
                string4 = "Melbourne";
                string5 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Australia Yellow")) {
                string4 = "Melbourne";
                string5 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Austria Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF Auto24 White and Yellow")) {
                string5 = "auto";
            } else if (t.contentEquals("IQUALIF Bangladesh Yellow")) {
                string4 = "Dhaka";
                string5 = "Bank";
                string3 = "";
            } else if (t.contentEquals("IQUALIF BCoin White and Yellow")) {
                string4 = "ile_de_france";
                string5 = "voitures";
            } else if (t.contentEquals("IQUALIF Belgium White")) {
                string4 = "Bruxelles";
                string5 = "Avenue Franklin Roosevelt";
                string3 = "1000";
            } else if (t.contentEquals("IQUALIF Belgium 07 Yellow")) {
                string4 = "Bruxelles";
                string5 = "Restaurant";
                string3 = "1000";
            } else if (t.contentEquals("IQUALIF Belgium Yellow")) {
                string4 = "Bruxelles";
                string5 = "Restaurant";
                string3 = "1000";
            } else if (t.contentEquals("IQUALIF Canada 41 White")) {
                string4 = "Montreal";
                string5 = "Sainte Catherine";
                string3 = "QC";
            } else if (t.contentEquals("IQUALIF Canada White")) {
                string4 = "Montreal";
                string5 = "Sainte Catherine";
                string3 = "QC";
            } else if (t.contentEquals("IQUALIF Canada Yellow")) {
                string4 = "Ottawa";
                string5 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Croatia Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF Dliveroo Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF Denmark Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF Dominica White")) {
                string5 = "Dominica";
            } else if (t.contentEquals("IQUALIF Finland Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF First Name White")) {
                string4 = "Paris";
                string5 = "Boulevard haussmann";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF France White")) {
                string4 = "Paris";
                string5 = "Boulevard haussmann";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF France Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF France PI Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF Germany White")) {
                string4 = "Berlin";
                string5 = "Ackerstra\u00dfe";
            } else if (t.contentEquals("IQUALIF Germany GS Yellow")) {
                string4 = "Berlin";
                string5 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Germany Yellow")) {
                string4 = "Berlin";
                string3 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Hungary White")) {
                string4 = "Budapest";
            } else if (t.contentEquals("IQUALIF Hungary Yellow")) {
                string4 = "Budapest";
                string5 = "Etterem";
            } else if (t.contentEquals("IQUALIF Immo24 White and Yellow")) {
                string5 = "auto";
            } else if (t.contentEquals("IQUALIF India Yellow")) {
                string4 = "Paris";
                string5 = "Restaurant";
                string3 = "75009";
            } else if (t.contentEquals("IQUALIF Italy White")) {
                string4 = "Roma";
                string5 = "Francesco";
            } else if (t.contentEquals("IQUALIF Italy PG Yellow")) {
                string4 = "Roma";
                string5 = "Ristoranti";
            } else if (t.contentEquals("IQUALIF Italy Yellow")) {
                string4 = "Roma";
                string5 = "Ristoranti";
            } else if (t.contentEquals("IQUALIF Kapa White and Yellow")) {
                string4 = "anvers";
                string5 = "voitures";
            } else if (t.contentEquals("IQUALIF Lucia White")) {
                string4 = "St Lucia";
            } else if (t.contentEquals("IQUALIF Luxembourg White")) {
                string4 = "Luxembourg";
                string5 = "Grand Rue";
            } else if (t.contentEquals("IQUALIF Luxembourg Yellow")) {
                string4 = "Luxembourg";
                string5 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Madagascar White")) {
                string4 = "Antananarivo";
                string5 = "Rue Principale";
            } else if (t.contentEquals("IQUALIF Madagascar Yellow")) {
                string4 = "Antananarivo";
                string5 = "Restaurant";
            } else if (t.contentEquals("IQUALIF Morocco White")) {
                string4 = "Casablanca";
                string5 = "Fadi";
            } else if (t.contentEquals("IQUALIF Morocco Yellow")) {
                string4 = "Casablanca";
                string5 = "Restaurant";
            } else if (!t.contentEquals("IQUALIF Multi White and Yellow")) {
                if (t.contentEquals("IQUALIF Netherlands White")) {
                    string4 = "Amsterdam";
                    string5 = "Place Centrale";
                } else if (t.contentEquals("IQUALIF Netherlands Yellow")) {
                    string4 = "Amsterdam";
                    string5 = "Restaurant";
                } else if (t.contentEquals("IQUALIF Norway Yellow")) {
                    string4 = "Paris";
                    string5 = "Restaurant";
                    string3 = "75009";
                } else if (t.contentEquals("IQUALIF Oedkniss White and Yellow")) {
                    string5 = "auto";
                } else if (t.contentEquals("IQUALIF PAnnonces White and Yellow")) {
                    string5 = "auto";
                } else if (t.contentEquals("IQUALIF Peru Yellow")) {
                    string4 = "Lima";
                    string5 = "Restaurante";
                } else if (t.contentEquals("IQUALIF Philippines Yellow")) {
                    string4 = "Manila";
                    string5 = "Restaurant";
                    string3 = "1000";
                } else if (t.contentEquals("IQUALIF Poland Yellow")) {
                    string4 = "Varsovia";
                    string5 = "Restaurant";
                } else if (t.contentEquals("IQUALIF Polynesia White")) {
                    string4 = "Papeete";
                    string5 = "Rue Principale";
                } else if (t.contentEquals("IQUALIF Polynesia Yellow")) {
                    string4 = "Papeete";
                    string5 = "Restaurant";
                } else if (t.contentEquals("IQUALIF Portugal White")) {
                    string4 = "Lisbonne";
                } else if (t.contentEquals("IQUALIF Portugal Yellow")) {
                    string4 = "Lisbonne";
                    string5 = "Ristoranti";
                } else if (t.contentEquals("IQUALIF PP Yellow")) {
                    string4 = "Paris";
                    string5 = "Restaurant";
                } else if (t.contentEquals("IQUALIF Russia Yellow")) {
                    string4 = "Paris";
                    string5 = "Restaurant";
                    string3 = "75009";
                } else if (t.contentEquals("IQUALIF Saudi Arabia Yellow")) {
                    string4 = "Paris";
                    string5 = "Restaurant";
                    string3 = "75009";
                } else if (t.contentEquals("IQUALIF Sbito White and Yellow")) {
                    string5 = "auto";
                } else if (t.contentEquals("IQUALIF Singapore Yellow")) {
                    string4 = "Paris";
                    string5 = "Restaurant";
                    string3 = "75009";
                } else if (t.contentEquals("IQUALIF Spain White")) {
                    string4 = "Benidorm";
                    string5 = "Maria";
                    string3 = "Alicante";
                } else if (t.contentEquals("IQUALIF Spain Yellow")) {
                    string4 = "Madrid";
                    string5 = "Restaurantes";
                } else if (t.contentEquals("IQUALIF Sweden Yellow")) {
                    string4 = "Paris";
                    string5 = "Restaurant";
                    string3 = "75009";
                } else if (t.contentEquals("IQUALIF Switzerland CH White")) {
                    string4 = "Paris";
                    string5 = "Boulevard haussmann";
                    string3 = "75009";
                } else if (t.contentEquals("IQUALIF Switzerland White")) {
                    string4 = "Bern";
                    string5 = "Rohrweg";
                    string3 = "3008";
                } else if (t.contentEquals("IQUALIF Switzerland CH Yellow")) {
                    string4 = "Bern";
                    string5 = "Restaurant";
                    string3 = "3008";
                } else if (t.contentEquals("IQUALIF Switzerland Yellow")) {
                    string4 = "Bern";
                    string5 = "Restaurant";
                    string3 = "3008";
                } else if (t.contentEquals("IQUALIF Switzerland ZP Yellow")) {
                    string4 = "Bern";
                    string5 = "Restaurant";
                    string3 = "3008";
                } else if (t.contentEquals("IQUALIF TAdvisor Yellow")) {
                    string4 = "Paris";
                    string5 = "Restaurant";
                    string3 = "75009";
                } else if (t.contentEquals("IQUALIF Tunisia Yellow")) {
                    string4 = "Tunis";
                    string5 = "Restaurant";
                } else if (t.contentEquals("IQUALIF Tuti White and Yellow")) {
                    string5 = "auto";
                } else if (t.contentEquals("IQUALIF United Kingdom White")) {
                    string4 = "St Albans ou AL1";
                    string5 = "Smith";
                } else if (t.contentEquals("IQUALIF United Kingdom Yellow")) {
                    string4 = "London";
                    string5 = "Restaurant";
                } else if (t.contentEquals("IQUALIF United Kingdom YL Yellow")) {
                    string4 = "London";
                    string5 = "Restaurant";
                } else if (t.contentEquals("IQUALIF United States WP White")) {
                    string4 = "New York";
                    string5 = "John";
                    string3 = "NY";
                } else if (t.contentEquals("IQUALIF United States White")) {
                    string4 = "New York";
                    string5 = "Convent Avenue";
                    string3 = "NY";
                } else if (t.contentEquals("IQUALIF United States Yellow")) {
                    string4 = "New York";
                    string5 = "Restaurant";
                    string3 = "NY";
                } else if (t.contentEquals("IQUALIF Viva White and Yellow")) {
                    string5 = "auto";
                }
            }
            if (string.contentEquals("zipsample")) {
                string2 = string3.contentEquals("") ? "" : String.valueOf(aM.G("dlg_man_manual_zip_jlabel").replaceAll(":(.*)$", ": ")) + string3;
            } else if (string.contentEquals("citysample")) {
                string2 = string4.contentEquals("") ? "" : String.valueOf(aM.G("dlg_man_manual_city_jlabel").replaceAll(":(.*)$", ": ")) + string4;
            } else if (string.contentEquals("streetsample")) {
                string2 = string5.contentEquals("") ? "" : String.valueOf(aM.G("dlg_man_manual_street_jlabel").replaceAll(":(.*)$", ": ")) + string5;
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static Integer a(String[] arrstring, String string, String string2) {
        Integer n2;
        n2 = null;
        try {
            JOptionPane jOptionPane;
            a = jOptionPane = new JOptionPane();
            n2 = JOptionPane.showOptionDialog(null, string2, string, -1, 1, null, arrstring, arrstring[0]);
        }
        catch (Throwable throwable) {}
        return n2;
    }

    public final void s() {
        try {
            this.a("mainWindows").dispose();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static boolean i() {
        try {
            Connection connection = SQL.a(String.valueOf(J) + bi.ao());
            SQL.a(connection, "update search_t set locked=0,error=0 where error=11;");
            SQL.a(connection, "update search_next_t set locked=0,error=0 where error=11;");
            SQL.a(connection, "update detail_t set locked=0,error=0 where error=11;");
            SQL.a(connection, "update search_t set locked=0,error=0 where locked=1;");
            SQL.a(connection, "update search_next_t set locked=0,error=0 where locked=1;");
            SQL.a(connection, "update detail_t set locked=0,error=0 where locked=1;");
            connection.close();
            GUI.d(aM.G("dlg_reset"), t);
        }
        catch (Throwable throwable) {}
        return false;
    }

    private boolean j() {
        try {
            Object object = aH.D("defaultdisplaymode");
            if (!object.contentEquals(aM.G("dlg_man_list")) && !object.contentEquals(aM.G("dlg_man_semiauto"))) {
                return false;
            }
            object = (JTable)o.get("department");
            JTable jTable = (JTable)o.get("zipcity");
            JTable jTable2 = (JTable)o.get("street");
            s.put("department", 10000);
            s.put("zipcity", 100000);
            s.put("street", 5000000);
            if (object.getSelectedRowCount() == 0) {
                object.selectAll();
            } else if (jTable.getSelectedRowCount() == 0) {
                jTable.selectAll();
            }
            int n2 = object.getSelectedRowCount();
            object = new ag(this, n2, (JTable)object, jTable, jTable2);
            new Thread((Runnable)object).start();
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean k() {
        boolean bl2;
        bl2 = true;
        try {
            long l2 = System.nanoTime();
            long l3 = l2 - b;
            long l4 = l3 / 1000000000L;
            if (l4 >= 259200L) {
                bl2 = false;
            }
            if (!(aH.D("multithread_number").contentEquals("0") || K.contentEquals("Multi") || Proxys.u())) {
                if (((String)q.get("setting")).contentEquals("validTRIAL")) {
                    if (l4 >= 60L) {
                        GUI.a(String.valueOf(aM.G("stg_adv_multi1")) + " " + aM.G("stg_adv_trial1") + " 60 " + aM.G("word_minutes"), aM.G("dlg_start"), a.n(aM.G("dlg_lic_btn_ok").toLowerCase()), a.n(aM.G("menu_buy").toLowerCase()), aM.G("buylinkmulti"));
                        aH.b(t, "multithread_number", "0");
                    }
                } else if (((String)q.get("setting")).contentEquals("validLicence")) {
                    if (l4 >= 300L) {
                        GUI.a(String.valueOf(aM.G("stg_adv_multi1")) + " " + aM.G("stg_adv_trial1") + " 5 " + aM.G("word_minutes"), aM.G("dlg_start"), a.n(aM.G("dlg_lic_btn_ok").toLowerCase()), a.n(aM.G("menu_buy").toLowerCase()), aM.G("buylinkmulti"));
                        aH.b(t, "multithread_number", "0");
                    }
                } else if (l4 >= 30L) {
                    GUI.a(String.valueOf(aM.G("stg_adv_multi1")) + " " + aM.G("stg_adv_trial1") + " 30 " + aM.G("word_seconds"), aM.G("dlg_start"), a.n(aM.G("dlg_lic_btn_ok").toLowerCase()), a.n(aM.G("menu_buy").toLowerCase()), aM.G("buylinkmulti"));
                    aH.b(t, "multithread_number", "0");
                }
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public final void t() {
        try {
            JDialog jDialog = new JDialog();
            jDialog.setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
            jDialog.setTitle(String.valueOf(t) + " - " + aM.G("dlg_hlp"));
            jDialog.setSize(690, 730);
            jDialog.setModal(true);
            JPanel jPanel = new JPanel();
            JPanel jPanel2 = new JPanel();
            JPanel jPanel3 = new JPanel();
            jPanel.setLayout(new BoxLayout(jPanel, 3));
            JLabel jLabel = new JLabel("<html><br><h2>" + t + "</h2></html>");
            jLabel.setIcon(new ImageIcon(String.valueOf(H) + "logo.png"));
            JLabel jLabel2 = new JLabel(aM.G("dlg_hlp_text"));
            JButton jButton = new JButton(aM.G("dlg_hlp_close"));
            jButton.setPreferredSize(new Dimension(80, 25));
            jDialog.setDefaultCloseOperation(2);
            jButton.addActionListener(new ah(this, jDialog));
            jPanel2.add(jLabel);
            jPanel2.add(jLabel2);
            jPanel3.add(jButton);
            jPanel.add(jPanel2);
            jPanel.add(jPanel3);
            jDialog.add(jPanel);
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void d(String string, String string2) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JOptionPane.showConfirmDialog(null, string, String.valueOf(t) + " - " + string2, -1);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void a(String string, String string2, String arrobject, String string3, String string4) {
        try {
            arrobject = new Object[]{string3, arrobject};
            int n2 = JOptionPane.showOptionDialog(null, string, String.valueOf(t) + " - " + string2, 0, 3, null, arrobject, arrobject[1]);
            if (n2 == 0) {
                a.c(string4);
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static void u() {
        try {
            JDialog jDialog = new JDialog();
            jDialog.setLocationRelativeTo(null);
            jDialog.setSize(100, 100);
            jDialog.setModal(true);
            GUI.e("_export", "setDialogSettingExport");
            GUI.r("_settingexport");
            GUI.a("_settingexport").setLayout(new FlowLayout());
            GUI.a("_settingexport").add(GUI.a("_export"));
            jDialog.add(GUI.a("_settingexport"));
            jDialog.setVisible(true);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void v() {
        try {
            try {
                Object object = new aQ();
                Object object2 = new aO();
                Object object3 = new aP();
                JDialog jDialog = new JDialog();
                jDialog.setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
                jDialog.setTitle(String.valueOf(t) + " - " + aM.G("dlg_lic"));
                jDialog.setSize(620, 410);
                if (B.contentEquals("mac")) {
                    jDialog.setSize(750, 410);
                } else if (B.contentEquals("linux")) {
                    jDialog.setSize(750, 510);
                }
                jDialog.setModal(true);
                jDialog.setLayout(new FlowLayout());
                JPanel jPanel = new JPanel();
                jPanel.setLayout(new FlowLayout(0));
                Object object4 = aM.G("dlg_lic_txt1");
                Object object5 = GUI.q();
                if (object5.contentEquals("activatedTRIAL")) {
                    object4 = aM.G("dlg_lic_txt2");
                } else if (object5.contentEquals("activatedLicense")) {
                    object4 = aM.G("dlg_lic_txt3");
                }
                object4 = "<html><br /><h2>" + t + "</h2><br /><br /><h3>" + (String)object4 + "</h3><br /><br />" + aM.G("dlg_lic_txt4") + "<br /><br /></html>";
                object4 = new JLabel((String)object4);
                object4.setIcon(new ImageIcon(String.valueOf(H) + "logo.png"));
                object4.addMouseListener((MouseListener)object);
                object4.setName("_trial");
                jPanel.add((Component)object4);
                object4 = new ImageIcon(String.valueOf(H) + "buybutton.png");
                JComponent jComponent = new JButton();
                jComponent.setIcon((Icon)object4);
                jComponent.setText(aM.G("menu_buy"));
                jComponent.setVerticalTextPosition(3);
                jComponent.setHorizontalTextPosition(0);
                jComponent.setPreferredSize(new Dimension(130, 80));
                jComponent.addActionListener((ActionListener)object2);
                jComponent.setActionCommand("_buy2");
                jComponent.addMouseListener((MouseListener)object);
                jComponent.setOpaque(false);
                jComponent.setFocusPainted(false);
                jComponent.setContentAreaFilled(false);
                jPanel.add(jComponent);
                object = new JRadioButton("<html><h4>" + aM.G("dlg_lic_chk1") + "</h4></html>");
                object.setActionCommand("licence_checkbox1");
                object2 = new JRadioButton("<html><h4>" + aM.G("dlg_lic_chk2") + "</h4></html>");
                object2.setActionCommand("licence_checkbox2");
                object4 = new ButtonGroup();
                object4.add((AbstractButton)object);
                object4.add((AbstractButton)object2);
                object.setSelected(true);
                object4 = new JPanel();
                object4.setLayout(new GridLayout(0, 1));
                object4.add((Component)object);
                object4.add((Component)object2);
                jComponent = new JPanel();
                JTextField jTextField = new JTextField(10);
                jTextField.setText("");
                JTextField jTextField2 = new JTextField(10);
                jTextField2.setText("");
                JTextField jTextField3 = new JTextField(10);
                jTextField3.setText("");
                JTextField jTextField4 = new JTextField(10);
                jTextField4.setText("");
                JTextField jTextField5 = new JTextField(10);
                jTextField5.setText("");
                jTextField.setName("lic_txt1");
                jTextField2.setName("lic_txt2");
                jTextField3.setName("lic_txt3");
                jTextField4.setName("lic_txt4");
                jTextField5.setName("lic_txt5");
                if (object5.contentEquals("activatedLicense") && ((String[])(object5 = GUI.o().split("-", -1))).length == 5) {
                    jTextField.setText(object5[0]);
                    jTextField2.setText(object5[1]);
                    jTextField3.setText(object5[2]);
                    jTextField4.setText(object5[3]);
                    jTextField5.setText(object5[4]);
                    object2.setSelected(true);
                }
                jTextField.setHorizontalAlignment(0);
                jTextField2.setHorizontalAlignment(0);
                jTextField3.setHorizontalAlignment(0);
                jTextField4.setHorizontalAlignment(0);
                jTextField5.setHorizontalAlignment(0);
                jTextField.addKeyListener((KeyListener)object3);
                jTextField2.addKeyListener((KeyListener)object3);
                jTextField3.addKeyListener((KeyListener)object3);
                jTextField4.addKeyListener((KeyListener)object3);
                jTextField5.addKeyListener((KeyListener)object3);
                jComponent.add(jTextField);
                jComponent.add(jTextField2);
                jComponent.add(jTextField3);
                jComponent.add(jTextField4);
                jComponent.add(jTextField5);
                object5 = new JPanel();
                object5.setLayout(new BoxLayout((Container)object5, 3));
                object3 = new JPanel();
                object3.setLayout(new FlowLayout(2));
                JButton jButton = new JButton(aM.G("dlg_lic_btn_ok"));
                jButton.setPreferredSize(new Dimension(80, 30));
                jButton.addActionListener(new ai((JRadioButton)object, (JRadioButton)object2, jTextField, jTextField2, jTextField3, jTextField4, jTextField5, jDialog));
                object = new JButton(aM.G("dlg_lic_btn_close"));
                object.setPreferredSize(new Dimension(80, 30));
                jDialog.setDefaultCloseOperation(2);
                object.addActionListener(new aj(jDialog));
                object3.add((Component)object);
                object3.add(jButton);
                jPanel.setName("panel1");
                object4.setName("panel2");
                jComponent.setName("panel3");
                object3.setName("panel4");
                object5.setName("jpanel_licence");
                object5.add(jPanel);
                object5.add((Component)object4);
                object5.add(jComponent);
                object5.add((Component)object3);
                jDialog.add((Component)object5);
                jDialog.setLocationRelativeTo(null);
                jDialog.setVisible(true);
                return;
            }
            catch (Throwable throwable) {
                return;
            }
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static HashMap a(String string) {
        HashMap<String, Object> hashMap;
        hashMap = new HashMap<String, Object>();
        try {
            String string2 = "dialog" + string;
            hashMap.put(string2, new JDialog());
            ((JDialog)hashMap.get(string2)).setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
            ((JDialog)hashMap.get(string2)).setTitle(String.valueOf(t) + " - " + aM.G("loading_title"));
            ((JDialog)hashMap.get(string2)).setSize(490, 220);
            ((JDialog)hashMap.get(string2)).setModal(true);
            string2 = "panel" + string;
            hashMap.put(string2, new JPanel());
            Object object = "<html><br><h2>" + t + "</h2></html>";
            string2 = "logo" + string;
            hashMap.put(string2, new JLabel((String)object));
            ((JLabel)hashMap.get(string2)).setIcon(new ImageIcon(String.valueOf(H) + "logo.png"));
            object = "<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step0").toLowerCase().trim()) + "<br /><br /></html>";
            string2 = "text" + string;
            hashMap.put(string2, new JLabel((String)object));
            ((JLabel)hashMap.get(string2)).setIcon(new ImageIcon(String.valueOf(H) + "splashscreen.gif"));
            ((JLabel)hashMap.get(string2)).setHorizontalTextPosition(0);
            object = new JButton(aM.G("dlg_lic_btn_close"));
            object.setPreferredSize(new Dimension(80, 25));
            object.addActionListener(new ak(hashMap, string));
            string2 = "button" + string;
            hashMap.put(string2, object);
            hashMap.put("buttontext" + string, "ok");
            ((JPanel)hashMap.get("panel" + string)).add((JLabel)hashMap.get("logo" + string));
            ((JPanel)hashMap.get("panel" + string)).add((JLabel)hashMap.get("text" + string));
            ((JPanel)hashMap.get("panel" + string)).add((JButton)hashMap.get("button" + string));
            ((JDialog)hashMap.get("dialog" + string)).add((JPanel)hashMap.get("panel" + string));
            ((JDialog)hashMap.get("dialog" + string)).setLocationRelativeTo(null);
        }
        catch (Throwable throwable) {}
        return hashMap;
    }

    private void w() {
        try {
            String string = "dialogloading";
            try {
                if (j.get(string) == null) {
                    JDialog jDialog = new JDialog();
                    j.put(string, jDialog);
                } else {
                    j.remove(string);
                    JDialog jDialog = new JDialog();
                    j.put(string, jDialog);
                }
            }
            catch (Throwable throwable) {}
            GUI.a("dialogloading").setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
            GUI.a("dialogloading").setTitle(String.valueOf(t) + " - " + aM.G("loading_title"));
            GUI.a("dialogloading").setSize(450, 220);
            GUI.a("dialogloading").setModal(true);
            GUI.r("_loading");
            GUI.e("_loading1", "<html><br><h2>" + t + "</h2></html>");
            GUI.a("_loading1").setIcon(new ImageIcon(String.valueOf(H) + "logo.png"));
            GUI.a("dialogloading").setIcon(new ImageIcon(String.valueOf(H) + "splashscreen.gif"));
            GUI.a("dialogloading").setHorizontalTextPosition(0);
            GUI.a("_loading").add(GUI.a("_loading1"));
            GUI.a("_loading").add(GUI.a("dialogloading"));
            GUI.a("dialogloading").add(GUI.a("_loading"));
            GUI.a("dialogloading").setLocationRelativeTo(null);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void x() {
        try {
            JDialog jDialog = new JDialog();
            jDialog.setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
            jDialog.setTitle(String.valueOf(t) + " - " + aM.G("dlg_advanced"));
            jDialog.setSize(550, 650);
            if (B.contentEquals("mac")) {
                jDialog.setSize(550, 650);
            }
            jDialog.setModal(true);
            Serializable serializable = new Dimension(490, 450);
            serializable = new aK(new ImageIcon(String.valueOf(H) + "backgroundsetting.jpg").getImage(), (Dimension)serializable);
            serializable.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            serializable.setOpaque(false);
            serializable.setLayout(new BoxLayout((Container)serializable, 3));
            String[] arrstring = new String[]{};
            String[] arrstring2 = new String[]{"adv_sql_host", "adv_sql_db", "adv_sql_user", "adv_sql_password", "srv_pass"};
            String[] arrstring3 = new String[]{};
            GUI.r("_setting_container_adv_0");
            GUI.r("_setting_container_adv_1");
            GUI.r("_setting_container_adv_2");
            GUI.r("_setting_container_adv_3");
            GUI.r("_setting_container_adv_6");
            GUI.r("_setting_container_adv_0_2a");
            GUI.r("_setting_container_adv_0_2b");
            GUI.r("_setting_container_adv_1_2a0");
            GUI.r("_setting_container_adv_1_2a");
            GUI.r("_setting_container_adv_1_2b");
            GUI.r("_setting_container_adv_1_2c");
            GUI.r("_setting_container_adv_1_2d");
            GUI.r("_setting_container_adv_1_2e");
            GUI.r("_setting_container_adv_1_2f");
            GUI.r("_setting_container_adv_1_2g");
            GUI.r("_setting_container_adv_1_2h");
            GUI.r("_setting_container_adv_1_2i");
            GUI.r("_setting_container_adv_2_2a");
            GUI.r("_setting_container_adv_2_2b");
            GUI.r("_setting_container_adv_2_2b0");
            GUI.r("_setting_container_adv_2_2c");
            GUI.r("_setting_container_adv_3_2a");
            GUI.r("_setting_container_adv_3_2b");
            GUI.r("_setting_container_adv_3_2c");
            GUI.a("_setting_container_adv_0").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_setting_container_adv_1").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_setting_container_adv_2").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            GUI.a("_setting_container_adv_3").setBackground(new Color(1.0f, 1.0f, 1.0f, 0.6f));
            String[] arrstring4 = new String[](Color.gray, 2, true);
            GUI.a("_setting_container_adv_0").setBorder((Border)arrstring4);
            GUI.a("_setting_container_adv_1").setBorder((Border)arrstring4);
            GUI.a("_setting_container_adv_2").setBorder((Border)arrstring4);
            GUI.a("_setting_container_adv_3").setBorder((Border)arrstring4);
            GUI.a("_setting_container_adv_0").setLayout(new GridLayout(0, 2));
            GUI.a("_setting_container_adv_1").setLayout(new GridLayout(0, 2));
            GUI.a("_setting_container_adv_2").setLayout(new GridLayout(0, 2));
            GUI.a("_setting_container_adv_3").setLayout(new GridLayout(0, 2));
            GUI.a("_setting_container_adv_6").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_0_2a").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_0_2b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2a0").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2a").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2c").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2d").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2e").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2f").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2g").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2h").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_1_2i").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_2_2a").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_2_2b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_2_2b0").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_2_2c").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_3_2a").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_3_2b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_adv_3_2c").setLayout(new FlowLayout(2));
            arrstring4 = aM.G("dlg_stg_adv_update").split(",", -1);
            GUI.a("_setting_adv_update", arrstring4, 120, 25, (int)Integer.valueOf(aH.D("adv_update")));
            GUI.e("_setting_adv_update", aM.G("dlg_stg_update"));
            GUI.a("_setting_container_adv_0_2a").add(GUI.a("_setting_adv_update"));
            GUI.a("_setting_container_adv_0").add(GUI.a("_setting_adv_update"));
            GUI.a("_setting_container_adv_0").add(GUI.a("_setting_container_adv_0_2a"));
            GUI.a("_setting_adv_btn_update", aM.G("dlg_stg_update_btn"), 150, 25);
            GUI.e("_setting_adv_btn_update", "");
            GUI.a("_setting_container_adv_0_2b").add(GUI.a("_setting_adv_btn_update"));
            GUI.a("_setting_container_adv_0").add(GUI.a("_setting_adv_btn_update"));
            GUI.a("_setting_container_adv_0").add(GUI.a("_setting_container_adv_0_2b"));
            arrstring4 = aM.G("dlg_stg_adv_sql").split(",", -1);
            GUI.a("_setting_adv_sql", arrstring4, 120, 25, (int)Integer.valueOf(aH.D("adv_sql")));
            GUI.e("_setting_adv_sql", aM.G("dlg_stg_sql"));
            GUI.a("_setting_container_adv_1_2a0").add(GUI.a("_setting_adv_sql"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_adv_sql"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_container_adv_1_2a0"));
            GUI.e("_setting_adv_sql_host", aM.G("adv_sql_host"));
            GUI.a("adv_sql_host", aH.D("adv_sql_host"), 20);
            GUI.a("_setting_container_adv_1_2a").add(GUI.a("adv_sql_host"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_adv_sql_host"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_container_adv_1_2a"));
            GUI.e("_setting_adv_sql_db", aM.G("adv_sql_db"));
            GUI.a("adv_sql_db", aH.D("adv_sql_db"), 20);
            GUI.a("_setting_container_adv_1_2b").add(GUI.a("adv_sql_db"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_adv_sql_db"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_container_adv_1_2b"));
            GUI.e("_setting_adv_sql_user", aM.G("adv_sql_user"));
            GUI.a("adv_sql_user", aH.D("adv_sql_user"), 20);
            GUI.a("_setting_container_adv_1_2c").add(GUI.a("adv_sql_user"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_adv_sql_user"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_container_adv_1_2c"));
            GUI.e("_setting_adv_sql_password", aM.G("adv_sql_password"));
            GUI.a("adv_sql_password", aH.D("adv_sql_password"), 20);
            GUI.a("_setting_container_adv_1_2d").add(GUI.a("adv_sql_password"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_adv_sql_password"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_container_adv_1_2d"));
            GUI.e("_setting_adv_sql_btn", aM.G("adv_sql_btn"));
            GUI.a("_setting_adv_sql_btn", aM.G("adv_sql_btn_btn"), 150, 25);
            GUI.a("_setting_container_adv_1_2e").add(GUI.a("_setting_adv_sql_btn"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_adv_sql_btn"));
            GUI.a("_setting_container_adv_1").add(GUI.a("_setting_container_adv_1_2e"));
            GUI.a("_setting_multithread_number", a, 120, 25, (int)Integer.valueOf(aH.D("multithread_number")));
            GUI.e("_setting_multithread_number", String.valueOf(aM.G("stg_adv_multi")) + " ( " + aM.G("stg_multi") + " ) :");
            GUI.a("_setting_container_adv_2_2b0").add(GUI.a("_setting_multithread_number"));
            GUI.a("_setting_container_adv_2").add(GUI.a("_setting_multithread_number"));
            GUI.a("_setting_container_adv_2").add(GUI.a("_setting_container_adv_2_2b0"));
            GUI.e("_setting_proxy_use", aM.G("dlg_stg_antiblacklist"));
            GUI.b("_setting_proxy_use", aM.G("dlg_stg_checkbox"), bn.Q("proxy_use"));
            GUI.a("_setting_proxy_use").setActionCommand("_setting_proxy_use");
            GUI.a("_setting_container_adv_2_2b").add(GUI.a("_setting_proxy_use"));
            GUI.a("_setting_container_adv_2").add(GUI.a("_setting_proxy_use"));
            GUI.a("_setting_container_adv_2").add(GUI.a("_setting_container_adv_2_2b"));
            GUI.e("_setting_proxy_import", aM.G("dlg_adv_proxy"));
            GUI.a("_setting_proxy_import", aM.G("browse_btn"), 150, 25);
            GUI.a("_setting_container_adv_2_2c").add(GUI.a("_setting_proxy_import"));
            GUI.a("_setting_container_adv_2").add(GUI.a("_setting_proxy_import"));
            GUI.a("_setting_container_adv_2").add(GUI.a("_setting_container_adv_2_2c"));
            arrstring4 = aM.G("dlg_adv_srv_distant_use").split(",", -1);
            GUI.e("_setting_srv_distant", aM.G("dlg_adv_srv_distant"));
            GUI.a("_setting_srv_distant", arrstring4, 120, 25, (int)Integer.valueOf(aH.D("srv_distant")));
            GUI.a("_setting_container_adv_3_2a").add(GUI.a("_setting_srv_distant"));
            GUI.a("_setting_container_adv_3").add(GUI.a("_setting_srv_distant"));
            GUI.a("_setting_container_adv_3").add(GUI.a("_setting_container_adv_3_2a"));
            GUI.e("_setting_adv_srv_pass", aM.G("adv_srv_pass"));
            GUI.a("srv_pass", aH.D("srv_pass"), 20);
            GUI.a("_setting_container_adv_3_2b").add(GUI.a("srv_pass"));
            GUI.a("_setting_container_adv_3").add(GUI.a("_setting_adv_srv_pass"));
            GUI.a("_setting_container_adv_3").add(GUI.a("_setting_container_adv_3_2b"));
            GUI.e("_setting_adv_srv_port", aM.G("adv_srv_port"));
            GUI.a("srv_port", aH.D("srv_port"), 20);
            GUI.a("_setting_container_adv_3_2c").add(GUI.a("srv_port"));
            GUI.a("_setting_container_adv_3").add(GUI.a("_setting_adv_srv_port"));
            GUI.a("_setting_container_adv_3").add(GUI.a("_setting_container_adv_3_2c"));
            if (a.equals(Level.FINEST)) {
                GUI.a("setting_adv_close", aM.G("dlg_stg_cancel"), 150, 25);
                GUI.a("_setting_container_adv_6").add(GUI.a("setting_adv_close"));
            } else {
                GUI.e("_setting_container_adv_6", aM.G("dlg_stg_txt1"));
                GUI.a("_setting_container_adv_6").add(GUI.a("_setting_container_adv_6"));
                GUI.a("setting_adv_close", aM.G("dlg_stg_cancel"), 150, 25);
                GUI.a("_setting_container_adv_6").add(GUI.a("setting_adv_close"));
            }
            GUI.a("_setting_adv_sql_btn").addActionListener(new al(this, arrstring2, arrstring, arrstring3));
            jDialog.addWindowListener(new an(this, arrstring2, arrstring, arrstring3, jDialog));
            GUI.a("setting_adv_close").addActionListener(new ao(this, arrstring2, arrstring, arrstring3, jDialog));
            GUI.a("_setting_container_adv_0").setOpaque(true);
            GUI.a("_setting_container_adv_1").setOpaque(true);
            GUI.a("_setting_container_adv_2").setOpaque(true);
            GUI.a("_setting_container_adv_3").setOpaque(true);
            GUI.a("_setting_container_adv_6").setOpaque(false);
            GUI.a("_setting_container_adv_0_2a").setOpaque(false);
            GUI.a("_setting_container_adv_0_2b").setOpaque(false);
            GUI.a("_setting_container_adv_1_2a0").setOpaque(false);
            GUI.a("_setting_container_adv_1_2a").setOpaque(false);
            GUI.a("_setting_container_adv_1_2b").setOpaque(false);
            GUI.a("_setting_container_adv_1_2c").setOpaque(false);
            GUI.a("_setting_container_adv_1_2d").setOpaque(false);
            GUI.a("_setting_container_adv_1_2e").setOpaque(false);
            GUI.a("_setting_container_adv_1_2f").setOpaque(false);
            GUI.a("_setting_container_adv_1_2g").setOpaque(false);
            GUI.a("_setting_container_adv_1_2h").setOpaque(false);
            GUI.a("_setting_container_adv_1_2i").setOpaque(false);
            GUI.a("_setting_container_adv_2_2a").setOpaque(false);
            GUI.a("_setting_container_adv_2_2b").setOpaque(false);
            GUI.a("_setting_container_adv_2_2b0").setOpaque(false);
            GUI.a("_setting_container_adv_2_2c").setOpaque(false);
            GUI.a("_setting_container_adv_3_2a").setOpaque(false);
            GUI.a("_setting_container_adv_3_2b").setOpaque(false);
            GUI.a("_setting_container_adv_3_2c").setOpaque(false);
            GUI.a("_setting_proxy_use").setOpaque(false);
            if (!(((String)q.get("setting")).contentEquals("validLicence") && e != 0 || a == Level.FINEST)) {
                GUI.a("_setting_multithread_number").setEnabled(false);
            }
            serializable.add(GUI.a("_setting_container_adv_0"));
            serializable.add(GUI.a("_setting_container_adv_1"));
            serializable.add(GUI.a("_setting_container_adv_3"));
            serializable.add(GUI.a("_setting_container_adv_2"));
            serializable.add(GUI.a("_setting_container_adv_6"));
            this.a("menudialogsettingadvanced", (JComponent)serializable);
            this.b("menudialogsettingadvanced").getVerticalScrollBar().setUnitIncrement(13);
            jDialog.add(this.b("menudialogsettingadvanced"));
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void y() {
        try {
            Serializable serializable;
            JDialog jDialog;
            String[] arrstring;
            String[] arrstring2;
            String[] arrstring3;
            Object object;
            arrstring2 = aI.c();
            jDialog = new JDialog();
            jDialog.setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
            jDialog.setTitle(String.valueOf(t) + " - " + aM.G("dlg_mail"));
            jDialog.setSize(550, 750);
            if (B.contentEquals("mac")) {
                jDialog.setSize(750, 750);
            }
            jDialog.setModal(true);
            serializable = new Dimension(490, 450);
            serializable = new aK(new ImageIcon(String.valueOf(H) + "backgroundsetting.jpg").getImage(), (Dimension)serializable);
            GUI.r("mailcontainer0");
            GUI.r("mailcontainer1");
            GUI.r("mailcontainer2");
            GUI.r("mailcontainer3");
            GUI.r("mailcontainer4");
            GUI.r("mailcontainer5");
            GUI.r("mailcontainer6");
            GUI.r("mailcontainer7");
            GUI.r("mailcontainer8");
            GUI.r("mailcontainer9");
            GUI.r("mailcontainer10");
            GUI.r("mailcontainer11");
            GUI.r("mailcontainer12");
            GUI.r("mailcontainer13");
            GUI.r("mailcontainer14");
            GUI.r("mailcontainer15");
            GUI.r("mailcontainer16");
            GUI.r("_setting_container_0_0a");
            GUI.r("_setting_container_0_0b");
            GUI.r("_setting_container_1_0a");
            GUI.r("_setting_container_1_0b");
            GUI.r("_setting_container_2_0a");
            GUI.r("_setting_container_2_0b");
            GUI.r("_setting_container_3_0a");
            GUI.r("_setting_container_3_0b");
            GUI.r("_setting_container_4_0a");
            GUI.r("_setting_container_4_0b");
            GUI.r("_setting_container_5_0a");
            GUI.r("_setting_container_5_0b");
            GUI.r("_setting_container_6_0a");
            GUI.r("_setting_container_6_0b");
            GUI.r("_setting_container_7_0a");
            GUI.r("_setting_container_7_0b");
            GUI.r("_setting_container_8_0a");
            GUI.r("_setting_container_8_0b");
            GUI.r("_setting_container_9_0a");
            GUI.r("_setting_container_9_0b");
            GUI.r("_setting_container_10_0a");
            GUI.r("_setting_container_10_0b");
            GUI.r("_setting_container_11_0a");
            GUI.r("_setting_container_11_0b");
            GUI.r("_setting_container_12_0a");
            GUI.r("_setting_container_12_0b");
            GUI.r("_setting_container_13_0a");
            GUI.r("_setting_container_13_0b");
            GUI.r("_setting_container_14_0a");
            GUI.r("_setting_container_14_0b");
            GUI.a("mailcontainer0").setOpaque(false);
            GUI.a("mailcontainer1").setOpaque(false);
            GUI.a("mailcontainer2").setOpaque(false);
            GUI.a("mailcontainer3").setOpaque(false);
            GUI.a("mailcontainer4").setOpaque(false);
            GUI.a("mailcontainer5").setOpaque(false);
            GUI.a("mailcontainer6").setOpaque(false);
            GUI.a("mailcontainer7").setOpaque(false);
            GUI.a("mailcontainer8").setOpaque(false);
            GUI.a("mailcontainer9").setOpaque(false);
            GUI.a("mailcontainer10").setOpaque(false);
            GUI.a("mailcontainer11").setOpaque(false);
            GUI.a("mailcontainer12").setOpaque(false);
            GUI.a("mailcontainer13").setOpaque(false);
            GUI.a("mailcontainer14").setOpaque(false);
            GUI.a("mailcontainer15").setOpaque(false);
            GUI.a("mailcontainer16").setOpaque(false);
            GUI.a("_setting_container_0_0a").setOpaque(false);
            GUI.a("_setting_container_0_0b").setOpaque(false);
            GUI.a("_setting_container_1_0a").setOpaque(false);
            GUI.a("_setting_container_1_0b").setOpaque(false);
            GUI.a("_setting_container_2_0a").setOpaque(false);
            GUI.a("_setting_container_2_0b").setOpaque(false);
            GUI.a("_setting_container_3_0a").setOpaque(false);
            GUI.a("_setting_container_3_0b").setOpaque(false);
            GUI.a("_setting_container_4_0a").setOpaque(false);
            GUI.a("_setting_container_4_0b").setOpaque(false);
            GUI.a("_setting_container_5_0a").setOpaque(false);
            GUI.a("_setting_container_5_0b").setOpaque(false);
            GUI.a("_setting_container_6_0a").setOpaque(false);
            GUI.a("_setting_container_6_0b").setOpaque(false);
            GUI.a("_setting_container_7_0a").setOpaque(false);
            GUI.a("_setting_container_7_0b").setOpaque(false);
            GUI.a("_setting_container_8_0a").setOpaque(false);
            GUI.a("_setting_container_8_0b").setOpaque(false);
            GUI.a("_setting_container_9_0a").setOpaque(false);
            GUI.a("_setting_container_9_0b").setOpaque(false);
            GUI.a("_setting_container_10_0a").setOpaque(false);
            GUI.a("_setting_container_10_0b").setOpaque(false);
            GUI.a("_setting_container_11_0a").setOpaque(false);
            GUI.a("_setting_container_11_0b").setOpaque(false);
            GUI.a("_setting_container_12_0a").setOpaque(false);
            GUI.a("_setting_container_12_0b").setOpaque(false);
            GUI.a("_setting_container_13_0a").setOpaque(false);
            GUI.a("_setting_container_13_0b").setOpaque(false);
            GUI.a("_setting_container_14_0a").setOpaque(false);
            GUI.a("_setting_container_14_0b").setOpaque(false);
            GUI.e("mailtype", aM.G("mailtype"));
            GUI.e("mailauth", aM.G("mailauth"));
            GUI.e("mailcrypt", aM.G("mailcrypt"));
            GUI.e("mailhost", aM.G("mailhost"));
            GUI.e("mailport", aM.G("mailport"));
            GUI.e("mailuser", aM.G("mailuser"));
            GUI.e("mailpass", aM.G("mailpass"));
            GUI.e("mailfrom", aM.G("mailfrom"));
            GUI.e("mailto", aM.G("mailto"));
            GUI.e("mailcc", aM.G("mailcc"));
            GUI.e("mailcci", aM.G("mailcci"));
            GUI.e("mailsubject", aM.G("mailsubject"));
            GUI.e("mailattachment", aM.G("mailattachment"));
            GUI.e("mailblacklist", String.valueOf(aM.G("mailblacklist")) + " " + arrstring2);
            GUI.e("mailsend", aM.G("mailsend"));
            GUI.e("mailclose", aM.G("dlg_stg_txt1"));
            GUI.a("mailtype", aM.G("mailtype_select").split(",", -1), 130, 25, (int)Integer.valueOf(bn.Q("mailtype")));
            GUI.a("mailauth", aM.G("mailauth_select").split(",", -1), 130, 25, (int)Integer.valueOf(bn.Q("mailauth")));
            GUI.a("mailcrypt", aM.G("mailcrypt_select").split(",", -1), 130, 25, (int)Integer.valueOf(bn.Q("mailcrypt")));
            GUI.a("mailhost", bn.Q("mailhost"), 30);
            GUI.a("mailport", bn.Q("mailport"), 30);
            GUI.a("mailuser", bn.Q("mailuser"), 30);
            GUI.a("mailpass", bn.Q("mailpass"), 30);
            GUI.a("mailfrom", bn.Q("mailfrom"), 30);
            GUI.a("mailto", bn.Q("mailto"), 30);
            GUI.a("mailcc", bn.Q("mailcc"), 30);
            GUI.a("mailcci", bn.Q("mailcci"), 30);
            GUI.a("mailsubject", bn.Q("mailsubject"), 30);
            Integer n2 = 60;
            Serializable serializable2 = Integer.valueOf(9);
            arrstring = bn.Q("mailbody");
            arrstring3 = "mailbody";
            object = this;
            try {
                if (object.l.get(arrstring3) == null) {
                    serializable2 = new JTextArea(serializable2.intValue(), n2);
                    serializable2.setText((String)arrstring);
                    serializable2.setName((String)arrstring3);
                    object.l.put(arrstring3, serializable2);
                } else {
                    object.l.remove(arrstring3);
                    serializable2 = new JTextArea(serializable2.intValue(), n2);
                    serializable2.setText((String)arrstring);
                    serializable2.setName((String)arrstring3);
                    object.l.put(arrstring3, serializable2);
                }
            }
            catch (Throwable throwable) {}
            object = new JScrollPane(this.a("mailbody"), 22, 32);
            GUI.a("mailattachment", aM.G("mailattachment_btn"), 150, 25);
            GUI.a("mailblacklist", aM.G("mailblacklist_btn"), 150, 25);
            GUI.a("mailsend", aM.G("mailsend_btn"), 150, 25);
            GUI.a("mailclose", aM.G("dlg_hlp_close"), 150, 25);
            serializable.setLayout(new BoxLayout((Container)serializable, 3));
            GUI.a("mailcontainer0").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer1").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer2").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer3").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer4").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer5").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer6").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer7").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer8").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer9").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer10").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer11").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer12").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer13").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer14").setLayout(new GridLayout(0, 2));
            GUI.a("mailcontainer15").setLayout(new FlowLayout(1));
            GUI.a("mailcontainer16").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_0_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_0_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_1_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_1_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_2_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_2_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_3_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_3_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_4_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_4_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_5_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_5_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_6_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_6_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_7_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_7_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_8_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_8_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_9_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_9_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_10_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_10_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_11_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_11_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_12_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_12_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_13_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_13_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_14_0a").setLayout(new FlowLayout(0));
            GUI.a("_setting_container_14_0b").setLayout(new FlowLayout(2));
            GUI.a("_setting_container_0_0a").add(GUI.a("mailtype"));
            GUI.a("_setting_container_0_0b").add(GUI.a("mailtype"));
            GUI.a("_setting_container_1_0a").add(GUI.a("mailhost"));
            GUI.a("_setting_container_1_0b").add(GUI.a("mailhost"));
            GUI.a("_setting_container_2_0a").add(GUI.a("mailport"));
            GUI.a("_setting_container_2_0b").add(GUI.a("mailport"));
            GUI.a("_setting_container_3_0a").add(GUI.a("mailcrypt"));
            GUI.a("_setting_container_3_0b").add(GUI.a("mailcrypt"));
            GUI.a("_setting_container_4_0a").add(GUI.a("mailauth"));
            GUI.a("_setting_container_4_0b").add(GUI.a("mailauth"));
            GUI.a("_setting_container_5_0a").add(GUI.a("mailuser"));
            GUI.a("_setting_container_5_0b").add(GUI.a("mailuser"));
            GUI.a("_setting_container_6_0a").add(GUI.a("mailpass"));
            GUI.a("_setting_container_6_0b").add(GUI.a("mailpass"));
            GUI.a("_setting_container_7_0a").add(GUI.a("mailfrom"));
            GUI.a("_setting_container_7_0b").add(GUI.a("mailfrom"));
            GUI.a("_setting_container_8_0a").add(GUI.a("mailto"));
            GUI.a("_setting_container_8_0b").add(GUI.a("mailto"));
            GUI.a("_setting_container_9_0a").add(GUI.a("mailcc"));
            GUI.a("_setting_container_9_0b").add(GUI.a("mailcc"));
            GUI.a("_setting_container_10_0a").add(GUI.a("mailcci"));
            GUI.a("_setting_container_10_0b").add(GUI.a("mailcci"));
            GUI.a("_setting_container_11_0a").add(GUI.a("mailsubject"));
            GUI.a("_setting_container_11_0b").add(GUI.a("mailsubject"));
            GUI.a("_setting_container_12_0a").add(GUI.a("mailattachment"));
            GUI.a("_setting_container_12_0b").add(GUI.a("mailattachment"));
            GUI.a("_setting_container_13_0a").add(GUI.a("mailblacklist"));
            GUI.a("_setting_container_13_0b").add(GUI.a("mailblacklist"));
            GUI.a("_setting_container_14_0a").add(GUI.a("mailsend"));
            GUI.a("_setting_container_14_0b").add(GUI.a("mailsend"));
            if (!bn.Q("mailattachment").contentEquals("empty")) {
                GUI.a("mailattachment").setText(aM.G("mailattachment_del_btn"));
                GUI.a("mailattachment").setText(String.valueOf(aM.G("mailattachment_file")) + bn.Q("mailattachment"));
            }
            if (arrstring2.intValue() != 0) {
                GUI.a("mailblacklist").setText(aM.G("mailblacklist_btn1"));
            }
            GUI.a("mailattachment").addActionListener(new ap(this));
            GUI.a("mailblacklist").addActionListener(new aq(this));
            arrstring2 = new String[]{"mailtype", "mailcrypt", "mailauth"};
            arrstring3 = new String[]{"mailhost", "mailport", "mailuser", "mailpass", "mailfrom", "mailto", "mailcc", "mailcci", "mailsubject"};
            arrstring = new String[]{"mailbody"};
            GUI.a("mailsend").addActionListener(new ar(this, arrstring3, arrstring2, arrstring));
            jDialog.addWindowListener(new as(this, arrstring3, arrstring2, arrstring, (JScrollPane)object));
            GUI.a("mailclose").addActionListener(new at(this, arrstring3, arrstring2, arrstring, (JScrollPane)object, jDialog));
            GUI.a("mailcontainer0").add(GUI.a("_setting_container_0_0a"));
            GUI.a("mailcontainer0").add(GUI.a("_setting_container_0_0b"));
            GUI.a("mailcontainer1").add(GUI.a("_setting_container_1_0a"));
            GUI.a("mailcontainer1").add(GUI.a("_setting_container_1_0b"));
            GUI.a("mailcontainer2").add(GUI.a("_setting_container_2_0a"));
            GUI.a("mailcontainer2").add(GUI.a("_setting_container_2_0b"));
            GUI.a("mailcontainer3").add(GUI.a("_setting_container_3_0a"));
            GUI.a("mailcontainer3").add(GUI.a("_setting_container_3_0b"));
            GUI.a("mailcontainer4").add(GUI.a("_setting_container_4_0a"));
            GUI.a("mailcontainer4").add(GUI.a("_setting_container_4_0b"));
            GUI.a("mailcontainer5").add(GUI.a("_setting_container_5_0a"));
            GUI.a("mailcontainer5").add(GUI.a("_setting_container_5_0b"));
            GUI.a("mailcontainer6").add(GUI.a("_setting_container_6_0a"));
            GUI.a("mailcontainer6").add(GUI.a("_setting_container_6_0b"));
            GUI.a("mailcontainer7").add(GUI.a("_setting_container_7_0a"));
            GUI.a("mailcontainer7").add(GUI.a("_setting_container_7_0b"));
            GUI.a("mailcontainer8").add(GUI.a("_setting_container_8_0a"));
            GUI.a("mailcontainer8").add(GUI.a("_setting_container_8_0b"));
            GUI.a("mailcontainer9").add(GUI.a("_setting_container_9_0a"));
            GUI.a("mailcontainer9").add(GUI.a("_setting_container_9_0b"));
            GUI.a("mailcontainer10").add(GUI.a("_setting_container_10_0a"));
            GUI.a("mailcontainer10").add(GUI.a("_setting_container_10_0b"));
            GUI.a("mailcontainer11").add(GUI.a("_setting_container_11_0a"));
            GUI.a("mailcontainer11").add(GUI.a("_setting_container_11_0b"));
            GUI.a("mailcontainer12").add(GUI.a("_setting_container_12_0a"));
            GUI.a("mailcontainer12").add(GUI.a("_setting_container_12_0b"));
            GUI.a("mailcontainer13").add(GUI.a("_setting_container_13_0a"));
            GUI.a("mailcontainer13").add(GUI.a("_setting_container_13_0b"));
            GUI.a("mailcontainer14").add(GUI.a("_setting_container_14_0a"));
            GUI.a("mailcontainer14").add(GUI.a("_setting_container_14_0b"));
            GUI.a("mailcontainer15").add((Component)object);
            GUI.a("mailcontainer16").add(GUI.a("mailclose"));
            GUI.a("mailcontainer16").add(GUI.a("mailclose"));
            serializable.add(GUI.a("mailcontainer0"));
            serializable.add(GUI.a("mailcontainer1"));
            serializable.add(GUI.a("mailcontainer2"));
            serializable.add(GUI.a("mailcontainer3"));
            serializable.add(GUI.a("mailcontainer4"));
            serializable.add(GUI.a("mailcontainer5"));
            serializable.add(GUI.a("mailcontainer6"));
            serializable.add(GUI.a("mailcontainer7"));
            serializable.add(GUI.a("mailcontainer8"));
            serializable.add(GUI.a("mailcontainer9"));
            serializable.add(GUI.a("mailcontainer10"));
            serializable.add(GUI.a("mailcontainer11"));
            serializable.add(GUI.a("mailcontainer15"));
            serializable.add(GUI.a("mailcontainer12"));
            serializable.add(GUI.a("mailcontainer13"));
            serializable.add(GUI.a("mailcontainer14"));
            serializable.add(GUI.a("mailcontainer16"));
            jDialog.add((Component)serializable);
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static boolean g(String string) {
        try {
            bn.Q("mailtype");
            String string2 = bn.Q("mailcrypt");
            String string3 = bn.Q("mailauth");
            String string4 = bn.Q("mailhost");
            String string5 = bn.Q("mailport");
            String string6 = bn.Q("mailuser");
            String string7 = bn.Q("mailpass");
            String string8 = bn.Q("mailfrom");
            String string9 = bn.Q("mailto");
            if (!string.contentEquals("")) {
                string9 = String.valueOf(bn.Q("mailto")) + ";" + string;
            }
            string = bn.Q("mailcc");
            String string10 = bn.Q("mailcci");
            String string11 = bn.Q("mailsubject");
            String string12 = bn.Q("mailbody");
            String string13 = bn.Q("mailattachment");
            string9 = string9.replace(",", ";");
            string = string.replace(",", ";");
            string10 = string10.replace(",", ";");
            if (string9.startsWith(";")) {
                string9 = string9.substring(1);
            }
            if (string.startsWith(";")) {
                string = string.substring(1);
            }
            if (string10.startsWith(";")) {
                string10 = string.substring(1);
            }
            String[] arrstring = string9.split(";", -1);
            String[] arrstring2 = string.split(";", -1);
            String[] arrstring3 = string10.split(";", -1);
            if (!string9.contains(";") && string9.contains("@")) {
                arrstring = new String[]{string9};
            }
            if (!string.contains(";") && string.contains("@")) {
                arrstring2 = new String[]{string};
            }
            if (!string10.contains(";") && string10.contains("@")) {
                arrstring3 = new String[]{string10};
            }
            string = aI.a(string2, string3, string4, string5, string6, string7, string8, arrstring, arrstring2, arrstring3, string11, string12, string13, false);
            string2 = aM.G("mailsent");
            if (string.contentEquals("false") || string.contentEquals("")) {
                string2 = aM.G("mailerror");
            }
            GUI.d(string2, aM.G("dlg_stg"));
        }
        catch (Throwable throwable) {}
        return false;
    }

    private boolean a(String[] arrstring, String[] arrstring2, String[] arrstring3) {
        boolean bl2;
        bl2 = false;
        try {
            int n2 = 0;
            while (n2 < arrstring.length) {
                bn.d(t, arrstring[n2], GUI.a(arrstring[n2]).getText());
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring2.length) {
                bn.d(t, arrstring2[n2], String.valueOf(GUI.a(arrstring2[n2]).getSelectedIndex()));
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring3.length) {
                bn.d(t, arrstring3[n2], String.valueOf(this.a(arrstring3[n2]).getText()));
                ++n2;
            }
            bl2 = true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private boolean b(String[] arrstring, String[] arrstring2, String[] arrstring3) {
        boolean bl2;
        bl2 = false;
        try {
            int n2 = 0;
            while (n2 < arrstring.length) {
                aH.b(t, arrstring[n2], GUI.a(arrstring[n2]).getText());
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring2.length) {
                aH.b(t, arrstring2[n2], String.valueOf(GUI.a(arrstring2[n2]).getSelectedIndex()));
                ++n2;
            }
            n2 = 0;
            while (n2 < arrstring3.length) {
                aH.b(t, arrstring3[n2], String.valueOf(this.a(arrstring3[n2]).getText()));
                ++n2;
            }
            bl2 = true;
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public final void z() {
        try {
            JDialog jDialog = new JDialog();
            jDialog.setIconImage(new ImageIcon(String.valueOf(H) + v).getImage());
            jDialog.setTitle(String.valueOf(t) + " - " + aM.G("dlg_abt"));
            jDialog.setSize(450, 350);
            jDialog.setModal(true);
            JPanel jPanel = new JPanel();
            JPanel jPanel2 = new JPanel();
            JPanel jPanel3 = new JPanel();
            jPanel.setLayout(new BoxLayout(jPanel, 3));
            JLabel jLabel = new JLabel("<html><br><h2>" + t + "</h2></html>");
            jLabel.setIcon(new ImageIcon(String.valueOf(H) + "logo.png"));
            JLabel jLabel2 = new JLabel("<html><br><br>" + t + " " + r + " <br><br>" + System.getProperty("os.name") + " ( " + System.getProperty("os.arch") + ", " + System.getProperty("sun.arch.data.model") + " ) <br><br>Copyright 2017-2018 IQUALIF<br><br>" + aM.G("dlg_abt_text"));
            jLabel2.setHorizontalTextPosition(0);
            JButton jButton = new JButton(aM.G("dlg_hlp_close"));
            jButton.setPreferredSize(new Dimension(80, 25));
            jDialog.setDefaultCloseOperation(2);
            jButton.addActionListener(new au(this, jDialog));
            jPanel2.add(jLabel);
            jPanel2.add(jLabel2);
            jPanel3.add(jButton);
            jPanel.add(jPanel2);
            jPanel.add(jPanel3);
            jDialog.add(jPanel);
            jDialog.setLocationRelativeTo(null);
            jDialog.setVisible(true);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void a(String string, String string2, String object, int n2, int n3) {
        try {
            if (h.get(string) == null) {
                object = new ImageIcon((String)object);
                JButton jButton = new JButton();
                jButton.setIcon((Icon)object);
                jButton.setText(string2);
                jButton.setVerticalTextPosition(3);
                jButton.setHorizontalTextPosition(0);
                jButton.setPreferredSize(new Dimension(n2, n3));
                jButton.addActionListener(GUI.a());
                jButton.setActionCommand(string);
                h.put(string, jButton);
                return;
            }
            h.remove(string);
            object = new ImageIcon((String)object);
            JButton jButton = new JButton();
            jButton.setIcon((Icon)object);
            jButton.setText(string2);
            jButton.setVerticalTextPosition(3);
            jButton.setHorizontalTextPosition(0);
            jButton.setPreferredSize(new Dimension(n2, n3));
            jButton.addActionListener(GUI.a());
            jButton.setActionCommand(string);
            h.put(string, jButton);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void m(String string) {
        try {
            h.remove(string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private JScrollPane a(String string) {
        JScrollPane jScrollPane = new JScrollPane(null);
        try {
            av av2 = new av(this);
            aw aw2 = new aw(this, av2);
            Object object = new TableRowSorter<av>(av2);
            aw2.setRowSorter((RowSorter<? extends TableModel>)object);
            object = aw2.getSelectionModel();
            object.setSelectionMode(2);
            object.addListSelectionListener(new ay(this, aw2));
            if (string.contentEquals("contact")) {
                a = av2;
            }
            aw2.getTableHeader().addMouseListener(GUI.a());
            aw2.setName(string);
            aw2.setModel(av2);
            o.put(string, aw2);
            this.a(string, aw2);
            this.b(string).setOpaque(false);
            this.b(string).getViewport().setOpaque(true);
            this.b(string).getViewport().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.95f));
            GUI.p(string);
            return this.b(string);
        }
        catch (Throwable throwable) {
            return jScrollPane;
        }
    }

    private static void A() {
        try {
            GUI.a("_container1c_col0").setText(aM.G("dlg_man_manual_zip"));
            GUI.a("_container1c_col1").setText(aM.G("dlg_man_manual_city"));
            GUI.a("_container1c_col2").setText(aM.G("dlg_man_manual_street"));
            GUI.a("_container1c_col0").setText(GUI.C("zipsample"));
            GUI.a("_container1c_col1").setText(GUI.C("citysample"));
            GUI.a("_container1c_col2").setText(GUI.C("streetsample"));
            GUI.a("_container1c").setOpaque(false);
            if (!bn.Q("url_search").contains("\u00a4zip\u00a4")) {
                GUI.a("_container1c_col0").setText("");
                GUI.a("_container1c_col0").setVisible(false);
                GUI.a("_container1c_col0").setVisible(false);
            } else {
                GUI.a("_container1c_col0").setVisible(true);
                GUI.a("_container1c_col0").setVisible(true);
            }
            if (!bn.Q("url_search").contains("\u00a4city\u00a4")) {
                GUI.a("_container1c_col1").setText("");
                GUI.a("_container1c_col1").setVisible(false);
                GUI.a("_container1c_col1").setVisible(false);
            } else {
                GUI.a("_container1c_col1").setVisible(true);
                GUI.a("_container1c_col1").setVisible(true);
            }
            if (!bn.Q("url_search").contains("\u00a4street\u00a4")) {
                GUI.a("_container1c_col2").setText("");
                GUI.a("_container1c_col2").setVisible(false);
                GUI.a("_container1c_col2").setVisible(false);
            } else {
                GUI.a("_container1c_col2").setVisible(true);
                GUI.a("_container1c_col2").setVisible(true);
            }
            if (t.contentEquals("IQUALIF Dominica White") || t.contentEquals("IQUALIF Lucia White")) {
                GUI.a("_container1c_col0").setVisible(false);
                GUI.a("_container1c_col0").setVisible(false);
                GUI.a("_container1c_col1").setVisible(false);
                GUI.a("_container1c_col1").setVisible(false);
            } else if (t.contentEquals("IQUALIF Australia Yellow") || t.contentEquals("IQUALIF Italy White") || t.contentEquals("IQUALIF Africa Yellow") || t.contains("United Kingdom ") || t.contains("Morocco ") || t.contains("Madagascar ")) {
                GUI.a("_container1c_col0").setVisible(false);
                GUI.a("_container1c_col0").setVisible(false);
            }
            if (t.contains("Madagascar Yellow")) {
                GUI.a("_container1c_col1").setVisible(false);
                GUI.a("_container1c_col1").setVisible(false);
            }
            GUI.a("_container1c").removeAll();
            GUI.a("_container1c").add(GUI.a("_container1c_col0"));
            if (t.contentEquals("IQUALIF Australia Yellow")) {
                GUI.a("_container1c").add(GUI.a("_container1c_col2"));
                GUI.a("_container1c").add(GUI.a("_container1c_col1"));
                return;
            }
            GUI.a("_container1c").add(GUI.a("_container1c_col1"));
            GUI.a("_container1c").add(GUI.a("_container1c_col2"));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static boolean a(List list, boolean bl2, String string, String string2, String string3, List list2) {
        try {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = GUI.a("0");
            JDialog jDialog = (JDialog)hashMap.get("dialog0");
            SwingUtilities.invokeLater(new az(jDialog));
            bi.a(arrayList, hashMap, list, string2);
            boolean bl3 = bi.a(list, (Integer)s.get("getzipcitystreet"), string, hashMap);
            if (bl3) {
                bi.P("continue");
                if (!string3.contentEquals("expert")) {
                    GUI.o(aM.G("dlg_man_search_start_ok"));
                    GUI.a("_recherche").setIcon(new ImageIcon(String.valueOf(H) + "loading.gif"));
                }
                GUI.b(string3, list2);
            } else if (((String)hashMap.get("buttontext0")).contentEquals("canceled")) {
                GUI.a("_recherche").setIcon(new ImageIcon(String.valueOf(H) + "stop.PNG"));
                GUI.a("_capture").setIcon(new ImageIcon(String.valueOf(H) + "startbutton.png"));
                GUI.a("_capture").setText(aM.G("menu_start"));
            } else {
                GUI.o(String.valueOf(aM.G("dlg_man_search_start_error")) + t);
                GUI.a("_recherche").setIcon(new ImageIcon(String.valueOf(H) + "stop.PNG"));
                GUI.a("_capture").setIcon(new ImageIcon(String.valueOf(H) + "startbutton.png"));
                GUI.a("_capture").setText(aM.G("menu_start"));
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static boolean b(String string, List list) {
        try {
            boolean bl2 = true;
            bn.Q("proxy_use");
            bi.P("continue");
            SwingUtilities.invokeAndWait(new aA());
            while (bi.az().contentEquals("continue")) {
                String string2;
                String[] arrstring;
                if (!GUI.d() && Integer.valueOf((arrstring = (string2 = bi.af()).split("\u00a4"))[1]) > 50) {
                    GUI.a(arrstring);
                    GUI.d(aM.G("dlg_lic_get_txt10"), aM.G("dlg_start"));
                    GUI.a().v();
                    return false;
                }
                string2 = bi.b(string, list);
                if (string.contentEquals("expert")) {
                    GUI.d("import termine", "info");
                    return false;
                }
                arrstring = bi.af();
                arrstring = arrstring.split("\u00a4");
                GUI.b(arrstring);
                GUI.a(arrstring, string2);
                if (!arrstring[0].contentEquals("false")) continue;
                GUI.m();
                bl2 = false;
                break;
            }
            if (bl2 && bi.az().contentEquals("stop")) {
                GUI.l();
            }
        }
        catch (Throwable throwable) {
            GUI.o(aM.G("dlg_man_search_continue7"));
            GUI.a("_recherche").setIcon(new ImageIcon(String.valueOf(H) + "stop.PNG"));
        }
        return false;
    }

    private static boolean a(String[] arrstring) {
        try {
            GUI.l();
            if (bn.Q("detailcapture").contentEquals("1") || (t.contentEquals("IQUALIF France White") || t.contentEquals("IQUALIF France Yellow")) && Integer.valueOf(arrstring[4].split(" / ")[0]) > 0) {
                if (!arrstring[3].split(" / ")[1].contentEquals("0")) {
                    if (arrstring[4].split(" / ")[1].contentEquals("0")) {
                        GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( " + a.format((float)(Integer.valueOf(arrstring[3].split(" / ")[1]) - Integer.valueOf(arrstring[3].split(" / ")[0])) / (float)Integer.valueOf(arrstring[3].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( 100 % )");
                    } else {
                        GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( " + a.format((float)(Integer.valueOf(arrstring[3].split(" / ")[1]) - Integer.valueOf(arrstring[3].split(" / ")[0])) / (float)Integer.valueOf(arrstring[3].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( " + a.format((double)(10000 / (100 + Integer.valueOf(arrstring[4].split(" / ")[1])))) + " % )");
                    }
                } else if (arrstring[4].split(" / ")[1].contentEquals("0")) {
                    GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( 100 % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( 100 % )");
                } else {
                    GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( 100 % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( " + a.format((double)(10000 / (100 + Integer.valueOf(arrstring[4].split(" / ")[1])))) + " % )");
                }
            } else if (!arrstring[3].split(" / ")[1].contentEquals("0")) {
                GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( " + a.format((float)(Integer.valueOf(arrstring[3].split(" / ")[1]) - Integer.valueOf(arrstring[3].split(" / ")[0])) / (float)Integer.valueOf(arrstring[3].split(" / ")[1]).intValue() * 100.0f) + " % )");
            } else {
                GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( 0 % )");
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean l() {
        try {
            bi.P("stop");
            GUI.o(aM.G("dlg_man_search_pause"));
            GUI.a("_recherche").setIcon(new ImageIcon(String.valueOf(H) + "stop.PNG"));
            ImageIcon imageIcon = new ImageIcon(String.valueOf(H) + "startbutton.png");
            GUI.a("_capture").setIcon(imageIcon);
            GUI.a("_capture").setText(aM.G("menu_start"));
            GUI.a();
            GUI.h("id");
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean m() {
        try {
            bi.P("stop");
            GUI.o(aM.G("dlg_man_search_end"));
            ImageIcon imageIcon = new ImageIcon(String.valueOf(H) + "startbutton.png");
            GUI.a("_capture").setIcon(imageIcon);
            GUI.a("_capture").setText(aM.G("menu_start"));
            GUI.a("_recherche").setIcon(new ImageIcon(String.valueOf(H) + "finish.png"));
            GUI.a();
            GUI.h("id");
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean n() {
        try {
            GUI.o(a.n(aM.G("dlg_man_search_continue1").trim()));
            if (bn.Q("detailcapture").contentEquals("1")) {
                GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + aM.G("dlg_man_search_continue3").toLowerCase() + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : <br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : <br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : ");
            } else {
                GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + aM.G("dlg_man_search_continue3").toLowerCase() + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : <br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : ");
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean b(String[] arrstring) {
        try {
            if (bn.Q("detailcapture").contentEquals("1") || (t.contentEquals("IQUALIF France White") || t.contentEquals("IQUALIF France Yellow")) && Integer.valueOf(arrstring[4].split(" / ")[0]) > 0) {
                if (!arrstring[3].split(" / ")[1].contentEquals("0")) {
                    if (arrstring[4].split(" / ")[1].contentEquals("0")) {
                        GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( " + a.format((float)(Integer.valueOf(arrstring[3].split(" / ")[1]) - Integer.valueOf(arrstring[3].split(" / ")[0])) / (float)Integer.valueOf(arrstring[3].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( 100 % )");
                    } else {
                        GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( " + a.format((float)(Integer.valueOf(arrstring[3].split(" / ")[1]) - Integer.valueOf(arrstring[3].split(" / ")[0])) / (float)Integer.valueOf(arrstring[3].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( " + a.format((double)(10000 / (100 + Integer.valueOf(arrstring[4].split(" / ")[1])))) + " % )");
                    }
                } else if (arrstring[4].split(" / ")[1].contentEquals("0")) {
                    GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( 100 % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( 100 % )");
                } else {
                    GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( 100 % )<br />" + a.n(aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim()) + " : " + arrstring[4] + " ( " + a.format((double)(10000 / (100 + Integer.valueOf(arrstring[4].split(" / ")[1])))) + " % )");
                }
            } else if (!arrstring[3].split(" / ")[1].contentEquals("0")) {
                GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( " + a.format((float)(Integer.valueOf(arrstring[3].split(" / ")[1]) - Integer.valueOf(arrstring[3].split(" / ")[0])) / (float)Integer.valueOf(arrstring[3].split(" / ")[1]).intValue() * 100.0f) + " % )");
            } else {
                GUI.n("<b>" + a.n(aM.G("dlg_man_search_continue2").toLowerCase().replace(":", "").trim()) + " : " + arrstring[1] + "</b><br />" + a.n(aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim()) + " : " + arrstring[2] + " ( " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " % )<br />" + a.n(aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim()) + " : " + arrstring[3] + " ( 0 % )");
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean a(String[] arrstring, String string) {
        try {
            if (a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f).contentEquals("100")) {
                GUI.o(String.valueOf(a.n(aM.G("dlg_man_search_continue1").trim())) + " 99 %");
            } else {
                String string2 = "";
                if (string.contentEquals("internetproblem")) {
                    string2 = ". V\u00e9rifier la connexion Internet";
                } else if (string.contains("Lecture ")) {
                    string2 = ". " + string;
                } else if (string.contentEquals("ipblacklist")) {
                    string2 = ". " + aM.G("dlg_man_search_continue_error");
                }
                GUI.o(String.valueOf(a.n(aM.G("dlg_man_search_continue1").trim())) + " " + a.format((float)(Integer.valueOf(arrstring[2].split(" / ")[1]) - Integer.valueOf(arrstring[2].split(" / ")[0])) / (float)Integer.valueOf(arrstring[2].split(" / ")[1]).intValue() * 100.0f) + " %" + string2);
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean h(String string) {
        try {
            c.setText(bi.L(string));
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static void n(String string) {
        try {
            GUI.a("_compteur").setText("<html>" + string + "</html>");
            GUI.a("_compteur").getParent().getParent().getParent().repaint();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void o(String string) {
        try {
            GUI.a("_recherche").setText("<html>" + string + "</html>");
            GUI.a("_recherche").getParent().getParent().getParent().repaint();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void p(String var0) {
        try {
            block109 : {
                block102 : {
                    block108 : {
                        block104 : {
                            block107 : {
                                block106 : {
                                    block105 : {
                                        block103 : {
                                            block101 : {
                                                var1_1 = (String[])GUI.o.get(var0);
                                                var2_2 = (DefaultTableModel)var1_1.getModel();
                                                var2_2.setColumnCount(0);
                                                if (!var0.contentEquals("department")) break block101;
                                                var2_2.addColumn("Index1");
                                                var2_2.addColumn(aM.G("dlg_list_department"));
                                                var2_2.addColumn(aM.G("dlg_list_name"));
                                                var2_2.addColumn("");
                                                var2_2.addColumn("");
                                                var1_1.getColumnModel().getColumn(0).setMinWidth(1);
                                                var1_1.getColumnModel().getColumn(0).setMaxWidth(1);
                                                var1_1.getColumnModel().getColumn(3).setMinWidth(1);
                                                var1_1.getColumnModel().getColumn(3).setMaxWidth(1);
                                                var1_1.getColumnModel().getColumn(4).setMinWidth(1);
                                                var1_1.getColumnModel().getColumn(4).setMaxWidth(1);
                                                if (GUI.t.contentEquals("IQUALIF France Yellow")) {
                                                    if (bn.Q("custom_list_use").contentEquals("2")) {
                                                        var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("dlg_list_code"));
                                                    }
                                                } else if (GUI.t.contentEquals("IQUALIF Canada 41 White")) {
                                                    var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("dlg_list_code"));
                                                    var1_1.getColumnModel().getColumn(2).setHeaderValue(aM.G("word_province"));
                                                } else if (GUI.t.contentEquals("IQUALIF Canada White")) {
                                                    var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("dlg_list_code"));
                                                    var1_1.getColumnModel().getColumn(2).setHeaderValue(aM.G("word_province"));
                                                } else if (GUI.t.contentEquals("IQUALIF Canada Yellow")) {
                                                    var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("dlg_list_code"));
                                                    var1_1.getColumnModel().getColumn(2).setHeaderValue(aM.G("word_province"));
                                                } else if (GUI.t.contentEquals("IQUALIF Germany White") || GUI.t.contentEquals("IQUALIF Germany Yellow") || GUI.t.contentEquals("IQUALIF Germany GS Yellow")) {
                                                    var1_1.getColumnModel().getColumn(1).setMinWidth(1);
                                                    var1_1.getColumnModel().getColumn(1).setMaxWidth(1);
                                                }
                                                break block102;
                                            }
                                            if (!var0.contentEquals("zipcity")) break block103;
                                            var2_2.addColumn("Index1");
                                            var2_2.addColumn(aM.G("dlg_list_zip"));
                                            var2_2.addColumn(aM.G("dlg_list_city"));
                                            var2_2.addColumn(aM.G("dlg_list_population"));
                                            var2_2.addColumn("");
                                            var1_1.getColumnModel().getColumn(0).setMinWidth(1);
                                            var1_1.getColumnModel().getColumn(0).setMaxWidth(1);
                                            var1_1.getColumnModel().getColumn(4).setMinWidth(1);
                                            var1_1.getColumnModel().getColumn(4).setMaxWidth(1);
                                            if (GUI.t.contentEquals("IQUALIF Africa Yellow")) {
                                                var1_1.getColumnModel().getColumn(3).setMinWidth(1);
                                                var1_1.getColumnModel().getColumn(3).setMaxWidth(1);
                                            } else if (GUI.t.contentEquals("IQUALIF Canada 41 White")) {
                                                var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("word_province"));
                                            } else if (GUI.t.contentEquals("IQUALIF Canada White")) {
                                                var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("word_province"));
                                            } else if (GUI.t.contentEquals("IQUALIF Canada Yellow")) {
                                                var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("word_province"));
                                            } else if (GUI.t.contentEquals("IQUALIF France Yellow")) {
                                                if (bn.Q("custom_list_use").contentEquals("1")) {
                                                    var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("dlg_list_code"));
                                                    var1_1.getColumnModel().getColumn(2).setHeaderValue(aM.G("dlg_list_department"));
                                                }
                                                if (bn.Q("custom_list_use").contentEquals("2")) {
                                                    var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("dlg_list_code"));
                                                    var1_1.getColumnModel().getColumn(2).setHeaderValue(aM.G("dlg_list_region"));
                                                }
                                            } else if (GUI.t.contentEquals("IQUALIF Germany Yellow") || GUI.t.contentEquals("IQUALIF Germany GS Yellow")) {
                                                if (bn.Q("custom_list_use").contentEquals("1")) {
                                                    var1_1.getColumnModel().getColumn(1).setMinWidth(1);
                                                    var1_1.getColumnModel().getColumn(1).setMaxWidth(1);
                                                }
                                            } else if (GUI.t.contains("IQUALIF Kapa ") || GUI.t.contains("IQUALIF Viva ") || GUI.t.contains("IQUALIF BCoin ")) {
                                                var1_1.getColumnModel().getColumn(1).setMinWidth(1);
                                                var1_1.getColumnModel().getColumn(1).setMaxWidth(1);
                                            }
                                            break block102;
                                        }
                                        if (!var0.contentEquals("street")) break block104;
                                        var2_2.addColumn("Index1");
                                        var2_2.addColumn(aM.G("dlg_list_zip"));
                                        var2_2.addColumn(aM.G("dlg_list_city"));
                                        var2_2.addColumn(aM.G("dlg_list_category"));
                                        var2_2.addColumn(aM.G("dlg_list_street"));
                                        if (!GUI.t.contentEquals("IQUALIF Italy White")) break block105;
                                        var1_1.getColumnModel().getColumn(1).setMinWidth(1);
                                        var1_1.getColumnModel().getColumn(1).setMaxWidth(1);
                                        var1_1.getColumnModel().getColumn(2).setMinWidth(1);
                                        var1_1.getColumnModel().getColumn(2).setMaxWidth(1);
                                        ** GOTO lbl-1000
                                    }
                                    if (!GUI.t.contentEquals("IQUALIF United Kingdom White")) break block106;
                                    var1_1.getColumnModel().getColumn(1).setMinWidth(1);
                                    var1_1.getColumnModel().getColumn(1).setMaxWidth(1);
                                    var1_1.getColumnModel().getColumn(2).setMinWidth(1);
                                    var1_1.getColumnModel().getColumn(2).setMaxWidth(1);
                                    ** GOTO lbl-1000
                                }
                                if (!GUI.t.contentEquals("IQUALIF United States White") && !GUI.t.contentEquals("IQUALIF United States WP White")) break block107;
                                var1_1.getColumnModel().getColumn(1).setMinWidth(1);
                                var1_1.getColumnModel().getColumn(1).setMaxWidth(1);
                                var1_1.getColumnModel().getColumn(2).setMinWidth(1);
                                var1_1.getColumnModel().getColumn(2).setMaxWidth(1);
                                ** GOTO lbl-1000
                            }
                            if (GUI.t.contains(" Yellow")) {
                                var1_1.getColumnModel().getColumn(1).setMinWidth(1);
                                var1_1.getColumnModel().getColumn(1).setMaxWidth(1);
                                var1_1.getColumnModel().getColumn(2).setMinWidth(1);
                                var1_1.getColumnModel().getColumn(2).setMaxWidth(1);
                            } else lbl-1000: // 4 sources:
                            {
                                var1_1.getColumnModel().getColumn(3).setMinWidth(1);
                                var1_1.getColumnModel().getColumn(3).setMaxWidth(1);
                            }
                            var1_1.getColumnModel().getColumn(0).setMinWidth(1);
                            var1_1.getColumnModel().getColumn(0).setMaxWidth(1);
                            if (GUI.t.contentEquals("IQUALIF Canada 41 White")) {
                                var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("word_province"));
                            } else if (GUI.t.contentEquals("IQUALIF Canada White")) {
                                var1_1.getColumnModel().getColumn(1).setHeaderValue(aM.G("word_province"));
                            }
                            break block102;
                        }
                        if (!var0.contentEquals("contact")) break block108;
                        if (GUI.h()) break block109;
                        if (GUI.t.contentEquals("IQUALIF 712 White and Yellow")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Africa Yellow")) {
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Australia Yellow")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                            var2_2.addColumn(aM.G("word_forename"));
                        } else if (GUI.t.contentEquals("IQUALIF Auto24 White and Yellow") || GUI.t.contentEquals("IQUALIF Immo24 White and Yellow")) {
                            var2_2.addColumn(aM.G("word_url"));
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_ad"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_price"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_description"));
                            var2_2.addColumn(aM.G("word_comment"));
                        } else if (GUI.t.contentEquals("IQUALIF Bangladesh Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_address"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                        } else if (GUI.t.contentEquals("IQUALIF Belgium White")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_phone1"));
                        } else if (GUI.t.contentEquals("IQUALIF BCoin White and Yellow")) {
                            var2_2.addColumn(aM.G("word_url"));
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_region"));
                            var2_2.addColumn(aM.G("word_department"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_ad"));
                            var2_2.addColumn(aM.G("word_description"));
                            var2_2.addColumn(aM.G("word_price"));
                        } else if (GUI.t.contentEquals("IQUALIF Canada 41 White")) {
                            var2_2.addColumn(aM.G("word_province"));
                            var2_2.addColumn(aM.G("word_postalcode"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_lastname"));
                            var2_2.addColumn(aM.G("word_firstname"));
                            var2_2.addColumn(aM.G("word_phone1"));
                        } else if (GUI.t.contentEquals("IQUALIF Canada White")) {
                            var2_2.addColumn(aM.G("word_postalcode"));
                            var2_2.addColumn(aM.G("word_province"));
                            var2_2.addColumn(aM.G("word_address"));
                            var2_2.addColumn(aM.G("word_lastname"));
                            var2_2.addColumn(aM.G("word_firstname"));
                            var2_2.addColumn(aM.G("word_phone1"));
                        } else if (GUI.t.contentEquals("IQUALIF Canada Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_postalcode"));
                            var2_2.addColumn(aM.G("word_province"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_address"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Dominica White") || GUI.t.contentEquals("IQUALIF Lucia White")) {
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Germany Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Germany GS Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Italy Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_region"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Morocco White")) {
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_address"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_phone1"));
                        } else if (GUI.t.contentEquals("IQUALIF Netherlands Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Oedkniss White and Yellow")) {
                            var2_2.addColumn(aM.G("word_url"));
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_ad"));
                            var2_2.addColumn(aM.G("word_address"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mail"));
                            var2_2.addColumn(aM.G("word_description"));
                        } else if (GUI.t.contentEquals("IQUALIF PAnnonces White and Yellow")) {
                            var2_2.addColumn(aM.G("word_url"));
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_ad"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_price"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_reference"));
                            var2_2.addColumn(aM.G("word_comment"));
                        } else if (GUI.t.contentEquals("IQUALIF Peru Yellow")) {
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Philippines Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_region"));
                            var2_2.addColumn(aM.G("word_address"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Poland Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Sbito White and Yellow")) {
                            var2_2.addColumn(aM.G("word_url"));
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_price"));
                            var2_2.addColumn(aM.G("word_ad"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_description"));
                            var2_2.addColumn(aM.G("word_comment"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF Singapore Yellow")) {
                            var2_2.addColumn(aM.G("word_category"));
                            var2_2.addColumn(aM.G("word_address"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contains("IQUALIF Spain Yellow")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_province"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF TAdvisor Yellow")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mail"));
                            var2_2.addColumn(aM.G("word_forename"));
                        } else if (GUI.t.contentEquals("IQUALIF Tuti White and Yellow")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contentEquals("IQUALIF United States White")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_phone1"));
                        } else if (GUI.t.contains("White and Yellow")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else if (GUI.t.contains("White")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                        } else if (GUI.t.contains("Yellow")) {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        } else {
                            var2_2.addColumn(aM.G("word_zip"));
                            var2_2.addColumn(aM.G("word_city"));
                            var2_2.addColumn(aM.G("word_street"));
                            var2_2.addColumn(aM.G("word_name"));
                            var2_2.addColumn(aM.G("word_forename"));
                            var2_2.addColumn(aM.G("word_phone1"));
                            var2_2.addColumn(aM.G("word_mobile"));
                            var2_2.addColumn(aM.G("word_fax"));
                            var2_2.addColumn(aM.G("word_site"));
                            var2_2.addColumn(aM.G("word_mail"));
                        }
                        break block102;
                    }
                    var2_2.addColumn("Index1");
                    var2_2.addColumn("Column1");
                    var2_2.addColumn("Column2");
                    var2_2.addColumn("Column3");
                    var2_2.addColumn("Column4");
                }
lbl437: // 2 sources:
                do {
                    try {
                        var1_1 = (JTable)GUI.o.get(var0);
                        if (var0.contentEquals("contact") != false) return;
                        if (GUI.t.contains(" Kapa ") || GUI.t.contains(" Viva ") || GUI.t.contains("BCoin ")) {
                            if (var0.contentEquals("zipcity")) {
                                var1_1.getRowSorter().toggleSortOrder(2);
                                return;
                            }
                            if (var0.contentEquals("street")) {
                                var1_1.getRowSorter().toggleSortOrder(4);
                                return;
                            }
                            var1_1.getRowSorter().toggleSortOrder(1);
                            return;
                        }
                        if (GUI.t.contains("Yellow") && var0.contentEquals("street")) {
                            var1_1.getRowSorter().toggleSortOrder(4);
                            return;
                        }
                        var1_1.getRowSorter().toggleSortOrder(1);
                        return;
                    }
                    catch (Throwable v0) {}
                    return;
                    break;
                } while (true);
            }
            var1_1 = aM.c();
            var3_3 = GSetting.b();
            var4_4 = var3_3.iterator();
            ** GOTO lbl468
        }
        catch (Throwable v1) {}
        return;
lbl-1000: // 1 sources:
        {
            var3_3 = (String)var4_4.next();
            var5_5 = bn.Q(String.valueOf(var3_3) + "Column");
            if ((var3_3 = GUI.a(var5_5, (String)var3_3)).intValue() <= 0 || var1_1[aM.a(var5_5)].contains("_marketing_accept") || var1_1[aM.a(var5_5)].contains("coldcalling") || var1_1[aM.a(var5_5)].contains("gender") || var1_1[aM.a(var5_5)].contains("average_age") || var1_1[aM.a(var5_5)].contains("ethnic_group") || var1_1[aM.a(var5_5)].contains("housing")) continue;
            var2_2.addColumn(aM.G("word_" + (String)var1_1[aM.a(var5_5)]));
lbl468: // 3 sources:
            ** while (var4_4.hasNext())
        }
lbl469: // 1 sources:
        ** while (true)
    }

    private static String q() {
        String string;
        string = "";
        try {
            Object object = a.a(new File(String.valueOf(G) + "k"));
            object = a.a((List)object);
            string = object == null ? "new" : (object.contentEquals("") ? "new" : (object.contentEquals("TRIAL") ? "activatedTRIAL" : (object.length() == 29 ? "activatedLicense" : "invalid")));
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static JPanel a(String string) {
        return (JPanel)k.get(string);
    }

    private JFrame a(String string) {
        return (JFrame)this.m.get(string);
    }

    private void setFrame(String string) {
        try {
            if (this.m.get(string) == null) {
                JFrame jFrame = new JFrame();
                this.m.put(string, jFrame);
                return;
            }
            this.m.remove(string);
            JFrame jFrame = new JFrame();
            this.m.put(string, jFrame);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static JPanel a(String string, String object, Dimension dimension) {
        try {
            if (k.get(string) == null) {
                object = new aK(new ImageIcon((String)object).getImage(), dimension);
                k.put(string, object);
            } else {
                k.remove(string);
                object = new aK(new ImageIcon((String)object).getImage(), dimension);
                k.put(string, object);
            }
        }
        catch (Throwable throwable) {}
        return (JPanel)k.get(string);
    }

    private JScrollPane b(String string) {
        return (JScrollPane)this.n.get(string);
    }

    private void a(String string, JComponent jComponent) {
        try {
            if (this.n.get(string) == null) {
                jComponent = new JScrollPane(jComponent);
                this.n.put(string, jComponent);
                return;
            }
            this.n.remove(string);
            jComponent = new JScrollPane(jComponent);
            this.n.put(string, jComponent);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static JCheckBox a(String string) {
        return (JCheckBox)f.get(string);
    }

    public static void a(String string, String[] object, int n2, int n3, int n4) {
        try {
            if (g.get(string) == null) {
                object = new JComboBox<String>((E[])object);
                object.setPreferredSize(new Dimension(n2, 25));
                object.setSelectedIndex(n4);
                object.setActionCommand(string);
                object.addActionListener(GUI.a());
                g.put(string, object);
                return;
            }
            g.remove(string);
            object = new JComboBox<String>((E[])object);
            object.setPreferredSize(new Dimension(n2, 25));
            object.setSelectedIndex(n4);
            object.setActionCommand(string);
            object.addActionListener(GUI.a());
            g.put(string, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void q(String string) {
        try {
            f.remove(string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void b(String string, String[] object, int n2, int n3, int n4) {
        try {
            if (g.get(string) == null) {
                object = new JComboBox<String>((E[])object);
                object.setPreferredSize(new Dimension(n2, 25));
                object.setSelectedIndex(n4);
                object.setActionCommand(string);
                object.addActionListener(GUI.a());
                g.put(string, object);
                return;
            }
            g.remove(string);
            object = new JComboBox<String>((E[])object);
            object.setPreferredSize(new Dimension(n2, 25));
            object.setSelectedIndex(n4);
            object.setActionCommand(string);
            object.addActionListener(GUI.a());
            g.put(string, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static JComboBox a(String string) {
        return (JComboBox)g.get(string);
    }

    public static void b(String string, String object, String string2) {
        try {
            if (f.get(string) == null) {
                object = new JCheckBox((String)object);
                if (string2 == null || string2.contentEquals("0")) {
                    object.setSelected(false);
                } else if (string2.contentEquals("1")) {
                    object.setSelected(true);
                }
                object.setActionCommand(string);
                object.addActionListener(GUI.a());
                f.put(string, object);
                return;
            }
            f.remove(string);
            object = new JCheckBox((String)object);
            if (string2.contentEquals("0")) {
                object.setSelected(false);
            } else if (string2.contentEquals("1")) {
                object.setSelected(true);
            }
            object.setActionCommand(string);
            object.addActionListener(GUI.a());
            f.put(string, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static JDialog a(String string) {
        return (JDialog)j.get(string);
    }

    private static void r(String string) {
        try {
            if (k.get(string) == null) {
                JPanel jPanel = new JPanel();
                k.put(string, jPanel);
                return;
            }
            k.remove(string);
            JPanel jPanel = new JPanel();
            k.put(string, jPanel);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static JLabel a(String string) {
        return (JLabel)e.get(string);
    }

    public static void e(String string, String object) {
        try {
            if (e.get(string) == null) {
                object = new JLabel((String)object);
                e.put(string, object);
                return;
            }
            e.remove(string);
            object = new JLabel((String)object);
            e.put(string, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void s(String string) {
        try {
            e.remove(string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final int a() {
        return this.f;
    }

    private void B() {
        try {
            GUI.a("_settingtool_container_3_2a").removeAll();
            if (bn.Q("show_tBList").contentEquals("1")) {
                GUI.a("_searchbuttonlist", aM.G("dlg_man_list"), String.valueOf(H) + "searchbutton1.png", 120, 22);
                GUI.a("_searchbuttonlist").addMouseListener(GUI.a());
                GUI.a("_searchbuttonlist").setOpaque(false);
                GUI.a("_searchbuttonlist").setFocusPainted(false);
                GUI.a("_searchbuttonlist").setBorderPainted(false);
                GUI.a("_searchbuttonlist").setContentAreaFilled(false);
                GUI.a("_searchbuttonlist").setHorizontalAlignment(2);
                GUI.a("_searchbuttonlist").setVerticalTextPosition(0);
                GUI.a("_searchbuttonlist").setHorizontalTextPosition(4);
                GUI.a("_settingtool_container_3_2a").add(GUI.a("_searchbuttonlist"));
            } else if (GUI.a("_searchbuttonlist") != null) {
                GUI.a("_settingtool_container_3_2a").remove(GUI.a("_searchbuttonlist"));
            }
            if (bn.Q("show_tBSemiAuto").contentEquals("1")) {
                GUI.a("_searchbuttonsemiauto", aM.G("dlg_man_semiauto"), String.valueOf(H) + "searchbutton2.png", 120, 22);
                GUI.a("_searchbuttonsemiauto").addMouseListener(GUI.a());
                GUI.a("_searchbuttonsemiauto").setOpaque(false);
                GUI.a("_searchbuttonsemiauto").setFocusPainted(false);
                GUI.a("_searchbuttonsemiauto").setBorderPainted(false);
                GUI.a("_searchbuttonsemiauto").setContentAreaFilled(false);
                GUI.a("_searchbuttonsemiauto").setHorizontalAlignment(2);
                GUI.a("_searchbuttonsemiauto").setVerticalTextPosition(0);
                GUI.a("_searchbuttonsemiauto").setHorizontalTextPosition(4);
                GUI.a("_settingtool_container_3_2a").add(GUI.a("_searchbuttonsemiauto"));
            } else if (GUI.a("_searchbuttonsemiauto") != null) {
                GUI.a("_settingtool_container_3_2a").remove(GUI.a("_searchbuttonsemiauto"));
            }
            if (bn.Q("show_tBManual").contentEquals("1")) {
                GUI.a("_searchbuttonmanual", aM.G("dlg_man_manual"), String.valueOf(H) + "searchbutton3.png", 120, 22);
                GUI.a("_searchbuttonmanual").addMouseListener(GUI.a());
                GUI.a("_searchbuttonmanual").setOpaque(false);
                GUI.a("_searchbuttonmanual").setFocusPainted(false);
                GUI.a("_searchbuttonmanual").setBorderPainted(false);
                GUI.a("_searchbuttonmanual").setContentAreaFilled(false);
                GUI.a("_searchbuttonmanual").setHorizontalAlignment(2);
                GUI.a("_searchbuttonmanual").setVerticalTextPosition(0);
                GUI.a("_searchbuttonmanual").setHorizontalTextPosition(4);
                GUI.a("_settingtool_container_3_2a").add(GUI.a("_searchbuttonmanual"));
            } else if (GUI.a("_searchbuttonmanual") != null) {
                GUI.a("_settingtool_container_3_2a").remove(GUI.a("_searchbuttonmanual"));
            }
            if (bn.Q("show_tBBrowser").contentEquals("1")) {
                if (d == 1 || d == 2) {
                    GUI.a("_searchbuttonbrowser", aM.G("dlg_man_browser"), String.valueOf(H) + "searchbutton4.png", 120, 22);
                    GUI.a("_searchbuttonbrowser").addMouseListener(GUI.a());
                    GUI.a("_searchbuttonbrowser").setOpaque(false);
                    GUI.a("_searchbuttonbrowser").setFocusPainted(false);
                    GUI.a("_searchbuttonbrowser").setBorderPainted(false);
                    GUI.a("_searchbuttonbrowser").setContentAreaFilled(false);
                    GUI.a("_searchbuttonbrowser").setHorizontalAlignment(2);
                    GUI.a("_searchbuttonbrowser").setVerticalTextPosition(0);
                    GUI.a("_searchbuttonbrowser").setHorizontalTextPosition(4);
                    GUI.a("_settingtool_container_3_2a").add(GUI.a("_searchbuttonbrowser"));
                }
            } else if (GUI.a("_searchbuttonbrowser") != null) {
                GUI.a("_settingtool_container_3_2a").remove(GUI.a("_searchbuttonbrowser"));
            }
            GUI.a("_settingtool_container_3_2a").repaint();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private JToolBar a() {
        try {
            JToolBar jToolBar = new JToolBar();
            jToolBar.setFloatable(false);
            GUI.r("_settingtool");
            GUI.r("_settingtool_container_3");
            GUI.r("_settingtool_container_3_1aa");
            GUI.r("_settingtool_container_3_1a");
            GUI.r("_settingtool_container_3_1b");
            GUI.r("_settingtool_container_3_2aa");
            GUI.r("_settingtool_container_3_2a");
            GUI.r("_settingtool_container_3_2b");
            GUI.a("_settingtool").setLayout(new FlowLayout(2, 0, 0));
            GUI.a("_settingtool_container_3").setLayout(new FlowLayout(2, 0, 0));
            GUI.a("_settingtool_container_3_1aa").setLayout(new FlowLayout(0, 0, 0));
            GUI.a("_settingtool_container_3_1a").setLayout(new FlowLayout(0, 0, 0));
            GUI.a("_settingtool_container_3_1b").setLayout(new FlowLayout(2, 0, 0));
            GUI.a("_settingtool_container_3_2a").setLayout(new GridLayout(0, 2));
            GUI.a("_settingtool_container_3_2a").setLayout(new GridLayout(4, 0));
            GUI.a("_settingtool_container_3_2b").setLayout(new GridLayout(0, 2));
            GUI.a("_capture", aM.G("menu_start"), String.valueOf(H) + "startbutton.png", 130, 80);
            GUI.a("_file", aM.G("menu_import"), String.valueOf(H) + "importbutton.png", 130, 80);
            GUI.a("_export", aM.G("menu_export"), String.valueOf(H) + "savebutton.png", 130, 80);
            this.B();
            GUI.a("_buy", aM.G("menu_buy"), String.valueOf(H) + "buybutton.png", 130, 80);
            GUI.a("_error", aM.G("menu_help"), String.valueOf(H) + "errorbutton.png", 130, 80);
            GUI.a("_capture").addMouseListener(GUI.a());
            GUI.a("_file").addMouseListener(GUI.a());
            GUI.a("_export").addMouseListener(GUI.a());
            GUI.a("_buy").addMouseListener(GUI.a());
            GUI.a("_error").addMouseListener(GUI.a());
            GUI.a("_capture").setOpaque(false);
            GUI.a("_capture").setFocusPainted(false);
            GUI.a("_capture").setBorderPainted(false);
            GUI.a("_capture").setContentAreaFilled(false);
            GUI.a("_file").setOpaque(false);
            GUI.a("_file").setFocusPainted(false);
            GUI.a("_file").setBorderPainted(false);
            GUI.a("_file").setContentAreaFilled(false);
            GUI.a("_export").setOpaque(false);
            GUI.a("_export").setFocusPainted(false);
            GUI.a("_export").setBorderPainted(false);
            GUI.a("_export").setContentAreaFilled(false);
            GUI.a("_buy").setOpaque(false);
            GUI.a("_buy").setFocusPainted(false);
            GUI.a("_buy").setBorderPainted(false);
            GUI.a("_buy").setContentAreaFilled(false);
            GUI.a("_error").setOpaque(false);
            GUI.a("_error").setFocusPainted(false);
            GUI.a("_error").setBorderPainted(false);
            GUI.a("_error").setContentAreaFilled(false);
            String[] arrstring = aH.D("softwareExport");
            if (GUI.a().length <= Integer.valueOf((String)arrstring)) {
                arrstring = GUI.B(t);
            }
            GUI.e("_settingtool_software", aM.G("dlg_stg_software"));
            GUI.b("_setting_softwareExport", GUI.a(), 200, 25, Integer.valueOf((String)arrstring));
            if (a.equals(Level.FINEST) || t.contentEquals("IQUALIF Multi White and Yellow") || t.contentEquals("IQUALIF Canada 41 White") || t.contentEquals("IQUALIF Canada White") || t.contentEquals("IQUALIF Italy PG Yellow") || t.contentEquals("IQUALIF Italy Yellow") || t.contentEquals("IQUALIF Germany GS Yellow") || t.contentEquals("IQUALIF Germany Yellow") || t.contentEquals("IQUALIF Switzerland CH White") || t.contentEquals("IQUALIF Switzerland White") || t.contentEquals("IQUALIF Switzerland CH Yellow") || t.contentEquals("IQUALIF Switzerland Yellow") || t.contentEquals("IQUALIF Switzerland ZP Yellow") || t.contentEquals("IQUALIF United Kingdom YL Yellow") || t.contentEquals("IQUALIF United Kingdom Yellow")) {
                GUI.a("_settingtool_container_3_2aa").add(GUI.a("_settingtool_software"));
                GUI.a("_settingtool_container_3_2aa").add(GUI.a("_setting_softwareExport"));
                GUI.a("_settingtool_container_3_1aa").add(GUI.a("_settingtool_container_3_2aa"));
                this.a(Integer.valueOf((String)arrstring));
            }
            arrstring = aM.G("dlg_man_searchmode").split(";", -1);
            GUI.b("_settingtool_searchmode", arrstring, 120, 25, 0);
            GUI.e("_settingtool_searchmode", aM.G("dlg_stg_searchmode"));
            GUI.a("_settingtool_container_3_1a").add(GUI.a("_settingtool_searchmode"));
            GUI.a("_settingtool_container_3_1a").add(GUI.a("_settingtool_container_3_2a"));
            arrstring = aM.G("dlg_man_housing").split(";", -1);
            GUI.e("_settingtool_housing", aM.G("dlg_stg_housing"));
            GUI.b("_setting_housingExport", arrstring, 120, 25, Integer.valueOf(bn.Q("housingExport")));
            if (a.equals(Level.FINEST)) {
                GUI.a("_settingtool_container_3_2b").add(GUI.a("_settingtool_housing"));
                GUI.a("_settingtool_container_3_2b").add(GUI.a("_setting_housingExport"));
                GUI.a("_settingtool_container_3_1b").add(GUI.a("_settingtool_container_3_2b"));
            }
            arrstring = aM.G("dlg_man_growing").split(";", -1);
            GUI.e("_settingtool_growing", aM.G("dlg_stg_growing"));
            GUI.b("_setting_ageExport", arrstring, 120, 25, Integer.valueOf(bn.Q("ageExport")));
            if (a.equals(Level.FINEST)) {
                GUI.a("_settingtool_container_3_2b").add(GUI.a("_settingtool_growing"));
                GUI.a("_settingtool_container_3_2b").add(GUI.a("_setting_ageExport"));
                GUI.a("_settingtool_container_3_1b").add(GUI.a("_settingtool_container_3_2b"));
            }
            GUI.a("_settingtool_container_3").add(GUI.a("_settingtool_container_3_1aa"));
            GUI.a("_settingtool_container_3").add(GUI.a("_settingtool_container_3_1a"));
            if (t.contains(" White") && !t.contains(" Kapa ") && !t.contains(" BCoin") && !t.contains(" Viva ")) {
                GUI.a("_settingtool_container_3").add(GUI.a("_settingtool_container_3_1b"));
            }
            GUI.a("_settingtool").add(GUI.a("_settingtool_container_3"));
            jToolBar.add(GUI.a("_capture"));
            jToolBar.add(GUI.a("_export"));
            jToolBar.add(Box.createHorizontalGlue());
            jToolBar.add(GUI.a("_settingtool"));
            if (a.equals(Level.FINEST) || !((String)q.get("setting")).contentEquals("validLicence")) {
                jToolBar.add(GUI.a("_buy"));
            }
            jToolBar.add(GUI.a("_error"));
            return jToolBar;
        }
        catch (Throwable throwable) {
            return new JToolBar();
        }
    }

    public static JTextField a(String string) {
        return (JTextField)i.get(string.toLowerCase());
    }

    private JTextArea a(String string) {
        return (JTextArea)this.l.get(string);
    }

    public static void a(String string, String string2, Integer serializable) {
        try {
            string = string.toLowerCase();
            if (i.get(string) == null) {
                serializable = new JTextField(serializable.intValue());
                serializable.setText(string2);
                serializable.setName(string);
                serializable.addMouseListener(GUI.a());
                i.put(string, serializable);
                return;
            }
            i.remove(string);
            if (i.get(string) == null) {
                serializable = new JTextField(serializable.intValue());
                serializable.setText(string2);
                serializable.setName(string);
                serializable.addMouseListener(GUI.a());
                i.put(string, serializable);
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public static boolean o() {
        boolean bl2 = false;
        try {
            Object object = "";
            Object object2 = "s_w_4.4.jar";
            Object object3 = "s_w_64_4.4.jar";
            String string = "s_m_4.4.jar";
            string = "s_m_64_4.4.jar";
            string = "s_l_4.4.jar";
            string = "s_l_64_4.4.jar";
            string = System.getProperty("sun.arch.data.model");
            if (B.contentEquals("mac")) {
                d = 0;
            } else if (B.contentEquals("linux")) {
                d = C.contains("1.6") ? 0 : 2;
            } else if (C.contains("1.6")) {
                if (string.contains("32")) {
                    object = String.valueOf(I) + (String)object2;
                } else if (string.contains("64")) {
                    object = String.valueOf(I) + (String)object3;
                }
                d = 1;
            } else {
                if (string.contains("32")) {
                    object = String.valueOf(I) + (String)object2;
                } else if (string.contains("64")) {
                    object = String.valueOf(I) + (String)object3;
                }
                d = 1;
            }
            try {
                object = new File((String)object);
                object = object.toURI().toURL();
                object2 = (URLClassLoader)ClassLoader.getSystemClassLoader();
                object3 = URLClassLoader.class;
                object3 = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
                object3.setAccessible(true);
                object3.invoke(object2, object);
            }
            catch (Throwable throwable) {}
            if (d != 0 && d != 1) {
                // empty if block
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return false;
    }

    private static aQ a() {
        try {
            if (a == null) {
                a = new aQ();
            }
            return a;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static aO a() {
        try {
            if (a == null) {
                a = new aO();
            }
            return a;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static aP a() {
        try {
            if (a == null) {
                a = new aP();
            }
            return a;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static int b() {
        int n2;
        n2 = 1;
        try {
            int n3 = Integer.valueOf(aH.D("multithread_number"));
            n2 = Integer.valueOf(a[n3]);
        }
        catch (Throwable throwable) {}
        return n2;
    }

    public static JButton a(String string) {
        JButton jButton;
        jButton = new JButton();
        try {
            jButton = (JButton)h.get(string);
        }
        catch (Throwable throwable) {}
        return jButton;
    }

    public static void a(String string, String object, int n2, int n3) {
        try {
            if (h.get(string) == null) {
                object = new JButton((String)object);
                object.setPreferredSize(new Dimension(n2, 25));
                object.addActionListener(GUI.a());
                object.setActionCommand(string);
                h.put(string, object);
                return;
            }
            h.remove(string);
            object = new JButton((String)object);
            object.setPreferredSize(new Dimension(n2, 25));
            object.addActionListener(GUI.a());
            object.setActionCommand(string);
            h.put(string, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static Level a() {
        return a;
    }

    public static String r() {
        return u;
    }

    public static String s() {
        return v;
    }

    public static String t() {
        return A;
    }

    public static String u() {
        return B;
    }

    public static void t(String string) {
        B = string;
    }

    public static void u(String string) {
        C = string;
    }

    public static String v() {
        return D;
    }

    public static String w() {
        return F;
    }

    public static String x() {
        return G;
    }

    public static String y() {
        return H;
    }

    public static String z() {
        return I;
    }

    public static String A() {
        return J;
    }

    public static int c() {
        return d;
    }

    public static int d() {
        return e;
    }

    public static HashMap b() {
        return c;
    }

    public static JOptionPane a() {
        return a;
    }

    public static String B() {
        return K;
    }

    public static String C() {
        return M;
    }

    public static String D() {
        return t;
    }

    public static Connection a() {
        return a;
    }

    public static void a(Connection connection) {
        a = connection;
    }

    public static Connection b() {
        return b;
    }

    public static void b(Connection connection) {
        b = connection;
    }

    public static Connection c() {
        return c;
    }

    public static void c(Connection connection) {
        c = connection;
    }

    public static Connection d() {
        return d;
    }

    public static void d(Connection connection) {
        d = connection;
    }

    public static Connection e() {
        return e;
    }

    public static void e(Connection connection) {
        e = connection;
    }

    public static Connection f() {
        return f;
    }

    public static void f(Connection connection) {
        f = connection;
    }

    public static Connection g() {
        return g;
    }

    public static void g(Connection connection) {
        g = connection;
    }

    public static Integer b() {
        return a;
    }

    public static HashMap c() {
        return o;
    }

    public static JLabel a() {
        return b;
    }

    public static GUI a() {
        try {
            return b;
        }
        catch (Throwable throwable) {
            return new GUI();
        }
    }

    public static String E() {
        return O;
    }

    public final Crawler a() {
        return this.a;
    }

    public static void v(String string) {
        Q = string;
    }

    public static String F() {
        return R;
    }

    public static HashMap d() {
        return s;
    }

    public static String[][] a() {
        return a;
    }

    public static List c() {
        return g;
    }

    public static void w(String string) {
        t = string;
    }

    static /* synthetic */ String a(GUI gUI, String string) {
        return gUI.A(string);
    }

    static /* synthetic */ JFrame a(GUI gUI, String string) {
        return gUI.a(string);
    }

    static /* synthetic */ HashMap a(GUI gUI) {
        return gUI.p;
    }

    static /* synthetic */ boolean a(GUI gUI) {
        return gUI.j();
    }

    static /* synthetic */ boolean b(GUI gUI) {
        return GUI.i();
    }

    static /* synthetic */ JScrollPane a(GUI gUI, String string) {
        return gUI.b(string);
    }

    static /* synthetic */ boolean c(GUI gUI) {
        return gUI.g();
    }

    static /* synthetic */ boolean i(String string) {
        return GUI.f(string);
    }

    static /* synthetic */ boolean a(GUI gUI, String[] arrstring, String[] arrstring2, String[] arrstring3) {
        return gUI.b(arrstring, arrstring2, arrstring3);
    }

    static /* synthetic */ void a(GUI object) {
        try {
            object = aH.D("adv_sql_host");
            Object object2 = aH.D("adv_sql_db");
            String string = aH.D("adv_sql_user");
            String string2 = aH.D("adv_sql_password");
            Connection connection = DriverManager.getConnection("jdbc:mysql://" + (String)object + ":3306/?user=" + string + "&password=" + string2);
            Statement statement = connection.createStatement();
            statement.execute("CREATE DATABASE IF NOT EXISTS " + (String)object2);
            statement.close();
            connection.close();
            object = SQL.a((String)object, (String)object2, string, string2);
            object2 = object.createStatement();
            if (t.contains(" White and Yellow")) {
                object2.execute("CREATE TABLE IF NOT EXISTS " + t.replace(" ", "_").toLowerCase() + " " + aM.G("dlg_stg_sql_create_table") + ";");
            } else if (t.contains(" Yellow")) {
                object2.execute("CREATE TABLE IF NOT EXISTS " + t.replace(" ", "_").toLowerCase() + " " + aM.G("dlg_stg_sql_create_table") + ";");
            } else if (t.contains(" White")) {
                try {
                    object2.execute("ALTER TABLE " + t.replace(" ", "_").toLowerCase() + " ADD COLUMN ethnie VARCHAR(255) null DEFAULT '' AFTER age_moyen;");
                }
                catch (Throwable throwable) {}
                try {
                    object2.execute("ALTER TABLE " + t.replace(" ", "_").toLowerCase() + " ADD COLUMN ethnic_group VARCHAR(255) null DEFAULT '' AFTER average_age;");
                }
                catch (Throwable throwable) {}
                string = "CREATE TABLE IF NOT EXISTS " + t.replace(" ", "_").toLowerCase() + " " + aM.G("dlg_stg_sql_create_table").replace("iqualif_test_white", t.replace(" ", "_").toLowerCase()) + ";";
                object2.execute(string);
                object2.close();
            }
            if (object == null) {
                GUI.d(aM.G("check_db_ko"), aM.G("dlg_start"));
            } else {
                GUI.d(aM.G("check_db_ok"), aM.G("dlg_start"));
            }
            object2.close();
            object.close();
            return;
        }
        catch (Throwable throwable) {
            String string = "";
            if (throwable.getCause() != null) {
                string = throwable.getCause().toString().replace("java.net.ConnectException:", "");
            }
            String string3 = throwable.getMessage();
            GUI.d("<html>" + aM.G("check_db_ko") + "<br /><br />Caused by : " + string + "<br />" + string3, aM.G("dlg_advanced"));
            return;
        }
    }

    static /* synthetic */ HashMap b(GUI gUI) {
        return gUI.n;
    }

    static /* synthetic */ String G() {
        return t;
    }

    static /* synthetic */ boolean b(GUI gUI, String[] arrstring, String[] arrstring2, String[] arrstring3) {
        return gUI.a(arrstring, arrstring2, arrstring3);
    }

    static /* synthetic */ void a(GUI gUI, ListSelectionEvent serializable, JTable arrn) {
        block17 : {
            try {
                String string;
                String string2;
                if (serializable.getValueIsAdjusting()) break block17;
                serializable = (DefaultListSelectionModel)serializable.getSource();
                string = arrn.getName();
                arrn = arrn.getSelectedRows();
                string2 = "";
                Integer n2 = arrn.length;
                String string3 = string;
                try {
                    if (string3.equals("department")) {
                        GUI.a("_container0_1a").setIcon(null);
                        GUI.a("_container0_1a").setText(String.valueOf(a.n(aM.G("dlg_man_list_selection").replace(":", "").toLowerCase().trim())) + " : " + n2 + " " + aM.G("dlg_man_list_element").toLowerCase());
                    } else if (string3.equals("zipcity")) {
                        GUI.a("_container0_2a").setIcon(null);
                        GUI.a("_container0_2a").setText(String.valueOf(a.n(aM.G("dlg_man_list_selection").replace(":", "").toLowerCase().trim())) + " : " + n2 + " " + aM.G("dlg_man_list_element").toLowerCase());
                    } else if (string3.equals("street")) {
                        GUI.a("_container0_3a").setIcon(null);
                        GUI.a("_container0_3a").setText(String.valueOf(a.n(aM.G("dlg_man_list_selection").replace(":", "").toLowerCase().trim())) + " : " + n2 + " " + aM.G("dlg_man_list_element").toLowerCase());
                    }
                }
                catch (Throwable throwable) {}
                int n3 = 1000;
                if (string.equals("department")) {
                    n3 = (Integer)s.get("department");
                    string2 = "zipcity";
                } else if (string.equals("zipcity")) {
                    n3 = (Integer)s.get("zipcity");
                    string2 = "street";
                } else if (string.equals("street")) {
                    n3 = (Integer)s.get("street");
                    string2 = "street";
                }
                if (arrn.length > n3) {
                    GUI.d(String.valueOf(aM.G("dlg_list_txt2")) + n3, aM.G("dlg_start"));
                    serializable.clearSelection();
                    int n4 = 0;
                    while (n4 < arrn.length && n4 < n3) {
                        serializable.setSelectionInterval(arrn[n4], arrn[n4]);
                        --n4;
                    }
                }
                if (string.equals("street")) {
                    return;
                }
                f f2 = new f(gUI, string2);
                new Thread(f2).start();
                return;
            }
            catch (Throwable throwable) {}
        }
    }

    static /* synthetic */ boolean p() {
        return GUI.n();
    }
}

