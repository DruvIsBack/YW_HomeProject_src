/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.jsoup.Connection
 *  org.jsoup.Connection$Method
 *  org.jsoup.Connection$Response
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Document
 *  org.jsoup.nodes.Element
 *  org.jsoup.parser.Parser
 *  org.jsoup.select.Elements
 */
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bi {
    private static String aC = "record.roa";
    private static String aD = "record_t";
    private static String aE = "record_c.roa";
    private static String aF = "record_h.roa";
    private static String aG = "ressource.roa";
    private static String aH = "ressource_m_0.roa";
    private static String aI = "ressource_n_0.roa";
    private static String aJ = "ressource_s_0.roa";
    private static String p = "ressource_f_0.roa";
    private static String o = "ressource_t_0.roa";
    private static String aK = "proxy_t";
    private static String aL = "search_t";
    private static String aM = "search_next_t";
    private static String aN = "detail_t";
    private static String aO = "table_t";
    private static String aP = "ini";
    private static LinkedHashMap a = new LinkedHashMap();

    /*
     * Exception decompiling
     */
    private static boolean a(java.sql.Connection var0, String var1_4, List var2_7, HashMap var3_8) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 22[DOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:416)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:468)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2960)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:818)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:196)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:141)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:372)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:867)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:768)
        // org.benf.cfr.reader.Main.doJar(Main.java:141)
        // org.benf.cfr.reader.Main.main(Main.java:242)
        throw new IllegalStateException("Decompilation failed");
    }

    public static String af() {
        String string;
        string = "false\u00a41\u00a41 / 1\u00a41 / 1\u00a41 / 1";
        Integer n2 = 0;
        Integer n3 = 0;
        Integer n4 = 0;
        Integer n5 = 0;
        Integer n6 = 0;
        Integer n7 = 0;
        Integer n8 = 0;
        try {
            Statement statement;
            Object object;
            if (bn.Q("delete_duplicate").contentEquals("0")) {
                object = new BufferedReader(new FileReader(String.valueOf(GUI.A()) + aD));
                while (object.readLine() != null) {
                    n2 = n2 + 1;
                }
                object.close();
                if (n2 > 0) {
                    n2 = n2 - 1;
                }
            } else {
                object = "SELECT COUNT('id') FROM " + aO + ";";
                statement = GUI.b().createStatement();
                object = statement.executeQuery((String)object);
                while (object.next()) {
                    n2 = Integer.valueOf(object.getString(1));
                }
                object.close();
                statement.close();
            }
            object = "SELECT COUNT('id') FROM " + aL + " WHERE locked='0' or locked='1';";
            statement = GUI.a().createStatement();
            object = statement.executeQuery((String)object);
            while (object.next()) {
                n3 = Integer.valueOf(object.getString(1));
            }
            object.close();
            statement.close();
            object = "SELECT COUNT('id') FROM " + aL + ";";
            statement = GUI.a().createStatement();
            object = statement.executeQuery((String)object);
            while (object.next()) {
                n4 = Integer.valueOf(object.getString(1));
            }
            object.close();
            statement.close();
            object = "SELECT COUNT('id') FROM " + aM + " WHERE locked='0' or locked='1';";
            statement = GUI.a().createStatement();
            object = statement.executeQuery((String)object);
            while (object.next()) {
                n5 = Integer.valueOf(object.getString(1));
            }
            object.close();
            statement.close();
            object = "SELECT COUNT('id') FROM " + aM + ";";
            statement = GUI.a().createStatement();
            object = statement.executeQuery((String)object);
            while (object.next()) {
                n6 = Integer.valueOf(object.getString(1));
            }
            object.close();
            statement.close();
            object = "SELECT COUNT('id') FROM " + aN + " WHERE locked='0' or locked='1';";
            statement = GUI.a().createStatement();
            object = statement.executeQuery((String)object);
            while (object.next()) {
                n7 = Integer.valueOf(object.getString(1));
            }
            object.close();
            statement.close();
            object = "SELECT COUNT('id') FROM " + aN + ";";
            statement = GUI.a().createStatement();
            object = statement.executeQuery((String)object);
            while (object.next()) {
                n8 = Integer.valueOf(object.getString(1));
            }
            object.close();
            statement.close();
            object = n3 + n5 + n7;
            string = object.intValue() > 0 ? "true\u00a4" + n2 + "\u00a4" + n3 + " / " + n4 + "\u00a4" + n5 + " / " + n6 + "\u00a4" + n7 + " / " + n8 : "false\u00a4" + n2 + "\u00a4" + n3 + " / " + n4 + "\u00a4" + n5 + " / " + n6 + "\u00a4" + n7 + " / " + n8;
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String L(String string) {
        block27 : {
            Statement statement;
            ResultSet resultSet;
            string = "status";
            Integer n2 = 0;
            Integer n3 = 0;
            Integer n4 = 0;
            statement = null;
            resultSet = null;
            try {
                try {
                    Object object = "SELECT COUNT('id') FROM " + aL + " WHERE locked='2' and error>='11';";
                    statement = GUI.a().createStatement();
                    resultSet = statement.executeQuery((String)object);
                    while (resultSet.next()) {
                        n2 = Integer.valueOf(resultSet.getString(1));
                    }
                    resultSet.close();
                    statement.close();
                    object = "SELECT COUNT('id') FROM " + aM + " WHERE locked='0' and error>='11';";
                    resultSet = statement.executeQuery((String)object);
                    while (resultSet.next()) {
                        n3 = Integer.valueOf(resultSet.getString(1));
                    }
                    resultSet.close();
                    statement.close();
                    object = "SELECT COUNT('id') FROM " + aN + " WHERE locked='0' and error>='11';";
                    resultSet = null;
                    resultSet = statement.executeQuery((String)object);
                    while (resultSet.next()) {
                        n4 = Integer.valueOf(resultSet.getString(1));
                    }
                    resultSet.close();
                    statement.close();
                    object = n2 + n3 + n4;
                    string = object.intValue() > 0 ? (n4 > 0 ? n2 + " " + aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim() + " / " + n3 + " " + aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim() + " / " + n4 + " " + aM.G("dlg_man_search_continue6").toLowerCase().replace(":", "").trim() + " ( press ctrl+r and resume last search )" : n2 + " " + aM.G("dlg_man_search_continue4").toLowerCase().replace(":", "").trim() + " / " + n3 + " " + aM.G("dlg_man_search_continue5").toLowerCase().replace(":", "").trim() + " ( press ctrl+r and resume last search )") : (bi.af().startsWith("false") ? aM.G("dlg_man_search_end") : "status");
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block27;
                }
            }
            catch (Throwable throwable) {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return string;
    }

    /*
     * Exception decompiling
     */
    public static boolean a(String var0, HashMap var1_2, Integer var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:393)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:471)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2960)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:818)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:196)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:141)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:372)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:867)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:768)
        // org.benf.cfr.reader.Main.doJar(Main.java:141)
        // org.benf.cfr.reader.Main.main(Main.java:242)
        throw new IllegalStateException("Decompilation failed");
    }

    public static boolean a(List list, Integer object, String object2, HashMap hashMap) {
        boolean bl2;
        bl2 = false;
        try {
            String string = GUI.E();
            JDialog jDialog = (JDialog)hashMap.get("dialog0");
            String[][] arrstring = (String[][])hashMap.get("text0");
            boolean bl3 = true;
            bn.Q("proxy_use");
            if (((String)hashMap.get("buttontext0")).contentEquals("canceled")) {
                return false;
            }
            arrstring.setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step").toLowerCase().trim()) + " 2 / 4<br /><br /></html>");
            a.a(new File(GUI.w()), ".txt");
            a.b(GUI.w());
            if (object2.contentEquals("0")) {
                arrstring = String.valueOf(aM.G("file_column")) + "\n";
                a.a(String.valueOf(GUI.A()) + aD, (String)arrstring);
            }
            arrstring = new String[][]{new String[0]};
            SQL.a(GUI.a(), aL, arrstring, "");
            SQL.a(GUI.a(), aM, arrstring, "");
            SQL.a(GUI.a(), aN, arrstring, "");
            SQL.a(GUI.g(), aO, arrstring, "");
            if (object2.contentEquals("0")) {
                SQL.a(GUI.b(), aO, arrstring, "");
                SQL.a(GUI.c(), aO, arrstring, "");
                SQL.a(GUI.d(), aO, arrstring, "");
            }
            if (string.contentEquals("file_t") || string.contentEquals("manual") || string.contentEquals("half") || string.contentEquals("browser")) {
                object = string.contentEquals("file_t") ? SQL.a(String.valueOf(GUI.A()) + p) : SQL.a(String.valueOf(GUI.A()) + o);
                object2 = new String[]{"streetId", "street"};
                arrstring = new String[][]{new String[0]};
                object2 = SQL.a((java.sql.Connection)object, aO, (String[])object2, arrstring, "");
                list.clear();
                int n2 = 0;
                while (n2 < object2.size()) {
                    String string2 = (String)((HashMap)object2.get(n2)).get("streetId");
                    String string3 = (String)((HashMap)object2.get(n2)).get("street");
                    list.add(n2, String.valueOf(string3) + "\u00a4" + string2);
                    ++n2;
                }
                object.close();
            } else if (string.contentEquals("table_t")) {
                bl3 = bi.a(list, hashMap, (Integer)object);
            }
            if (((String)hashMap.get("buttontext0")).contentEquals("canceled")) {
                return false;
            }
            if (bl3) {
                bl2 = bi.a(GUI.a(), string, list, hashMap);
                bn.d(GUI.D(), "lastSearchHistory", string);
            }
            SwingUtilities.invokeLater(new bj(jDialog));
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private static String a(String arrstring, String string, String string2, String string3, String string4, String string5) {
        String string6;
        string6 = "";
        try {
            String string7 = "e";
            String string8 = GUI.D();
            aS aS2 = new aS(K.M(), K.L());
            string7 = aS.b(aS2.b(string7));
            string8 = aS.b(aS2.b(string8));
            arrstring = aS.b(aS2.b((String)arrstring));
            string = aS.b(aS2.b(string));
            string2 = aS.b(aS2.b(string2));
            string3 = aS.b(aS2.b(string3));
            arrstring = new String[]{"s=" + string7, "version=" + string8, "type=" + (String)arrstring, "table=" + string, "table_act=" + string2, "field=" + string3, "data=" + string4};
            string6 = bi.a(string5, arrstring, "text");
        }
        catch (Throwable throwable) {}
        return string6;
    }

    private static String a(String string, String[] arrstring, String string2) {
        String string3;
        string3 = "";
        try {
            string = Jsoup.connect((String)string);
            int n2 = 0;
            while (n2 < arrstring.length) {
                String[] arrstring2 = arrstring[n2].split("=", 2);
                string.data(arrstring2[0], arrstring2[1]);
                ++n2;
            }
            string.userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36").ignoreHttpErrors(true).validateTLSCertificates(false).followRedirects(true).timeout(30000).method(Connection.Method.POST).proxy(Proxy.NO_PROXY);
            Connection.Response response = string.execute();
            int n3 = response.statusCode();
            if (n3 == 200) {
                string = response.parse();
                string = string2.contentEquals("text") ? string.text() : string.outerHtml();
                string3 = string;
            }
        }
        catch (Throwable throwable) {}
        return string3;
    }

    private static boolean a(List list, JLabel jLabel, String string) {
        try {
            if (!(GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow"))) {
                return false;
            }
            new java.text.DecimalFormat("###");
            int n2 = 0;
            while (n2 < list.size()) {
                Object object = ((String)list.get(n2)).split(string, -1);
                HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
                try {
                    String string2 = object[0];
                    String string3 = object[1];
                    String string4 = object[2];
                    object = object[3];
                    hashMap.put(0, string3);
                    hashMap.put(1, string4);
                    hashMap.put(2, (String)object);
                    a.put(string2, hashMap);
                }
                catch (Throwable throwable) {}
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean a(String[] arrstring, JLabel jLabel, String string) {
        try {
            new java.text.DecimalFormat("###");
            int n2 = 0;
            while (n2 < arrstring.length) {
                Object object = arrstring[n2].split(string, -1);
                HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
                try {
                    String string2 = object[0];
                    String string3 = object[1];
                    String string4 = object[2];
                    object = object[3];
                    hashMap.put(0, string3);
                    hashMap.put(1, string4);
                    hashMap.put(2, (String)object);
                    a.put(string2, hashMap);
                }
                catch (Throwable throwable) {}
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static boolean a(java.sql.Connection var0, Integer var1_2) {
        block38 : {
            var2_19 = false;
            var3_20 = null;
            var4_21 = null;
            try {
                try {
                    block36 : {
                        var5_22 = new ArrayList<String>();
                        if (!GUI.D().contentEquals("IQUALIF United Kingdom White") && !GUI.D().contentEquals("IQUALIF United States White") && !GUI.D().contentEquals("IQUALIF United States WP White") && !GUI.D().contains("Yellow")) break block36;
                        var6_23 = "SELECT streetId FROM " + bi.aM + " WHERE locked=?;";
                        var4_21 = var0.prepareStatement(var6_23);
                        var4_21.setInt(1, 0);
                        var3_20 = var4_21.executeQuery();
                        ** GOTO lbl69
                    }
                    var6_24 = "0";
                    var7_26 = "0";
                    var8_28 = "f";
                    var9_30 = "z";
                    var10_32 = GUI.C();
                    var11_33 = 0;
                    if (bn.Q("custom_list_use").contentEquals("1")) {
                        var6_24 = "1";
                    }
                    if (bn.Q("custom_list_use_act").contentEquals("1")) {
                        var7_26 = "1";
                    }
                    var12_34 = "SELECT streetId FROM " + bi.aM + " WHERE locked=?;";
                    var4_21 = var0.prepareStatement(var12_34);
                    var4_21.setInt(1, 0);
                    var3_20 = var4_21.executeQuery();
                    do {
                        block37 : {
                            if (var3_20.next()) break block37;
                            var3_20.close();
                            var4_21.close();
                            var12_34 = "SELECT streetId FROM " + bi.aL + " WHERE locked=?;";
                            var4_21 = var0.prepareStatement(var12_34);
                            var4_21.setInt(1, 0);
                            var3_20 = var4_21.executeQuery();
                            ** GOTO lbl103
                        }
                        var12_34 = var3_20.getString("streetId");
                        var5_22.add(var12_34);
                    } while (true);
                }
                catch (Throwable v0) {
                    if (var3_20 != null) {
                        try {
                            var3_20.close();
                        }
                        catch (Throwable v1) {}
                    }
                    if (var4_21 == null) return var2_19;
                    try {
                        var4_21.close();
                        return var2_19;
                    }
                    catch (Throwable v2) {
                        return var2_19;
                    }
                }
            }
            catch (Throwable var0_17) {
                if (var3_20 != null) {
                    try {
                        var3_20.close();
                    }
                    catch (Throwable v3) {}
                }
                if (var4_21 == null) throw var0_17;
                try {
                    var4_21.close();
                    throw var0_17;
                }
                catch (Throwable v4) {}
                throw var0_17;
            }
lbl-1000: // 1 sources:
            {
                var7_25 = var3_20.getString("streetId");
                var5_22.add((String)var7_25);
lbl69: // 2 sources:
                ** while (var3_20.next())
            }
lbl70: // 1 sources:
            var3_20.close();
            var4_21.close();
            var6_23 = "SELECT streetId FROM " + bi.aL + " WHERE locked=?;";
            var4_21 = var0.prepareStatement(var6_23);
            var4_21.setInt(1, 0);
            var3_20 = var4_21.executeQuery();
            while (var3_20.next()) {
                var7_25 = var3_20.getString("streetId");
                var5_22.add((String)var7_25);
            }
            var3_20.close();
            var4_21.close();
            a.a(var5_22);
            bi.a.clear();
            var7_25 = SQL.a(String.valueOf(GUI.A()) + bi.o);
            var6_23 = "SELECT zipId,zip,city,street FROM " + bi.aO + ";";
            var4_21 = var7_25.prepareStatement(var6_23);
            var3_20 = var4_21.executeQuery();
            while (var3_20.next()) {
                var0_2 = var3_20.getString("zipId");
                if (!var5_22.contains(var0_2)) continue;
                var8_27 = var3_20.getString("zip");
                var9_29 = new String(K.E(var3_20.getString("city")).getBytes(), "UTF-8");
                var10_31 = new String(K.E(var3_20.getString("street")).getBytes(), "UTF-8");
                var0_3 = new String[]{String.valueOf(var0_2) + "\u00a4" + var8_27 + "\u00a4" + var9_29 + "\u00a4" + var10_31};
                bi.a(var0_3, null, "\u00a4");
            }
            var3_20.close();
            var4_21.close();
            var7_25.close();
            break block38;
lbl-1000: // 1 sources:
            {
                var12_34 = var3_20.getString("streetId");
                var5_22.add(var12_34);
lbl103: // 2 sources:
                ** while (var3_20.next())
            }
lbl104: // 1 sources:
            var3_20.close();
            var4_21.close();
            a.a(var5_22);
            bi.a.clear();
            var12_35 = 0;
            while (var12_35 < var5_22.size()) {
                block39 : {
                    block40 : {
                        block41 : {
                            var13_36 = false;
                            var0_5 = "";
                            var14_39 = var12_35;
                            while (var14_39 < var5_22.size() && var14_39 < var12_35 + var1_18.intValue()) {
                                var13_37 = (String)var5_22.get(var14_39);
                                var0_7 = String.valueOf(var0_6) + var13_37 + "\u00a4";
                                var13_36 = true;
                                ++var14_39;
                            }
                            if (!var13_36) break block39;
                            if (var0_6.length() > 1 && var0_6.endsWith("\u00a4")) {
                                var0_8 = var0_6.substring(0, var0_6.length() - 1);
                            }
                            if (!(var14_40 = bi.a(var8_28, var6_24, var7_26, var9_30, (String)var0_9, var10_32)).startsWith("<!DOCTYPE HTML PUBLIC")) break block40;
                            if (var14_40.contains("Internal Server Error")) {
                                var0_10 = aM.G("dlg_list_error1");
                            } else {
                                var0_11 = aM.G("dlg_list_error2");
                            }
                            var11_33 = var11_33 + 1;
                            var2_19 = false;
                            if (var11_33 >= 2) break block41;
                            GUI.d(aM.G("dlg_list_error3"), aM.G("dlg_start"));
                            break block39;
                        }
                        GUI.d((String)var0_12, "Information");
                        bi.a.clear();
                        break;
                    }
                    if (!var14_40.contentEquals("")) ** GOTO lbl147
                    var0_13 = aM.G("dlg_list_error4");
                    var11_33 = var11_33 + 1;
                    var2_19 = false;
                    if (var11_33 < 2) {
                        GUI.d(aM.G("dlg_list_error3"), aM.G("dlg_start"));
                    } else {
                        GUI.d(var0_13, aM.G("dlg_start"));
                        bi.a.clear();
                        break;
lbl147: // 1 sources:
                        var13_38 = new aS(K.K(), K.J());
                        var0_14 = new String(var13_38.c(var14_40), "UTF-8");
                        var0_15 = var0_14.split("\u00a4", -1);
                        bi.a(var0_15, null, ";");
                        var2_19 = true;
                    }
                }
                var12_35 += var1_18.intValue();
            }
        }
        if (var3_20 != null) {
            try {
                var3_20.close();
            }
            catch (Throwable v5) {}
        }
        if (var4_21 == null) return var2_19;
        try {
            var4_21.close();
            return var2_19;
        }
        catch (Throwable v6) {}
        return var2_19;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(List list, HashMap hashMap, Integer n2) {
        boolean bl2 = false;
        try {
            SwingUtilities.invokeLater(new bk(hashMap));
            if (GUI.D().contentEquals("IQUALIF United Kingdom White")) return true;
            if (GUI.D().contentEquals("IQUALIF United States White")) return true;
            if (GUI.D().contentEquals("IQUALIF United States WP White")) return true;
            if (GUI.D().contains("Yellow")) {
                return true;
            }
            String string = "0";
            String string2 = "0";
            String string3 = "f";
            String string4 = "z";
            String string5 = GUI.C();
            Integer n3 = 0;
            if (bn.Q("custom_list_use").contentEquals("1")) {
                string = "1";
            }
            if (bn.Q("custom_list_use_act").contentEquals("1")) {
                string2 = "1";
            }
            a.clear();
            DecimalFormat decimalFormat = new DecimalFormat("###");
            int n4 = 0;
            do {
                block16 : {
                    String string6;
                    block17 : {
                        block18 : {
                            if (n4 >= list.size()) {
                                return bl2;
                            }
                            int n5 = n4;
                            int n6 = list.size();
                            SwingUtilities.invokeLater(new bl(hashMap, decimalFormat, n5, n6));
                            n6 = 0;
                            String string7 = "";
                            if (((String)hashMap.get("buttontext0")).contentEquals("canceled")) {
                                return bl2;
                            }
                            int n7 = n4;
                            do {
                                void var6_15;
                                if (n7 >= list.size() || n7 >= n4 + n2) {
                                    void var6_18;
                                    if (n6 == 0) break block16;
                                    if (var6_15.length() > 1 && var6_15.endsWith("\u00a4")) {
                                        String string8 = var6_15.substring(0, var6_15.length() - 1);
                                    }
                                    if (!(string6 = bi.a(string3, string, string2, string4, (String)var6_18, string5)).startsWith("<!DOCTYPE HTML PUBLIC")) break block17;
                                    if (!string6.contains("Internal Server Error")) break;
                                    String string9 = aM.G("dlg_list_error1");
                                    break block18;
                                }
                                String string10 = (String)list.get(n7);
                                if (GUI.D().contains(" Yellow")) {
                                    String[] arrstring = ((String)list.get(n7)).split("\u00a4", -1);
                                    string10 = arrstring[0];
                                }
                                String string11 = String.valueOf(var6_15) + string10 + "\u00a4";
                                n6 = 1;
                                ++n7;
                            } while (true);
                            String string12 = aM.G("dlg_list_error2");
                        }
                        n3 = n3 + 1;
                        bl2 = false;
                        if (n3 >= 2) {
                            void var6_21;
                            GUI.d((String)var6_21, "Information");
                            a.clear();
                            return bl2;
                        }
                        GUI.d(aM.G("dlg_list_error3"), aM.G("dlg_start"));
                        break block16;
                    }
                    if (string6.contentEquals("")) {
                        String string13 = aM.G("dlg_list_error4");
                        n3 = n3 + 1;
                        bl2 = false;
                        if (n3 >= 2) {
                            GUI.d(string13, "Information");
                            a.clear();
                            return bl2;
                        }
                        GUI.d(aM.G("dlg_list_error3"), aM.G("dlg_start"));
                    } else {
                        aS aS2 = new aS(K.K(), K.J());
                        String string14 = new String(aS2.c(string6), "UTF-8");
                        String[] arrstring = string14.split("\u00a4", -1);
                        bi.a(arrstring, null, ";");
                        bl2 = true;
                    }
                }
                n4 += n2.intValue();
            } while (true);
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private static boolean b(bb object) {
        try {
            Object object2 = object.O();
            object = object.Y();
            if (object2.contentEquals("firstpage")) {
                object2 = aL;
            } else if (object2.contentEquals("nextpage")) {
                object2 = aM;
            } else if (object2.contentEquals("detailpage")) {
                object2 = aN;
            } else {
                return false;
            }
            if (GUI.D().contentEquals("IQUALIF Canada White")) {
                object2 = "UPDATE " + (String)object2 + " SET locked=2, error=11 WHERE locked=1 AND id= ?;";
                object2 = GUI.a().prepareStatement((String)object2);
                object2.setString(1, (String)object);
                object2.execute();
                object2.close();
            } else {
                object2 = "UPDATE " + (String)object2 + " SET locked=0, error=error+1 WHERE locked=1 AND id= ?;";
                object2 = GUI.a().prepareStatement((String)object2);
                object2.setString(1, (String)object);
                object2.execute();
                object2.close();
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean c(bb object) {
        try {
            Object object2 = object.O();
            object = object.Y();
            if (object2.contentEquals("firstpage")) {
                object2 = aL;
            } else if (object2.contentEquals("nextpage")) {
                object2 = aM;
            } else if (object2.contentEquals("detailpage")) {
                object2 = aN;
            } else {
                return false;
            }
            object2 = "UPDATE " + (String)object2 + " SET locked=2 WHERE locked=1 AND id= ?;";
            if (GUI.a() != null) {
                GUI.a().isClosed();
            }
            object2 = GUI.a().prepareStatement((String)object2);
            object2.setString(1, (String)object);
            object2.execute();
            object2.close();
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static String M(String string) {
        try {
            if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                string = string.replace(" ", "");
                string = string.replace(".", "");
                string = string.replace(":", "1");
                string = string.replace("n", "6");
                string = string.replace(";", "7");
                string = string.replace("q", "9");
                string = string.replace("#", "7");
                string = string.replace("a", "6");
                string = string.replace("I", "3");
                string = string.replace("&", "4");
                string = string.replace("-", "");
            } else if (GUI.D().contentEquals("IQUALIF Germany White")) {
                string = string.replace(" ", "");
                string = string.replace(".", "");
                string = string.replaceAll("<spanstyle=.display:none.>.*?</span>", "").replaceAll("<spanclass=.hide.>.*?</span>", "").replaceAll("\u2026", "").replaceAll("\\.", "");
            } else if (GUI.D().contentEquals("IQUALIF Germany Yellow")) {
                string = string.replace(" ", "");
                string = string.replace(".", "");
                if ((string = string.replace("\r", "").replace("\n", "").replace("Tel/", "").replace("--", "-").replace("Fon-", "").replace("Mobil-", "").replace("Fax-", "").replace("-", "")).endsWith("-")) {
                    string = string.substring(0, string.length() - 1);
                }
                string = string.replace("+", "");
            } else if (GUI.D().contains("Morocco")) {
                string = string.replace(" ", "");
                string = string.replace(".", "");
            } else {
                string = string.replace(" ", "");
                string = string.replace(".", "");
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static boolean a(String string, HashMap hashMap, String string2) {
        block26 : {
            ResultSet resultSet;
            Statement statement;
            resultSet = null;
            statement = null;
            try {
                try {
                    java.sql.Connection connection = string2.contentEquals("file_t") ? GUI.f() : GUI.e();
                    String string3 = "streetId, zip, city, street";
                    string3 = "SELECT " + string3 + " FROM " + aO + " WHERE streetId= ? LIMIT 1;";
                    statement = connection.prepareStatement(string3);
                    statement.setString(1, string);
                    resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        string = new String(K.E(resultSet.getString("city")).getBytes(), "UTF-8");
                        hashMap.put("zip", resultSet.getString("zip"));
                        hashMap.put("city", string);
                        hashMap.put("street", resultSet.getString("street"));
                        if (string2.contentEquals("manual") || string2.contentEquals("half") || string2.contentEquals("browser")) {
                            string = K.E(resultSet.getString("street"));
                            hashMap.put("street", string);
                        }
                    }
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable3) {}
                    }
                    break block26;
                }
            }
            catch (Throwable throwable) {
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable4) {}
                }
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    }
                    catch (Throwable throwable5) {}
                }
                throw throwable;
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable) {}
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return false;
    }

    private static void a(String object, HashMap hashMap) {
        try {
            try {
                hashMap.put("zip", (String)((HashMap)a.get(object)).get(0));
                hashMap.put("city", (String)((HashMap)a.get(object)).get(1));
                hashMap.put("street", (String)((HashMap)a.get(object)).get(2));
                return;
            }
            catch (Throwable throwable) {
                return;
            }
        }
        catch (Throwable throwable) {
            object = throwable;
            throw throwable;
        }
    }

    private static List a(String string, Integer n2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            String string2 = bn.Q("lastSearchHistory");
            String string3 = "";
            if (string.contentEquals("firstpage")) {
                string = aL;
                string3 = bn.Q("url_search");
            } else if (string.contentEquals("nextpage")) {
                string = aM;
                string3 = bn.Q("url_next_page");
                if (bn.Q("lastSearchHistory").contentEquals("browser")) {
                    string3 = bn.Q("url_browser_next_page");
                }
            } else if (string.contentEquals("detailpage")) {
                string = aN;
            } else {
                return arrayList;
            }
            String string4 = "";
            if (bn.Q("custom_list_use").contentEquals("1")) {
                string4 = "_perso";
            }
            string4 = "ressource" + string4 + "_s_";
            a.a(GUI.A(), string4);
            int n3 = 0;
            while (n3 < n2) {
                Object object = "id, streetId, page_id, error";
                object = "SELECT " + (String)object + " FROM " + string + " WHERE locked= ? LIMIT 1;";
                object = GUI.a().prepareStatement((String)object);
                object.setInt(1, 0);
                ResultSet resultSet = object.executeQuery();
                while (resultSet.next()) {
                    Object object2 = new HashMap<String, String>();
                    String string5 = resultSet.getString("streetId");
                    object2.put("url", string3);
                    object2.put("searchid", resultSet.getString("id"));
                    object2.put("streetid", string5);
                    object2.put("pageid", resultSet.getString("page_id"));
                    object2.put("error", resultSet.getString("error"));
                    object2.put("zip", "");
                    object2.put("city", "");
                    object2.put("street", "");
                    if (string2.contentEquals("table_t")) {
                        bi.a(string5, object2);
                    } else if (string2.contentEquals("file_t") || string2.contentEquals("manual") || string2.contentEquals("half") || string2.contentEquals("browser")) {
                        bi.a(string5, object2, string2);
                    }
                    arrayList.add(n3, object2);
                    object2 = "UPDATE " + string + " SET locked='1' WHERE locked='0' AND id= ? ;";
                    object2 = GUI.a().prepareStatement((String)object2);
                    object2.setString(1, (String)((HashMap)arrayList.get(n3)).get("searchid"));
                    object2.executeUpdate();
                    object2.close();
                }
                resultSet.close();
                object.close();
                ++n3;
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static List b(String arrayList, Integer n2) {
        ArrayList<Object> arrayList2;
        ResultSet resultSet;
        Statement statement;
        Statement statement2;
        String string;
        block39 : {
            arrayList2 = new ArrayList<Object>();
            resultSet = null;
            statement2 = null;
            statement = null;
            string = "";
            if (arrayList.contentEquals((CharSequence)"firstpage")) {
                arrayList = aL;
                string = bn.Q("url_search");
                break block39;
            }
            if (arrayList.contentEquals((CharSequence)"nextpage")) {
                arrayList = aM;
                string = bn.Q("url_next_page");
                if (bn.Q("lastSearchHistory").contentEquals("browser")) {
                    string = bn.Q("url_browser_next_page");
                }
                break block39;
            }
            if (!arrayList.contentEquals((CharSequence)"detailpage")) return arrayList2;
            arrayList = aN;
        }
        try {
            try {
                String string2 = bn.Q("lastSearchHistory");
                String string3 = "";
                if (bn.Q("custom_list_use").contentEquals("1")) {
                    string3 = "_perso";
                }
                string3 = "ressource" + string3 + "_s_";
                a.a(GUI.A(), string3);
                int n3 = 0;
                while (n3 < n2) {
                    Object object = "id, streetId, page_id, error";
                    object = "SELECT " + (String)object + " FROM " + arrayList + " WHERE locked= ? OR locked= ? LIMIT 1;";
                    if (GUI.a() != null) {
                        GUI.a().isClosed();
                    }
                    statement2 = GUI.a().prepareStatement((String)object);
                    statement2.setInt(1, 0);
                    statement2.setInt(2, 1);
                    resultSet = statement2.executeQuery();
                    while (resultSet.next()) {
                        object = new HashMap();
                        String string4 = resultSet.getString("streetId");
                        object.put("url", string);
                        object.put("searchid", resultSet.getString("id"));
                        object.put("streetid", string4);
                        object.put("pageid", resultSet.getString("page_id"));
                        object.put("error", resultSet.getString("error"));
                        object.put("zip", "");
                        object.put("city", "");
                        object.put("street", "");
                        if (string2.contentEquals("table_t")) {
                            bi.a(string4, (HashMap)object);
                        } else if (string2.contentEquals("file_t") || string2.contentEquals("manual") || string2.contentEquals("half") || string2.contentEquals("browser")) {
                            bi.a(string4, (HashMap)object, string2);
                        }
                        arrayList2.add(n3, object);
                        object = "UPDATE " + arrayList + " SET locked='1' WHERE locked='0' AND id= ? ;";
                        statement = GUI.a().prepareStatement((String)object);
                        statement.setString(1, (String)((HashMap)arrayList2.get(n3)).get("searchid"));
                        statement.executeUpdate();
                    }
                    ++n3;
                }
            }
            catch (Throwable throwable) {
                if (statement2 != null) {
                    try {
                        statement2.close();
                    }
                    catch (Throwable throwable2) {}
                }
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable3) {}
                }
                if (resultSet == null) return arrayList2;
                try {
                    resultSet.close();
                    return arrayList2;
                }
                catch (Throwable throwable4) {}
                return arrayList2;
            }
        }
        catch (Throwable throwable) {
            if (statement2 != null) {
                try {
                    statement2.close();
                }
                catch (Throwable throwable5) {}
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable6) {}
            }
            if (resultSet == null) throw throwable;
            try {
                resultSet.close();
                throw throwable;
            }
            catch (Throwable throwable7) {}
            throw throwable;
        }
        if (statement2 != null) {
            try {
                statement2.close();
            }
            catch (Throwable throwable) {}
        }
        if (statement != null) {
            try {
                statement.close();
            }
            catch (Throwable throwable) {}
        }
        if (resultSet == null) return arrayList2;
        try {
            resultSet.close();
            return arrayList2;
        }
        catch (Throwable throwable) {}
        return arrayList2;
    }

    private static String a(String string, HashMap object) {
        Object object2;
        object2 = "";
        try {
            String string2 = "UTF-8";
            object2 = (String)object.get("url");
            String string3 = "";
            String string4 = (String)object.get("zip");
            String string5 = (String)object.get("city");
            String string6 = (String)object.get("street");
            object = (String)object.get("pageid");
            if (string.contentEquals("detailpage")) {
                object2 = object;
            }
            string6 = bi.N(string6);
            if (GUI.D().contentEquals("IQUALIF France White")) {
                string4 = a.o(string4);
                string5 = a.o(string5);
                string6 = a.o(string6);
                if (bn.Q("lastSearchHistory").contentEquals("file_t") && bn.Q("streetimportfilebyname").contentEquals("0") && string.contentEquals("firstpage")) {
                    object2 = "https://www.pagesjaunes.fr/pagesblanches/recherche?pj4valid=true&quoiqui=\u00a4street\u00a4&ou=\u00a4zip\u00a4+\u00a4city\u00a4&idOu=&acOuSollicitee=0&rangOu=&sourceOu=&typeOu=&nbPropositionOuTop=0&nbPropositionOuHisto=0&ouSaisi=&ouNbCar=";
                }
            } else if (GUI.D().contentEquals("IQUALIF Canada White") && string.contentEquals("firstpage") && string6.matches("^[a-zA-Z0-9]{3} [a-zA-Z0-9]{3}$")) {
                object2 = "http://www.canada411.ca/search/?stype=si&what=&where=\u00a4street\u00a4";
            }
            object2 = object2.replace("\u00a4searchoption\u00a4", string3);
            object2 = string4.length() >= 2 ? object2.replace("\u00a4department\u00a4", string4.substring(0, 2)) : object2.replace("\u00a4department\u00a4", string4);
            if (GUI.D().contentEquals("IQUALIF United States White") && string4.length() > 7) {
                string4 = string4.substring(3, 8);
            }
            if ((GUI.D().contentEquals("IQUALIF Italy Yellow") || GUI.D().contentEquals("IQUALIF Italy PG Yellow")) && string4.length() > 9) {
                string4 = string4.substring(5, string4.length());
            }
            if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                if (bn.Q("lastSearchHistory").contentEquals("table_t")) {
                    string4 = a.j(string4);
                    string5 = a.j(string5);
                    string6 = a.j(string6);
                    string4 = string4.toLowerCase();
                    string5 = string5.toLowerCase();
                    string6 = string6.toLowerCase();
                    string4 = string4.replace(" & ", "_");
                    string5 = string5.replace(" & ", "_");
                    string6 = string6.replace(" & ", "_");
                    string4 = string4.replace(" / ", "_");
                    string5 = string5.replace(" / ", "_");
                    string6 = string6.replace(" / ", "_");
                    string4 = string4.replace(" - ", "_");
                    string5 = string5.replace(" - ", "_");
                    string6 = string6.replace(" - ", "_");
                    string4 = string4.replace("-", "_");
                    string5 = string5.replace("-", "_");
                    string6 = string6.replace("-", "_");
                    string4 = string4.replace(" ", "_");
                    string5 = string5.replace(" ", "_");
                    string6 = string6.replace(" ", "_");
                }
            } else if (GUI.D().contains("United Kingdom Yellow")) {
                string4 = string4.replace(" ", "-").toLowerCase();
                string5 = string5.replace(" ", "-").toLowerCase();
                string6 = string6.replace(" ", "-").toLowerCase();
                object = object.replace(" ", "-").toLowerCase();
            }
            if (GUI.D().contains(" Viva ")) {
                if (bn.Q("lastSearchHistory").contentEquals("table_t")) {
                    string4 = a.j(string4);
                    string5 = a.j(string5);
                    string6 = a.j(string6);
                    string4 = string4.toLowerCase();
                    string5 = string5.toLowerCase();
                    string6 = string6.toLowerCase();
                    string4 = string4.replace(".", "");
                    string5 = string5.replace(".", "");
                    string6 = string6.replace(".", "");
                }
            } else if (GUI.D().contains(" 712")) {
                string4 = string4.replace(" ", "-");
                string5 = string5.replace(" ", "-");
                string6 = string6.replace(" ", "-");
            } else if (GUI.D().contains("IQUALIF Luxembourg White")) {
                string4 = string4.replace(".", "-");
                string5 = string5.replace(".", "-");
                string6 = string6.replace(".", "-");
                string5 = a.j(string5);
                string6 = a.j(string6);
            } else if (GUI.D().contains("IQUALIF Luxembourg Yellow")) {
                string4 = string4.replace(".", "-");
                string5 = string5.replace(".", "-");
                string6 = string6.replace(".", "-");
            }
            if (GUI.D().contentEquals("IQUALIF Denmark Yellow")) {
                object = object.replace("&oslash;", "\u00f8");
            } else if (GUI.D().contentEquals("IQUALIF Sbito White and Yellow") || GUI.D().contentEquals("IQUALIF Auto24 White and Yellow") || GUI.D().contentEquals("IQUALIF Immo24 White and Yellow") || GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow") || GUI.D().contentEquals("IQUALIF Germany Yellow") || GUI.D().contentEquals("IQUALIF Belgium 07 Yellow") || GUI.D().contentEquals("IQUALIF Anbis White and Yellow") || GUI.D().contentEquals("IQUALIF Italy White") || GUI.D().contentEquals("IQUALIF Italy PG Yellow") || GUI.D().contentEquals("IQUALIF Italy Yellow") || GUI.D().contentEquals("IQUALIF Spain Yellow") || GUI.D().contentEquals("IQUALIF Switzerland Yellow") || GUI.D().contentEquals("IQUALIF BCoin White and Yellow") || GUI.D().contains("Hungary") || GUI.D().contains("Australia") || GUI.D().contains(" Tunisia ") || GUI.D().contains(" Viva ") || GUI.D().contains("United Kingdom ") || GUI.D().contains("United States ") || GUI.D().contains("Netherlands ") || GUI.D().contains("Luxembourg ") || GUI.D().contains("Morocco ")) {
                object = object.replace("&amp;", "&").replace("&amp;", "&");
                object = object.replace(" ", "%20");
                object = object.replace("&Eacute;", "%C9");
                if (GUI.D().contains("Germany") && object2.contains("cmd=detail") || GUI.D().contentEquals("IQUALIF Auto24 White and Yellow") || GUI.D().contentEquals("IQUALIF Immo24 White and Yellow") || GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow") || GUI.D().contentEquals("IQUALIF Sbito White and Yellow") || GUI.D().contentEquals("IQUALIF Spain Yellow") || GUI.D().contentEquals("IQUALIF Switzerland Yellow")) {
                    object2 = object2.replace("&amp;", "&");
                }
            }
            if (GUI.D().contentEquals("IQUALIF Germany Yellow")) {
                string2 = "UTF-8";
            }
            if (GUI.D().contentEquals("IQUALIF France Yellow") && bn.Q("custom_list_use").contentEquals("2")) {
                string4 = "";
            }
            if (GUI.D().contentEquals("IQUALIF Africa Yellow")) {
                string5 = string5.toLowerCase();
            }
            if (!GUI.D().contentEquals("IQUALIF Saudi Arabia Yellow") && !GUI.D().contentEquals("IQUALIF Dliveroo Yellow")) {
                if (GUI.D().contentEquals("IQUALIF Germany White")) {
                    string5 = string5.replace(" ", "-");
                    string6 = string6.replace(" ", "-");
                    string5 = URLEncoder.encode(string5, string2);
                    string6 = URLEncoder.encode(string6, string2);
                } else if (GUI.D().contains(" Portugal ")) {
                    string4 = string4.replace(" ", "%20");
                    string5 = string5.replace(" ", "%20");
                    string6 = string6.replace(" ", "%20");
                } else if (GUI.D().contentEquals("IQUALIF Belgium White")) {
                    string4 = string4.replace(" ", "%20");
                    string5 = string5.replace(" ", "%20");
                    string6 = string6.replace(" ", "%20");
                } else if (GUI.D().contentEquals("IQUALIF Belgium Yellow")) {
                    string4 = string4.replace(" ", "+");
                    string5 = string5.replace(" ", "+");
                    string6 = string6.replace(" ", "+");
                } else {
                    string4 = URLEncoder.encode(string4, string2);
                    string5 = URLEncoder.encode(string5, string2);
                    string6 = URLEncoder.encode(string6, string2);
                }
            }
            if (GUI.D().contentEquals("IQUALIF Africa Yellow") || GUI.D().contentEquals("IQUALIF Finland Yellow")) {
                object = URLEncoder.encode((String)object, string2);
            }
            if (GUI.D().contains("Canada ")) {
                string6 = string6.replace("*", "-");
            }
            if (GUI.D().contentEquals("IQUALIF Switzerland CH White")) {
                object2 = object2.replace("*%2C%20", "");
            }
            if (GUI.D().contentEquals("IQUALIF Switzerland White")) {
                string6 = string6.replace("+", "%20");
                string4 = string4.replace(" ", "%20");
                string5 = string5.replace(" ", "%20");
                string6 = string6.replace(" ", "%20");
            }
            if (GUI.D().contentEquals("IQUALIF France Yellow") && string4.contentEquals(string5)) {
                object2 = object2.replace("+\u00a4city\u00a4", "");
            }
            if (GUI.D().contentEquals("IQUALIF Belgium White")) {
                object2 = string5.contentEquals("*") || string5.contentEquals("") ? object2.replace("+\u00a4city\u00a4", "") : object2.replace("\u00a4zip\u00a4", "");
            }
            object2 = object2.replace("\u00a4zip\u00a4", string4);
            object2 = object2.replace("\u00a4city\u00a4", string5);
            object2 = object2.replace("\u00a4street\u00a4", string6);
            object2 = object2.replace("\u00a4pageid\u00a4", (CharSequence)object);
            if (GUI.D().contentEquals("IQUALIF Belgium White")) {
                object2 = object2.replace("*", "");
            }
            object2 = a.r((String)object2);
        }
        catch (Throwable throwable) {}
        return object2;
    }

    private static String N(String string) {
        String string2;
        string2 = string;
        try {
            int n2 = string.lastIndexOf("(");
            int n3 = string.lastIndexOf(")");
            if (n2 >= 0 && n3 > n2) {
                if (GUI.D().contains("IQUALIF Canada")) {
                    string = string.substring(0, n2);
                    string2 = string.trim();
                } else if (!string.substring(n2 + 1, n3).contentEquals("AUTRE")) {
                    string = String.valueOf(string.substring(n2 + 1, n3)) + " " + string.substring(0, n2);
                    string2 = string.trim();
                } else {
                    string = string.substring(0, n2);
                    string2 = string.trim();
                }
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static boolean c(String string, List list) {
        try {
            int n2 = 0;
            while (n2 < list.size()) {
                String string2 = bi.a(string, (HashMap)list.get(n2));
                ((HashMap)list.get(n2)).put("url", string2);
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static bb a(String string, String string2, HashMap hashMap) {
        bb bb2;
        bb2 = null;
        try {
            String string3 = "save";
            if (!string.contentEquals("firstpage")) {
                if (string.contentEquals("nextpage")) {
                    string3 = "use";
                } else {
                    string.contentEquals("detailpage");
                }
            }
            bb2 = new bb((String)hashMap.get("url"), string2, string3, string, (String)hashMap.get("searchid"), (String)hashMap.get("streetid"), (String)hashMap.get("pageid"), (String)hashMap.get("error"), (String)hashMap.get("zip"), (String)hashMap.get("city"), (String)hashMap.get("street"));
        }
        catch (Throwable throwable) {}
        return bb2;
    }

    private static String ag() {
        String string;
        string = "";
        try {
            Integer n2 = Integer.valueOf(bn.Q("ageExport"));
            if (n2 != 0) {
                if (n2 == 1) {
                    string = "age IN(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25)";
                } else if (n2 == 2) {
                    string = "age IN(26,27,28,29,30,31,32,33,34,35)";
                } else if (n2 == 3) {
                    string = "age IN(36,37,38,39,40,41,42,43,44,45)";
                } else if (n2 == 4) {
                    string = "age IN(46,47,48,49,50,51,52,53,54,55)";
                } else if (n2 == 5) {
                    string = "age IN(56,57,58,59,60,61,62,63,64,65)";
                } else if (n2 == 6) {
                    string = "age IN(66,67,68,69,70,71,72,73,74,75)";
                } else if (n2 == 7) {
                    string = "age IN(76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110)";
                } else if (n2 == 8) {
                    string = "age IN('nc')";
                }
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static String ah() {
        String string;
        string = "";
        try {
            string = aM.G("file_column");
            if (GUI.h()) {
                string = "";
                String[] arrstring = aM.c();
                Object object = GSetting.b();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    object = (String)iterator.next();
                    String string2 = bn.Q(String.valueOf(object) + "Column");
                    if ((object = GUI.a(string2, (String)object)).intValue() <= 0) continue;
                    string = string.contentEquals("") ? aM.G("word_" + arrstring[object.intValue()]) : String.valueOf(string) + ";" + aM.G(new StringBuilder("word_").append(arrstring[object.intValue()]).toString());
                }
                string = String.valueOf(aM.G("word_date")) + ";" + string;
            } else if (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow") || GUI.D().contentEquals("IQUALIF Luxembourg White") || GUI.D().contentEquals("IQUALIF Switzerland White") || GUI.D().contentEquals("IQUALIF Switzerland Yellow") || GUI.D().contentEquals("IQUALIF Australia Yellow") || GUI.D().contentEquals("IQUALIF United Kingdom YL Yellow") || GUI.D().contentEquals("IQUALIF Italy White") || GUI.D().contentEquals("IQUALIF Anbis White and Yellow") || GUI.D().contentEquals("IQUALIF Tuti White and Yellow") || GUI.D().contentEquals("IQUALIF Sbito White and Yellow")) {
                if (GUI.D().contentEquals("IQUALIF France White") && bn.Q("professionnalMark").contentEquals("1")) {
                    if (aH.D("language").contentEquals("3")) {
                        string = "date;code postal;ville;adresse;genre;nom;prenom;tel1;tel2;tel3;mobile;fax;habitat;age moyen;ethnie;tel1_prospection;tel2_prospection;tel3_prospection;mobile_prospection;fax_prospection";
                    } else if (aH.D("language").contentEquals("1")) {
                        string = "date;zip;city;street;gender;last name;first name;tel1;tel2;tel3;mobile;fax;housing;average age;ethnic group;tel1_marketing;tel2_marketing;tel3_marketing;mobile_marketing;fax_marketing";
                    } else if (aH.D("language").contentEquals("4")) {
                        string = "data;codice postale;citt\u00e0;indirizzo;genere;cognome;nome;e-mail;tel1;tel2;tel3;cellulare;fax;sito;commenti;habitat;et\u00e0 media;gruppo etnico;tel1_consenso;tel2_consenso;tel3_consenso;cellulare_consenso;fax_consenso";
                    } else if (aH.D("language").contentEquals("2")) {
                        string = "fecha;c\u00f3digo postal;ciudad;direcci\u00f3n;g\u00e9nero;nombre;apellido;e-mail;tel1;tel2;tel3;m\u00f3vil;fax;web;comentario;actividad;vivienda;edad media;grupo \u00e9tnico;tel1_prospecci\u00f3n;tel2_prospecci\u00f3n;tel3_prospecci\u00f3n;m\u00f3vil_prospecci\u00f3n;fax_prospecci\u00f3n";
                    } else if (aH.D("language").contentEquals("0")) {
                        string = "Datum;PLZ;Stadt;Geschlecht;Name;Vorname;E-Mail;Tel1;Tel2;Tel3;Handy;Fax;Webseite;Kommentar;Unterkunft;Durchschnittsalter;ethnischen Gruppe;Tel1_Marketing;Tel2_Marketing;Tel3_Marketing;Handy_Marketing;Fax_Marketing";
                    }
                } else if (GUI.D().contentEquals("IQUALIF Switzerland White") && bn.Q("detailcapture").contentEquals("1")) {
                    if (aH.D("language").contentEquals("3")) {
                        string = "date;code postal;ville;adresse;genre;nom;prenom;tel1;tel2;tel3;mobile;fax;mail;habitat;age moyen;ethnie;tel1_prospection;tel2_prospection;tel3_prospection;mobile_prospection;fax_prospection";
                    } else if (aH.D("language").contentEquals("1")) {
                        string = "date;zip;city;street;gender;last name;first name;tel1;tel2;tel3;mobile;fax;mail;housing;average age;ethnic group;tel1_marketing;tel2_marketing;tel3_marketing;mobile_marketing;fax_marketing";
                    } else if (aH.D("language").contentEquals("4")) {
                        string = "data;codice postale;citt\u00e0;indirizzo;genere;cognome;nome;e-mail;tel1;tel2;tel3;cellulare;fax;sito;commenti;habitat;et\u00e0 media;gruppo etnico;tel1_consenso;tel2_consenso;tel3_consenso;cellulare_consenso;fax_consenso";
                    } else if (aH.D("language").contentEquals("2")) {
                        string = "fecha;c\u00f3digo postal;ciudad;direcci\u00f3n;g\u00e9nero;nombre;apellido;e-mail;tel1;tel2;tel3;m\u00f3vil;fax;web;comentario;actividad;vivienda;edad media;grupo \u00e9tnico;tel1_prospecci\u00f3n;tel2_prospecci\u00f3n;tel3_prospecci\u00f3n;m\u00f3vil_prospecci\u00f3n;fax_prospecci\u00f3n";
                    } else if (aH.D("language").contentEquals("0")) {
                        string = "Datum;PLZ;Stadt;Geschlecht;Name;Vorname;E-Mail;Tel1;Tel2;Tel3;Handy;Fax;Webseite;Kommentar;Unterkunft;Durchschnittsalter;ethnischen Gruppe;Tel1_Marketing;Tel2_Marketing;Tel3_Marketing;Handy_Marketing;Fax_Marketing";
                    }
                }
            } else {
                string = GUI.D().contentEquals("IQUALIF Auto24 White and Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_ad") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_price") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_description") + ";" + aM.G("word_comment") + ";" + aM.G("word_type") + ";" + aM.G("word_kilometer") + ";" + aM.G("word_gearbox") + ";" + aM.G("word_fuel") + ";" + aM.G("word_door") + ";" + aM.G("word_power") + ";" + aM.G("word_date") + "2;" + aM.G("word_color") + ";" + aM.G("word_wheel") + ";" + aM.G("word_color") + "2;" + aM.G("word_date") + "3;" + aM.G("word_price") + "2;" + aM.G("word_consumption") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : (GUI.D().contentEquals("IQUALIF Bangladesh Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_address") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mail") + ";" + aM.G("word_comment") + ";" + aM.G("word_phone1_marketing_accept") : String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_address") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_phone1_marketing_accept")) : (GUI.D().contentEquals("IQUALIF BCoin White and Yellow") ? (aH.D("capturebcoinminprice").contentEquals("1") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_region") + ";" + aM.G("word_department") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_ad") + ";" + aM.G("word_description") + ";" + aM.G("word_price") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_brand") + ";" + aM.G("word_model") + ";" + aM.G("word_year") + ";" + aM.G("word_kilometer") + ";" + aM.G("word_fuel") + ";" + aM.G("word_gearbox") + ";" + aM.G("word_price") + aM.G("word_minimum") + ";" + aM.G("word_difference") + ";" + aM.G("word_url") + aM.G("word_minimum") + ";" + aM.G("word_url") + "2;" + aM.G("word_power") + ";Finition" + ";" + aM.G("word_url") + aM.G("word_minimum") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") : String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_region") + ";" + aM.G("word_department") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_ad") + ";" + aM.G("word_description") + ";" + aM.G("word_price") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_brand") + ";" + aM.G("word_model") + ";" + aM.G("word_year") + ";" + aM.G("word_kilometer") + ";" + aM.G("word_fuel") + ";" + aM.G("word_gearbox") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept")) : (GUI.D().contentEquals("IQUALIF Belgium White") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_gender") + ";" + aM.G("word_name") + ";" + aM.G("word_forename") + ";" + aM.G("word_phone1") + ";" + aM.G("word_housing") + ";" + aM.G("word_average_age") + ";" + aM.G("word_ethnic_group") + ";" + aM.G("word_latitude") + ";" + aM.G("word_longitude") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Canada 41 White") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_province") + ";" + aM.G("word_postalcode") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_gender") + ";" + aM.G("word_lastname") + ";" + aM.G("word_firstname") + ";" + aM.G("word_phone1") + ";" + aM.G("word_housing") + ";" + aM.G("word_average_age") + ";" + aM.G("word_ethnic_group") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Canada White") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_postalcode") + ";" + aM.G("word_province") + ";" + aM.G("word_address") + ";" + aM.G("word_gender") + ";" + aM.G("word_lastname") + ";" + aM.G("word_firstname") + ";" + aM.G("word_phone1") + ";" + aM.G("word_housing") + ";" + aM.G("word_average_age") + ";" + aM.G("word_ethnic_group") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Canada Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_postalcode") + ";" + aM.G("word_province") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Germany White") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_gender") + ";" + aM.G("word_name") + ";" + aM.G("word_forename") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_housing") + ";" + aM.G("word_average_age") + ";" + aM.G("word_ethnic_group") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : (GUI.D().contentEquals("IQUALIF Germany Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + "1;" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_fax") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_latitude") + ";" + aM.G("word_longitude") + ";" + aM.G("word_category") + "2;" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : (GUI.D().contentEquals("IQUALIF Germany GS Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_latitude") + ";" + aM.G("word_longitude") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Immo24 White and Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_ad") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_price") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_description") + ";" + aM.G("word_comment") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : (GUI.D().contentEquals("IQUALIF Italy Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_region") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_latitude") + ";" + aM.G("word_longitude") + ";" + aM.G("word_comment") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_region") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_latitude") + ";" + aM.G("word_longitude") + ";" + aM.G("word_comment") + ";" + aM.G("word_phone1_marketing_accept")) : (GUI.D().contentEquals("IQUALIF Morocco White") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_city") + ";" + aM.G("word_address") + ";" + aM.G("word_gender") + ";" + aM.G("word_name") + ";" + aM.G("word_forename") + ";" + aM.G("word_phone1") + ";" + aM.G("word_housing") + ";" + aM.G("word_average_age") + ";" + aM.G("word_ethnic_group") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Netherlands Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow") ? String.valueOf(aM.G("word_date")) + "1;" + aM.G("word_url") + ";" + aM.G("word_category") + "1;" + aM.G("word_address") + "1;" + aM.G("word_ad") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mail") + ";" + aM.G("word_description") + ";" + aM.G("word_id") + ";" + aM.G("word_views") + ";" + aM.G("word_date") + "2;" + aM.G("word_pseudonym") + ";" + aM.G("word_price") + ";" + aM.G("word_name") + ";" + aM.G("word_category") + "2;" + aM.G("word_address") + "2;" + aM.G("word_comment") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_ad") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_name") + ";" + aM.G("word_price") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_reference") + ";" + aM.G("word_comment") + ";" + aM.G("word_date") + "2;" + aM.G("word_date") + "3;" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : (GUI.D().contentEquals("IQUALIF Philippines Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_phone1") + "2;" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_about") + ";" + aM.G("word_services") + ";" + aM.G("word_tags") + ";" + aM.G("word_longitude") + ";" + aM.G("word_latitude") + ";" + aM.G("word_phone1_marketing_accept") : String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + "1;" + aM.G("word_region") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_category") + "2;" + aM.G("word_phone1_marketing_accept")) : (GUI.D().contentEquals("IQUALIF Poland Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF Spain Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_province") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_latitude") + ";" + aM.G("word_longitude") + ";" + aM.G("word_phone1_marketing_accept") : String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_province") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_phone1_marketing_accept")) : (GUI.D().contentEquals("IQUALIF Saudi Arabia Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_region") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_comment") + ";" + aM.G("word_latitude") + ";" + aM.G("word_longitude") + ";" + aM.G("word_address") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : (GUI.D().contentEquals("IQUALIF Singapore Yellow") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_address") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_site") + ";" + aM.G("word_mail") + ";" + aM.G("word_longitude") + ";" + aM.G("word_latitude") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contentEquals("IQUALIF United States White") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_gender") + ";" + aM.G("word_name") + ";" + aM.G("word_forename") + ";" + aM.G("word_phone1") + ";" + aM.G("word_housing") + ";" + aM.G("word_average_age") + ";" + aM.G("word_ethnic_group") + ";" + aM.G("word_phone1_marketing_accept") : (GUI.D().contains("White and Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_price") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_price") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept")) : (GUI.D().contains("White") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_gender") + ";" + aM.G("word_name") + ";" + aM.G("word_forename") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_housing") + ";" + aM.G("word_average_age") + ";" + aM.G("word_ethnic_group") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(aM.G("word_date")) + ";" + aM.G("word_url") + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept") : String.valueOf(aM.G("word_date")) + ";" + aM.G("word_category") + ";" + aM.G("word_zip") + ";" + aM.G("word_city") + ";" + aM.G("word_street") + ";" + aM.G("word_name") + ";" + aM.G("word_phone1") + ";" + aM.G("word_mobile") + ";" + aM.G("word_fax") + ";" + aM.G("word_phone1_marketing_accept") + ";" + aM.G("word_mobile1_marketing_accept") + ";" + aM.G("word_fax_marketing_accept")))))))))))))))))))))))));
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static void a(String string, String string2, JLabel jLabel) {
        try {
            int n2 = 500;
            if (string.contains("xlsx") || string.contains("xls")) {
                n2 = 1500;
            }
            ArrayList<String[]> arrayList = new ArrayList<String[]>();
            Object object = Integer.valueOf(bn.Q("delete_duplicate"));
            Object object2 = Integer.valueOf(bn.Q("housingExport"));
            object2 = object2.intValue() == 0 ? "" : (object2.intValue() == 1 ? aM.G("file_housing_ind") : aM.G("file_housing_col"));
            object = object.intValue() == 0 ? SQL.a(String.valueOf(GUI.A()) + bi.am()) : SQL.a(String.valueOf(GUI.A()) + bi.ak());
            Object object3 = bi.ah();
            arrayList.add(object3.replace("\n", "").split(";"));
            if (string.contains("xlsx")) {
                a.a(string, arrayList);
            } else if (string.contains("xls")) {
                a.a(string, arrayList);
            } else {
                a.a(string, String.valueOf(object3.replace(";", string2)) + "\n", "WINDOWS-1252");
            }
            arrayList.clear();
            object3 = "SELECT COUNT(id) as id FROM " + bi.ay();
            String string3 = bi.ag();
            if (string3.contentEquals("")) {
                if (!object2.contentEquals("")) {
                    object3 = String.valueOf(object3) + " WHERE housing=?";
                }
            } else {
                object3 = !object2.contentEquals("") ? String.valueOf(object3) + " WHERE housing=? AND " + string3 : String.valueOf(object3) + " WHERE " + string3;
            }
            object3 = object.prepareStatement((String)object3);
            if (!object2.contentEquals("")) {
                object3.setString(1, (String)object2);
            }
            ResultSet resultSet = object3.executeQuery();
            int n3 = 0;
            if (resultSet.next()) {
                n3 = Integer.valueOf(resultSet.getString("id"));
            }
            resultSet.close();
            object3.close();
            object3 = "UPDATE " + bi.ay() + " SET locked = '0';";
            object.createStatement().execute((String)object3);
            DecimalFormat decimalFormat = new DecimalFormat("###");
            int n4 = 0;
            while (n4 < n3) {
                object3 = "SELECT * FROM " + bi.ay() + " WHERE locked='0' LIMIT " + n2;
                if (string3.contentEquals("")) {
                    if (!object2.contentEquals("")) {
                        object3 = "SELECT * FROM " + bi.ay() + " WHERE locked='0' AND housing='" + (String)object2 + "' LIMIT " + n2;
                    }
                } else {
                    object3 = !object2.contentEquals("") ? "SELECT * FROM " + bi.ay() + " WHERE locked='0' AND housing='" + (String)object2 + "' AND " + string3 + " LIMIT " + n2 : "SELECT * FROM " + bi.ay() + " WHERE locked='0' AND " + string3 + " LIMIT " + n2;
                }
                resultSet = object.createStatement().executeQuery((String)object3);
                if (jLabel != null) {
                    jLabel.setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step0").toLowerCase().trim()) + " " + decimalFormat.format((float)n4 / (float)n3 * 100.0f) + " %<br /><br /></html>");
                }
                String string4 = "";
                String string5 = "";
                while (resultSet.next()) {
                    if (GUI.h()) {
                        object3 = "";
                        Object object4 = GSetting.b();
                        Iterator iterator = object4.iterator();
                        while (iterator.hasNext()) {
                            object4 = (String)iterator.next();
                            String string6 = bn.Q(String.valueOf(object4) + "Column");
                            Integer n5 = GUI.a(string6, (String)object4);
                            if (n5 <= 0) continue;
                            if (bn.Q("detailcapture").contentEquals("1")) {
                                object4 = object4.substring(0, object4.length() - 6);
                            }
                            if (object4.contentEquals("category")) {
                                object4 = "company";
                            }
                            if (object4.contentEquals("phone")) {
                                object4 = "phone1";
                            }
                            if (object4.contentEquals("mobile")) {
                                object4 = "mobile1";
                            }
                            if (object4.toLowerCase().endsWith("coldcalling")) {
                                object4 = object4.replace("ColdCalling", "_marketing_accept").replace("coldcalling", "_marketing_accept");
                            }
                            if (object4.contentEquals("phone_marketing_accept")) {
                                object4 = "phone1_marketing_accept";
                            }
                            if (object4.contentEquals("mobile_marketing_accept")) {
                                object4 = "mobile1_marketing_accept";
                            }
                            if (string6.contentEquals("housing")) {
                                object4 = "housing";
                            }
                            object3 = resultSet.getString((String)object4) == null ? String.valueOf(object3) + ";" : String.valueOf(object3) + ";" + resultSet.getString((String)object4);
                        }
                        object3 = String.valueOf(resultSet.getString("created_on")) + (String)object3 + "\n";
                    } else {
                        object3 = GUI.D().contentEquals("IQUALIF Dominica White") || GUI.D().contentEquals("IQUALIF Lucia White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Denmark Yellow") || GUI.D().contentEquals("IQUALIF Sweden Yellow") || GUI.D().contentEquals("IQUALIF Finland Yellow") || GUI.D().contentEquals("IQUALIF Norway Yellow") || GUI.D().contentEquals("IQUALIF Switzerland Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Australia Yellow") || GUI.D().contentEquals("IQUALIF TAdvisor Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF AConcession Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + "\n" : (GUI.D().contentEquals("IQUALIF Africa Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Anbis White and Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special2") + ";" + resultSet.getString("company") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Auto24 White and Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special1") + ";" + resultSet.getString("company") + ";" + resultSet.getString("name") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("special7") + ";" + resultSet.getString("special8") + ";" + resultSet.getString("special9") + ";" + resultSet.getString("special10") + ";" + resultSet.getString("special11") + ";" + resultSet.getString("special12") + ";" + resultSet.getString("special13") + ";" + resultSet.getString("special14") + ";" + resultSet.getString("special15") + ";" + resultSet.getString("special16") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Bangladesh Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special1") + ";" + resultSet.getString("company") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone1_marketing_accept") + "\n") : (GUI.D().contentEquals("IQUALIF BCoin White and Yellow") ? (aH.D("capturebcoinminprice").contentEquals("1") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("site") + ";" + resultSet.getString("company") + ";" + resultSet.getString("special8") + ";" + resultSet.getString("special9") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("name") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("special7") + ";" + resultSet.getString("special11") + ";" + resultSet.getString("special12") + ";" + resultSet.getString("special13") + ";" + resultSet.getString("special14") + ";" + resultSet.getString("special15") + ";" + resultSet.getString("special16") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + "\n" : String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("site") + ";" + resultSet.getString("company") + ";" + resultSet.getString("special8") + ";" + resultSet.getString("special9") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("name") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("special7") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + "\n") : (GUI.D().contentEquals("IQUALIF Belgium White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Canada 41 White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special1") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Canada White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Canada Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Dliveroo Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special6") + ";" + resultSet.getString("company") + ";" + resultSet.getString("name") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special5") + "\n" : (GUI.D().contentEquals("IQUALIF France White") && bn.Q("professionnalMark").contentEquals("1") || GUI.D().contentEquals("IQUALIF Luxembourg White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Germany White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Germany Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Germany GS Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Immo24 White and Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special1") + ";" + resultSet.getString("company") + ";" + resultSet.getString("name") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Italy Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("phone1_marketing_accept") + "\n") : (GUI.D().contains(" Kapa ") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special8") + ";" + resultSet.getString("special9") + ";" + resultSet.getString("name") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("special7") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Morocco White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Netherlands Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special4") + ";" + resultSet.getString("company") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("special10") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("special7") + ";" + resultSet.getString("special8") + ";" + resultSet.getString("special9") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special1") + ";" + resultSet.getString("company") + ";" + resultSet.getString("name") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Peru Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Philippines Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special5") + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("company") + ";" + resultSet.getString("phone1_marketing_accept") + "\n") : (GUI.D().contentEquals("IQUALIF Poland Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Portugal White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Saudi Arabia Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Sbito White and Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special1") + ";" + resultSet.getString("company") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("special7") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("special8") + ";" + resultSet.getString("special9") + ";" + resultSet.getString("special10") + ";" + resultSet.getString("special11") + ";" + resultSet.getString("special12") + ";" + resultSet.getString("special13") + ";" + resultSet.getString("special14") + ";" + resultSet.getString("special15") + ";" + resultSet.getString("special16") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Spain Yellow") ? (bn.Q("detailcapture").contentEquals("1") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1_marketing_accept") + "\n") : (GUI.D().contentEquals("IQUALIF Singapore Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("company") + ";" + resultSet.getString("zip") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("site") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("street") + ";" + resultSet.getString("city") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Switzerland White") && bn.Q("detailcapture").contentEquals("1") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Tuti White and Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special2") + ";" + resultSet.getString("company") + ";" + resultSet.getString("name") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("city") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF United States White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + "\n" : (GUI.D().contentEquals("IQUALIF Viva White and Yellow") || GUI.D().contentEquals("IQUALIF Viva Yellow") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("special8") + ";" + resultSet.getString("special9") + ";" + resultSet.getString("name") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("special1") + ";" + resultSet.getString("special2") + ";" + resultSet.getString("special3") + ";" + resultSet.getString("special4") + ";" + resultSet.getString("special5") + ";" + resultSet.getString("special6") + ";" + resultSet.getString("special7") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : (GUI.D().contains(" White") ? String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("title") + ";" + resultSet.getString("name") + ";" + resultSet.getString("surname") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("housing") + ";" + resultSet.getString("age") + ";" + resultSet.getString("nationality") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n" : String.valueOf(resultSet.getString("created_on")) + ";" + resultSet.getString("zip") + ";" + resultSet.getString("city") + ";" + resultSet.getString("street") + ";" + resultSet.getString("name") + ";" + resultSet.getString("mail") + ";" + resultSet.getString("phone1") + ";" + resultSet.getString("phone2") + ";" + resultSet.getString("phone3") + ";" + resultSet.getString("mobile1") + ";" + resultSet.getString("fax") + ";" + resultSet.getString("site") + ";" + resultSet.getString("comment") + ";" + resultSet.getString("company") + ";" + resultSet.getString("phone1_marketing_accept") + ";" + resultSet.getString("phone2_marketing_accept") + ";" + resultSet.getString("phone3_marketing_accept") + ";" + resultSet.getString("mobile1_marketing_accept") + ";" + resultSet.getString("fax_marketing_accept") + "\n")))))))))))))))))))))))))))))))))))));
                    }
                    string4 = String.valueOf(string4) + (String)object3;
                    string5 = String.valueOf(string5) + resultSet.getString("id") + ",";
                    arrayList.add(object3.replace("\n", "").split(";"));
                }
                string5 = string5.substring(0, string5.length() - 1);
                object3 = "UPDATE " + bi.ay() + " SET locked = '1' WHERE id IN (" + string5 + ")";
                object.createStatement().execute((String)object3);
                if (string.contains("xlsx")) {
                    a.a(string, arrayList);
                } else if (string.contains("xls")) {
                    a.a(string, arrayList);
                } else {
                    a.a(string, string4.replace(";", string2), "WINDOWS-1252");
                }
                arrayList.clear();
                resultSet.close();
                n4 += n2;
            }
            object.close();
            return;
        }
        catch (Throwable throwable) {
            if (jLabel != null) {
                jLabel.setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step0").toLowerCase().trim()) + "<br /><br /></html>");
            }
            return;
        }
    }

    private static String f(bb bb2) {
        String string;
        string = "false";
        try {
            Thread.sleep(Integer.valueOf(bn.Q("connection_wait")).intValue());
            n.a(bb2);
            GUI.e(bb2);
            string = bi.i(bb2);
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static void a(String string, List list) {
        bb bb2 = null;
        boolean bl2 = true;
        try {
            int n2 = 0;
            while (n2 < list.size()) {
                bb2 = bi.a(string, (String)((HashMap)list.get(n2)).get("streetid"), (HashMap)list.get(n2));
                bl2 = false;
                ++n2;
            }
            if (!bl2) {
                bi.f(bb2);
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    private static void b(String string, List list) {
        try {
            Collections.shuffle(list);
            int n2 = 0;
            while (n2 < list.size()) {
                bb bb2 = bi.a(string, (String)((HashMap)list.get(n2)).get("streetid"), (HashMap)list.get(n2));
                MRThreadPool.f(bb2);
                ++n2;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void c(String string, List list) {
        try {
            Collections.shuffle(list);
            int n2 = 0;
            while (n2 < list.size()) {
                bb bb2 = bi.a(string, (String)((HashMap)list.get(n2)).get("streetid"), (HashMap)list.get(n2));
                GUI.a().a().getQueue().add(bb2);
                ++n2;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static boolean a(List arrstring, HashMap hashMap, List list, String string) {
        try {
            JLabel jLabel = (JLabel)hashMap.get("text0");
            if (hashMap != null) {
                jLabel.setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step").toLowerCase().trim()) + " 1 / 4<br /><br /></html>");
            }
            if (GUI.F().contentEquals("auto")) {
                if (GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow")) {
                    String string2 = "";
                    bi.a((JTable)GUI.c().get("zipcity"), list, string2, (List)arrstring, GUI.F(), hashMap);
                }
            } else if (GUI.F().contentEquals("half")) {
                String string3 = "";
                if (string.split("\u00a4").length > 2) {
                    string3 = string.split("\u00a4")[2];
                }
                bi.a((JTable)GUI.c().get("zipcity"), list, string3, (List)arrstring, GUI.F(), hashMap);
            } else if (GUI.F().contentEquals("manual")) {
                arrstring.add(string);
                java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + o);
                arrstring = new String[][]{new String[0]};
                SQL.a(connection, "table_t", arrstring, "");
                bi.c(string, "\u00a4", o);
                connection.close();
            } else if (GUI.F().contentEquals("browser")) {
                java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + o);
                arrstring = new String[][]{new String[0]};
                SQL.a(connection, "table_t", arrstring, "");
                bi.c("zip\u00a4city\u00a4street", "\u00a4", o);
                connection.close();
            }
            if (hashMap != null) {
                jLabel.setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step").toLowerCase().trim()) + " 1 / 4 : 100 %<br /><br /></html>");
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String g(bb bb2) {
        String string = "false";
        try {
            String string2 = bb2.O();
            String[][] arrstring = bb2.P();
            String string3 = bb2.getError();
            Integer n2 = Integer.valueOf(bb2.X());
            String string4 = bb2.Y();
            if (string2.contentEquals("firstpage")) {
                string2 = aL;
            } else if (string2.contentEquals("nextpage")) {
                string2 = aM;
            } else {
                if (!string2.contentEquals("detailpage")) return string;
                string2 = aN;
            }
            Integer n3 = 10;
            if (arrstring == null) {
                arrstring = "0";
            }
            if (arrstring.contentEquals("0")) {
                if (GUI.D().contains("IQUALIF France") ? string3.contains("HTTP response code: 500") : GUI.D().contains("IQUALIF Luxembourg") && string3.contains("FileNotFoundException")) {
                    return "true";
                }
            } else {
                n3 = 35;
            }
            if (n2 > 5) {
                if (string2.contentEquals(aM)) {
                    a.DeleteFile(String.valueOf(GUI.w()) + string4);
                } else {
                    a.DeleteFile(String.valueOf(GUI.w()) + string4);
                }
                if (n2 <= n3) return String.valueOf(aM.G("dlg_man_search_continue9")) + " " + (n2 - 5) + "/" + (n3 - 5);
                boolean bl2 = a.a();
                if (bl2) {
                    if (!arrstring.contentEquals("0")) return "true";
                    return "ipblacklist";
                }
                String[][] arrstring2 = new String[][]{{"error", "0"}};
                arrstring = new String[][]{{"locked", "1"}, {"id", string4}};
                SQL.a(GUI.a(), string2, arrstring2, arrstring, "AND");
                return "internetproblem";
            }
            if (!GUI.D().contentEquals("IQUALIF France Yellow")) return string;
            if (bn.Q("lastSearchHistory").toLowerCase().contentEquals("browser")) return string;
            if (bb2.getHtml().toLowerCase().contains("aucun r\u00e9sultat \u00e0")) return "true";
            if (!bb2.getHtml().toLowerCase().contains("aucun r&eacute;sultat &agrave;")) return string;
            return "true";
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static boolean d(bb bb2) {
        try {
            if (GUI.D().contentEquals("IQUALIF France White")) {
                if (bb2.getHtml().toLowerCase().contains("vous utilisez une version obsol")) {
                    bb2.H("");
                }
                if (bb2.getHtml().toLowerCase().contains("you have been blocked") || bb2.getHtml().contains("")) {
                    if (!Proxys.isEnabled()) {
                        Proxys.a(true);
                    }
                    if (!GUI.B().contentEquals("Multi") && GUI.d() == 1 && GUI.b() != 3) {
                        aH.b(GUI.D(), "multithread_number", "2");
                    }
                }
            } else if (GUI.D().contentEquals("IQUALIF France Yellow")) {
                if (bb2.getHtml().toLowerCase().contains("vous utilisez une version obsol")) {
                    bb2.H("");
                }
                if (bb2.getHtml().toLowerCase().contains("you have been blocked") || bb2.getHtml().contains("")) {
                    if (!Proxys.isEnabled()) {
                        Proxys.a(true);
                    }
                    if (!GUI.B().contentEquals("Multi") && GUI.d() == 1 && GUI.b() != 3) {
                        aH.b(GUI.D(), "multithread_number", "2");
                    }
                }
            }
        }
        catch (Throwable throwable) {}
        return true;
    }

    private static boolean e(bb object) {
        boolean bl2;
        bl2 = true;
        try {
            String string = object.getHtml();
            Object object2 = object.O();
            object = object.ac();
            Object object3 = "pageError";
            bn.Q("parseType");
            Object object4 = bn.Q("parse" + object3.substring(0, 1).toUpperCase() + object3.substring(1) + "Type");
            String string2 = bn.Q(String.valueOf(object3.substring(0, 1).toLowerCase()) + object3.substring(1) + "ClassType");
            String string3 = bn.Q("parse" + object3.substring(0, 1).toUpperCase() + object3.substring(1));
            String string4 = bn.Q(String.valueOf(object3.substring(0, 1).toLowerCase()) + object3.substring(1) + "Class");
            if (object2.contentEquals("detailpage")) {
                object4 = bn.Q("parse" + object3.substring(0, 1).toUpperCase() + object3.substring(1) + "TypeDetail");
                string2 = bn.Q(String.valueOf(object3.substring(0, 1).toLowerCase()) + object3.substring(1) + "DetailClassType");
                string3 = bn.Q("parse" + object3.substring(0, 1).toUpperCase() + object3.substring(1) + "Detail");
                string4 = bn.Q(String.valueOf(object3.substring(0, 1).toLowerCase()) + object3.substring(1) + "DetailClass");
            }
            if (object4 == null) {
                object4 = bn.Q("parseType");
            }
            if (string4 == null) {
                string4 = bn.Q("pageErrorSearchClass");
            }
            if (string4.contentEquals("")) {
                string4 = bn.Q("pageErrorSearchClass");
            }
            if (string3 == null) {
                string3 = bn.Q("parseContact");
            }
            if (string2 == null) {
                string2 = "text";
            }
            object3 = bn.Q("parsePageError");
            String string5 = bn.Q("pageErrorSearchString");
            if (object2.contentEquals("detailpage")) {
                if (object4 == null) {
                    string4 = bn.Q("contactDetailClass");
                }
                if (object4.contentEquals("")) {
                    string4 = bn.Q("contactDetailClass");
                }
                if (string3 == null) {
                    bn.Q("parseContactDetail");
                }
                object3 = bn.Q("parsePageErrorDetail");
                string5 = bn.Q("pageErrorSearchStringDetail");
            }
            if (object4.contentEquals("0") || object4.contentEquals("")) {
                object4 = "html";
            }
            if (object4.contentEquals("1")) {
                object4 = "text";
            }
            if (string2.contentEquals("0")) {
                string2 = "html";
            }
            string2.contentEquals("1");
            if (object4.contentEquals("text")) {
                object2 = Pattern.compile((String)object3);
                object2 = object2.matcher(string);
                while (object2.find()) {
                    bl2 = false;
                }
            } else if (object4.contentEquals("html")) {
                object2 = Jsoup.parse((String)string, (String)"UTF-8");
                if ((object2 = object2.select(string4)).isEmpty()) {
                    object2 = Jsoup.parse((String)string, (String)"UTF-8", (Parser)Parser.xmlParser());
                    object2 = object2.select(string4);
                }
                if (!object2.isEmpty()) {
                    object3 = object2.iterator();
                    while (object3.hasNext()) {
                        object2 = (Element)object3.next();
                        object2 = object2.text();
                        object4 = Pattern.compile(string5);
                        object2 = object4.matcher((CharSequence)object2);
                        if (!object2.find()) continue;
                        bl2 = false;
                    }
                }
                if (GUI.D().contentEquals("IQUALIF Canada White")) {
                    if (object.startsWith("St ") || object.startsWith("Ste ") || object.startsWith("Saint ") || object.startsWith("Sainte ") || object.startsWith("St-") || object.startsWith("Ste-") || object.startsWith("Saint-") || object.startsWith("Sainte-")) {
                        bl2 = !(string.toLowerCase().contains(object.toLowerCase()) || string.toLowerCase().contains(object.toLowerCase().replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("ste-", "ste ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("ste-", "sainte ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("ste-", "sainte-")) || string.toLowerCase().contains(object.toLowerCase().replace("ste ", "ste-").replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("ste ", "sainte ")) || string.toLowerCase().contains(object.toLowerCase().replace("ste ", "sainte-").replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("st-", "st ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("st-", "saint ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("st-", "saint-")) || string.toLowerCase().contains(object.toLowerCase().replace("st ", "st-").replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("st ", "saint ")) || string.toLowerCase().contains(object.toLowerCase().replace("st ", "saint-").replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("sainte-", "sainte ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("sainte-", "ste ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("sainte-", "ste-")) || string.toLowerCase().contains(object.toLowerCase().replace("sainte ", "sainte-").replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("sainte ", "ste ")) || string.toLowerCase().contains(object.toLowerCase().replace("sainte ", "ste-").replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("saint-", "saint ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("saint-", "st ").replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace("saint-", "st-")) || string.toLowerCase().contains(object.toLowerCase().replace("saint ", "saint-").replace(" ", "-")) || string.toLowerCase().contains(object.toLowerCase().replace("saint ", "st ")) || string.toLowerCase().contains(object.toLowerCase().replace("saint ", "st-").replace(" ", "-")));
                    } else if (object.contains(" ") || object.contains("'") || object.contains("-")) {
                        bl2 = !(string.toLowerCase().contains(object.toLowerCase()) || string.toLowerCase().contains(object.toLowerCase().replace("-", " ")) || string.toLowerCase().contains(object.toLowerCase().replace(" ", "-")));
                    } else if (!string.toLowerCase().contains(object.toLowerCase())) {
                        bl2 = true;
                    }
                }
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static String a(bb object, String string) {
        String string2;
        block18 : {
            string2 = "";
            try {
                Object object2;
                Object object3;
                boolean bl2 = false;
                boolean bl3 = false;
                string2 = object.getUrl();
                if (!GUI.D().contentEquals("IQUALIF Canada 41 White") || !string.contentEquals("firstpage")) break block18;
                string = "";
                Object object4 = "div.inp";
                String string3 = "(?is)input_text_q.*?value=\"(.*?)\"";
                object4 = (object = Jsoup.parse((String)object.getHtml())).select((String)object4);
                if (!object4.isEmpty()) {
                    object3 = object4.iterator();
                    block2 : while (object3.hasNext()) {
                        object4 = (Element)object3.next();
                        if (bl2) break;
                        object2 = Pattern.compile(string3);
                        object4 = object2.matcher(object4.html());
                        while (object4.find()) {
                            if (bl2) continue block2;
                            if (object4.group(1) != null) {
                                string = object4.group(1);
                            } else if (object4.groupCount() > 1 && object4.group(2) != null) {
                                string = object4.group(2);
                            } else if (object4.groupCount() > 2 && object4.group(3) != null) {
                                string = object4.group(3);
                            }
                            bl2 = true;
                        }
                    }
                }
                if (string.contentEquals("")) break block18;
                object4 = "div.left_list_item";
                object3 = "(?is)href=\"(.*?)\"";
                object2 = "https://legacy.411.ca";
                if ((object4 = object.select((String)object4)).isEmpty()) break block18;
                Iterator iterator = object4.iterator();
                block4 : while (iterator.hasNext()) {
                    object = (Element)iterator.next();
                    if (!bl3) {
                        if (!object.html().toLowerCase().contains(string.toLowerCase())) continue;
                        object4 = Pattern.compile((String)object3);
                        object = object4.matcher(object.html());
                        while (object.find()) {
                            if (bl3) continue block4;
                            if (object.group(1) != null) {
                                string2 = object.group(1);
                            } else if (object.groupCount() > 1 && object.group(2) != null) {
                                string2 = object.group(2);
                            } else if (object.groupCount() > 2 && object.group(3) != null) {
                                string2 = object.group(3);
                            }
                            string2 = String.valueOf(object2) + string2;
                            string2 = a.r(string2);
                            bl3 = true;
                        }
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable) {}
        }
        return string2;
    }

    private static boolean k(String string) {
        boolean bl2;
        block7 : {
            bl2 = false;
            try {
                Object object = bn.Q("parseType");
                String string2 = bn.Q("parseHasNextPage");
                String string3 = bn.Q("hasNextPageClass");
                String string4 = bn.Q("hasNextPageString");
                if (object.contentEquals("text")) {
                    object = Pattern.compile(string2);
                    object = object.matcher(string);
                    while (object.find()) {
                        bl2 = true;
                    }
                    break block7;
                }
                object = Jsoup.parse((String)string);
                if ((object = object.select(string3)).isEmpty()) {
                    object = Jsoup.parse((String)string, (String)"UTF-8", (Parser)Parser.xmlParser());
                    object = object.select(string3);
                }
                if (object.isEmpty()) break block7;
                object = object.iterator();
                while (object.hasNext()) {
                    string = (Element)object.next();
                    string2 = string.text();
                    if (GUI.D().contentEquals("IQUALIF Spain Yellow")) {
                        string2 = string.html();
                    }
                    if (!string2.matches(string4)) continue;
                    bl2 = true;
                    break;
                }
            }
            catch (Throwable throwable) {}
        }
        return bl2;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static LinkedHashMap a(GUI serializable, String string, List list, GUI gUI, int n2, Integer n3, Integer n4) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        try {
            int n5;
            String string2 = "p";
            String string3 = string;
            String string4 = GUI.C();
            ArrayList<String> arrayList = new ArrayList<String>();
            if (!(string.contentEquals("department") || string.contentEquals("zipcity") || string.contentEquals("street"))) {
                serializable = linkedHashMap;
                return serializable;
            }
            String string5 = "";
            if (string.contentEquals("department")) {
                string5 = "ini";
                list.add("0\u00a40");
            } else if (string.contentEquals("zipcity")) {
                string5 = "department";
            } else if (string.contentEquals("street")) {
                string5 = "zipcity";
            }
            string = bn.Q("custom_list_use");
            String string6 = bn.Q("custom_list_use_act");
            GUI.a(string5, String.valueOf(a.n(aM.G("dlg_list_txt1").toLowerCase().trim())) + " 1 %", String.valueOf(GUI.y()) + "progress_bar.gif");
            DecimalFormat decimalFormat = new DecimalFormat("###");
            int n6 = 0;
            while (n6 < list.size()) {
                String string7;
                if (serializable.a() != n2) {
                    linkedHashMap.clear();
                    serializable = linkedHashMap;
                    return serializable;
                }
                if ((float)n6 / (float)list.size() * 100.0f > 1.0f) {
                    GUI.a(string5, String.valueOf(a.n(aM.G("dlg_list_txt1").toLowerCase().trim())) + " " + decimalFormat.format((float)n6 / (float)list.size() * 100.0f) + " %", String.valueOf(GUI.y()) + "progress_bar.gif");
                }
                if (n6 > n3 - n4) {
                    GUI.d(String.valueOf(aM.G("dlg_list_txt2")) + n3, aM.G("dlg_start"));
                    GUI.a(string5, String.valueOf(a.n(aM.G("dlg_list_txt1").toLowerCase().trim())) + " 99 %", String.valueOf(GUI.y()) + "progress_bar.gif");
                    break;
                }
                n5 = 0;
                String string8 = "";
                int n7 = n6;
                while (n7 < list.size() && n7 < n6 + n4) {
                    string7 = (String)list.get(n7);
                    if (string7 != null) {
                        String string9 = ((String)list.get(n7)).split("\u00a4", -1)[0];
                        string8 = String.valueOf(string8) + string9 + "\u00a4";
                        n5 = 1;
                    }
                    ++n7;
                }
                if (n5 != 0) {
                    if (string8.length() > 1 && string8.endsWith("\u00a4")) {
                        string8 = string8.substring(0, string8.length() - 1);
                    }
                    if ((string8 = bi.a(string2, string, string6, string3, string8, string4)).startsWith("<!DOCTYPE HTML PUBLIC")) {
                        if (string8.contains("Internal Server Error")) {
                            GUI.d(aM.G("dlg_list_error5"), aM.G("dlg_start"));
                        } else {
                            GUI.d(aM.G("dlg_list_error6"), aM.G("dlg_start"));
                        }
                        serializable = linkedHashMap;
                        return serializable;
                    }
                    if (string8.contentEquals("")) {
                        GUI.d(aM.G("dlg_list_error7"), aM.G("dlg_start"));
                        serializable = linkedHashMap;
                        return serializable;
                    }
                    if (string8.startsWith("<br /><b>Warning</b>:")) {
                        GUI.d(aM.G("dlg_list_error7"), aM.G("dlg_start"));
                        serializable = linkedHashMap;
                        return serializable;
                    }
                    String[] arrstring = new String[](K.K(), K.J());
                    string7 = new String(arrstring.c(string8), "UTF-8");
                    String[] arrstring2 = string7.split("\u00a4", -1);
                    int n8 = 0;
                    while (n8 < arrstring2.length) {
                        arrstring = arrstring2[n8].split(";", -1);
                        string7 = "";
                        if (arrstring.length == 6) {
                            string7 = String.valueOf(arrstring[0]) + "\u00a4" + arrstring[1] + "\u00a4" + arrstring[2] + "\u00a4" + arrstring[3] + "\u00a4" + arrstring[4] + "\u00a4" + arrstring[5];
                        } else if (arrstring.length == 5) {
                            string7 = String.valueOf(arrstring[0]) + "\u00a4" + arrstring[1] + "\u00a4" + arrstring[2] + "\u00a4" + arrstring[3] + "\u00a4" + arrstring[4] + "\u00a4";
                        } else if (arrstring.length == 4) {
                            string7 = String.valueOf(arrstring[0]) + "\u00a4" + arrstring[1] + "\u00a4" + arrstring[2] + "\u00a4" + arrstring[3] + "\u00a4\u00a4";
                        } else if (arrstring.length == 3) {
                            string7 = String.valueOf(arrstring[0]) + "\u00a4" + arrstring[1] + "\u00a4" + arrstring[2] + "\u00a4\u00a4";
                        } else if (arrstring.length == 2) {
                            string7 = String.valueOf(arrstring[0]) + "\u00a4" + arrstring[1] + "\u00a4\u00a4" + "\u00a4";
                        }
                        arrayList.add(string7);
                        ++n8;
                    }
                }
                n6 += n4.intValue();
            }
            GUI.a(string5, String.valueOf(a.n(aM.G("dlg_list_txt1").toLowerCase().trim())) + " 99 %", String.valueOf(GUI.y()) + "progress_bar.gif");
            a.a(arrayList);
            Collections.sort(arrayList);
            n6 = 0;
            while (n6 < arrayList.size()) {
                n5 = gUI.a();
                if (n5 != n2) {
                    linkedHashMap.clear();
                    serializable = linkedHashMap;
                    return serializable;
                }
                linkedHashMap.put(n6, (String)arrayList.get(n6));
                ++n6;
            }
            if (serializable.a() != n2) {
                linkedHashMap.clear();
                serializable = linkedHashMap;
                return serializable;
            }
        }
        catch (Throwable throwable) {
        }
        catch (Throwable throwable) {
            serializable = throwable;
            throw throwable;
        }
        return linkedHashMap;
    }

    public static HashMap a(String object, String object2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            String string;
            string = String.valueOf(GUI.w()) + "filem" + (String)object2 + ".gif";
            try {
                Thread.sleep(500L);
            }
            catch (Throwable throwable) {}
            byte[] arrby = new byte[1];
            Object object3 = new URL(String.valueOf(object) + "?" + (String)object2);
            if (GUI.D().contentEquals("IQUALIF Tunisia Yellow")) {
                object3 = new URL((String)object);
            }
            if (!GUI.D().contentEquals("IQUALIF Tunisia Yellow")) {
                object2 = "iddiv=2";
            }
            object = (HttpURLConnection)object3.openConnection();
            object.setRequestMethod("POST");
            object.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            object.setRequestProperty("Content-Length", Integer.toString(object2.getBytes().length));
            object.setRequestProperty("Content-Language", "en-US");
            object.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:20.0) Gecko/20100101 Firefox/20.0");
            object.setRequestProperty("X-Requested-With", "XMLHttpRequest");
            object.setUseCaches(false);
            object.setDoInput(true);
            object.setDoOutput(true);
            object3 = new DataOutputStream(object.getOutputStream());
            object3.writeBytes((String)object2);
            object3.flush();
            object3.close();
            object.connect();
            object = new DataInputStream(object.getInputStream());
            object2 = new FileOutputStream(string);
            while (-1 != object.read(arrby, 0, 1)) {
                object2.write(arrby, 0, 1);
            }
            object.close();
            object2.close();
            hashMap.put("page", "");
            hashMap.put("error", "curl_error");
            hashMap.put("info", "curl_getinfo");
            hashMap.put("data_t", "data_t");
        }
        catch (Throwable throwable) {
            hashMap.put("page", "");
            hashMap.put("error", "curl_error");
            hashMap.put("info", "curl_getinfo");
            hashMap.put("data_t", "data_t");
        }
        return hashMap;
    }

    public static HashMap b(String object) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            Object object2;
            object2 = String.valueOf(GUI.w()) + "file.gif";
            try {
                Thread.sleep(500L);
            }
            catch (Throwable throwable) {}
            byte[] arrby = new byte[1];
            object = new URL((String)object);
            object = object.openConnection();
            object.connect();
            object = new DataInputStream(object.getInputStream());
            object2 = new FileOutputStream((String)object2);
            while (-1 != object.read(arrby, 0, 1)) {
                object2.write(arrby, 0, 1);
            }
            object.close();
            object2.close();
            hashMap.put("page", "");
            hashMap.put("error", "curl_error");
            hashMap.put("info", "curl_getinfo");
            hashMap.put("data_t", "data_t");
        }
        catch (Throwable throwable) {
            hashMap.put("page", "");
            hashMap.put("error", "curl_error");
            hashMap.put("info", "curl_getinfo");
            hashMap.put("data_t", "data_t");
        }
        return hashMap;
    }

    private static String a(String object, String string, List list) {
        String string2;
        string2 = object;
        try {
            int n2;
            String string3 = bn.Q("parseMobileDetail");
            String string4 = bn.Q("parseFaxDetail");
            if (!object.contains("@")) {
                object = a.a(string);
                n2 = 0;
                while (n2 < object.size()) {
                    string2 = String.valueOf(string2) + (String)object.get(n2) + ",";
                    ++n2;
                }
                if (string2.length() > 1 && string2.endsWith(",")) {
                    string2 = string2.substring(0, string2.length() - 1);
                }
            }
            object = a.a(string);
            n2 = 0;
            while (n2 < object.size()) {
                Object object2;
                HashMap hashMap;
                string = (String)object.get(n2);
                Object object3 = 0;
                while (object3 < list.size()) {
                    hashMap = (HashMap)list.get((int)object3);
                    if (((String)hashMap.get("numero")).contentEquals("")) {
                        object2 = "";
                        String string5 = "";
                        if (string.matches(string3)) {
                            string5 = "mobile";
                        } else if (string.matches(string4)) {
                            object2 = "fax";
                        }
                        hashMap.put("numero", string);
                        hashMap.put("marketing_accept", aM.G("file_marketing_refuse"));
                        hashMap.put("fax", object2);
                        hashMap.put("mobile", string5);
                        break;
                    }
                    if (object3 + 1 == list.size()) {
                        object2 = "";
                        String string6 = "";
                        if (string.matches(string3)) {
                            string6 = "mobile";
                        } else if (string.matches(string4)) {
                            object2 = "fax";
                        }
                        hashMap = new HashMap();
                        hashMap.put("numero", string);
                        hashMap.put("marketing_accept", aM.G("file_marketing_refuse"));
                        hashMap.put("fax", object2);
                        hashMap.put("mobile", string6);
                        list.add(0, hashMap);
                        break;
                    }
                    ++object3;
                }
                if (list.size() == 0) {
                    object3 = "";
                    hashMap = "";
                    if (string.matches(string3)) {
                        hashMap = "mobile";
                    } else if (string.matches(string4)) {
                        object3 = "fax";
                    }
                    object2 = new HashMap<String, String>();
                    object2.put("numero", string);
                    object2.put("marketing_accept", aM.G("file_marketing_refuse"));
                    object2.put("fax", object3);
                    object2.put("mobile", hashMap);
                    list.add(0, object2);
                }
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String h(bb object) {
        String string;
        string = "";
        try {
            Object object2;
            Matcher matcher;
            String string2;
            Object object3;
            Object object4;
            String string3 = object.Z();
            String string4 = object.getHtml();
            String string5 = object.ab();
            String string6 = object.ac();
            object = object.ad();
            Object object5 = bn.Q("parseType");
            String string7 = "html";
            String string8 = "(?is)href=\"(.*?)\"";
            String string9 = "";
            Object object6 = "div.searchListings div";
            if (GUI.D().contentEquals("IQUALIF France White")) {
                string8 = "(?is)pj_search_ou.*?:.*?[\";](.*?)[\"&]";
                string9 = "(?is)pj_search_idou.*?:.*?[\";](.*?)[\"&]";
                object6 = "div.ambiguite_ou_container li";
            } else if (GUI.D().contentEquals("IQUALIF France Yellow")) {
                string8 = "(?is)pj_search_ou.*?:.*?[\";](.*?)[\"&]";
                string9 = "(?is)pj_search_idou.*?:.*?[\";](.*?)[\"&]";
                object6 = "div.ambiguite_ou_container li";
            } else if (GUI.D().contentEquals("IQUALIF Morocco Yellow")) {
                string8 = "(?i)href=\"/(.*?)\"";
                object6 = "div#directeur_site_content";
            }
            if (object5.contentEquals("text")) {
                object5 = Pattern.compile(string8);
                object6 = object5.matcher(string4);
                while (object6.find()) {
                    string = string2 = object6.group(1);
                }
            } else {
                object5 = Jsoup.parse((String)string4);
                object6 = object5.select((String)object6);
                int n2 = 0;
                while (n2 < object6.size()) {
                    object5 = ((Element)object6.get(n2)).html();
                    object2 = ((Element)object6.get(n2)).text();
                    if (string7.contentEquals("html")) {
                        object2 = object5;
                    }
                    object5 = Pattern.compile(string8);
                    matcher = object5.matcher((CharSequence)object2);
                    while (matcher.find()) {
                        String string10 = matcher.group(1);
                        if (GUI.D().contentEquals("IQUALIF France White")) {
                            if (!string10.contains(string5) || !a.g(string10).toLowerCase().contains(string6.toLowerCase())) continue;
                            object4 = Pattern.compile(string9);
                            object3 = object4.matcher((CharSequence)object2);
                            if (object3.find()) {
                                object4 = object3.group(1);
                                string = "/pagesblanches/recherche?ou=" + string10 + "&idOu=" + (String)object4 + "&proximite=0";
                                string = string.replace(" ", "%20");
                                object4 = new String[][]{{"streetId", string3}, {"page_id", string}};
                                SQL.a(GUI.a(), aM, (String[][])object4);
                            }
                        }
                        if (GUI.D().contains("Morocco Yellow")) {
                            string = string10;
                            object4 = new String[][]{{"streetId", string3}, {"page_id", string}};
                            SQL.a(GUI.a(), aM, (String[][])object4);
                            continue;
                        }
                        if (!GUI.D().contains("United Kingdom")) continue;
                        string = string10;
                        object4 = new String[][]{{"streetId", string3}, {"page_id", string}};
                        SQL.a(GUI.a(), aM, (String[][])object4);
                    }
                    ++n2;
                }
            }
            if (GUI.D().contains("Yellow") && GUI.D().contains("France Yellow")) {
                object5 = "html";
                string8 = "(?i)<input.*? name=\"(.*?)\".*?";
                string9 = "(?i)<input.*? value=\"(.*?)\".*?";
                object6 = "div#listActivities li";
                string7 = "html";
                string2 = "?quiQuoiSaisi=&quiQuoiNbCar=&ouSaisi=&ouNbCar=&quoiqui=" + (String)object + "&ou=" + string5 + "+" + string6;
                if (!object5.contentEquals("text")) {
                    object5 = Pattern.compile("<form.*?action=\"/trouverlesprofessionnels/(.*?)\"");
                    object2 = object5.matcher(string4);
                    if (object2.find()) {
                        object5 = object2.group(1);
                        string2 = String.valueOf(object5) + string2;
                    }
                    object5 = Jsoup.parse((String)string4);
                    matcher = object5.select((String)object6);
                    int n3 = 0;
                    while (n3 < matcher.size()) {
                        object4 = ((Element)matcher.get(n3)).html();
                        object3 = ((Element)matcher.get(n3)).text();
                        object5 = "";
                        object6 = "";
                        if (string7.contentEquals("html")) {
                            object3 = object4;
                        }
                        object4 = Pattern.compile(string8);
                        object4 = object4.matcher((CharSequence)object3);
                        while (object4.find()) {
                            string4 = object4.group(1);
                            object5 = string4;
                        }
                        object4 = Pattern.compile(string9);
                        object4 = object4.matcher((CharSequence)object3);
                        while (object4.find()) {
                            string4 = object4.group(1);
                            object6 = string4;
                        }
                        if (!object5.contentEquals("") && !object6.contentEquals("")) {
                            string2 = String.valueOf(string2) + "&" + (String)object5 + "=" + (String)object6;
                        }
                        ++n3;
                    }
                    if (!string2.contentEquals("quiQuoiSaisi=&quiQuoiNbCar=&ouSaisi=&ouNbCar=&quoiqui=" + (String)object + "&ou=" + string5 + "+" + string6)) {
                        string = a.g(string2);
                        String[][] arrstring = new String[][]{{"streetId", string3}, {"page_id", string}};
                        SQL.a(GUI.a(), aM, arrstring);
                    }
                }
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static List e() {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            for (String string : bi.c(null)) {
                if (!string.toLowerCase().endsWith("coldcalling") && !string.toLowerCase().endsWith("_marketing_accept")) continue;
                arrayList.add(string);
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    private static List f() {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            arrayList.add("created_on");
            arrayList.add("gender");
            arrayList.add("lastname");
            arrayList.add("firstname");
            arrayList.add("forename");
            arrayList.add("housing");
            arrayList.add("age");
            arrayList.add("nationality");
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    private static List g() {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            arrayList.add("pageerror");
            arrayList.add("contact");
            arrayList.add("lastname");
            arrayList.add("firstname");
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static List c(String arrstring) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            if (arrstring == null) {
                arrstring = "";
            }
            arrayList.add("created_on");
            arrayList.add("pageerror");
            arrayList.add("contact");
            arrayList.add("zip");
            arrayList.add("city");
            arrayList.add("street");
            arrayList.add("gender");
            arrayList.add("lastname");
            arrayList.add("firstname");
            arrayList.add("name");
            arrayList.add("forename");
            arrayList.add("mail");
            if (GUI.h() || !arrstring.contentEquals("")) {
                arrayList.add("phone");
                arrayList.add("phone2");
                arrayList.add("phone3");
            } else {
                arrayList.add("tel1");
                arrayList.add("tel2");
                arrayList.add("tel3");
            }
            arrayList.add("mobile");
            arrayList.add("fax");
            arrayList.add("site");
            arrayList.add("comment");
            arrayList.add("category");
            arrayList.add("iscompany");
            arrayList.add("housing");
            arrayList.add("age");
            arrayList.add("nationality");
            arrayList.add("special1");
            arrayList.add("special2");
            arrayList.add("special3");
            arrayList.add("special4");
            arrayList.add("special5");
            arrayList.add("special6");
            arrayList.add("special7");
            arrayList.add("special8");
            arrayList.add("special9");
            arrayList.add("special10");
            arrayList.add("special11");
            arrayList.add("special12");
            arrayList.add("special13");
            arrayList.add("special14");
            arrayList.add("special15");
            arrayList.add("special16");
            if (GUI.h() || !arrstring.contentEquals("")) {
                arrayList.add("mobile2");
                arrayList.add("phonecoldcalling");
                arrayList.add("phone2coldcalling");
                arrayList.add("phone3coldcalling");
                arrayList.add("mobilecoldcalling");
                arrayList.add("mobile2coldcalling");
                arrayList.add("faxcoldcalling");
            } else {
                arrayList.add("tel1_marketing");
                arrayList.add("tel2_marketing");
                arrayList.add("tel3_marketing");
                arrayList.add("mobile_marketing");
                arrayList.add("fax_marketing");
            }
            arrstring = new String[arrayList.size()];
            arrayList.toArray(arrstring);
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static List h() {
        List list;
        list = new ArrayList();
        try {
            list = bi.c("force");
            a.a(list, bi.f());
        }
        catch (Throwable throwable) {}
        return list;
    }

    private static HashMap a(HashMap hashMap, List list) {
        try {
            String string = "";
            String string2 = "";
            String string3 = "";
            String string4 = "";
            String string5 = "";
            String string6 = "";
            String string7 = aM.G("file_marketing_accept");
            String string8 = aM.G("file_marketing_accept");
            String string9 = aM.G("file_marketing_accept");
            String string10 = aM.G("file_marketing_accept");
            String string11 = aM.G("file_marketing_accept");
            String string12 = aM.G("file_marketing_accept");
            hashMap.put("phone1", string);
            hashMap.put("phone2", string2);
            hashMap.put("phone3", string3);
            hashMap.put("mobile1", string4);
            hashMap.put("mobile2", string5);
            hashMap.put("fax", string6);
            hashMap.put("phone1_marketing_accept", string7);
            hashMap.put("phone2_marketing_accept", string8);
            hashMap.put("phone3_marketing_accept", string9);
            hashMap.put("mobile1_marketing_accept", string10);
            hashMap.put("mobile2_marketing_accept", string11);
            hashMap.put("fax_marketing_accept", string12);
            int n2 = 0;
            while (n2 < list.size()) {
                HashMap hashMap2 = (HashMap)list.get(n2);
                String string13 = (String)hashMap2.get("numero");
                string13 = bi.M(string13);
                if (!GUI.D().contentEquals("IQUALIF BCoin White and Yellow") || string13.length() >= 10 && !string13.matches("(^[1-9]).*?$")) {
                    if (((String)hashMap2.get("fax")).contentEquals("fax")) {
                        string6 = string13;
                        string12 = (String)hashMap2.get("marketing_accept");
                    } else if (((String)hashMap2.get("mobile")).contentEquals("mobile")) {
                        if (string4.contentEquals("")) {
                            string4 = string13;
                            string10 = (String)hashMap2.get("marketing_accept");
                        } else if (string5.contentEquals("") && !string13.contentEquals(string4)) {
                            string5 = string13;
                            string11 = (String)hashMap2.get("marketing_accept");
                        }
                    } else if (string.contentEquals("")) {
                        string = string13;
                        string7 = (String)hashMap2.get("marketing_accept");
                    } else if (string2.contentEquals("")) {
                        if (!string13.contentEquals(string)) {
                            string2 = string13;
                            string8 = (String)hashMap2.get("marketing_accept");
                        }
                    } else if (string3.contentEquals("")) {
                        string3 = string13;
                        string9 = (String)hashMap2.get("marketing_accept");
                    }
                    if ((GUI.D().contains(" France ") || GUI.D().contentEquals("IQUALIF 712 White and Yellow")) && string4.contentEquals("") && string.matches("^.[67]")) {
                        string4 = string;
                        string10 = string7;
                        string = "";
                        string7 = aM.G("file_marketing_accept");
                    }
                }
                ++n2;
            }
            if (string.contentEquals("")) {
                if (!string2.contentEquals("")) {
                    string = string2;
                    string2 = "";
                } else if (!string3.contentEquals("")) {
                    string = string3;
                    string3 = "";
                }
            }
            hashMap.put("phone1", string);
            hashMap.put("phone2", string2);
            hashMap.put("phone3", string3);
            hashMap.put("mobile1", string4);
            hashMap.put("mobile2", string5);
            hashMap.put("fax", string6);
            hashMap.put("phone1_marketing_accept", string7);
            hashMap.put("phone2_marketing_accept", string8);
            hashMap.put("phone3_marketing_accept", string9);
            hashMap.put("mobile1_marketing_accept", string10);
            hashMap.put("mobile2_marketing_accept", string11);
            hashMap.put("fax_marketing_accept", string12);
        }
        catch (Throwable throwable) {}
        return hashMap;
    }

    private static HashMap a(HashMap hashMap) {
        HashMap<String, String> hashMap2;
        hashMap2 = new HashMap<String, String>();
        try {
            String[] arrstring = a.a(bi.c(null));
            int n2 = arrstring.length;
            int n3 = 0;
            while (n3 < n2) {
                String string = arrstring[n3];
                hashMap2.put(string, "");
                if (hashMap.get(string) != null) {
                    if (!GUI.h()) {
                        if (string.contentEquals("name")) {
                            hashMap2.put("lastname", hashMap.get(string).toString());
                        } else if (string.contentEquals("forename")) {
                            hashMap2.put("firstname", hashMap.get(string).toString());
                        } else {
                            hashMap2.put(string, hashMap.get(string).toString());
                        }
                    } else {
                        hashMap2.put(string, hashMap.get(string).toString());
                    }
                }
                ++n3;
            }
            if (!GUI.h()) {
                bi.a(hashMap2, (List)hashMap.get("phone"));
            }
        }
        catch (Throwable throwable) {}
        return hashMap2;
    }

    private static void a(HashMap hashMap, List object) {
        try {
            if (bn.Q("coldcalling") == null) {
                bn.d(GUI.D(), "coldcalling", "1");
            }
            if (GUI.h()) {
                String string = aM.G("file_marketing_accept");
                String string2 = aM.G("file_marketing_refuse");
                if (bn.Q("coldcalling").contentEquals("0")) {
                    string = string2;
                    string2 = aM.G("file_marketing_accept");
                }
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    object = (String)iterator.next();
                    if (((String)hashMap.get(object)).contentEquals("")) {
                        hashMap.put(object, string);
                        continue;
                    }
                    hashMap.put(object, string2);
                }
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    private static void a(HashMap hashMap) {
        try {
            String string = "";
            String string2 = "";
            String string3 = "";
            String string4 = "";
            if (GUI.h()) {
                String[] arrstring = aM.c();
                Object object = GSetting.b();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    object = (String)iterator.next();
                    Object object2 = bn.Q(String.valueOf(object) + "Column");
                    if ((object2 = GUI.a((String)object2, (String)object)).intValue() <= 0 || arrstring[object2.intValue()].contains("_marketing_accept") || arrstring[object2.intValue()].toLowerCase().contains("coldcalling")) continue;
                    if (arrstring[object2.intValue()].toLowerCase().contentEquals("gender")) {
                        string2 = object.replace("Detail", "");
                        continue;
                    }
                    if (arrstring[object2.intValue()].toLowerCase().contentEquals("average_age")) {
                        string3 = object.replace("Detail", "");
                        continue;
                    }
                    if (arrstring[object2.intValue()].toLowerCase().contentEquals("ethnic_group")) {
                        string4 = object.replace("Detail", "");
                        continue;
                    }
                    if (arrstring[object2.intValue()].toLowerCase().contentEquals("name")) continue;
                    if (arrstring[object2.intValue()].toLowerCase().contentEquals("firstname")) {
                        string = (String)hashMap.get(object.replace("Detail", ""));
                        continue;
                    }
                    if (arrstring[object2.intValue()].toLowerCase().contentEquals("middlename")) continue;
                    arrstring[object2.intValue()].toLowerCase().contentEquals("lastname");
                }
                object = bi.a(hashMap, string);
                if (!string2.contentEquals("")) {
                    hashMap.put(string2, object[0]);
                }
                if (!string3.contentEquals("")) {
                    hashMap.put(string3, object[1]);
                }
                if (!string4.contentEquals("")) {
                    hashMap.put(string4, object[2]);
                    return;
                }
            }
        }
        catch (Throwable throwable) {}
    }

    private static boolean a(bb object, List list) {
        boolean bl2;
        bl2 = false;
        try {
            String string = object.ab();
            String string2 = object.ac();
            object = object.ad();
            List list2 = bi.c(null);
            List list3 = bi.e();
            a.a(list2, bi.g());
            int n2 = 0;
            while (n2 < list.size()) {
                Object object2;
                Object object3;
                Object object4 = (HashMap)list.get(n2);
                HashMap hashMap = bi.a((HashMap)object4);
                if (GUI.h()) {
                    hashMap.put("phone1", (String)hashMap.get("phone"));
                    hashMap.put("mobile1", (String)hashMap.get("mobile"));
                    bi.a(hashMap, list3);
                    bi.a(hashMap);
                }
                String string3 = "";
                if (GUI.D().contentEquals("IQUALIF Anbis White and Yellow")) {
                    hashMap.put("special2", "http://www.anibis.ch" + (String)hashMap.get("special2"));
                }
                if (GUI.D().contentEquals("IQUALIF Portugal White")) {
                    hashMap.put("special1", string);
                    hashMap.put("special2", string2);
                    hashMap.put("special3", object);
                }
                if (GUI.D().contentEquals("IQUALIF Belgium White") && ((String)hashMap.get("zip")).contentEquals("") && ((String)hashMap.get("city")).toLowerCase().trim().contentEquals(string2.toLowerCase().trim())) {
                    hashMap.put("zip", string);
                }
                if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow") || GUI.D().contentEquals("IQUALIF Kapa White and Yellow")) {
                    hashMap.put("mail", bi.a((String)hashMap.get("mail"), (String)hashMap.get("comment"), (List)object4.get("phone")));
                }
                object4 = new Date();
                Object object52 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                object4 = object52.format((Date)object4);
                hashMap.put("created_on", object4);
                for (Object object52 : hashMap.keySet()) {
                    object3 = object52.toString();
                    hashMap.get(object52);
                    hashMap.put(object3, a.g((String)hashMap.get(object3)));
                }
                object52 = String.valueOf((String)hashMap.get("country")) + (String)hashMap.get("state") + (String)hashMap.get("department") + (String)hashMap.get("zip") + (String)hashMap.get("city") + (String)hashMap.get("street") + (String)hashMap.get("gender") + (String)hashMap.get("lastname") + (String)hashMap.get("firstname") + (String)hashMap.get("mail") + (String)hashMap.get("site") + (String)hashMap.get("comment") + (String)hashMap.get("category") + (String)hashMap.get("special1") + (String)hashMap.get("special2") + (String)hashMap.get("special3") + (String)hashMap.get("special4") + (String)hashMap.get("special5") + (String)hashMap.get("special6") + (String)hashMap.get("special7") + (String)hashMap.get("special8") + (String)hashMap.get("special9") + (String)hashMap.get("special10") + (String)hashMap.get("special11") + (String)hashMap.get("special12") + (String)hashMap.get("special13") + (String)hashMap.get("special14") + (String)hashMap.get("special15") + (String)hashMap.get("special16");
                Object object6 = object52.getBytes();
                object3 = a.a((byte[])object6);
                for (Object object52 : hashMap.keySet()) {
                    object2 = object52.toString();
                    hashMap.get(object52);
                    object52 = ((String)hashMap.get(object2)).getBytes();
                    hashMap.put(object2, new String((byte[])object52, (String)object3));
                    hashMap.put(object2, a.s((String)hashMap.get(object2)));
                }
                if (bn.Q("parseRecordStreetCityZipCase").contentEquals("1")) {
                    hashMap.put("street", ((String)hashMap.get("street")).toUpperCase());
                    hashMap.put("zip", ((String)hashMap.get("zip")).toUpperCase());
                    hashMap.put("city", ((String)hashMap.get("city")).toUpperCase());
                } else if (bn.Q("parseRecordStreetCityZipCase").contentEquals("2")) {
                    hashMap.put("street", ((String)hashMap.get("street")).toLowerCase());
                    hashMap.put("zip", ((String)hashMap.get("zip")).toLowerCase());
                    hashMap.put("city", ((String)hashMap.get("city")).toLowerCase());
                }
                if (GUI.D().contentEquals("IQUALIF Spain White") && ((String)hashMap.get("city")).startsWith("- ")) {
                    hashMap.put("city", ((String)hashMap.get("city")).substring(2, ((String)hashMap.get("city")).length()));
                }
                if (GUI.D().contentEquals("IQUALIF Spain Yellow")) {
                    hashMap.put("special3", ((String)hashMap.get("special3")).replace("(", "").replace(")", ""));
                    if (((String)hashMap.get("special3")).contentEquals("")) {
                        hashMap.put("special3", (String)hashMap.get("city"));
                    }
                }
                if (GUI.D().contentEquals("IQUALIF France Yellow") || GUI.D().contentEquals("IQUALIF France White")) {
                    hashMap.put("category", ((String)hashMap.get("category")).replace(", * ", " * ").replace(" * * ", " * ").replace(" * ,\u00a0 * ", " * ").replace(" * ...", "").replaceAll("^\\* ", ""));
                    hashMap.put("city", ((String)hashMap.get("city")).replace(" + D'ADRESSES", ""));
                    if (((String)hashMap.get("street")).endsWith(",")) {
                        hashMap.put("street", a.q((String)hashMap.get("street")));
                    }
                    hashMap.put("site", a.h((String)hashMap.get("site")));
                }
                if (GUI.D().contentEquals("IQUALIF Belgium Yellow") && ((String)hashMap.get("lastname")).contains("Affichez ce")) {
                    hashMap.put("lastname", ((String)hashMap.get("lastname")).replaceAll("Affichez ce.*", "").trim());
                }
                if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                    if (aH.D("capturebcoinminprice").contentEquals("1")) {
                        object52 = getHTTPSpecial.a((String)hashMap.get("site"), (String)hashMap.get("special1"), (String)hashMap.get("special2"), (String)hashMap.get("special3"), (String)hashMap.get("zip"), (String)hashMap.get("special4"), (String)hashMap.get("special5"), (String)hashMap.get("special6"), (String)hashMap.get("special7"), String.valueOf((String)hashMap.get("lastname")) + " " + (String)hashMap.get("comment"));
                        hashMap.put("special11", object52.split("\u00a4", -1)[0]);
                        hashMap.put("special12", object52.split("\u00a4", -1)[1]);
                        hashMap.put("special13", object52.split("\u00a4", -1)[2]);
                        hashMap.put("special14", object52.split("\u00a4", -1)[3]);
                        hashMap.put("special15", object52.split("\u00a4", -1)[4]);
                        hashMap.put("special16", object52.split("\u00a4", -1)[5]);
                    }
                    if (((String)hashMap.get("phone1")).matches("0[123456789].*?")) {
                        hashMap.put("phone1", a.a((String)hashMap.get("phone1"), (Integer)10));
                    }
                    if (((String)hashMap.get("phone2")).matches("0[123456789].*?")) {
                        hashMap.put("phone2", a.a((String)hashMap.get("phone2"), (Integer)10));
                    }
                    if (((String)hashMap.get("phone3")).matches("0[123456789].*?")) {
                        hashMap.put("phone3", a.a((String)hashMap.get("phone3"), (Integer)10));
                    }
                    if (((String)hashMap.get("mobile1")).matches("0[123456789].*?")) {
                        hashMap.put("mobile1", a.a((String)hashMap.get("mobile1"), (Integer)10));
                    }
                    if (((String)hashMap.get("mobile2")).matches("0[123456789].*?")) {
                        hashMap.put("mobile2", a.a((String)hashMap.get("mobile2"), (Integer)10));
                    }
                    if (((String)hashMap.get("fax")).matches("0[123456789].*?")) {
                        hashMap.put("fax", a.a((String)hashMap.get("fax"), (Integer)10));
                    }
                }
                if (GUI.D().contentEquals("IQUALIF Polynesia White")) {
                    int n3 = ((String)hashMap.get("street")).length() - ((String)hashMap.get("street")).replace(",", "").length();
                    if (n3 == 1) {
                        hashMap.put("zip", ((String)hashMap.get("street")).substring(((String)hashMap.get("street")).indexOf(",") + 1, ((String)hashMap.get("street")).length()));
                        hashMap.put("city", ((String)hashMap.get("street")).substring(0, ((String)hashMap.get("street")).indexOf(",")));
                        hashMap.put("street", "");
                    } else {
                        hashMap.put("zip", ((String)hashMap.get("street")).substring(((String)hashMap.get("street")).lastIndexOf(",") + 1, ((String)hashMap.get("street")).length()));
                        hashMap.put("city", ((String)hashMap.get("street")).substring(((String)hashMap.get("street")).indexOf(",") + 2, ((String)hashMap.get("street")).lastIndexOf(",")));
                        hashMap.put("street", ((String)hashMap.get("street")).substring(0, ((String)hashMap.get("street")).indexOf(",")));
                    }
                }
                if (GUI.D().contentEquals("IQUALIF Germany Yellow")) {
                    hashMap.put("street", ((String)hashMap.get("street")).replace("&HN=", " ").replaceAll("&PC=.*", ""));
                }
                if (GUI.D().contentEquals("IQUALIF Tunisia Yellow")) {
                    if (((String)hashMap.get("fax")).length() > 8) {
                        hashMap.put("fax", ((String)hashMap.get("fax")).substring(0, 8));
                    }
                    if (!((String)hashMap.get("mail")).contains("@")) {
                        hashMap.put("mail", "");
                    }
                }
                if (!GUI.h()) {
                    object52 = bi.a((String)hashMap.get("lastname"), (String)hashMap.get("firstname"), (String)hashMap.get("iscompany"), (String)hashMap.get("category"), (String)hashMap.get("site"));
                    hashMap.put("lastname", object52[0]);
                    hashMap.put("firstname", object52[1]);
                }
                if (!GUI.h() && !((String)hashMap.get("lastname")).contains("{")) {
                    object52 = bi.a((String)hashMap.get("gender"), (String)hashMap.get("age"), (String)hashMap.get("firstname"), (String)hashMap.get("nationality"));
                    hashMap.put("gender", object52[0]);
                    hashMap.put("age", object52[1]);
                    hashMap.put("nationality", object52[2]);
                }
                if ((object52 = bn.Q("housingDeduct")).contentEquals("1")) {
                    hashMap.put("housing", aM.G("file_housing_ind"));
                }
                if (!(GUI.D().contains(" White") && bn.Q("professionnalMark").contentEquals("1") && ((String)hashMap.get("lastname")).startsWith("{") && ((String)hashMap.get("lastname")).endsWith("}"))) {
                    if (GUI.D().contains(" Luxembourg ") && ((String)hashMap.get("city")).toLowerCase().matches(".*[0-9]+.[0-9]+km")) {
                        hashMap.put("city", ((String)hashMap.get("city")).substring(0, ((String)hashMap.get("city")).length() - 7));
                    }
                    if (!GUI.D().contains("United Kingdom Yellow") || !((String)hashMap.get("lastname")).contains("your business listed for")) {
                        if (Integer.valueOf(bn.Q("mailCapture")) == 1 || Integer.valueOf(bn.Q("mailCapture")) == 2) {
                            hashMap.put("mail", MailGet.a((String)hashMap.get("site"), (String)hashMap.get("mail"), Integer.valueOf(bn.Q("mailCapture"))));
                        }
                        if (!GUI.h()) {
                            hashMap.put("name", (String)hashMap.get("lastname"));
                            hashMap.put("forename", (String)hashMap.get("firstname"));
                        }
                        object6 = "";
                        if (GUI.h()) {
                            int n4 = 0;
                            while (n4 < list2.size()) {
                                object6 = n4 == 0 ? (String)hashMap.get(list2.get(n4)) : String.valueOf(object6) + ";" + (String)hashMap.get(list2.get(n4));
                                ++n4;
                            }
                            object6 = String.valueOf(object6) + "\n";
                        } else {
                            object6 = String.valueOf(object4) + ";" + (String)hashMap.get("zip") + ";" + (String)hashMap.get("city") + ";" + (String)hashMap.get("street") + ";" + (String)hashMap.get("gender") + ";" + (String)hashMap.get("lastname") + ";" + (String)hashMap.get("firstname") + ";" + (String)hashMap.get("mail") + ";" + (String)hashMap.get("phone1") + ";" + (String)hashMap.get("phone2") + ";" + (String)hashMap.get("phone3") + ";" + (String)hashMap.get("mobile1") + ";" + (String)hashMap.get("mobile2") + ";" + (String)hashMap.get("fax") + ";" + (String)hashMap.get("site") + ";" + (String)hashMap.get("comment") + ";" + (String)hashMap.get("category") + ";" + (String)hashMap.get("housing") + ";" + (String)hashMap.get("age") + ";" + (String)hashMap.get("nationality") + ";" + (String)hashMap.get("special1") + ";" + (String)hashMap.get("special2") + ";" + (String)hashMap.get("special3") + ";" + (String)hashMap.get("special4") + ";" + (String)hashMap.get("special5") + ";" + (String)hashMap.get("special6") + ";" + (String)hashMap.get("special7") + ";" + (String)hashMap.get("special8") + ";" + (String)hashMap.get("special9") + ";" + (String)hashMap.get("special10") + ";" + (String)hashMap.get("special11") + ";" + (String)hashMap.get("special12") + ";" + (String)hashMap.get("special13") + ";" + (String)hashMap.get("special14") + ";" + (String)hashMap.get("special15") + ";" + (String)hashMap.get("special16") + ";" + (String)hashMap.get("phone1_marketing_accept") + ";" + (String)hashMap.get("phone2_marketing_accept") + ";" + (String)hashMap.get("phone3_marketing_accept") + ";" + (String)hashMap.get("mobile1_marketing_accept") + ";" + (String)hashMap.get("mobile2_marketing_accept") + ";" + (String)hashMap.get("fax_marketing_accept") + ";\n";
                        }
                        object2 = new String[list2.size()][];
                        if (GUI.h()) {
                            int n5 = 0;
                            while (n5 < list2.size()) {
                                object2[n5] = ((String)list2.get(n5)).toLowerCase().contentEquals("gender") ? new String[]{"title", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().contentEquals("lastname") ? new String[]{"name", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().contentEquals("firstname") ? new String[]{"surname", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().contentEquals("forename") ? new String[]{"surname", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().contentEquals("phone") ? new String[]{"phone1", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().contentEquals("mobile") ? new String[]{"mobile1", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().contentEquals("category") ? new String[]{"company", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().contentEquals("category") ? new String[]{"company", (String)hashMap.get(list2.get(n5))} : (((String)list2.get(n5)).toLowerCase().endsWith("coldcalling") ? new String[]{((String)list2.get(n5)).replace("phoneColdCalling", "phone1_marketing_accept").replace("phonecoldcalling", "phone1_marketing_accept").replace("mobileColdCalling", "mobile1_marketing_accept").replace("mobilecoldcalling", "mobile1_marketing_accept").replace("ColdCalling", "_marketing_accept").replace("coldcalling", "_marketing_accept"), (String)hashMap.get(list2.get(n5))} : new String[]{(String)list2.get(n5), (String)hashMap.get(list2.get(n5))}))))))));
                                ++n5;
                            }
                        } else {
                            object2 = new String[][]{{"created_on", object4}, {"zip", (String)hashMap.get("zip")}, {"city", (String)hashMap.get("city")}, {"street", (String)hashMap.get("street")}, {"title", (String)hashMap.get("gender")}, {"name", (String)hashMap.get("lastname")}, {"surname", (String)hashMap.get("firstname")}, {"mail", (String)hashMap.get("mail")}, {"phone1", (String)hashMap.get("phone1")}, {"phone2", (String)hashMap.get("phone2")}, {"phone3", (String)hashMap.get("phone3")}, {"mobile1", (String)hashMap.get("mobile1")}, {"mobile2", (String)hashMap.get("mobile2")}, {"fax", (String)hashMap.get("fax")}, {"site", (String)hashMap.get("site")}, {"comment", (String)hashMap.get("comment")}, {"company", (String)hashMap.get("category")}, {"housing", (String)hashMap.get("housing")}, {"age", (String)hashMap.get("age")}, {"nationality", (String)hashMap.get("nationality")}, {"special1", (String)hashMap.get("special1")}, {"special2", (String)hashMap.get("special2")}, {"special3", (String)hashMap.get("special3")}, {"special4", (String)hashMap.get("special4")}, {"special5", (String)hashMap.get("special5")}, {"special6", (String)hashMap.get("special6")}, {"special7", (String)hashMap.get("special7")}, {"special8", (String)hashMap.get("special8")}, {"special9", (String)hashMap.get("special9")}, {"special10", (String)hashMap.get("special10")}, {"special11", (String)hashMap.get("special11")}, {"special12", (String)hashMap.get("special12")}, {"special13", (String)hashMap.get("special13")}, {"special14", (String)hashMap.get("special14")}, {"special15", (String)hashMap.get("special15")}, {"special16", (String)hashMap.get("special16")}, {"phone1_marketing_accept", (String)hashMap.get("phone1_marketing_accept")}, {"phone2_marketing_accept", (String)hashMap.get("phone2_marketing_accept")}, {"phone3_marketing_accept", (String)hashMap.get("phone3_marketing_accept")}, {"mobile1_marketing_accept", (String)hashMap.get("mobile1_marketing_accept")}, {"mobile2_marketing_accept", (String)hashMap.get("mobile2_marketing_accept")}, {"fax_marketing_accept", (String)hashMap.get("fax_marketing_accept")}};
                        }
                        a.a(String.valueOf(GUI.A()) + bi.al(), (String)object6, "WINDOWS-1252");
                        object52 = bi.a(object2, (String)hashMap.get("zip"), (String)hashMap.get("city"), (String)hashMap.get("street"));
                        if (object52 == false && (bn.Q("mailtype").contentEquals("1") || bn.Q("mailtype").contentEquals("2") || bn.Q("mailtype").contentEquals("3"))) {
                            string3 = aM.G("mailerror2");
                        }
                        if (object52 != false && (bn.Q("mailtype").contentEquals("1") || bn.Q("mailtype").contentEquals("2") || bn.Q("mailtype").contentEquals("3"))) {
                            string3 = bi.P((String)hashMap.get("mail"));
                        }
                        if (bn.Q("show_contact").contains("1")) {
                            if (GUI.h()) {
                                Object object7;
                                Object object8;
                                String[] arrstring = aM.c();
                                object6 = GSetting.b();
                                object3 = 0;
                                Object object9 = object6.iterator();
                                while (object9.hasNext()) {
                                    object2 = (String)object9.next();
                                    object7 = bn.Q(String.valueOf(object2) + "Column");
                                    object8 = GUI.a((String)object7, (String)object2);
                                    if (object8.intValue() <= 0 || arrstring[object8.intValue()].contains("_marketing_accept") || arrstring[object8.intValue()].toLowerCase().contains("coldcalling") || arrstring[object8.intValue()].toLowerCase().contains("gender") || arrstring[object8.intValue()].toLowerCase().contains("average_age") || arrstring[object8.intValue()].toLowerCase().contains("ethnic_group") || arrstring[object8.intValue()].toLowerCase().contains("housing")) continue;
                                    object3 = object3.intValue() + 1;
                                }
                                object2 = new Object[object3.intValue()];
                                object3 = 0;
                                object7 = object6.iterator();
                                while (object7.hasNext()) {
                                    object9 = (String)object7.next();
                                    object8 = bn.Q(String.valueOf(object9) + "Column");
                                    object6 = GUI.a((String)object8, (String)object9);
                                    if (object6.intValue() <= 0 || arrstring[object6.intValue()].contains("_marketing_accept") || arrstring[object6.intValue()].toLowerCase().contains("coldcalling") || arrstring[object6.intValue()].toLowerCase().contains("gender") || arrstring[object6.intValue()].toLowerCase().contains("average_age") || arrstring[object6.intValue()].toLowerCase().contains("ethnic_group") || arrstring[object6.intValue()].toLowerCase().contains("housing")) continue;
                                    if (bn.Q("detailcapture").contentEquals("1")) {
                                        object9 = object9.substring(0, object9.length() - 6);
                                    }
                                    object6 = "";
                                    if (object9.contentEquals("dat")) {
                                        object6 = object4;
                                    }
                                    if (object9.contentEquals("zip")) {
                                        object6 = (String)hashMap.get("zip");
                                    }
                                    if (object9.contentEquals("city")) {
                                        object6 = (String)hashMap.get("city");
                                    }
                                    if (object9.contentEquals("street")) {
                                        object6 = (String)hashMap.get("street");
                                    }
                                    if (object9.contentEquals("gender")) {
                                        object6 = (String)hashMap.get("gender");
                                    }
                                    if (object9.contentEquals("name")) {
                                        object6 = (String)hashMap.get("name");
                                    }
                                    if (object9.contentEquals("forename")) {
                                        object6 = (String)hashMap.get("forename");
                                    }
                                    if (object9.contentEquals("lastname")) {
                                        object6 = (String)hashMap.get("lastname");
                                    }
                                    if (object9.contentEquals("firstname")) {
                                        object6 = (String)hashMap.get("firstname");
                                    }
                                    if (object9.contentEquals("mail")) {
                                        object6 = String.valueOf((String)hashMap.get("mail")) + " " + string3;
                                    }
                                    if (object9.contentEquals("phone")) {
                                        object6 = (String)hashMap.get("phone1");
                                    }
                                    if (object9.contentEquals("phone1")) {
                                        object6 = (String)hashMap.get("phone1");
                                    }
                                    if (object9.contentEquals("phone2")) {
                                        object6 = (String)hashMap.get("phone2");
                                    }
                                    if (object9.contentEquals("phone3")) {
                                        object6 = (String)hashMap.get("phone3");
                                    }
                                    if (object9.contentEquals("mobile")) {
                                        object6 = (String)hashMap.get("mobile1");
                                    }
                                    if (object9.contentEquals("mobile1")) {
                                        object6 = (String)hashMap.get("mobile1");
                                    }
                                    if (object9.contentEquals("mobile2")) {
                                        object6 = (String)hashMap.get("mobile2");
                                    }
                                    if (object9.contentEquals("fax")) {
                                        object6 = (String)hashMap.get("fax");
                                    }
                                    if (object9.contentEquals("site")) {
                                        object6 = (String)hashMap.get("site");
                                    }
                                    if (object9.contentEquals("comment")) {
                                        object6 = (String)hashMap.get("comment");
                                    }
                                    if (object9.contentEquals("category")) {
                                        object6 = (String)hashMap.get("category");
                                    }
                                    if (object9.contentEquals("housing")) {
                                        object6 = (String)hashMap.get("housing");
                                    }
                                    if (object9.contentEquals("age")) {
                                        object6 = (String)hashMap.get("age");
                                    }
                                    if (object9.contentEquals("nationality")) {
                                        object6 = (String)hashMap.get("nationality");
                                    }
                                    if (object9.contentEquals("special1")) {
                                        object6 = (String)hashMap.get("special1");
                                    }
                                    if (object9.contentEquals("special2")) {
                                        object6 = (String)hashMap.get("special2");
                                    }
                                    if (object9.contentEquals("special3")) {
                                        object6 = (String)hashMap.get("special3");
                                    }
                                    if (object9.contentEquals("special4")) {
                                        object6 = (String)hashMap.get("special4");
                                    }
                                    if (object9.contentEquals("special5")) {
                                        object6 = (String)hashMap.get("special5");
                                    }
                                    if (object9.contentEquals("special6")) {
                                        object6 = (String)hashMap.get("special6");
                                    }
                                    if (object9.contentEquals("special7")) {
                                        object6 = (String)hashMap.get("special7");
                                    }
                                    if (object9.contentEquals("special8")) {
                                        object6 = (String)hashMap.get("special8");
                                    }
                                    if (object9.contentEquals("special9")) {
                                        object6 = (String)hashMap.get("special9");
                                    }
                                    if (object9.contentEquals("special10")) {
                                        object6 = (String)hashMap.get("special10");
                                    }
                                    if (object9.contentEquals("special11")) {
                                        object6 = (String)hashMap.get("special11");
                                    }
                                    if (object9.contentEquals("special12")) {
                                        object6 = (String)hashMap.get("special12");
                                    }
                                    if (object9.contentEquals("special13")) {
                                        object6 = (String)hashMap.get("special13");
                                    }
                                    if (object9.contentEquals("special14")) {
                                        object6 = (String)hashMap.get("special14");
                                    }
                                    if (object9.contentEquals("special15")) {
                                        object6 = (String)hashMap.get("special15");
                                    }
                                    if (object9.contentEquals("special16")) {
                                        object6 = (String)hashMap.get("special16");
                                    }
                                    if (object9.contentEquals("phone1_marketing_accept")) {
                                        object6 = (String)hashMap.get("phone1_marketing_accept");
                                    }
                                    if (object9.contentEquals("phone2_marketing_accept")) {
                                        object6 = (String)hashMap.get("phone2_marketing_accept");
                                    }
                                    if (object9.contentEquals("phone3_marketing_accept")) {
                                        object6 = (String)hashMap.get("phone3_marketing_accept");
                                    }
                                    if (object9.contentEquals("mobile1_marketing_accept")) {
                                        object6 = (String)hashMap.get("mobile1_marketing_accept");
                                    }
                                    if (object9.contentEquals("mobile2_marketing_accept")) {
                                        object6 = (String)hashMap.get("mobile2_marketing_accept");
                                    }
                                    if (object9.contentEquals("fax_marketing_accept")) {
                                        object6 = (String)hashMap.get("fax_marketing_accept");
                                    }
                                    object2[object3.intValue()] = object6;
                                    object3 = object3.intValue() + 1;
                                }
                                GUI.a((Object[])object2);
                            } else if (GUI.D().contentEquals("IQUALIF Dominica White") || GUI.D().contentEquals("IQUALIF Lucia White")) {
                                GUI.a(new Object[]{hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1"), hashMap.get("mobile1"), hashMap.get("fax"), hashMap.get("site"), hashMap.get("mail")});
                            } else if (GUI.D().contentEquals("IQUALIF 712 White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("mobile1"), hashMap.get("fax"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Africa Yellow")) {
                                GUI.a(new Object[]{hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("mobile1"), hashMap.get("fax"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Anbis White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("special1"), hashMap.get("phone1"), hashMap.get("special3"), hashMap.get("comment"), hashMap.get("category"), hashMap.get("special2")});
                            } else if (GUI.D().contentEquals("IQUALIF Australia Yellow")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3, hashMap.get("category")});
                            } else if (GUI.D().contentEquals("IQUALIF Auto24 White and Yellow") || GUI.D().contentEquals("IQUALIF Immo24 White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("special1"), hashMap.get("category"), hashMap.get("lastname"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("special2"), hashMap.get("phone1"), hashMap.get("special3"), hashMap.get("comment")});
                            } else if (GUI.D().contentEquals("IQUALIF Bangladesh Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1")});
                            } else if (GUI.D().contentEquals("IQUALIF Belgium White")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1")});
                            } else if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("site"), hashMap.get("category"), hashMap.get("special8"), hashMap.get("special9"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("lastname"), hashMap.get("comment"), hashMap.get("special5")});
                            } else if (GUI.D().contentEquals("IQUALIF Canada 41 White")) {
                                GUI.a(new Object[]{hashMap.get("special1"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1")});
                            } else if (GUI.D().contentEquals("IQUALIF Canada White")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1")});
                            } else if (GUI.D().contentEquals("IQUALIF Canada Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("zip"), hashMap.get("special1"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Germany Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("fax"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Germany GS Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Italy Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("special1"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Morocco White")) {
                                GUI.a(new Object[]{hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1")});
                            } else if (GUI.D().contentEquals("IQUALIF Netherlands Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("special4"), hashMap.get("category"), hashMap.get("lastname"), hashMap.get("street"), hashMap.get("phone1"), String.valueOf((String)hashMap.get("mail")) + " " + string3, hashMap.get("comment")});
                            } else if (GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("special1"), hashMap.get("category"), hashMap.get("lastname"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("special4"), hashMap.get("special2"), hashMap.get("phone1"), hashMap.get("special3"), hashMap.get("comment")});
                            } else if (GUI.D().contentEquals("IQUALIF Peru Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Philippines Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Poland Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contains("IQUALIF Spain Yellow")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("special3"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Sbito White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("special1"), hashMap.get("category"), hashMap.get("special2"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("special7"), hashMap.get("comment"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF Singapore Yellow")) {
                                GUI.a(new Object[]{hashMap.get("category"), hashMap.get("zip"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contentEquals("IQUALIF TAdvisor Yellow")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), String.valueOf((String)hashMap.get("mail")) + " " + string3, hashMap.get("category")});
                            } else if (GUI.D().contentEquals("IQUALIF Tuti White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("special2"), hashMap.get("category"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("city"), hashMap.get("special1"), hashMap.get("special5"), hashMap.get("comment"), hashMap.get("special4")});
                            } else if (GUI.D().contentEquals("IQUALIF United States White")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1")});
                            } else if (GUI.D().contains("White and Yellow")) {
                                GUI.a(new Object[]{hashMap.get("special8"), hashMap.get("special9"), hashMap.get("lastname"), hashMap.get("special5"), hashMap.get("special1"), hashMap.get("phone1"), hashMap.get("mobile1"), hashMap.get("fax"), hashMap.get("site"), hashMap.get("mail"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else if (GUI.D().contains("White")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1"), hashMap.get("mobile1"), hashMap.get("fax")});
                            } else if (GUI.D().contains("Yellow")) {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("phone1"), hashMap.get("mobile1"), hashMap.get("fax"), hashMap.get("site"), String.valueOf((String)hashMap.get("mail")) + " " + string3});
                            } else {
                                GUI.a(new Object[]{hashMap.get("zip"), hashMap.get("city"), hashMap.get("street"), hashMap.get("lastname"), hashMap.get("firstname"), hashMap.get("phone1"), hashMap.get("mobile1"), hashMap.get("fax"), hashMap.get("site"), hashMap.get("mail")});
                            }
                        }
                    }
                }
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private static boolean a(String[][] arrstring, String object, String string, String object2) {
        boolean bl2;
        block8 : {
            bl2 = false;
            try {
                boolean bl3;
                String[][] arrstring2 = bn.Q("housingDeduct");
                SQL.a(GUI.c(), aO, arrstring);
                bi.a(arrstring);
                bl2 = bl3 = SQL.a(GUI.b(), aO, arrstring);
                if (GUI.D().contains(" Yellow")) {
                    return bl2;
                }
                if (!bl2 || !arrstring2.contentEquals("1")) break block8;
                Object object3 = String.valueOf(object) + string + (String)object2;
                object3 = Normalizer.normalize((CharSequence)object3, Normalizer.Form.NFD);
                object3 = object3.replaceAll("[^\\p{ASCII}]", "");
                arrstring2 = new String[][]{{"zipcitystreet", object3}, {"zip", object}, {"city", string}, {"street", object2}};
                boolean bl4 = SQL.a(GUI.d(), aO, arrstring2);
                if (bl4) {
                    String string2 = object2;
                    string2 = Normalizer.normalize(string2, Normalizer.Form.NFD);
                    string2 = string2.replaceAll("[^\\p{ASCII}]", "");
                    string2 = string2.toLowerCase().trim();
                    Object object4 = new String[]{"^appt .*", "^appt\\. .*", "^appartement .*", "^app .*", "^app\\. .*", "^imm .*", "^imm\\. .*", "^immeuble .*", "^res .*", "^res\\. .*", "^resid .*", "^resid\\. .*", "^residence .*", "^bat .*", "^bat\\. .*", "^batiment .*", "^hlm .*", "^h\\.l\\.m\\. ", ".* appt .*", ".* appt\\. .*", ".* appartement .*", ".* app .*", ".* app\\. .*", ".* imm .*", ".* imm\\. .*", ".* immeuble .*", ".* res .*", ".* res\\. .*", ".* resid .*", ".* resid\\. .*", ".* residence .*", ".* bat .*", ".* bat\\. .*", ".* batiment .*", ".* hlm .*", ".* h\\.l\\.m\\. .*"};
                    int n2 = 0;
                    while (n2 < ((String[])object4).length) {
                        if (string2.matches(object4[n2])) {
                            object4 = "UPDATE " + aO + " SET housing=? WHERE housing=? AND zip=? AND city=? AND street=?";
                            PreparedStatement preparedStatement = GUI.b().prepareStatement((String)object4);
                            preparedStatement.setString(1, aM.G("file_housing_col"));
                            preparedStatement.setString(2, aM.G("file_housing_ind"));
                            preparedStatement.setString(3, (String)object);
                            preparedStatement.setString(4, string);
                            preparedStatement.setString(5, (String)object2);
                            preparedStatement.execute();
                            preparedStatement.close();
                            PreparedStatement preparedStatement2 = GUI.c().prepareStatement((String)object4);
                            preparedStatement2.setString(1, aM.G("file_housing_col"));
                            preparedStatement2.setString(2, aM.G("file_housing_ind"));
                            preparedStatement2.setString(3, (String)object);
                            preparedStatement2.setString(4, string);
                            preparedStatement2.setString(5, (String)object2);
                            preparedStatement2.execute();
                            preparedStatement2.close();
                            object4 = "SELECT zip,city,street FROM " + aO + " WHERE zipcitystreet=?";
                            object2 = GUI.d().prepareStatement((String)object4);
                            object2.setString(1, (String)object3);
                            object3 = object2.executeQuery();
                            if (!(!object3.next() || object.contentEquals(object3.getString("zip")) && string.contentEquals(object3.getString("city")) && string.contentEquals(object3.getString("street")))) {
                                object4 = "UPDATE " + aO + " SET housing=? WHERE housing=? AND zip=? AND city=? AND street=?";
                                object = GUI.b().prepareStatement((String)object4);
                                object.setString(1, aM.G("file_housing_col"));
                                object.setString(2, aM.G("file_housing_ind"));
                                object.setString(3, object3.getString("zip"));
                                object.setString(4, object3.getString("city"));
                                object.setString(5, object3.getString("street"));
                                object.execute();
                                object.close();
                                object = GUI.c().prepareStatement((String)object4);
                                object.setString(1, aM.G("file_housing_col"));
                                object.setString(2, aM.G("file_housing_ind"));
                                object.setString(3, object3.getString("zip"));
                                object.setString(4, object3.getString("city"));
                                object.setString(5, object3.getString("street"));
                                object.execute();
                                object.close();
                            }
                            object3.close();
                            object2.close();
                            break block8;
                        }
                        ++n2;
                    }
                    break block8;
                }
                String string3 = "UPDATE " + aO + " SET housing=? WHERE housing=? AND zip=? AND city=? AND street=?";
                PreparedStatement preparedStatement = GUI.b().prepareStatement(string3);
                preparedStatement.setString(1, aM.G("file_housing_col"));
                preparedStatement.setString(2, aM.G("file_housing_ind"));
                preparedStatement.setString(3, (String)object);
                preparedStatement.setString(4, string);
                preparedStatement.setString(5, (String)object2);
                preparedStatement.execute();
                preparedStatement.close();
                AutoCloseable autoCloseable = GUI.c().prepareStatement(string3);
                autoCloseable.setString(1, aM.G("file_housing_col"));
                autoCloseable.setString(2, aM.G("file_housing_ind"));
                autoCloseable.setString(3, (String)object);
                autoCloseable.setString(4, string);
                autoCloseable.setString(5, (String)object2);
                autoCloseable.execute();
                autoCloseable.close();
                string3 = "SELECT zip,city,street FROM " + aO + " WHERE zipcitystreet=?";
                preparedStatement = GUI.d().prepareStatement(string3);
                preparedStatement.setString(1, (String)object3);
                autoCloseable = preparedStatement.executeQuery();
                if (!(!autoCloseable.next() || object.contentEquals(autoCloseable.getString("zip")) && string.contentEquals(autoCloseable.getString("city")) && string.contentEquals(autoCloseable.getString("street")))) {
                    string3 = "UPDATE " + aO + " SET housing=? WHERE housing=? AND zip=? AND city=? AND street=?";
                    PreparedStatement preparedStatement3 = GUI.b().prepareStatement(string3);
                    preparedStatement3.setString(1, aM.G("file_housing_col"));
                    preparedStatement3.setString(2, aM.G("file_housing_ind"));
                    preparedStatement3.setString(3, autoCloseable.getString("zip"));
                    preparedStatement3.setString(4, autoCloseable.getString("city"));
                    preparedStatement3.setString(5, autoCloseable.getString("street"));
                    preparedStatement3.execute();
                    preparedStatement3.close();
                    object2 = GUI.c().prepareStatement(string3);
                    object2.setString(1, aM.G("file_housing_col"));
                    object2.setString(2, aM.G("file_housing_ind"));
                    object2.setString(3, autoCloseable.getString("zip"));
                    object2.setString(4, autoCloseable.getString("city"));
                    object2.setString(5, autoCloseable.getString("street"));
                    object2.execute();
                    object2.close();
                }
                autoCloseable.close();
                preparedStatement.close();
            }
            catch (Throwable throwable) {}
        }
        return bl2;
    }

    private static boolean a(String[][] object) {
        Object object2;
        block12 : {
            block11 : {
                if (!aH.D("adv_sql").contentEquals("0")) break block11;
                return false;
            }
            if (GUI.D().contains(" White and Yellow")) {
                object2 = new String[]{"created_on", "zip", "city", "street", "name", "mail", "phone1", "phone2", "phone3", "mobile1", "fax", "site", "comment", "company", "phone1_marketing_accept", "phone2_marketing_accept", "phone3_marketing_accept", "mobile1_marketing_accept", "fax_marketing_accept"};
                break block12;
            }
            if (GUI.D().contains(" Yellow")) {
                object2 = new String[]{"created_on", "zip", "city", "street", "name", "mail", "phone1", "phone2", "phone3", "mobile1", "fax", "site", "comment", "company", "phone1_marketing_accept", "phone2_marketing_accept", "phone3_marketing_accept", "mobile1_marketing_accept", "fax_marketing_accept"};
                break block12;
            }
            if (GUI.D().contains(" White")) {
                object2 = new String[]{"created_on", "zip", "city", "street", "title", "name", "surname", "mail", "phone1", "phone2", "phone3", "mobile1", "fax", "site", "comment", "company", "housing", "age", "nationality", "phone1_marketing_accept", "phone2_marketing_accept", "phone3_marketing_accept", "mobile1_marketing_accept", "fax_marketing_accept"};
                break block12;
            }
            return false;
        }
        try {
            try {
                int n2 = 0;
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
                int n3 = 0;
                while (n3 < ((String[][])object).length) {
                    if (object[n3][0].contentEquals(object2[n2])) {
                        linkedHashMap.put(object[n3][0], object[n3][1]);
                        ++n2;
                    }
                    ++n3;
                }
                linkedHashMap.put("computer", "");
                linkedHashMap.put("locked", "0");
                String string = aH.D("adv_sql_host");
                object = aH.D("adv_sql_db");
                object2 = aH.D("adv_sql_user");
                String string2 = aH.D("adv_sql_password");
                object = SQL.a(string, (String)object, (String)object2, string2);
                SQL.a((java.sql.Connection)object, GUI.D().replace(" ", "_").toLowerCase(), linkedHashMap);
                object.close();
            }
            catch (Throwable throwable) {}
        }
        catch (Throwable throwable) {
            object = throwable;
            throw throwable;
        }
        return false;
    }

    private static String[] a(HashMap object, String string) {
        String[] arrstring;
        String string2 = (String)object.get("gender");
        String string3 = (String)object.get("age");
        object = (String)object.get("nationality");
        arrstring = new String[]{string2, string3, object};
        try {
            if (string.contains("{")) {
                return arrstring;
            }
            if (GUI.D().contains(" Yellow")) {
                return arrstring;
            }
            String string4 = bn.Q("genderDeduct");
            String string5 = bn.Q("ageDeduct");
            String string6 = "1";
            if (string4.contentEquals("0") && string5.contentEquals("0")) {
                return arrstring;
            }
            string = Normalizer.normalize(string, Normalizer.Form.NFD);
            string = string.replaceAll("[^\\p{ASCII}]", "");
            string = string.toLowerCase().trim();
            string = string.replace(" ", "-");
            string = J.y(string);
            if (string4.contentEquals("1")) {
                string2 = aM.G("file_title_mf");
            }
            if (string5.contentEquals("1")) {
                string3 = aM.G("file_age");
            }
            if (string6.contentEquals("1")) {
                object = "";
            }
            if (string != null && string.contains("\u00a4")) {
                if (string4.contentEquals("1")) {
                    string2 = string.split("\u00a4", -1)[0];
                    string2 = string2.contentEquals("0") ? aM.G("file_title_m") : (string2.contentEquals("1") ? aM.G("file_title_f") : aM.G("file_title_mf"));
                }
                if (string5.contentEquals("1")) {
                    string3 = string.split("\u00a4", -1)[1];
                }
                if (string6.contentEquals("1")) {
                    object = string.split("\u00a4", -1)[2];
                }
            }
            arrstring[0] = string2;
            arrstring[1] = string3;
            arrstring[2] = object;
        }
        catch (Throwable throwable) {}
        return arrstring;
    }

    private static String[] a(String string, String string2, String string3, String string4) {
        String[] arrstring;
        arrstring = new String[]{string, string2, string4};
        try {
            if (GUI.D().contains(" Yellow")) {
                return arrstring;
            }
            String string5 = bn.Q("genderDeduct");
            String string6 = bn.Q("ageDeduct");
            String string7 = "1";
            if (string5.contentEquals("0") && string6.contentEquals("0")) {
                return arrstring;
            }
            string3 = Normalizer.normalize(string3, Normalizer.Form.NFD);
            string3 = string3.replaceAll("[^\\p{ASCII}]", "");
            string3 = string3.toLowerCase().trim();
            string3 = string3.replace(" ", "-");
            string3 = J.y(string3);
            if (string5.contentEquals("1")) {
                string = aM.G("file_title_mf");
            }
            if (string6.contentEquals("1")) {
                string2 = aM.G("file_age");
            }
            if (string7.contentEquals("1")) {
                string4 = "";
            }
            if (string3 != null && string3.contains("\u00a4")) {
                if (string5.contentEquals("1")) {
                    string = string3.split("\u00a4", -1)[0];
                    string = string.contentEquals("0") ? aM.G("file_title_m") : (string.contentEquals("1") ? aM.G("file_title_f") : aM.G("file_title_mf"));
                }
                if (string6.contentEquals("1")) {
                    string2 = string3.split("\u00a4", -1)[1];
                }
                if (string7.contentEquals("1")) {
                    string4 = string3.split("\u00a4", -1)[2];
                }
            }
            arrstring[0] = string;
            arrstring[1] = string2;
            arrstring[2] = string4;
        }
        catch (Throwable throwable) {}
        return arrstring;
    }

    private static String[] a(String string, String object, String object2, String arrstring, String string2) {
        String[] arrstring2;
        arrstring2 = new String[]{string, object};
        try {
            if (GUI.D().contains(" Yellow")) {
                return arrstring2;
            }
            String string3 = string;
            String string4 = object;
            if (!object2.contentEquals("")) {
                arrstring2[0] = "{" + string + "}";
                return arrstring2;
            }
            if (GUI.D().contains(" White and Yellow")) {
                if (arrstring.contentEquals("Particulier")) {
                    if ((bn.Q("separateforename").contentEquals("1") || bn.Q("genderDeduct").contentEquals("1") || bn.Q("ageDeduct").contentEquals("1")) && object.contentEquals("") && !string.startsWith("{") && GUI.D().contains(" 712") && (object2 = Integer.valueOf(string.lastIndexOf(" "))).intValue() < string.length() && object2.intValue() > 0 && string.length() > object2.intValue() + 1) {
                        object = string.substring(0, object2.intValue());
                        string = string.substring(object2.intValue(), string.length());
                    }
                } else if (bn.Q("professionnalMark").contentEquals("1")) {
                    string = "{" + string + "}";
                }
            } else if (GUI.D().contains(" White")) {
                if (!(string2.contentEquals("") && arrstring.contentEquals("") && string2.contentEquals("") || string.contains("{"))) {
                    string = "{" + string + "}";
                } else if (GUI.D().contains("France White") && !string.contains("{")) {
                    object2 = new String[]{"direction .*", ".* conception $", ".*\\(sa\\) $", "mairie $", "plomberie .*", "atelier .*", "energie .*", ".*\\(sarl\\)", ".* sarl$", ".* sarl .*", "^sarl .*", "communaut\u00e9s? .*", "bureau .*", "club [a-z] [a-z] .*", "paroisse .*", ".*\\(asso\\) $", ".* loisirs .*", "hotel .*", ".* \\(scm\\).*", "universit\u00e9 .*", ".*\\(ets\\) $", ".*\\(eurl\\) $", ".*\\(sci\\) $", "tennis.*club", ".*informatique.*", "centre .*", "association .*", "ctre .*", "coop\u00e9rative .*", ".* catholiques? .* ", "expl .*", ".* immobilier.*", "entreprise .*", ".* entreprise .* ", "camping .*", "soci\u00e9t\u00e9 .*", "restauration .*", "restaurant .*", "office des? .*", "syndicat .*", "maison des? .*", ".*groupe scolaire.*", "ecole.*coll\u00e8ge.*", "ecole.*primaire.*", "comit\u00e9 .*"};
                    int n2 = 0;
                    while (n2 < ((String[])object2).length) {
                        if (string.toLowerCase().matches(object2[n2])) {
                            string = "{" + string + "}";
                            break;
                        }
                        ++n2;
                    }
                } else if (GUI.D().contains("Belgium White")) {
                    object2 = string;
                    object2 = Normalizer.normalize((CharSequence)object2, Normalizer.Form.NFD);
                    object2 = object2.replaceAll("[^\\p{ASCII}]", "");
                    arrstring = new String[]{"direction", "conception", "mairie", "plomberie", "atelier", "energie", "sarl", "communautes?", "bureau", "club", "paroisse", "asso", "association", "loisirs ", "hotel", "scm", "universite", "ets", "eurl", "sci", "tennis", "informatique", "centre", "ctre", "cooperative", "catholiques?", "expl", "immobilier", "entreprise", "camping", "societe", "restauration", "restaurant", "office", "syndicat", "maison", "groupe", "scolaire", "college", "lycee", "ecole", "primaire.*", "International", "Therapies?", "informatica", "Holding", "Medical", "Pneu", "Express", "Avocat", "Services?", "ASSURANCES?", "Consulting", "MUTUALITE", "SOCIALISTE", "Porte", "Strategy", "Management", "Associes?", "Hypothecaire", "Technology", "Esthetic", "Companies?", "notaire", "Foundation", "Estate", "air", "fresh", "Belgium", "Belgique", "france", "Media", "Organisation", "les", "des", "au", "and", "Distribution", "sports?", "el", "languages?", "agences?", "presse", "ficances?", "le", "la", "Associes?", "-", "pizzerias?", "finances?", "Invest", "[0-9]+", "labo", "Espace", "buro", "Continental", "Expert", "Chambre", "commerce", "canada", "Associates", "Communication", "region de", "sprl", "scrl", "asbl", "sa-nv", "sa", "bvba", "\\)", "\\(.*", "Advocaten"};
                    int n3 = 0;
                    while (n3 < arrstring.length) {
                        String string5 = arrstring[n3] + " .*";
                        String string6 = ".* " + arrstring[n3] + " .*";
                        String string7 = ".* " + arrstring[n3];
                        if (object2.toLowerCase().matches(string5.toLowerCase())) {
                            string = "{" + string + "}";
                            break;
                        }
                        if (object2.toLowerCase().matches(string7.toLowerCase())) {
                            string = "{" + string + "}";
                            break;
                        }
                        if (object2.toLowerCase().matches(string6.toLowerCase())) {
                            string = "{" + string + "}";
                            break;
                        }
                        ++n3;
                    }
                }
                if ((bn.Q("separateforename").contentEquals("1") || bn.Q("genderDeduct").contentEquals("1") || bn.Q("ageDeduct").contentEquals("1")) && object.contentEquals("") && !string.startsWith("{")) {
                    if (GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contains(" Canada")) {
                        object2 = string.lastIndexOf(" ");
                        if (object2.intValue() < string.length() && object2.intValue() > 0 && string.length() > object2.intValue() + 1) {
                            object = string.substring(0, object2.intValue());
                            string = string.substring(object2.intValue(), string.length());
                        }
                    } else if (GUI.D().contains(" Belgium")) {
                        object2 = string.lastIndexOf(" ");
                        if (object2.intValue() < string.length() && object2.intValue() > 0 && string.length() > object2.intValue() + 1) {
                            object = string.substring(object2.intValue(), string.length());
                            string = string.substring(0, object2.intValue());
                        }
                    } else if (GUI.D().contains(" Luxembourg")) {
                        object2 = string.lastIndexOf(" ");
                        if (object2.intValue() < string.length() && object2.intValue() > 0 && string.length() > object2.intValue() + 1) {
                            object = string.substring(0, object2.intValue());
                            string = string.substring(object2.intValue(), string.length());
                        }
                    } else {
                        object2 = string.indexOf(" ");
                        if (string.length() > 0 && object2.intValue() > 0 && object2.intValue() <= string.length()) {
                            object = string.substring(object2.intValue());
                            string = string.substring(0, object2.intValue());
                        }
                    }
                }
                if (GUI.D().contains("United Kingdom White")) {
                    String string8;
                    object2 = string;
                    string = string8 = object;
                    object = object2;
                }
            }
            if (bn.Q("separateforename").contentEquals("0")) {
                if (!string.contains("{")) {
                    string = string3;
                }
                object = string4;
            }
            arrstring2[0] = string;
            arrstring2[1] = object;
        }
        catch (Throwable throwable) {}
        return arrstring2;
    }

    public static String i(bb bb2) {
        String string;
        string = "false";
        boolean bl2 = false;
        try {
            String string2;
            String string3 = bb2.O();
            if (!(string3.contentEquals("firstpage") || string3.contentEquals("nextpage") || string3.contentEquals("detailpage"))) {
                return string;
            }
            if (string3.contentEquals("firstpage") && GUI.F().contentEquals("browser")) {
                bi.j(bb2);
            }
            string = string2 = bi.g(bb2);
            if (string2.contentEquals("true") || string2.contentEquals("ipblacklist")) {
                bi.c(bb2);
                return string;
            }
            if (bb2.getHtml() == "") {
                if (GUI.a().equals(Level.FINEST)) {
                    a.a(String.valueOf(GUI.w()) + bb2.Z() + "_" + bb2.aa() + "_vide.html", bb2.getHtml().toString());
                }
                Proxys.a(bb2);
                bi.b(bb2);
            } else {
                boolean bl3 = bi.e(bb2);
                if (bl3) {
                    if (GUI.a().equals(Level.FINEST)) {
                        String string4 = "";
                        if (bb2.O().contentEquals("detailpage")) {
                            string4 = "_detail";
                        }
                        if (bb2.aa().matches("[0-9]*")) {
                            a.a(String.valueOf(GUI.w()) + bb2.Z() + "_" + bb2.aa() + string4 + "_incomplet.html", bb2.getHtml().toString());
                        } else {
                            a.a(String.valueOf(GUI.w()) + bb2.Z() + "_" + bb2.Y() + string4 + "_str_incomplet.html", bb2.getHtml().toString());
                        }
                    }
                    Proxys.a(bb2);
                    bi.b(bb2);
                } else {
                    if (GUI.a().equals(Level.FINEST)) {
                        String string5 = "";
                        if (bb2.O().contentEquals("detailpage")) {
                            string5 = "_detail";
                        }
                        if (bb2.aa().matches("[0-9]*")) {
                            a.a(String.valueOf(GUI.w()) + bb2.Z() + "_" + bb2.aa() + string5 + "_ok.html", bb2.getHtml().toString());
                        } else {
                            a.a(String.valueOf(GUI.w()) + bb2.Z() + "_" + bb2.Y() + string5 + "_str_ok.html", bb2.getHtml().toString());
                        }
                    }
                    if (string3.contentEquals("firstpage") && bn.Q("lastSearchHistory").contentEquals("browser")) {
                        bi.k(bb2);
                    }
                    List list = Parser.a(bb2);
                    if (bb2.getHtml().toString().contains("ambiguite_ou_container") && (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) || list.size() <= 0 && string3.contentEquals("firstpage") && (GUI.D().contains("United Kingdom") || GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow") || GUI.D().contains("Morocco Yellow"))) {
                        bi.h(bb2);
                        list.clear();
                    }
                    if (!string3.contentEquals("detailpage") && bn.Q("detailcapture").contentEquals("1") || (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) && (bb2.getHtml().toString().contains("r\u00e9sultats \u00e0 proximit\u00e9") || bb2.getHtml().toString().contains("proximite=1")) && !string3.contentEquals("detailpage")) {
                        bi.b(bb2, list);
                    } else {
                        bl2 = bi.a(bb2, list);
                    }
                    if (!bl2 && GUI.D().contentEquals("IQUALIF Canada White")) {
                        bi.b(bb2);
                    } else {
                        bi.f(bb2);
                        bi.c(bb2);
                        string = "true";
                    }
                }
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static boolean f(bb object) {
        try {
            String[][] arrstring = object.O();
            Object object2 = object.getHtml();
            String string = object.Z();
            object = object.getUrl();
            if (!(arrstring.contentEquals("firstpage") || arrstring.contentEquals("nextpage") || arrstring.contentEquals("detailpage"))) {
                return false;
            }
            boolean bl2 = bi.k(object2.toString());
            if (bl2) {
                object = Parser.c((String)object2, (String)arrstring, (String)object);
                Integer n2 = Parser.b((String)object2);
                if (bn.Q("useLastPageNumber").contentEquals("0")) {
                    if (!object.contentEquals("0")) {
                        if (GUI.D().contains("Belgium")) {
                            if ((object = Parser.d((String)object, (String)object2, "nextpagenumber")).contentEquals("")) {
                                return false;
                            }
                        } else if (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) {
                            object = object.replace("&quot;", "");
                            object = a.h((String)object);
                        }
                        arrstring = new String[][]{{"streetId", string}, {"page_id", object}};
                        SQL.a(GUI.a(), aM, arrstring);
                    }
                } else if (arrstring.contentEquals("firstpage") && bn.Q("useLastPageNumber").contentEquals("1")) {
                    if (n2 > 0) {
                        if (GUI.D().contains("Belgium")) {
                            arrstring = 20.0;
                            object2 = Math.ceil((double)n2.intValue() / arrstring.doubleValue());
                            n2 = object2.intValue();
                        }
                        arrstring = GUI.a().getText();
                        int n3 = 2;
                        while (n3 <= n2) {
                            Object object3 = GUI.D().contains("Morocco") ? object.replaceAll("page=([0-9]+)&", "page=" + String.valueOf(n3) + "&") : object.replaceAll("/([0-9]+)/?$", "/" + String.valueOf(n3));
                            object3 = new String[][]{{"streetId", string}, {"page_id", object3}};
                            int n4 = n3 - 1;
                            int n5 = n2 - 1;
                            SwingUtilities.invokeAndWait(new bm((String)arrstring, n4, n5));
                            SQL.a(GUI.a(), aM, object3);
                            ++n3;
                        }
                    } else if (GUI.D().contentEquals("IQUALIF Morocco Yellow") && n2 <= 0 && !object.contentEquals("0")) {
                        arrstring = new String[][]{{"streetId", string}, {"page_id", object}};
                        SQL.a(GUI.a(), aM, arrstring);
                    }
                } else if (GUI.D().contentEquals("IQUALIF Morocco Yellow") && n2 <= 0 && !object.contentEquals("0")) {
                    arrstring = new String[][]{{"streetId", string}, {"page_id", object}};
                    SQL.a(GUI.a(), aM, arrstring);
                }
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static String j(bb object) {
        String string;
        block24 : {
            Statement statement;
            string = "";
            statement = null;
            try {
                try {
                    java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + o);
                    String string2 = "";
                    String string3 = "";
                    String string4 = "";
                    boolean bl2 = false;
                    boolean bl3 = false;
                    boolean bl4 = false;
                    Object object2 = bn.Q("parseBrowserZip");
                    String string5 = bn.Q("parseBrowserCity");
                    String string6 = bn.Q("parseBrowserStreet");
                    String string7 = object.getHtml();
                    String string8 = object.Z();
                    object2 = Pattern.compile((String)object2);
                    object2 = object2.matcher(string7);
                    if (object2.find()) {
                        string2 = object2.group(1);
                        bl2 = true;
                    }
                    object2 = Pattern.compile(string5);
                    if ((object2 = object2.matcher(string7)).find()) {
                        string3 = object2.group(1);
                        bl3 = true;
                    }
                    object2 = Pattern.compile(string6);
                    if ((object2 = object2.matcher(string7)).find()) {
                        string4 = object2.group(1);
                        bl4 = true;
                    }
                    if (GUI.D().contentEquals("IQUALIF France Yellow")) {
                        object2 = "(?is)<INPUT value=([-0-9]*) type=hidden name=idContext>";
                        string5 = "(?is)<INPUT id=ou .*? value=(.*?) maxLength=256 .*?name=ou .*?";
                        string6 = "(?is)<INPUT id=quoiqui .*? value=(.*?) type=text.*?name=quoiqui .*?";
                        if (!bl2) {
                            object2 = Pattern.compile((String)object2);
                            if ((object2 = object2.matcher(string7)).find()) {
                                string2 = object2.group(1);
                                string2 = string2.replaceAll("\"", "");
                            }
                        }
                        if (!bl3) {
                            object2 = Pattern.compile(string5);
                            if ((object2 = object2.matcher(string7)).find()) {
                                string3 = object2.group(1);
                                string3 = string3.replaceAll("\"", "");
                            }
                        }
                        if (!bl4) {
                            object2 = Pattern.compile(string6);
                            if ((object2 = object2.matcher(string7)).find()) {
                                string4 = object2.group(1);
                                string4 = string4.replaceAll("\"", "");
                            }
                        }
                    }
                    object.M(string2);
                    object.N(string3);
                    object.O(string4);
                    object = "UPDATE " + aO + " SET zip=?,city=?,street=? WHERE streetId=?";
                    statement = connection.prepareStatement((String)object);
                    object = K.F(string3);
                    string3 = K.F(string4);
                    statement.setString(1, string2);
                    statement.setString(2, (String)object);
                    statement.setString(3, string3);
                    statement.setString(4, string8);
                    statement.execute();
                    connection.close();
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block24;
                }
            }
            catch (Throwable throwable) {
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return string;
    }

    private static boolean b(bb object, List list) {
        try {
            object = object.Z();
            int n2 = 0;
            while (n2 < list.size()) {
                Object object2 = (HashMap)list.get(n2);
                object2 = (List)object2.get("urldetail");
                a.a((List)object2);
                int n3 = 0;
                while (n3 < object2.size()) {
                    String[][] arrstring = new String[][]{{"streetId", object}, {"page_id", (String)object2.get(n3)}};
                    SQL.a(GUI.a(), aN, arrstring);
                    ++n3;
                }
                ++n2;
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static String k(bb object) {
        String string;
        block18 : {
            Statement statement;
            string = "false";
            statement = null;
            try {
                try {
                    Object object2 = object.getHtml();
                    object = object.Z();
                    String string2 = "zip";
                    String string3 = "city";
                    String string4 = "street";
                    if (GUI.D().contains("Polynesie White")) {
                        Object object3 = ".*SELECT .*id=\"?R_ile\"?.* selected value=\"?(.*?)\"?>.*";
                        String string5 = ".*SELECT .*id=\"?R_commune\"?.* selected value=\"?(.*?)\"?>.*";
                        String string6 = ".*INPUT .*id=\"?R_quoiqui\"?.* value=\"?(.*?)\"? .*";
                        object3 = Pattern.compile((String)object3);
                        if ((object3 = object3.matcher((CharSequence)object2)).find()) {
                            string2 = object3.group(1);
                        }
                        object3 = Pattern.compile(string5);
                        if ((object3 = object3.matcher((CharSequence)object2)).find()) {
                            string3 = object3.group(1);
                        }
                        if ((object2 = (object3 = Pattern.compile(string6)).matcher((CharSequence)object2)).find()) {
                            string4 = object2.group(1);
                        }
                        object2 = SQL.a(String.valueOf(GUI.A()) + p);
                        object3 = "UPDATE " + aO + " SET zip=?,city=?,street=? WHERE streetId=?";
                        statement = object2.prepareStatement((String)object3);
                        string3 = K.F(string3);
                        statement.setString(1, string2);
                        statement.setString(2, string3);
                        statement.setString(3, string4);
                        statement.setString(4, (String)object);
                        statement.execute();
                        object2.close();
                    }
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block18;
                }
            }
            catch (Throwable throwable) {
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return string;
    }

    private static boolean v() {
        try {
            java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + aG);
            String string = "UPDATE " + aK + " SET error='0'";
            connection.createStatement().executeUpdate(string);
            connection.close();
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static boolean w() {
        try {
            java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + aG);
            String[][] arrstring = new String[][]{new String[0]};
            SQL.a(connection, aK, arrstring, "");
            connection.close();
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean a(JTable jTable, List arrn, String string, List list, String string2, HashMap hashMap) {
        try {
            java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + o);
            Object object = new String[][]{new String[0]};
            SQL.a(connection, aO, object, "");
            if (string2.contentEquals("auto") && (GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow"))) {
                bi.a((List)arrn, hashMap);
            } else if (string2.contentEquals("half")) {
                arrn = jTable.getSelectedRows();
                int n2 = 0;
                while (n2 < arrn.length) {
                    object = (String)jTable.getValueAt(arrn[n2], 1);
                    String string3 = (String)jTable.getValueAt(arrn[n2], 2);
                    if ((GUI.D().contains("Switzerland ") || GUI.D().contains("Swiss ") || GUI.D().contains("Belgium ")) && string3.contentEquals(aM.G("dlg_man_city"))) {
                        string3 = "";
                    }
                    list.add("\u00a4" + (String)object + "\u00a4" + string3 + "\u00a4" + string);
                    ++n2;
                }
                bi.a(list, hashMap);
            }
            connection.close();
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static boolean b(File file, String string) {
        boolean bl2;
        List list;
        block37 : {
            block35 : {
                block36 : {
                    bl2 = true;
                    new java.util.ArrayList();
                    list = null;
                    if (file.getName().endsWith(".csv") || file.getName().endsWith(".txt")) {
                        list = a.a(file);
                        break block35;
                    }
                    if (!file.getName().endsWith(".xls")) break block36;
                    GUI.d(aM.G("dlg_file_unsupported"), aM.G("dlg_start"));
                    return false;
                }
                if (file.getName().endsWith(".xlsx")) {
                    GUI.d(aM.G("dlg_file_unsupported"), aM.G("dlg_start"));
                    return false;
                }
                return false;
            }
            int n2 = 0;
            while (n2 < list.size()) {
                String string2 = (String)list.get(n2);
                if (list.size() <= 1 || n2 != 0) {
                    file = (File)(string2.length() - string2.replace(",", "").length());
                    int n3 = string2.length() - string2.replace(";", "").length();
                    int n4 = string2.length() - string2.replace(":", "").length();
                    if (file == false && n3 == 0) {
                        if (n4 > 0) {
                            string = ":";
                        }
                    } else if (n3 > file) {
                        string = ";";
                    } else if (file > n3) {
                        string = ",";
                    }
                    if (n2 >= 5) break;
                }
                ++n2;
            }
            if (string != null) break block37;
            GUI.d(String.valueOf(aM.G("dlg_file_separator_unsupported")) + " ( ex : 10.0.0.1:3128 or socks;10.0.0.1:3128 or socks;10.0.0.1;3128;user;pass )", aM.G("dlg_start"));
            return false;
        }
        try {
            Object object;
            java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + aG);
            String string3 = "ip";
            String string4 = "port";
            String string5 = "http";
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            boolean bl6 = false;
            boolean bl7 = false;
            Integer n5 = -1;
            Integer n6 = -1;
            Integer n7 = -1;
            Integer n8 = -1;
            Integer n9 = -1;
            String string6 = "localhost";
            String string7 = "3128";
            String string8 = "http";
            String string9 = "";
            String string10 = "";
            if (list.size() == 1) {
                GUI.d("The file needs to contains at least 2 lines because the first line is ignored ( ex : 10.0.0.1:3128 or socks;10.0.0.1:3128 or socks;10.0.0.1;3128;user;pass )", aM.G("dlg_start"));
                connection.close();
                return true;
            }
            int n10 = 0;
            while (n10 < list.size()) {
                object = ((String)list.get(n10)).split(string, -1);
                if (n10 == 0) {
                    int n11 = 0;
                    while (n11 < ((String[])object).length) {
                        String string11 = object[n11].toLowerCase();
                        if (string11.contentEquals(string3) || string11.matches("^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$") || string11.matches("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$") || string11.matches("^((([0\u20139A-Fa-f]{1,4}:){7}[0\u20139A-Fa-f]{1,4})|(([0\u20139A-Fa-f]{1,4}:){6}:[0\u20139A-Fa-f]{1,4})|(([0\u20139A-Fa-f]{1,4}:){5}:([0\u20139A-Fa-f]{1,4}:)?[0\u20139A-Fa-f]{1,4})|(([0\u20139A-Fa-f]{1,4}:){4}:([0\u20139A-Fa-f]{1,4}:){0,2}[0\u20139A-Fa-f]{1,4})|(([0\u20139A-Fa-f]{1,4}:){3}:([0\u20139A-Fa-f]{1,4}:){0,3}[0\u20139A-Fa-f]{1,4})|(([0\u20139A-Fa-f]{1,4}:){2}:([0\u20139A-Fa-f]{1,4}:){0,4}[0\u20139A-Fa-f]{1,4})|(([0\u20139A-Fa-f]{1,4}:){6}((b((25[0\u20135])|(1d{2})|(2[0\u20134]d)|(d{1,2}))b).){3}(b((25[0\u20135])|(1d{2})|(2[0\u20134]d)|(d{1,2}))b))|(([0\u20139A-Fa-f]{1,4}:){0,5}:((b((25[0\u20135])|(1d{2})|(2[0\u20134]d)|(d{1,2}))b).){3}(b((25[0\u20135])|(1d{2})|(2[0\u20134]d)|(d{1,2}))b))|(::([0\u20139A-Fa-f]{1,4}:){0,5}((b((25[0\u20135])|(1d{2})|(2[0\u20134]d)|(d{1,2}))b).){3}(b((25[0\u20135])|(1d{2})|(2[0\u20134]d)|(d{1,2}))b))|([0\u20139A-Fa-f]{1,4}::([0\u20139A-Fa-f]{1,4}:){0,5}[0\u20139A-Fa-f]{1,4})|(::([0\u20139A-Fa-f]{1,4}:){0,6}[0\u20139A-Fa-f]{1,4})|(([0\u20139A-Fa-f]{1,4}:){1,7}:))$")) {
                            bl3 = true;
                            n5 = n11;
                        } else if (string11.contentEquals(string4) || string11.matches("^[0-9]+$")) {
                            bl4 = true;
                            n6 = n11;
                        } else if (string11.contentEquals(string5) || string11.matches("socks") || string11.matches("socks4") || string11.matches("socks5") || string11.matches("http") || string11.matches("https")) {
                            bl5 = true;
                            n7 = n11;
                        } else if (((String[])object).length >= 5) {
                            bl6 = true;
                            n8 = 3;
                            bl7 = true;
                            n9 = 4;
                        } else {
                            bl2 = true;
                        }
                        ++n11;
                    }
                    if (!bl3 && !bl4) {
                        GUI.d(String.valueOf(aM.G("dlg_file_separator_unsupported")) + " ( ex : 10.0.0.1:3128 or socks;10.0.0.1:3128 or socks;10.0.0.1;3128;user;pass )", aM.G("dlg_start"));
                        bl2 = true;
                        connection.close();
                        return true;
                    }
                    bi.w();
                } else {
                    if (bl3) {
                        string6 = object[n5];
                    }
                    if (bl4) {
                        string7 = object[n6];
                    }
                    if (bl5) {
                        string8 = object[n7];
                    }
                    if (bl6) {
                        string9 = object[n8];
                    }
                    if (bl7) {
                        string10 = object[n9];
                    }
                    String[][] arrstring = new String[][]{{"protocol", string8}, {"ip", string6}, {"port", string7}, {"user", string9}, {"pass", string10}, {"error", "0"}, {"locked", "0"}};
                    bl2 = SQL.a(connection, aK, arrstring);
                }
                ++n10;
            }
            if (bn.Q("proxy_use").contentEquals("0") && !GUI.a("_setting_proxy_use").isSelected()) {
                GUI.a("_setting_proxy_use").setSelected(true);
                bn.d(GUI.D(), "proxy_use", "1");
            }
            Date date = new Date();
            object = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String string12 = object.format(date);
            bn.d(GUI.D(), "lastProxyUpdate", string12);
            GUI.d(aM.G("dlg_stg_ok"), aM.G("dlg_start"));
            connection.close();
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static boolean x() {
        try {
            a.clear();
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static boolean b(String arrstring, String string) {
        try {
            arrstring = arrstring.split("\u00a4", -1);
            String string2 = arrstring[1];
            String string3 = arrstring[2];
            String string4 = "";
            int n2 = 0;
            while (n2 < arrstring.length) {
                if (n2 > 2) {
                    string4 = String.valueOf(string4) + arrstring[n2] + "\u00a4";
                }
                ++n2;
            }
            if (string4.endsWith("\u00a4")) {
                string4 = string4.substring(0, string4.length() - 1);
            }
            if (string2.contentEquals("iqstatus")) {
                if (GUI.a(String.valueOf(string3) + "srv_ip").getText().contentEquals(string)) {
                    GUI.a(String.valueOf(string3) + "srv_contact").setText(string4.replace("\u00a4", ", "));
                    GUI.a(String.valueOf(string3) + "srv_contact").setBackground(Color.GREEN);
                }
            } else if (string2.contentEquals("iqreplacedb")) {
                Thread.sleep(2000L);
                if (GUI.a() == Level.FINEST) {
                    GUI.d("BDD des id remplacee sur le serveur", "info");
                }
            } else if (string2.contentEquals("iqreplacezipcitystreetdb")) {
                Thread.sleep(2000L);
                if (GUI.a() == Level.FINEST) {
                    GUI.d("BDD zip city street remplacee sur le serveur", "info");
                }
            } else if (string2.contentEquals("iqstart")) {
                Thread.sleep(2000L);
                if (GUI.a() == Level.FINEST) {
                    GUI.d("demande de demarrage effectu\u00e9e", "info");
                }
            } else if (string2.contentEquals("iqpause")) {
                Thread.sleep(15000L);
                if (GUI.a() == Level.FINEST) {
                    GUI.d("demande de mise en pause effectu\u00e9e", "info");
                }
            }
            if (string2.contentEquals("iqstartorpauseelse")) {
                Thread.sleep(15000L);
                if (GUI.a() == Level.FINEST) {
                    GUI.d("d\u00e9marrage ou pause effectu\u00e9e", "info");
                }
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static String g(String object, String object2, String object3) {
        String string;
        string = "";
        try {
            object2 = new Socket((String)object2, (int)Integer.valueOf((String)object3));
            object3 = object2.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)object3);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(String.valueOf(object) + "\n");
            bufferedWriter.flush();
            object = object2.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            string = bufferedReader.readLine();
            object2.close();
            bufferedWriter.close();
            outputStreamWriter.close();
            object3.close();
            bufferedReader.close();
            inputStreamReader.close();
            object.close();
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static boolean l(String arrstring) {
        block16 : {
            Statement statement;
            statement = null;
            try {
                try {
                    if (GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow")) {
                        java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + o);
                        String[][] arrstring2 = new String[][]{new String[0]};
                        SQL.a(connection, aO, arrstring2, "");
                        arrstring = arrstring.split("\u00a4", -1);
                        int n2 = 0;
                        while (n2 < arrstring.length) {
                            Object object = arrstring[n2].split(";", -1);
                            String string = object[0];
                            String string2 = object[1];
                            String string3 = object[2];
                            object = object[3];
                            String string4 = "INSERT INTO " + aO + " (zipId,zip,city,street) VALUES(?,?,?,?);";
                            statement = connection.prepareStatement(string4);
                            statement.setString(1, string);
                            statement.setString(2, string2);
                            statement.setString(3, string3);
                            statement.setString(4, (String)object);
                            statement.executeUpdate();
                            ++n2;
                        }
                        connection.close();
                    }
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block16;
                }
            }
            catch (Throwable throwable) {
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return false;
    }

    public static boolean m(String arrstring) {
        boolean bl2;
        block15 : {
            Statement statement;
            bl2 = false;
            statement = null;
            try {
                try {
                    java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + aG);
                    java.sql.Connection connection2 = SQL.a(String.valueOf(GUI.A()) + aJ);
                    java.sql.Connection connection3 = SQL.a(String.valueOf(GUI.A()) + aC);
                    java.sql.Connection connection4 = SQL.a(String.valueOf(GUI.A()) + aE);
                    java.sql.Connection connection5 = SQL.a(String.valueOf(GUI.A()) + aF);
                    Object object = "stop";
                    aP = "stop";
                    object = String.valueOf(aM.G("file_column")) + "\n";
                    a.a(String.valueOf(GUI.A()) + aD, (String)object);
                    object = new String[][]{new String[0]};
                    SQL.a(connection, aL, object, "");
                    SQL.a(connection, aM, object, "");
                    SQL.a(connection, aN, object, "");
                    SQL.a(connection2, aO, object, "");
                    SQL.a(connection3, aO, object, "");
                    SQL.a(connection4, aO, object, "");
                    SQL.a(connection5, aO, object, "");
                    object = "auto";
                    bn.d(GUI.D(), "lastSearchHistory", (String)object);
                    arrstring = arrstring.split("\u00a4", -1);
                    int n2 = 0;
                    while (n2 < arrstring.length) {
                        String string = arrstring[n2];
                        String string2 = "INSERT INTO " + aL + " (streetId) VALUES(?);";
                        statement = connection.prepareStatement(string2);
                        statement.setString(1, string);
                        statement.executeUpdate();
                        ++n2;
                    }
                    connection.close();
                    connection2.close();
                    connection3.close();
                    connection4.close();
                    connection5.close();
                    bl2 = true;
                }
                catch (Throwable throwable) {
                    if (statement != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {}
                    }
                    break block15;
                }
            }
            catch (Throwable throwable) {
                if (statement != null) {
                    try {
                        statement.close();
                    }
                    catch (Throwable throwable3) {}
                }
                throw throwable;
            }
            if (statement != null) {
                try {
                    statement.close();
                }
                catch (Throwable throwable) {}
            }
        }
        return bl2;
    }

    private static boolean n(String string) {
        try {
            Object object = new ArrayList<String>();
            object.add(string);
            object = "0";
            object = String.valueOf(string.split(":")[2]) + "\u00a4iqstart" + "\u00a4" + (String)object;
            object = bi.g((String)object, string.split(":", -1)[0], string.split(":", -1)[1]);
            bi.b((String)object, string);
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean o(String string) {
        try {
            String string2 = "0";
            string2 = String.valueOf(string.split(":")[2]) + "\u00a4iqpause" + "\u00a4" + string2;
            string2 = bi.g(string2, string.split(":", -1)[0], string.split(":", -1)[1]);
            bi.b(string2, string);
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static boolean a(int n2, int n3, List list, String string) {
        try {
            String string2;
            String string3;
            String string4;
            String string5;
            String string6 = "";
            String string7 = "";
            while (n2 < n3) {
                string2 = (String)list.get(n2);
                string6 = String.valueOf(string2) + "\u00a4" + string6;
                if (GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow")) {
                    string5 = (String)((HashMap)a.get(string2)).get(0);
                    string3 = K.F((String)((HashMap)a.get(string2)).get(1));
                    string4 = K.F((String)((HashMap)a.get(string2)).get(2));
                    string7 = String.valueOf(string2) + ";" + string5 + ";" + string3 + ";" + string4 + "\u00a4" + string7;
                }
                ++n2;
            }
            if (string6.endsWith("\u00a4")) {
                string6 = string6.substring(0, string6.length() - 1);
            }
            if (string7.endsWith("\u00a4")) {
                string7 = string7.substring(0, string7.length() - 1);
            }
            String string8 = "0";
            string2 = String.valueOf(string.split(":", -1)[2]) + "\u00a4iqreplacedb" + "\u00a4" + string8 + "\u00a4" + string6;
            string5 = bi.g(string2, string.split(":", -1)[0], string.split(":", -1)[1]);
            bi.b(string5, string);
            if (GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow")) {
                string3 = "0";
                string4 = String.valueOf(string.split(":", -1)[2]) + "\u00a4iqreplacezipcitystreetdb" + "\u00a4" + string3 + "\u00a4" + string7;
                string8 = bi.g(string4, string.split(":", -1)[0], string.split(":", -1)[1]);
                bi.b(string8, string);
            }
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static String a(String object, List list) {
        String string;
        string = "false";
        try {
            if (!(object.contentEquals("table_t") || object.contentEquals("file_t") || object.contentEquals("manual") || object.contentEquals("half") || object.contentEquals("browser"))) {
                return string;
            }
            java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + aG);
            if (object.contentEquals("table_t")) {
                String string2;
                object = new String[]{"streetId"};
                Object object2 = new String[][]{new String[0]};
                object = SQL.a(connection, aL, (String[])object, (String[][])object2, "");
                object2 = new ArrayList();
                Object object3 = new ArrayList();
                int n2 = 0;
                while (n2 < object.size()) {
                    string2 = (String)((HashMap)object.get(n2)).get("streetId");
                    object2.add(string2);
                    ++n2;
                }
                if (GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow")) {
                    Iterator iterator = a.keySet().iterator();
                    while (iterator.hasNext()) {
                        string2 = iterator.next().toString();
                        object = (String)((HashMap)a.get(string2)).get(0);
                        String string3 = (String)((HashMap)a.get(string2)).get(1);
                        String string4 = (String)((HashMap)a.get(string2)).get(2);
                        object3.add(String.valueOf(string2) + ";" + (String)object + ";" + string3 + ";" + string4);
                    }
                }
                n2 = object2.size() / list.size();
                int n3 = object2.size() % list.size();
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                while (n6 < list.size()) {
                    object3 = (String)list.get(n6);
                    n5 += n2;
                    bi.o((String)object3);
                    if (n2 == 0) {
                        bi.a(n4, object2.size(), (List)object2, (String)object3);
                        break;
                    }
                    if (n6 == list.size() - 1 && n3 > 0) {
                        n5 += n3;
                    }
                    bi.a(n4, n5, (List)object2, (String)object3);
                    bi.n((String)object3);
                    n4 += n2;
                    ++n6;
                }
            }
            connection.close();
            GUI.d("aProcessExpert", "info");
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static String ai() {
        String string;
        string = "false";
        try {
            Object object = new ArrayList<String>();
            object.add("detailpage");
            object.add("nextpage");
            object.add("firstpage");
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                List list = bi.b((String)object, 1);
                int n2 = 0;
                while (n2 < list.size()) {
                    ++n2;
                }
                bi.c((String)object, list);
                bi.a((String)object, list);
                if (list.size() <= 0) continue;
                return string;
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String aj() {
        var0 = "false";
        try {
            SQL.F();
            var1_1 = new ArrayList<String>();
            var1_1.add("detailpage");
            var1_1.add("nextpage");
            var1_1.add("firstpage");
            GUI.a().a();
            Crawler.c();
            do {
                block5 : {
                    GUI.a().a();
                    if (Crawler.a().size() >= GUI.b() << 2) break block5;
                    Thread.sleep(150L);
                    var2_2 = var1_1.iterator();
                    ** GOTO lbl36
                }
                GUI.a().a();
                Crawler.c();
                Thread.sleep(10000L);
            } while (true);
        }
        catch (Throwable v0) {}
        return var0;
lbl-1000: // 1 sources:
        {
            var1_1 = (String)var2_2.next();
            var3_3 = bi.a((String)var1_1, (Integer)(GUI.b() * 6));
            var4_4 = 0;
            while (var4_4 < var3_3.size()) {
                ++var4_4;
            }
            bi.c((String)var1_1, var3_3);
            bi.b((String)var1_1, var3_3);
            bi.c((String)var1_1, var3_3);
            if (var3_3.size() <= 0) continue;
            GUI.a().a();
            if (Crawler.a().size() < GUI.b() << 2) continue;
            return var0;
lbl36: // 3 sources:
            ** while (var2_2.hasNext())
        }
lbl37: // 1 sources:
        return var0;
    }

    private static boolean c(String arrstring, String string, String object) {
        boolean bl2;
        bl2 = false;
        try {
            object = SQL.a(String.valueOf(GUI.A()) + (String)object);
            String string2 = arrstring.split(string).length > 2 ? K.F(arrstring.split(string, -1)[2]) : K.F("");
            String string3 = arrstring.split(string).length > 1 ? K.F(arrstring.split(string, -1)[1]) : K.F("");
            arrstring = new String[][]{{"zipId", ""}, {"cityId", ""}, {"zip", arrstring.split(string, -1)[0]}, {"city", string3}, {"street", string2}};
            bl2 = SQL.a((java.sql.Connection)object, aO, arrstring);
            object.close();
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private static boolean a(List list, HashMap hashMap) {
        boolean bl2;
        bl2 = false;
        try {
            java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + o);
            if (!(GUI.D().contentEquals("IQUALIF United Kingdom White") || GUI.D().contentEquals("IQUALIF United States White") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contains("Yellow"))) {
                connection.close();
                return false;
            }
            JLabel jLabel = (JLabel)hashMap.get("text0");
            DecimalFormat decimalFormat = new DecimalFormat("###");
            a.clear();
            int n2 = 0;
            while (n2 < list.size()) {
                if (((String)hashMap.get("buttontext0")).contentEquals("canceled")) break;
                if (hashMap != null) {
                    if (decimalFormat.format((float)n2 / (float)a.size() * 100.0f).contentEquals("100")) {
                        jLabel.setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step").toLowerCase().trim()) + " 1 / 4 : 99 %<br /><br /></html>");
                    } else {
                        jLabel.setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step").toLowerCase().trim()) + " 1 / 4 : " + decimalFormat.format((float)n2 / (float)list.size() * 100.0f) + " %<br /><br /></html>");
                    }
                }
                Object object = ((String)list.get(n2)).split("\u00a4", -1);
                String string = object[0];
                String string2 = object[1];
                String string3 = object[2];
                object = object[3];
                string3 = K.F(string3);
                object = K.F((String)object);
                object = new String[][]{{"zipId", string}, {"cityId", ""}, {"zip", string2}, {"city", string3}, {"street", object}};
                bl2 = SQL.a(connection, aO, (String[][])object);
                ++n2;
            }
            if (!((String)hashMap.get("buttontext0")).contentEquals("canceled")) {
                bi.a(list, null, "\u00a4");
            }
            connection.close();
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    public static boolean c(File object, String string) {
        try {
            Integer n2 = 0;
            Integer n3 = 0;
            Integer n4 = 0;
            Integer n5 = 0;
            GUI.c().clear();
            object = a.a((File)object);
            int n6 = 0;
            while (n6 < object.size()) {
                Object object2 = ((String)object.get(n6)).split(string, -1);
                if (n6 == 0) {
                    Object object3;
                    GUI.c().add(object2);
                    int n7 = 0;
                    while (n7 < ((String[])object2).length) {
                        object3 = object2[n7];
                        if (object3.toLowerCase().contentEquals("zip") || object3.toLowerCase().contentEquals("cp") || object3.toLowerCase().startsWith("code postal")) {
                            n2 = n7;
                        } else if (object3.toLowerCase().contentEquals("city") || object3.toLowerCase().contentEquals("ville")) {
                            n3 = n7;
                        } else if (object3.toLowerCase().contentEquals("street") || object3.toLowerCase().contentEquals("adresse") || object3.toLowerCase().contentEquals("rue")) {
                            n4 = n7;
                        } else if (object3.toLowerCase().contentEquals("nom") || object3.toLowerCase().contentEquals("name")) {
                            n5 = n7;
                        }
                        ++n7;
                    }
                    JComboBox<String> jComboBox = new JComboBox<String>((E[])object2);
                    jComboBox.setPreferredSize(new Dimension(120, 25));
                    jComboBox.setSelectedIndex(n2);
                    jComboBox.setActionCommand("_zipimportfile");
                    GUI.a("_zipimportfile").setModel(jComboBox.getModel());
                    object3 = new JComboBox<String>((E[])object2);
                    object3.setPreferredSize(new Dimension(120, 25));
                    object3.setSelectedIndex(n3);
                    object3.setActionCommand("_cityimportfile");
                    GUI.a("_cityimportfile").setModel(object3.getModel());
                    object2 = new JComboBox<String>((E[])object2);
                    object2.setPreferredSize(new Dimension(120, 25));
                    object2.setActionCommand("_streetimportfile");
                    GUI.a("_streetimportfile").setModel(object2.getModel());
                    if (bn.Q("streetimportfilebyname").contentEquals("0")) {
                        GUI.a("_streetimportfile").setSelectedIndex(n5);
                        ((JTable)GUI.c().get("filelistimport")).getTableHeader().getColumnModel().getColumn(2).setHeaderValue(aM.G("word_name"));
                    } else {
                        object2.setSelectedIndex(n4);
                    }
                } else {
                    if (n6 >= 8) break;
                    GUI.c().add(object2);
                    int n8 = 0;
                    while (n8 < ((String[])object2).length) {
                        GUI.a()[n6 - 1][0] = object2[n2];
                        GUI.a()[n6 - 1][1] = object2[n3];
                        GUI.a()[n6 - 1][2] = object2[n4];
                        ++n8;
                    }
                }
                ++n6;
            }
            ((JTable)GUI.c().get("filelistimport")).getTableHeader().repaint();
            ((JTable)GUI.c().get("filelistimport")).repaint();
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static boolean d(File object, String string) {
        try {
            object = a.a((File)object);
            java.sql.Connection connection = SQL.a(String.valueOf(GUI.A()) + p);
            String[][] arrstring = new String[][]{new String[0]};
            SQL.a(connection, aO, arrstring, "");
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            Integer n2 = -1;
            Integer n3 = -1;
            Integer n4 = -1;
            String string2 = "Default";
            String string3 = "Default";
            String string4 = "*";
            int n5 = 0;
            while (n5 < object.size()) {
                Object object2 = ((String)object.get(n5)).split(string, -1);
                if (n5 == 0) {
                    bl2 = true;
                    n2 = GUI.a("_zipimportfile").getSelectedIndex();
                    bl3 = true;
                    n3 = GUI.a("_cityimportfile").getSelectedIndex();
                    bl4 = true;
                    n4 = GUI.a("_streetimportfile").getSelectedIndex();
                } else {
                    if (bl2) {
                        string2 = object2[n2];
                    }
                    if (bl3) {
                        string3 = object2[n3];
                    }
                    if (bl4) {
                        string4 = object2[n4];
                    }
                    object2 = K.F(string3);
                    object2 = new String[][]{{"zipId", String.valueOf(n5)}, {"cityId", ""}, {"zip", string2}, {"city", object2}, {"street", string4}};
                    SQL.a(connection, aO, (String[][])object2);
                }
                ++n5;
            }
            connection.close();
        }
        catch (Throwable throwable) {}
        return true;
    }

    private static String O(String string) {
        String string2;
        string2 = "false";
        try {
            bn.Q("mailtype");
            String string3 = bn.Q("mailcrypt");
            String string4 = bn.Q("mailauth");
            String string5 = bn.Q("mailhost");
            String string6 = bn.Q("mailport");
            String string7 = bn.Q("mailuser");
            String string8 = bn.Q("mailpass");
            String string9 = bn.Q("mailfrom");
            string = String.valueOf(bn.Q("mailto")) + ";" + string;
            String string10 = bn.Q("mailcc");
            String string11 = bn.Q("mailcci");
            String string12 = bn.Q("mailsubject");
            String string13 = bn.Q("mailbody");
            String string14 = bn.Q("mailattachment");
            string = string.replace(",", ";");
            string10 = string10.replace(",", ";");
            string11 = string11.replace(",", ";");
            if (string.startsWith(";")) {
                string = string.substring(1);
            }
            if (string10.startsWith(";")) {
                string10 = string10.substring(1);
            }
            if (string11.startsWith(";")) {
                string11 = string10.substring(1);
            }
            String[] arrstring = string.split(";", -1);
            String[] arrstring2 = string10.split(";", -1);
            String[] arrstring3 = string11.split(";", -1);
            if (!string.contains(";") && string.contains("@")) {
                arrstring = new String[]{string};
            }
            if (!string10.contains(";") && string10.contains("@")) {
                arrstring2 = new String[]{string10};
            }
            if (!string11.contains(";") && string11.contains("@")) {
                arrstring3 = new String[]{string11};
            }
            string2 = aI.a(string3, string4, string5, string6, string7, string8, string9, arrstring, arrstring2, arrstring3, string12, string13, string14, true);
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String P(String string) {
        String string2;
        string2 = "";
        try {
            String string3 = "false";
            String string4 = bn.Q("mailtype");
            if (!string.contains("@")) {
                string2 = aM.G("mailerror1");
            }
            if (string.contains("@") && (string4.contentEquals("0") || string4.contentEquals("1"))) {
                string3 = bi.O(string);
            }
            string4.contentEquals("2");
            if (string2.contentEquals("")) {
                string2 = string3.contentEquals("false") ? aM.G("mailerror") : (string3.contentEquals("doublon detected") ? aM.G("mailerror2") : (string3.contentEquals("blacklist detected") ? aM.G("mailerror3") : aM.G("mailsent")));
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static String b(String string, List list) {
        String string2;
        string2 = "false";
        try {
            boolean bl2 = true;
            String string3 = bn.Q("lastSearchHistory");
            if (!(string3.contentEquals("table_t") || string3.contentEquals("file_t") || string3.contentEquals("manual") || string3.contentEquals("half") || string3.contentEquals("browser"))) {
                return string2;
            }
            if ((GUI.d() == 0 || GUI.b() == 1) && a.size() <= 0) {
                String[][] arrstring = new String[][]{{"locked", "0"}};
                String[][] arrstring2 = new String[][]{{"locked", "1"}};
                SQL.a(GUI.a(), aK, arrstring, arrstring2, "AND");
                SQL.a(GUI.a(), aL, arrstring, arrstring2, "AND");
                SQL.a(GUI.a(), aM, arrstring, arrstring2, "AND");
                SQL.a(GUI.a(), aN, arrstring, arrstring2, "AND");
            }
            if (string3.contentEquals("table_t") && a.size() <= 0) {
                bl2 = bi.a(GUI.a(), (Integer)GUI.d().get("getzipcitystreet"));
            }
            if (bl2) {
                if (string.contentEquals("expert")) {
                    string2 = bi.a(string3, list);
                } else if (GUI.d() == 0 || GUI.b() == 1) {
                    bi.ai();
                } else {
                    bi.aj();
                }
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static String ak() {
        return aC;
    }

    public static String al() {
        return aD;
    }

    public static String am() {
        return aE;
    }

    public static String an() {
        return aF;
    }

    public static String ao() {
        return aG;
    }

    public static String ap() {
        return aH;
    }

    public static String aq() {
        return aI;
    }

    public static String ar() {
        return aJ;
    }

    public static String as() {
        return p;
    }

    public static String at() {
        return o;
    }

    public static String au() {
        return aK;
    }

    public static String av() {
        return aL;
    }

    public static String aw() {
        return aM;
    }

    public static String ax() {
        return aN;
    }

    public static String ay() {
        return aO;
    }

    public static void a(Integer n2) {
    }

    public static String az() {
        return aP;
    }

    public static void P(String string) {
        aP = string;
    }
}

