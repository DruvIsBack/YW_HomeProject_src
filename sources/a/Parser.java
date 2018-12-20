/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.jsoup.Connection
 *  org.jsoup.Connection$Response
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Document
 *  org.jsoup.nodes.Element
 *  org.jsoup.parser.Parser
 *  org.jsoup.select.Elements
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Parser {
    public static void main(String[] arrstring) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static List a(bb var0) {
        var1_1 = new ArrayList<HashMap<K, V>>();
        try {
            block59 : {
                var2_2 = var0.getHtml();
                var0 = var0.O();
                var3_3 = "Contact";
                bn.Q("parseType");
                var4_4 = bn.Q("parse" + var3_3.substring(0, 1).toUpperCase() + var3_3.substring(1) + "Type");
                var5_5 = bn.Q(String.valueOf(var3_3.substring(0, 1).toLowerCase()) + var3_3.substring(1) + "ClassType");
                var6_6 = bn.Q("parse" + var3_3.substring(0, 1).toUpperCase() + var3_3.substring(1));
                var7_9 = bn.Q(String.valueOf(var3_3.substring(0, 1).toLowerCase()) + var3_3.substring(1) + "Class");
                if (var0.contentEquals("detailpage")) {
                    var4_4 = bn.Q("parse" + var3_3.substring(0, 1).toUpperCase() + var3_3.substring(1) + "TypeDetail");
                    var5_5 = bn.Q(String.valueOf(var3_3.substring(0, 1).toLowerCase()) + var3_3.substring(1) + "DetailClassType");
                    var6_6 = bn.Q("parse" + var3_3.substring(0, 1).toUpperCase() + var3_3.substring(1) + "Detail");
                    var7_9 = bn.Q(String.valueOf(var3_3.substring(0, 1).toLowerCase()) + var3_3.substring(1) + "DetailClass");
                }
                if (var4_4 == null) {
                    var4_4 = bn.Q("parseType");
                }
                if (var7_9 == null) {
                    var7_9 = bn.Q("contactClass");
                }
                if (var6_6 == null) {
                    var6_6 = bn.Q("parseContact");
                }
                if (var5_5 == null) {
                    var5_5 = "text";
                }
                var3_3 = bn.Q("contactSearchString");
                if (var0.contentEquals("detailpage")) {
                    if (var4_4 == null) {
                        var7_9 = bn.Q("contactDetailClass");
                    }
                    if (var4_4 == null) {
                        var6_6 = bn.Q("parseContactDetail");
                    }
                    var3_3 = bn.Q("contactSearchStringDetail");
                }
                if (var4_4.contentEquals("0") || var4_4.contentEquals("")) {
                    var4_4 = "html";
                }
                if (var4_4.contentEquals("1")) {
                    var4_4 = "text";
                }
                if (var5_5.contentEquals("0")) {
                    var5_5 = "html";
                }
                var5_5.contentEquals("1");
                var5_5 = a.a(bi.c(null));
                if (!var4_4.contentEquals("text")) break block59;
                var4_4 = Pattern.compile(var6_6);
                var4_4 = var4_4.matcher(var2_2.toString());
                var6_7 = 0;
                ** GOTO lbl152
            }
            if (var4_4.contentEquals("html") == false) return var1_1;
            var4_4 = Jsoup.parse((String)var2_2);
            if ((var4_4 = var4_4.select(var7_9)).isEmpty()) {
                var4_4 = Jsoup.parse((String)var2_2, (String)"UTF-8", (org.jsoup.parser.Parser)org.jsoup.parser.Parser.xmlParser());
                var4_4 = var4_4.select(var7_9);
            }
            if (var4_4.isEmpty() != false) return var1_1;
            if (var4_4.html().contains(var3_3) == false) return var1_1;
            var6_8 = 0;
            var8_11 = var4_4.iterator();
            block2 : do {
                if (!var8_11.hasNext()) {
                    return var1_1;
                }
                var7_9 = (Element)var8_11.next();
                if (var6_8 == 1) {
                    GUI.d();
                }
                if (var0.contentEquals("firstpage") && GUI.D().contentEquals("IQUALIF France Yellow")) {
                    Parser.f(var2_2, "globalCounterAim", (String)var0);
                }
                var9_13 = new HashMap<String, Object>();
                var10_15 = var7_9.html();
                if (Parser.s()) {
                    var10_15 = var7_9.outerHtml();
                }
                if (!GUI.h()) {
                    var9_13.put("phone", Parser.b(var10_15, (String)var0));
                }
                var11_17 = 0;
                do {
                    if (var11_17 >= var5_5.length) {
                        if (bn.Q("detailcapture").contentEquals("1") || GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow") && (var2_2.contains("r\u00e9sultats \u00e0 proximit\u00e9") || var2_2.contains("proximite=1")) && !var0.contentEquals("detailpage")) {
                            var9_13.put("urldetail", Parser.b(var10_15));
                        }
                        var1_1.add(var6_8, var9_13);
                        ++var6_8;
                        continue block2;
                    }
                    if (!var5_5[var11_17].toLowerCase().contentEquals("phone") && !var5_5[var11_17].toLowerCase().contentEquals("phone2") && !var5_5[var11_17].toLowerCase().contentEquals("phone3") && !var5_5[var11_17].toLowerCase().contentEquals("mobile") && !var5_5[var11_17].toLowerCase().contentEquals("fax") && !var5_5[var11_17].toLowerCase().contentEquals("name") && !var5_5[var11_17].toLowerCase().contains("zip") && !var5_5[var11_17].toLowerCase().contains("city") && !var5_5[var11_17].toLowerCase().contains("street") && !var5_5[var11_17].toLowerCase().contains("comment") && !var5_5[var11_17].toLowerCase().contains("mail") && !var5_5[var11_17].toLowerCase().contains("site") && !var5_5[var11_17].toLowerCase().contains("category") && !var5_5[var11_17].toLowerCase().contains("iscompany") && !var5_5[var11_17].toLowerCase().contains("special") && !var5_5[var11_17].toLowerCase().contains("coldcalling")) ** GOTO lbl94
                    if (GUI.D().contentEquals("IQUALIF Anbis White and Yellow") && var5_5[var11_17].toLowerCase().contains("category")) {
                        var9_13.put(var5_5[var11_17], Parser.a(var2_2.toString(), var5_5[var11_17], (String)var0));
                    } else if (GUI.D().contentEquals("IQUALIF Morocco Yellow") && var5_5[var11_17].toLowerCase().contains("category")) {
                        var9_13.put(var5_5[var11_17], Parser.a(var2_2.toString(), var5_5[var11_17], (String)var0));
                    } else if (GUI.D().contentEquals("IQUALIF Africa Yellow") && var5_5[var11_17].toLowerCase().contains("category")) {
                        var9_13.get("name");
                        var9_13.put(var5_5[var11_17], Parser.e(var2_2.toString(), var5_5[var11_17], (String)var0));
                    } else {
                        var3_3 = bn.Q(String.valueOf(var5_5[var11_17]) + "GlobalSearch");
                        if (var0.contentEquals("detailpage")) {
                            var3_3 = bn.Q(String.valueOf(var5_5[var11_17]) + "DetailGlobalSearch");
                        }
                        if (var3_3 != null && var3_3.contentEquals("1")) {
                            var9_13.put(var5_5[var11_17], Parser.a(var2_2, var5_5[var11_17], (String)var0));
                        } else {
                            var9_13.put(var5_5[var11_17], Parser.a(var10_15, var5_5[var11_17], (String)var0));
                        }
lbl94: // 3 sources:
                        if (var5_5[var11_17].toLowerCase().contentEquals("name") && GUI.D().contentEquals("IQUALIF France White")) {
                            if (var10_15.contains("+ d'infos") || var10_15.contains("+ d\u00e9tails")) {
                                var9_13.put(var5_5[var11_17], "{" + var9_13.get(var5_5[var11_17]) + "}");
                            }
                        } else if (var5_5[var11_17].toLowerCase().contentEquals("iscompany") && GUI.D().contentEquals("IQUALIF Belgium White")) {
                            var3_3 = ((String)var9_13.get("name")).trim().toLowerCase();
                            var4_4 = ((String)var9_13.get(var5_5[var11_17])).replace("&#039;", "'").replace(", ", " ");
                            if (var4_4.toLowerCase().contains(var3_3)) {
                                var9_13.put(var5_5[var11_17], "true");
                            } else {
                                var9_13.put(var5_5[var11_17], "");
                            }
                        }
                    }
                    ++var11_17;
                } while (true);
                break;
            } while (true);
        }
        catch (Throwable v0) {}
        return var1_1;
lbl-1000: // 1 sources:
        {
            if (var0.contentEquals("firstpage") && GUI.D().contentEquals("IQUALIF France Yellow")) {
                Parser.f(var2_2, "globalCounterAim", (String)var0);
            }
            if (!(var7_9 = var4_4.group(0)).contains(var3_3)) continue;
            var8_10 = new HashMap<String, Object>();
            if (!GUI.h()) {
                var8_10.put("phone", Parser.b(var7_9, (String)var0));
            }
            var9_12 = 0;
            while (var9_12 < var5_5.length) {
                if (var5_5[var9_12].toLowerCase().contentEquals("phone") || var5_5[var9_12].toLowerCase().contentEquals("phone2") || var5_5[var9_12].toLowerCase().contentEquals("phone3") || var5_5[var9_12].toLowerCase().contentEquals("mobile") || var5_5[var9_12].toLowerCase().contentEquals("fax") || var5_5[var9_12].toLowerCase().contentEquals("name") || var5_5[var9_12].toLowerCase().contains("zip") || var5_5[var9_12].toLowerCase().contains("city") || var5_5[var9_12].toLowerCase().contains("street") || var5_5[var9_12].toLowerCase().contains("comment") || var5_5[var9_12].toLowerCase().contains("mail") || var5_5[var9_12].toLowerCase().contains("site") || var5_5[var9_12].toLowerCase().contains("category") || var5_5[var9_12].toLowerCase().contains("iscompany") || var5_5[var9_12].toLowerCase().contains("special") || var5_5[var9_12].toLowerCase().contains("coldcalling")) {
                    if (GUI.D().contentEquals("IQUALIF Morocco Yellow") && var5_5[var9_12].toLowerCase().contains("category")) {
                        var8_10.put(var5_5[var9_12], Parser.a(var2_2.toString(), var5_5[var9_12], (String)var0));
                    } else if (GUI.D().contains(" Portugal Yellow") && var5_5[var9_12].toLowerCase().contains("category")) {
                        var8_10.put(var5_5[var9_12], Parser.a(var2_2.toString(), var5_5[var9_12], (String)var0));
                    } else if (GUI.D().contentEquals("IQUALIF Africa Yellow") && var5_5[var9_12].toLowerCase().contains("category")) {
                        var8_10.get("name");
                        var8_10.put(var5_5[var9_12], Parser.e(var2_2.toString(), var5_5[var9_12], (String)var0));
                    } else {
                        var10_14 = bn.Q(String.valueOf(var5_5[var9_12]) + "GlobalSearch");
                        if (var0.contentEquals("detailpage")) {
                            var10_14 = bn.Q(String.valueOf(var5_5[var9_12]) + "DetailGlobalSearch");
                        }
                        if (var10_14 != null && var10_14.contentEquals("1")) {
                            var8_10.put(var5_5[var9_12], Parser.a(var2_2.toString(), var5_5[var9_12], (String)var0));
                        } else {
                            var8_10.put(var5_5[var9_12], Parser.a(var7_9, var5_5[var9_12], (String)var0));
                        }
                        if (var5_5[var9_12].toLowerCase().contentEquals("name") && GUI.D().contentEquals("IQUALIF France White")) {
                            if (var7_9.contains("+ d'infos") || var7_9.contains("+ d\u00e9tails")) {
                                var8_10.put(var5_5[var9_12], "{" + var8_10.get(var5_5[var9_12]) + "}");
                            }
                        } else if (var5_5[var9_12].toLowerCase().contentEquals("iscompany") && GUI.D().contentEquals("IQUALIF Belgium White")) {
                            var10_14 = ((String)var8_10.get("name")).trim().toLowerCase();
                            var11_16 = ((String)var8_10.get(var5_5[var9_12])).replace("&#039;", "'").replace(", ", " ");
                            if (var11_16.toLowerCase().contains(var10_14)) {
                                var8_10.put(var5_5[var9_12], "true");
                            } else {
                                var8_10.put(var5_5[var9_12], "");
                            }
                        }
                    }
                }
                ++var9_12;
            }
            if (bn.Q("detailcapture").contentEquals("1") || GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow") && (var2_2.contains("r\u00e9sultats \u00e0 proximit\u00e9") || var2_2.contains("proximite=1")) && !var0.contentEquals("detailpage")) {
                var8_10.put("urldetail", Parser.b(var7_9));
            }
            var1_1.add(var6_7, var8_10);
            ++var6_7;
lbl152: // 3 sources:
            ** while (var4_4.find())
        }
lbl153: // 1 sources:
        var1_1.size();
        return var1_1;
    }

    private static String a(String string, String string2, String object) {
        String string3;
        block27 : {
            string3 = "";
            try {
                string = Parser.b(string, string2, (String)object);
                string = Parser.f(string, string2);
                boolean bl2 = false;
                bn.Q("parseType");
                Object object2 = bn.Q("parse" + string2.substring(0, 1).toUpperCase() + string2.substring(1) + "Type");
                String string4 = bn.Q(String.valueOf(string2) + "ClassType");
                String string5 = bn.Q("parse" + string2.substring(0, 1).toUpperCase() + string2.substring(1));
                String string6 = bn.Q(String.valueOf(string2) + "Class");
                if (object.contentEquals("detailpage")) {
                    object2 = bn.Q("parse" + string2.substring(0, 1).toUpperCase() + string2.substring(1) + "TypeDetail");
                    string4 = bn.Q(String.valueOf(string2) + "DetailClassType");
                    string5 = bn.Q("parse" + string2.substring(0, 1).toUpperCase() + string2.substring(1) + "Detail");
                    string6 = bn.Q(String.valueOf(string2) + "DetailClass");
                }
                if (object2 == null) {
                    return string3;
                }
                if (object2.contentEquals("0") || object2.contentEquals("")) {
                    object2 = "html";
                }
                if (object2.contentEquals("1")) {
                    object2 = "text";
                }
                if (string4.contentEquals("0")) {
                    string4 = "html";
                }
                if (string4.contentEquals("1")) {
                    string4 = "text";
                }
                if (object2.contentEquals("text")) {
                    object = Pattern.compile(string5);
                    object = object.matcher(string);
                    while (object.find()) {
                        string3 = string = object.group(1);
                    }
                    break block27;
                }
                if (string6.contentEquals("") || string6 == null) {
                    return string3;
                }
                object = Jsoup.parse((String)string);
                if ((object = object.select(string6)).isEmpty()) {
                    object = Jsoup.parse((String)string, (String)"UTF-8", (org.jsoup.parser.Parser)org.jsoup.parser.Parser.xmlParser());
                    object = object.select(string6);
                }
                int n2 = 0;
                while (n2 < object.size()) {
                    object2 = ((Element)object.get(n2)).outerHtml();
                    string6 = ((Element)object.get(n2)).html();
                    Object object3 = ((Element)object.get(n2)).text();
                    if (string4.contentEquals("html")) {
                        object3 = !Parser.s() ? string6 : object2;
                    }
                    object2 = Pattern.compile(string5);
                    object2 = object2.matcher((CharSequence)object3);
                    while (object2.find()) {
                        object3 = "";
                        if (object2.group(1) != null) {
                            object3 = object2.group(1);
                        } else if (object2.groupCount() > 1 && object2.group(2) != null) {
                            object3 = object2.group(2);
                        } else if (object2.groupCount() > 2 && object2.group(3) != null) {
                            object3 = object2.group(3);
                        }
                        if (string2.contentEquals("category") && (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow"))) {
                            string3 = String.valueOf(string3) + " * " + (String)object3;
                            string3 = string3.replace("\u00a0 ", " * ");
                            continue;
                        }
                        if (string2.contentEquals("category") && GUI.D().contentEquals("IQUALIF Dliveroo Yellow")) {
                            string3 = String.valueOf(string3) + " " + (String)object3;
                            continue;
                        }
                        if (GUI.D().contentEquals("IQUALIF Switzerland White") && bn.Q("detailcapture").contentEquals("1")) {
                            string3 = object3;
                            if (string6.contains("*")) {
                                string3 = String.valueOf(string3) + "*";
                            }
                            bl2 = true;
                            break;
                        }
                        if (string2.contentEquals("category") && GUI.D().contentEquals("IQUALIF Italy Yellow") && bn.Q("detailcapture").contentEquals("1")) {
                            if (!(string3 = String.valueOf(string3) + " - " + (String)object3).startsWith(" - ")) continue;
                            string3 = a.p(a.p(string3));
                            continue;
                        }
                        if (string2.contentEquals("category") && GUI.D().contentEquals("IQUALIF Philippines Yellow") && bn.Q("detailcapture").contentEquals("1")) {
                            string3 = String.valueOf(string3) + (String)object3;
                            continue;
                        }
                        string3 = object3;
                        bl2 = true;
                        break;
                    }
                    if (!bl2) {
                        ++n2;
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable) {}
        }
        return string3;
    }

    private static String b(String string, String string2, String object) {
        String string3;
        string3 = string;
        try {
            bn.Q("is" + string2 + "Javascript");
            String string4 = bn.Q("parse" + string2.substring(0, 1).toUpperCase() + string2.substring(1) + "JavascriptType");
            String string5 = bn.Q("parse" + string2.substring(0, 1).toUpperCase() + "JavascriptId1");
            String string6 = bn.Q("parse" + string2.substring(0, 1).toUpperCase() + "JavascriptId2");
            bn.Q(String.valueOf(string2) + "JavascriptId1Class");
            String string7 = System.getProperty("line.separator");
            String string8 = "";
            String string9 = "";
            if (string2.contentEquals("mail") && GUI.D().contentEquals("IQUALIF Switzerland Yellow") && bn.Q("detailcapture").contentEquals("1")) {
                object = "1";
                string4 = "text";
                string5 = "(?is)decodeURIComponent.'(.*?)'";
                string6 = "(?is)azertyuiop.'.*?','(.*?)'";
            } else if (string2.contentEquals("browser") && GUI.D().contentEquals("IQUALIF Italy Yellow") && object.contentEquals("nextpage")) {
                object = "1";
                string4 = "text";
                string5 = "(?is)decodeURIComponent.'(.*?)'";
                string6 = "(?is)azertyuiop.'.*?','(.*?)'";
                string8 = "notempty";
                string9 = "notempty";
                string = string.replace("%20", " ");
            } else {
                object = "0";
            }
            if (object.contentEquals("0")) {
                return string3;
            }
            if (string4.contentEquals("text")) {
                object = Pattern.compile(string5);
                if ((object = object.matcher(string)).find()) {
                    object = object.group(1);
                    string8 = object;
                }
                object = Pattern.compile(string6);
                if ((object = object.matcher(string)).find()) {
                    object = object.group(1);
                    string9 = object;
                }
                if (!string8.contentEquals("") && !string9.contentEquals("")) {
                    object = string;
                    string = string2;
                    o.d("");
                    SwingUtilities.invokeAndWait(new bc(string, string7, (String)object));
                    string3 = o.g();
                } else if (!string8.contentEquals("") && string9.contentEquals("")) {
                    object = string8;
                    o.d("");
                    if (string2.contentEquals("mail") && GUI.D().contentEquals("IQUALIF Switzerland Yellow") && bn.Q("detailcapture").contentEquals("1")) {
                        string = "function get_custom(param) {" + string7 + "var result = decodeURIComponent(param);" + string7 + "return result;" + string7 + "}" + string7 + " var result1 = get_custom('" + (String)object + "');" + string7 + " return result1; ";
                        string3 = o.d("browser", string);
                    }
                }
            } else {
                string4.contentEquals("html");
            }
        }
        catch (Throwable throwable) {}
        return string3;
    }

    private static String f(String object, String string) {
        Object object2;
        String string2;
        String string3;
        String string4;
        Object object3;
        boolean bl2;
        Object object4;
        String string5;
        String string6;
        Object object5;
        block25 : {
            object2 = object;
            object3 = bn.Q("is" + string.substring(0, 1).toUpperCase() + string.substring(1) + "Ocr");
            bl2 = false;
            object5 = bn.Q("parse" + string.substring(0, 1).toUpperCase() + string.substring(1) + "OcrType");
            string2 = bn.Q(String.valueOf(string) + "OcrClassType");
            string4 = bn.Q("parse" + string.substring(0, 1).toUpperCase() + string.substring(1) + "Ocr");
            string6 = bn.Q(String.valueOf(string) + "OcrClass");
            string5 = bn.Q("parse" + string.substring(0, 1).toUpperCase() + "OcrId1");
            object4 = bn.Q("parse" + string.substring(0, 1).toUpperCase() + "OcrId2");
            string3 = bn.Q(String.valueOf(string) + "OcrId1Class");
            string = bn.Q(String.valueOf(string) + "OcrPrefix");
            if (object3 == null) {
                return object2;
            }
            if (object5 != null) break block25;
            return object2;
        }
        try {
            if (!object3.contentEquals("1")) {
                return object2;
            }
            object3 = "";
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList2 = new ArrayList<String>();
            if (object5.contentEquals("text")) {
                object5 = Pattern.compile(string5);
                if ((object5 = object5.matcher((CharSequence)object)).find()) {
                    string6 = object5.group(1);
                    arrayList.add(string6);
                }
                object5 = Pattern.compile((String)object4);
                if ((object5 = object5.matcher((CharSequence)object)).find()) {
                    string6 = object5.group(1);
                    arrayList2.add(string6);
                }
                if (arrayList.size() <= 0 || arrayList2.size() <= 0) {
                    arrayList.size();
                }
            } else {
                if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                    object5 = Jsoup.parse((String)object);
                    object5 = object5.select(string3);
                    int n2 = 0;
                    while (n2 < object5.size()) {
                        object = ((Element)object5.get(n2)).html();
                        object4 = Pattern.compile(string5);
                        object = object4.matcher((CharSequence)object);
                        while (object.find()) {
                            object3 = object.group(1);
                        }
                        ++n2;
                    }
                    if (!object3.contentEquals("")) {
                        object2 = Parser.g((String)object3, "");
                        object2 = "getPhoneNumber(\"http://www2.leboncoin.fr\", " + (String)object2 + ")";
                    }
                    return object2;
                }
                if (object5.contentEquals("html")) {
                    if (string6.contentEquals("") || string6 == null) {
                        return object2;
                    }
                    object5 = Jsoup.parse((String)object);
                    object5 = object5.select(string6);
                    int n3 = 0;
                    while (n3 < object5.size()) {
                        object = ((Element)object5.get(n3)).html();
                        object4 = ((Element)object5.get(n3)).text();
                        if (string2.contentEquals("html")) {
                            object4 = object;
                        }
                        if ((object3 = (object = Pattern.compile(string4)).matcher((CharSequence)object4)).find()) {
                            object = "";
                            if (object3.group(1) != null) {
                                object = object3.group(1);
                            } else if (object3.groupCount() > 1 && object3.group(2) != null) {
                                object = object3.group(2);
                            } else if (object3.groupCount() > 2 && object3.group(3) != null) {
                                object = object3.group(3);
                            }
                            object2 = object;
                            bl2 = true;
                        }
                        if (bl2) break;
                        ++n3;
                    }
                }
            }
            if (bl2) {
                string = String.valueOf(string) + (String)object2;
                object2 = Parser.g(string, "");
            }
        }
        catch (Throwable throwable) {}
        return object2;
    }

    private static List b(String object, String string) {
        ArrayList<Object> arrayList;
        arrayList = new ArrayList<Object>();
        try {
            object = Parser.b((String)object, "tel1", string);
            object = GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow") ? Parser.f((String)object, "phone") : Parser.K((String)object);
            String string2 = bn.Q("parseType");
            Object object2 = bn.Q("parsePhone");
            Object object3 = bn.Q("phone_tClass");
            String string3 = bn.Q("excludesearchPhone");
            Object object4 = bn.Q("parseMobile");
            Object object5 = bn.Q("mobile_tClass");
            String string4 = bn.Q("parseFax");
            String string5 = bn.Q("fax_tClass");
            String string6 = bn.Q("searchMarketingAccept");
            Object object6 = bn.Q("searchMarketingAcceptFound");
            if (string.contentEquals("detailpage")) {
                object2 = bn.Q("parsePhoneDetail");
                object3 = bn.Q("phone_tDetailClass");
                string3 = bn.Q("excludesearchPhoneDetail");
                object4 = bn.Q("parseMobileDetail");
                object5 = bn.Q("mobile_tDetailClass");
                string4 = bn.Q("parseFaxDetail");
                string5 = bn.Q("fax_tDetailClass");
                string6 = bn.Q("searchMarketingAcceptDetail");
                object6 = bn.Q("searchMarketingAcceptFoundDetail");
            }
            string = aM.G("file_marketing_accept");
            String string7 = aM.G("file_marketing_refuse");
            if (!object6.contentEquals("accept")) {
                string = aM.G("file_marketing_refuse");
                string7 = aM.G("file_marketing_accept");
            }
            object6 = "";
            if (string2.contentEquals("text")) {
                Object object7;
                Object object8;
                Object object9;
                Object object10;
                int n2 = 0;
                Pattern pattern = Pattern.compile((String)object4);
                object5 = pattern.matcher((CharSequence)object);
                while (object5.find()) {
                    object9 = object5.group(1);
                    if (object6.contentEquals((CharSequence)object9)) continue;
                    object6 = object9;
                    object7 = new HashMap<String, Object>();
                    object7.put("numero", object9);
                    if (object.matches(string6)) {
                        object7.put("marketing_accept", string);
                    } else {
                        object7.put("marketing_accept", string7);
                    }
                    object7.put("fax", "");
                    object7.put("mobile", "mobile");
                    arrayList.add(n2, object7);
                    ++n2;
                }
                object9 = Pattern.compile((String)object2);
                object7 = object9.matcher((CharSequence)object);
                while (object7.find()) {
                    object8 = object7.group(1);
                    if (object.matches(string3) || object6.contentEquals((CharSequence)object8)) continue;
                    object6 = object8;
                    object10 = new HashMap<String, Object>();
                    object10.put("numero", object8);
                    if (object.matches(string6)) {
                        object10.put("marketing_accept", string);
                    } else {
                        object10.put("marketing_accept", string7);
                    }
                    object10.put("fax", "");
                    object10.put("mobile", "");
                    arrayList.add(n2, object10);
                    ++n2;
                }
                object8 = Pattern.compile(string4);
                object10 = object8.matcher((CharSequence)object);
                while (object10.find()) {
                    String string8 = object10.group(1);
                    if (object6.contentEquals(string8)) continue;
                    object6 = string8;
                    object3 = new HashMap<String, String>();
                    object3.put("numero", string8);
                    if (object.matches(string6)) {
                        object3.put("marketing_accept", string);
                    } else {
                        object3.put("marketing_accept", string7);
                    }
                    object3.put("fax", "fax");
                    object3.put("mobile", "");
                    arrayList.add(n2, object3);
                    ++n2;
                }
            } else if (string2.contentEquals("html")) {
                Object object11;
                String string9;
                Object object12;
                Object object13;
                int n3 = 0;
                Document document = Jsoup.parse((String)object);
                object5 = document.select((String)object5);
                int n4 = 0;
                while (n4 < object5.size()) {
                    String string10 = ((Element)object5.get(n4)).outerHtml();
                    string9 = ((Element)object5.get(n4)).html();
                    if (Parser.s()) {
                        string9 = string10;
                    }
                    object13 = Pattern.compile((String)object4);
                    object11 = object13.matcher(string9);
                    while (object11.find()) {
                        object11.group(0);
                        object = object11.group(1);
                        if (object11.group(1) != null) {
                            object = object11.group(1);
                        } else if (object11.groupCount() > 1 && object11.group(2) != null) {
                            object = object11.group(2);
                        } else if (object11.groupCount() > 2 && object11.group(3) != null) {
                            object = object11.group(3);
                        }
                        if (object6.contentEquals((CharSequence)object)) continue;
                        object6 = object;
                        object12 = new HashMap<String, Object>();
                        object12.put("numero", object);
                        if (string9.contains(string6)) {
                            object12.put("marketing_accept", string);
                        } else {
                            object12.put("marketing_accept", string7);
                        }
                        object12.put("fax", "");
                        object12.put("mobile", "mobile");
                        arrayList.add(n3, object12);
                        ++n3;
                    }
                    ++n4;
                }
                Elements elements = document.select((String)object3);
                int n5 = 0;
                while (n5 < elements.size()) {
                    string9 = ((Element)elements.get(n5)).outerHtml();
                    object13 = ((Element)elements.get(n5)).html();
                    if (Parser.s()) {
                        object13 = string9;
                    }
                    object11 = Pattern.compile((String)object2);
                    object3 = object11.matcher((CharSequence)object13);
                    while (object3.find()) {
                        object3.group(0);
                        object12 = object3.group(1);
                        if (object3.group(1) != null) {
                            object12 = object3.group(1);
                        } else if (object3.groupCount() > 1 && object3.group(2) != null) {
                            object12 = object3.group(2);
                        } else if (object3.groupCount() > 2 && object3.group(3) != null) {
                            object12 = object3.group(3);
                        }
                        if (object13.matches(string3) || object6.contentEquals((CharSequence)object12)) continue;
                        object6 = object12;
                        object4 = new HashMap<String, Object>();
                        object4.put("numero", object12);
                        if (object13.contains(string6)) {
                            object4.put("marketing_accept", string);
                        } else {
                            object4.put("marketing_accept", string7);
                        }
                        object4.put("fax", "");
                        object4.put("mobile", "");
                        arrayList.add(n3, object4);
                        ++n3;
                    }
                    ++n5;
                }
                Elements elements2 = document.select(string5);
                int n6 = 0;
                while (n6 < elements2.size()) {
                    object13 = ((Element)elements2.get(n6)).outerHtml();
                    object11 = ((Element)elements2.get(n6)).html();
                    if (Parser.s()) {
                        object11 = object13;
                    }
                    object3 = Pattern.compile(string4);
                    object = object3.matcher((CharSequence)object11);
                    while (object.find()) {
                        object.group(0);
                        object4 = object.group(1);
                        if (object.group(1) != null) {
                            object4 = object.group(1);
                        } else if (object.groupCount() > 1 && object.group(2) != null) {
                            object4 = object.group(2);
                        } else if (object.groupCount() > 2 && object.group(3) != null) {
                            object4 = object.group(3);
                        }
                        if (object6.contentEquals((CharSequence)object4)) continue;
                        object6 = object4;
                        object2 = new HashMap<String, Object>();
                        object2.put("numero", object4);
                        if (object11.contains(string6)) {
                            object2.put("marketing_accept", string);
                        } else {
                            object2.put("marketing_accept", string7);
                        }
                        object2.put("fax", "fax");
                        object2.put("mobile", "");
                        arrayList.add(n3, object2);
                        ++n3;
                    }
                    ++n6;
                }
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    private static boolean s() {
        boolean bl2;
        bl2 = true;
        try {
            if (GUI.D().contentEquals("IQUALIF Canada White") || GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF Australia Yellow") || GUI.D().contentEquals("IQUALIF United States WP White") || GUI.D().contentEquals("IQUALIF TAdvisor Yellow") || GUI.D().contentEquals("IQUALIF Anbis White and Yellow") || GUI.D().contentEquals("IQUALIF Tuti White and Yellow") || GUI.D().contentEquals("IQUALIF Auto24 White and Yellow") || GUI.D().contentEquals("IQUALIF Immo24 White and Yellow") || GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow") || GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow") || GUI.D().contentEquals("IQUALIF Singapore Yellow")) {
                bl2 = false;
            }
        }
        catch (Throwable throwable) {}
        return bl2;
    }

    private static String K(String string) {
        String string2;
        string2 = string;
        try {
            String string3 = bn.Q("isPhoneOcr");
            if (!string3.contentEquals("1")) {
                return string2;
            }
            string3 = "";
            String string4 = "";
            Object object = bn.Q("parseType");
            String string5 = bn.Q("parsePhoneOcr");
            String string6 = bn.Q("phoneOcrClass");
            String string7 = "";
            String string8 = "";
            String string9 = bn.Q("phoneOcrPrefix");
            if (GUI.D().contentEquals("IQUALIF Kapa White and Yellow")) {
                string7 = "\"id\".*?value=\"([0-9]*?)\"";
                string8 = "form";
            }
            if (object.contentEquals("text")) {
                object = Pattern.compile(string5);
                if ((object = object.matcher(string)).find()) {
                    object = object.group(1);
                    string3 = object;
                }
                if (string7.contentEquals("") && !string3.contentEquals("")) {
                    string2 = Parser.g(string9, "p=" + string3);
                }
                if (GUI.D().contains(" Kapa ")) {
                    object = Pattern.compile(string7);
                    if ((object = object.matcher(string)).find()) {
                        object = object.group(1);
                        string4 = object;
                    }
                    if (!string3.contentEquals("") && !string4.contentEquals("")) {
                        string2 = Parser.g(string9, "list_id=" + string4 + "&hf=" + string3);
                    }
                }
            } else {
                Pattern pattern;
                Object object2;
                object = Jsoup.parse((String)string);
                object = object.select(string6);
                int n2 = 0;
                while (n2 < object.size()) {
                    object2 = ((Element)object.get(n2)).html();
                    pattern = Pattern.compile(string5);
                    object2 = pattern.matcher((CharSequence)object2);
                    if (object2.find()) {
                        if (object2.group(1) != null) {
                            string3 = object2.group(1);
                        }
                        if (object2.groupCount() > 1 && object2.group(2) != null) {
                            string4 = object2.group(2);
                        }
                        if (object2.groupCount() > 2 && object2.group(3) != null) {
                            string4 = object2.group(3);
                        }
                        if (object2.groupCount() > 3 && object2.group(4) != null) {
                            string3 = object2.group(4);
                        }
                    }
                    ++n2;
                }
                if (GUI.D().contentEquals("IQUALIF Tuti White and Yellow")) {
                    String[] arrstring = new String[]{"list_id=" + string3, "hash=" + string4};
                    string2 = a.a("http://www.tutti.ch/ajax/phoneview", arrstring);
                    return string2;
                }
                if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                    if (string8.contentEquals("") && !string3.contentEquals("")) {
                        string2 = Parser.g(string9, "list_id=" + string3);
                        string2 = "<div class=\"lbc_option_box\">" + string2 + "</div>";
                    }
                } else {
                    if (GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow")) {
                        string9 = "https:" + string3;
                        string2 = Parser.g(string9, "");
                        return string2;
                    }
                    if (string8.contentEquals("") && !string3.contentEquals("")) {
                        string2 = Parser.g(string9, "list_id=" + string3);
                        string2 = "<div class=\"lbc_option_box\">" + string2 + "</div>";
                    }
                }
                if (GUI.D().contains(" Kapa ")) {
                    object = Jsoup.parse((String)string);
                    object = object.select(string8);
                    n2 = 0;
                    while (n2 < object.size()) {
                        object2 = ((Element)object.get(n2)).html();
                        pattern = Pattern.compile(string7);
                        object2 = pattern.matcher((CharSequence)object2);
                        if (object2.find()) {
                            string4 = string = object2.group(1);
                        }
                        ++n2;
                    }
                }
                if (!string3.contentEquals("") && !string4.contentEquals("")) {
                    string2 = Parser.g(string9, "list_id=" + string4 + "&hf=" + string3);
                    string2 = "<div class=\"adview_phone\">" + string2 + "</div>";
                }
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String g(String object, String string) {
        String string2 = "";
        try {
            Object object2 = null;
            String string3 = "0";
            if (GUI.D().contains(" Kapa ")) {
                string = string.replace("%", "%25");
            }
            if (GUI.D().contentEquals("IQUALIF Oedkniss White and Yellow")) {
                if (!a.d((String)object)) {
                    return string2;
                }
                object = Jsoup.connect((String)object).ignoreContentType(true).execute();
                int n2 = a.a(1, (Integer)100000);
                object2 = new FileOutputStream(new File(String.valueOf(GUI.w()) + "file" + n2 + ".jpeg"));
                object2.write(object.bodyAsBytes());
                object2.close();
                new aZ();
                string2 = aZ.I(String.valueOf(GUI.w()) + "file" + n2 + ".jpeg");
                return "<div class=\"ocr\">" + string2 + "</div>";
            }
            int n3 = 0;
            do {
                Serializable serializable;
                if (n3 >= 2) {
                    return string2;
                }
                try {
                    Thread.sleep(11000L);
                }
                catch (Throwable throwable) {}
                object2 = new String[]{"", ""};
                Object object3 = a.a(0, (Integer)((String[])object2).length);
                object = String.valueOf(object2[object3.intValue()]) + (String)object;
                object2 = "";
                object3 = "";
                if (string3.contentEquals("1")) {
                    bi.a((String)object, string);
                } else {
                    serializable = new HashMap<String, String>();
                    serializable.put("page", "");
                    serializable.put("error", "curl_error");
                    serializable.put("info", "curl_getinfo");
                    serializable.put("data_t", "data_t");
                    serializable = a.a(String.valueOf(object) + "?" + string, (String)object2, (String)object3);
                    a.a(String.valueOf(GUI.w()) + "file.gif", (String)serializable.get("page"));
                }
                serializable = new File(String.valueOf(GUI.w()) + "file.gif");
                object2 = a.a((File)serializable).toString();
                if (object2.length() < 15) {
                    if (!object2.contentEquals("")) {
                        if (!object2.contentEquals("\"\"")) return string2;
                    }
                    if (n3 > 0) {
                        return string2;
                    }
                } else {
                    object = object2.substring(14, object2.length() - 3).replace("\\", "");
                    if (string3.contentEquals("1")) {
                        bi.a((String)object, string);
                        return string2;
                    }
                    bi.b((String)object);
                    if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                        Thread.sleep(1000L);
                        return ba.J(String.valueOf(GUI.w()) + "file.gif");
                    }
                    object = new aZ();
                    return object.c(new File(String.valueOf(GUI.w()) + "file.gif"));
                }
                ++n3;
            } while (true);
        }
        catch (Throwable throwable) {}
        return string2;
    }

    public static String c(String string, String string2, String string3) {
        String string4;
        string4 = "0";
        try {
            Object object = bn.Q("parseType");
            String string5 = bn.Q("parseNextPageNumber");
            String string6 = "(?is)rel=\"canonical\".*?<link href=\"(.*?)\" rel=\"next\"";
            Object object2 = bn.Q("nextPageNumberClass");
            Integer n2 = Integer.valueOf(bn.Q("addToNextPageNumber"));
            boolean bl2 = false;
            if (string2.contentEquals("detailpage")) {
                return string4;
            }
            if (object.contentEquals("text")) {
                object = Pattern.compile(string5);
                if ((object = object.matcher(string)).find()) {
                    string4 = object.group(1);
                    if (n2 > 0) {
                        if (GUI.D().contentEquals("IQUALIF Luxembourg White") || GUI.D().contentEquals("IQUALIF Luxembourg Yellow")) {
                            object = Pattern.compile("page=([0-9]*?)&");
                            object2 = object.matcher(string4);
                            if (object2.find()) {
                                String string7 = String.valueOf(Integer.valueOf(object2.group(1)) + n2);
                                string4 = string4.replaceAll("page=([0-9]*?)&", "page=" + string7 + "&");
                            }
                        } else {
                            string4 = String.valueOf(Integer.valueOf(string4) + n2);
                        }
                    }
                }
            } else if (object.contentEquals("html")) {
                Object object3;
                Object object4;
                object = Jsoup.parse((String)string);
                if ((object = object.select((String)object2)).isEmpty()) {
                    object = Jsoup.parse((String)string, (String)"UTF-8", (org.jsoup.parser.Parser)org.jsoup.parser.Parser.xmlParser());
                    object = object.select((String)object2);
                }
                if (!object.isEmpty()) {
                    object2 = object.iterator();
                    while (object2.hasNext()) {
                        object = (Element)object2.next();
                        object3 = object.html();
                        object4 = object.outerHtml();
                        if (Parser.s()) {
                            object3 = object4;
                        }
                        if (bl2) break;
                        object4 = Pattern.compile(string5);
                        object3 = object4.matcher((CharSequence)object3);
                        while (object3.find()) {
                            if (bl2) break;
                            if (object3.group(1) != null) {
                                string4 = object3.group(1);
                            } else if (object3.groupCount() > 1 && object3.group(2) != null) {
                                string4 = object3.group(2);
                            } else if (object3.groupCount() > 2 && object3.group(3) != null) {
                                string4 = object3.group(3);
                            }
                            if (a.c(string4) && n2 > 0) {
                                string4 = String.valueOf(Integer.valueOf(string4) + n2);
                            }
                            bl2 = true;
                        }
                        if (GUI.D().contains("Belgium Yellow")) {
                            object4 = Pattern.compile(string6);
                            object3 = object4.matcher(object.html());
                            while (object3.find()) {
                                if (bl2) break;
                                string4 = object3.group(1);
                                if (a.c(string4) && n2 > 0) {
                                    string4 = String.valueOf(Integer.valueOf(string4) + n2);
                                }
                                bl2 = true;
                            }
                        }
                        string4 = string4.replace("https://www.pagesdor.behttp", "https");
                    }
                }
                if ((GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) && ((string4 = string4.replace("&quot;", "").replace("\\", "")).contains("/pages") || string4.contains("/annuaire"))) {
                    string4 = a.h(string4);
                }
                if (GUI.D().contentEquals("IQUALIF United Kingdom YL Yellow")) {
                    string4.contains("scrambleSeed");
                } else if (GUI.D().contentEquals("IQUALIF Canada Yellow")) {
                    string4 = string4.replaceAll("\\?.*$", "");
                }
                if (GUI.D().contentEquals("IQUALIF Italy Yellow") && bl2) {
                    if (string2.contentEquals("firstpage")) {
                        object = Jsoup.parse((String)string);
                        object2 = object.getElementsByTag("meta");
                        object4 = object2.iterator();
                        while (object4.hasNext()) {
                            object3 = (Element)object4.next();
                            object3.attr("content");
                            object3 = object3.attr("property");
                            if (!object3.contains("og:url")) continue;
                            string4 = String.valueOf(string3) + "&page=" + string4;
                            break;
                        }
                    } else {
                        string3 = string3.replaceAll("&page=.*", "");
                        string4 = String.valueOf(string3) + "&page=" + string4;
                    }
                } else if (GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow") && bl2) {
                    string3 = string3.replaceAll("\\?p=.*", "");
                    string4 = String.valueOf(string3) + string4;
                } else if (GUI.D().contentEquals("IQUALIF Portugal Yellow") && bl2) {
                    string4 = Parser.d(string4, string, "nextpagenumber");
                } else if (GUI.D().contentEquals("IQUALIF Singapore Yellow") && bl2) {
                    string4 = Parser.d(string4, string, "nextpagenumber");
                }
            }
            if (GUI.D().contains("IQUALIF Luxembourg") && string4.contentEquals("1")) {
                string4 = "0";
            }
        }
        catch (Throwable throwable) {}
        return string4;
    }

    public static Integer b(String object) {
        Integer n2;
        n2 = 0;
        try {
            String string = "0";
            if (bn.Q("useLastPageNumber").contentEquals("0")) {
                return n2;
            }
            Object object2 = bn.Q("parseType");
            String string2 = bn.Q("parseLastPageNumber");
            Object object3 = bn.Q("lastPageNumberClass");
            boolean bl2 = false;
            if (object2.contentEquals("text")) {
                object2 = Pattern.compile(string2);
                object = object2.matcher((CharSequence)object);
                if (object.find()) {
                    string = object.group(1);
                }
            } else if (object2.contentEquals("html")) {
                object2 = Jsoup.parse((String)object);
                object = object2.select((String)object3);
                if (!object.isEmpty()) {
                    object2 = object.iterator();
                    block2 : while (object2.hasNext()) {
                        object = (Element)object2.next();
                        if (bl2) break;
                        object3 = Pattern.compile(string2);
                        object = object3.matcher(object.html());
                        while (object.find()) {
                            if (bl2) continue block2;
                            string = object.group(1);
                            bl2 = true;
                        }
                    }
                }
            }
            n2 = Integer.valueOf(string);
        }
        catch (Throwable throwable) {}
        return n2;
    }

    public static String d(String string, String object, String object2) {
        try {
            if (object2.contentEquals("nextpagenumber")) {
                if (GUI.D().contains("Belgium") || GUI.D().contentEquals("IQUALIF Portugal Yellow")) {
                    if (string.matches(".*?/[0-9]+/[0-9]+/?")) {
                        if (string.length() > 1 && string.endsWith("/")) {
                            string = string.substring(0, string.lastIndexOf("/"));
                            object2 = string.substring(string.lastIndexOf("/"), string.length());
                            string = string.substring(0, string.lastIndexOf("/"));
                            string = string.substring(0, string.lastIndexOf("/"));
                            string = String.valueOf(string) + (String)object2 + "/";
                        } else if (string.length() > 1) {
                            object2 = string.substring(string.lastIndexOf("/"), string.length());
                            string = string.substring(0, string.lastIndexOf("/"));
                            string = string.substring(0, string.lastIndexOf("/"));
                            string = String.valueOf(string) + (String)object2 + "/";
                        }
                        if (GUI.D().contentEquals("IQUALIF Belgium Yellow") && string.matches(".*?/[0-9]+/?")) {
                            object = string.substring(0, string.lastIndexOf("/"));
                            if (a.c((String)(object = object.substring(object.lastIndexOf("/") + 1, object.length()))) && Integer.valueOf((String)object) > 20) {
                                string = "";
                            }
                        }
                    }
                } else if (GUI.D().contains("IQUALIF Singapore Yellow") && (object = (object2 = Pattern.compile("(?is)canonical.*?href=\"(http.?://www.yellowpages.com.sg/search.*?)\"")).matcher((CharSequence)object)).find()) {
                    object = object.group(1);
                    string = String.valueOf(object) + string;
                }
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static List b(String string) {
        ArrayList<Object> arrayList;
        arrayList = new ArrayList<Object>();
        try {
            Object object = bn.Q("parseType");
            String string2 = bn.Q("parseUrlDetail");
            String string3 = bn.Q("urldetailClass");
            String string4 = bn.Q("urldetailprefix");
            if (string4 == null) {
                string4 = "";
            }
            if (GUI.D().contentEquals("IQUALIF Luxembourg Yellow")) {
                string4 = "https://www.yellow.lu";
            } else if (GUI.D().contentEquals("IQUALIF United States Yellow")) {
                string4 = "https://www.yellowpages.com";
            } else if (GUI.D().contentEquals("IQUALIF Belgium 07 Yellow")) {
                string4 = "http://www.1307.be";
            } else if (GUI.D().contentEquals("IQUALIF First Name White")) {
                string4 = "http://madame.lefigaro.fr";
            }
            if (object.contentEquals("text")) {
                object = Pattern.compile(string2);
                object = object.matcher(string);
                while (object.find()) {
                    string3 = String.valueOf(string4) + object.group(1);
                    arrayList.add(string3);
                }
            } else if (object.contentEquals("html")) {
                object = Jsoup.parse((String)string);
                object = object.select(string3);
                int n2 = 0;
                while (n2 < object.size()) {
                    Object object2 = ((Element)object.get(n2)).html();
                    Object object3 = ((Element)object.get(n2)).outerHtml();
                    if (Parser.s()) {
                        object2 = object3;
                    }
                    object3 = Pattern.compile(string2);
                    object2 = object3.matcher((CharSequence)object2);
                    while (object2.find()) {
                        object3 = "";
                        if (object2.group(1) != null) {
                            object3 = object2.group(1);
                        } else if (object2.groupCount() > 1 && object2.group(2) != null) {
                            object3 = object2.group(2);
                        } else if (object2.groupCount() > 2 && object2.group(3) != null) {
                            object3 = object2.group(3);
                        }
                        if (GUI.D().contentEquals("IQUALIF Canada 41 White")) {
                            object3 = object3.replace("/person/profil/", "/person/profile/");
                        } else if (GUI.D().contentEquals("IQUALIF Italy Yellow") && object3.contains("overplace.com")) continue;
                        if (GUI.D().contentEquals("IQUALIF France Yellow") && string.contains("container-mappy")) {
                            object3 = "https://www.pagesjaunes.fr/pros/detail?bloc_id=" + (String)object3;
                            arrayList.add(object3);
                            continue;
                        }
                        if (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) {
                            object3 = object3.replace("&quot;", "").replace("\\", "");
                            if ((object3 = a.h((String)object3)).contains("/fd-media/")) continue;
                        }
                        object3 = String.valueOf(string4) + (String)object3;
                        if (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) {
                            object3 = object3.replace("http://www.pagesjaunes.frhttps://www.pagesjaunes.fr", "https://www.pagesjaunes.fr").replace("https://www.pagesjaunes.frhttps://www.pagesjaunes.fr", "https://www.pagesjaunes.fr");
                            object3 = object3.replace("http://", "https://");
                        }
                        arrayList.add(object3);
                        if (!GUI.D().contains("BCoin ")) break;
                    }
                    ++n2;
                }
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    private static String e(String object, String object2, String object3) {
        String string;
        string = "";
        try {
            if (!GUI.D().contentEquals("IQUALIF Africa Yellow")) {
                return string;
            }
            object = Parser.b((String)object, (String)object2, (String)object3);
            object = Parser.f((String)object, (String)object2);
            bn.Q("parseType");
            String string2 = bn.Q("parse" + object2.substring(0, 1).toUpperCase() + object2.substring(1) + "Type");
            String string3 = bn.Q(String.valueOf(object2) + "ClassType");
            String string4 = bn.Q("parse" + object2.substring(0, 1).toUpperCase() + object2.substring(1));
            String string5 = bn.Q(String.valueOf(object2) + "Class");
            if (object3.contentEquals("detailpage")) {
                string2 = bn.Q("parse" + object2.substring(0, 1).toUpperCase() + object2.substring(1) + "TypeDetail");
                string3 = bn.Q(String.valueOf(object2) + "DetailClassType");
                string4 = bn.Q("parse" + object2.substring(0, 1).toUpperCase() + object2.substring(1) + "Detail");
                string5 = bn.Q(String.valueOf(object2) + "DetailClass");
            }
            if (string2 == null) {
                return string;
            }
            if (string2.contentEquals("text")) {
                object2 = Pattern.compile(string4);
                object = object2.matcher((CharSequence)object);
                while (object.find()) {
                    object2 = object.group(1);
                    string = object2;
                }
            } else {
                object2 = Jsoup.parse((String)object);
                object = object2.select(string5);
                int n2 = 0;
                while (n2 < object.size()) {
                    object3 = ((Element)object.get(n2)).html();
                    string2 = ((Element)object.get(n2)).text();
                    if (string3.contentEquals("html")) {
                        string2 = object3;
                    }
                    object3 = Pattern.compile(string4);
                    object3 = object3.matcher(string2);
                    while (object3.find()) {
                        string = string2 = object3.group(1);
                    }
                    ++n2;
                }
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static String f(String object, String object2, String object3) {
        String string;
        string = "";
        try {
            boolean bl2;
            bl2 = false;
            bn.Q("parseType");
            String string2 = "html";
            String string3 = "html";
            String string4 = "(?is)</h1>(.*?)<span";
            String string5 = "div.title";
            if (object3.contentEquals("detailpage")) {
                string2 = bn.Q("parse" + object2.substring(0, 1).toUpperCase() + object2.substring(1) + "TypeDetail");
                string3 = bn.Q(String.valueOf(object2) + "DetailClassType");
                string4 = bn.Q("parse" + object2.substring(0, 1).toUpperCase() + object2.substring(1) + "Detail");
                string5 = bn.Q(String.valueOf(object2) + "DetailClass");
            }
            if (string2 == null) {
                return string;
            }
            if (string2.contentEquals("text")) {
                object2 = Pattern.compile(string4);
                object = object2.matcher((CharSequence)object);
                while (object.find()) {
                    object2 = object.group(1);
                    string = object2;
                    bl2 = true;
                }
            } else {
                object2 = Jsoup.parse((String)object);
                object = object2.select(string5);
                int n2 = 0;
                while (n2 < object.size()) {
                    object3 = ((Element)object.get(n2)).html();
                    string2 = ((Element)object.get(n2)).text();
                    if (string3.contentEquals("html")) {
                        string2 = object3;
                    }
                    object3 = Pattern.compile(string4);
                    if ((object3 = object3.matcher(string2)).find()) {
                        object3 = object3.group(1);
                        string = object3;
                        bl2 = true;
                    }
                    if (!bl2) {
                        ++n2;
                        continue;
                    }
                    break;
                }
            }
            if (bl2) {
                string = string.replaceAll("[^\\d]", "");
                bi.a(Integer.valueOf(string));
            }
        }
        catch (Throwable throwable) {}
        return string;
    }
}

