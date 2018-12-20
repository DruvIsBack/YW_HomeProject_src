/*
 * Decompiled with CFR 0_132.
 */
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class getHTTPSpecial {
    private static List a(String charSequence, String object, String object2, String string, String object3) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        Pattern pattern = Pattern.compile("(?is)[^']<div class=\"listingResultLine .*?auto.*?\">(.*?)</div>", 32);
        Pattern pattern2 = Pattern.compile("(?i)<a .*?href=\"(.*?)\"", 32);
        Pattern pattern3 = Pattern.compile("(?i)<span>(.*?)</span>", 32);
        try {
            if (charSequence.toLowerCase().contains("citroen")) {
                if (object3.toLowerCase().contains("picasso") && object3.toLowerCase().contains("grand")) {
                    object = "grand+" + (String)object + "+picasso";
                } else if (object3.toLowerCase().contains("picasso")) {
                    object = String.valueOf(object) + "+picasso";
                } else if (object3.toLowerCase().contains("cactus")) {
                    object = String.valueOf(object) + "+cactus";
                } else if (object3.toLowerCase().contains("aircross")) {
                    object = String.valueOf(object) + "+aircross";
                }
            }
            charSequence = MessageFormat.format("https://www.lacentrale.fr/cote-voitures-{0}-{1}--{2}-.html", charSequence, object, object2);
            o.a("overview", (String)charSequence);
            int n2 = 0;
            while (n2 < 30) {
                object = o.e("overview");
                object2 = o.f("overview");
                if (object2.contains("100") && object.contains("pfChangerPage")) break;
                try {
                    Thread.sleep(200L);
                }
                catch (Throwable throwable) {}
                ++n2;
            }
            try {
                Thread.sleep(2000L);
            }
            catch (Throwable throwable) {}
            object = o.a("overview");
            object = object.replace("&eacute;", "\u00e9");
            object = Normalizer.normalize((CharSequence)object, Normalizer.Form.NFD);
            object = object.replaceAll("[^\\x00-\\x7F]", "");
            object2 = pattern.matcher((CharSequence)object);
            while (object2.find()) {
                charSequence = new StringBuffer("");
                object = object2.group(1).trim();
                if (!"Essence".equalsIgnoreCase(string) ? "Diesel".equalsIgnoreCase(string) && !object.contains("Diesel") : !object.contains("Essence")) continue;
                object3 = pattern2.matcher((CharSequence)object);
                if (object3.find()) {
                    charSequence.append("https://www.lacentrale.fr/" + object3.group(1)).append("; ");
                    object = object.replaceAll("(?i)<a href.*?>", "").replaceAll("(?i)<h3.*?>", "").replaceAll("(?i)</h3>", "");
                }
                object = pattern3.matcher((CharSequence)object);
                while (object.find()) {
                    object3 = object.group(1);
                    charSequence.append(object3.replaceAll("(?i)<h3.*?>", "").replaceAll("(?i)</h3>", "").trim()).append(";");
                }
                arrayList.add(charSequence.toString());
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    private static int a(String string, String string2, String string3, String string4) {
        int n2;
        n2 = 999999;
        Pattern pattern = Pattern.compile("\"cote_perso\":(.*?),", 32);
        try {
            String string5;
            Object object;
            o.a("overview", string);
            int n3 = 0;
            while (n3 < 30) {
                string5 = o.e("overview");
                object = o.f("overview");
                if (object.contains("100") && string5.contains("pfChangerPage")) break;
                try {
                    Thread.sleep(200L);
                }
                catch (Throwable throwable) {}
                ++n3;
            }
            try {
                Thread.sleep(2000L);
            }
            catch (Throwable throwable) {}
            string5 = MessageFormat.format("https://www.lacentrale.fr/get_co_prox.php?km={0}&zipcode={1}&month=01&year={2}", string2, string3, string4);
            object = new bb(string5);
            object.y("nextpage");
            n.d((bb)object);
            Object object2 = object.getHtml();
            object2 = pattern.matcher((CharSequence)object2);
            if (object2.find()) {
                n2 = Integer.parseInt(object2.group(1));
            }
        }
        catch (Throwable throwable) {}
        return n2;
    }

    private static List a(String string, String string2, String object, String object2, String object3, String object4, String object5, String string3, String string4, String string5, String string6) {
        ArrayList<Object> arrayList;
        String string7;
        arrayList = new ArrayList<Object>();
        string7 = null;
        try {
            string7 = URLEncoder.encode(String.valueOf(Objects.toString(string, "")) + " " + Objects.toString(string2, ""), "UTF-8").replace("+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {}
        string = "https://www.leboncoin.fr/recherche/?category=2&text={0}&model={2}&brand={1}&fuel={3}&gearbox={4}&mileage={8}-{9}&price={5}-{6}&regdate={7}-max";
        string = MessageFormat.format("https://www.leboncoin.fr/recherche/?category=2&text={0}&model={2}&brand={1}&fuel={3}&gearbox={4}&mileage={8}-{9}&price={5}-{6}&regdate={7}-max", string7, string3, string4, string5, string6, object, object2, object3, object4, object5);
        try {
            do {
                string2 = (String)false;
                object = new bb(string);
                object.y("nextpage");
                BJsoup.b((bb)object);
                object = object.getHtml();
                object = Normalizer.normalize((CharSequence)object, Normalizer.Form.NFD);
                object = object.replaceAll("[^\\x00-\\x7F]", "");
                object2 = Pattern.compile("<li.*?aditem_container.*?>(.*?)</li>", 32);
                object2 = object2.matcher((CharSequence)object);
                while (object2.find()) {
                    object4 = object2.group(1);
                    object3 = Pattern.compile("<a.*?href=\"(.*?)\"", 32);
                    object3 = object3.matcher((CharSequence)object4);
                    object3.find();
                    object3 = String.valueOf(object3.group(1).trim().replace("//", "")) + "\u00a4";
                    object5 = Pattern.compile("<span .*?itemprop=\"name\".*?>(.*?)</span>", 32);
                    object5 = object5.matcher((CharSequence)object4);
                    object5.find();
                    object3 = String.valueOf(object3) + object5.group(1).trim() + "\u00a4";
                    object5 = Pattern.compile("<meta itemprop=\"address\" content=\"(.*?)\"./>", 32);
                    object5 = object5.matcher((CharSequence)object4);
                    while (object5.find()) {
                        object3 = String.valueOf(object3) + object5.group(1).trim() + "/";
                    }
                    object3 = String.valueOf(object3.substring(0, object3.length() - 1).trim()) + "\u00a4";
                    object5 = Pattern.compile("<span.*price.*?>(.*?)</span", 32);
                    object5 = object5.matcher((CharSequence)object4);
                    object5.find();
                    object3 = String.valueOf(object3) + object5.group(1).trim() + "\u00a4";
                    object5 = Pattern.compile("<div .*?itemprop=\"availabilityStarts\" .*?content=\"(.*?)\".*?>", 32);
                    object4 = object5.matcher((CharSequence)object4);
                    object4.find();
                    object3 = String.valueOf(object3) + object4.group(1).trim();
                    arrayList.add(object3);
                }
                object3 = Pattern.compile("<!-- Next page -->.*<a href=\"(.*?)\" class=\"element page static\" id=\"next\"><i class=\"icon-chevron-right nomargin\"></i></a>", 32);
                object4 = object3.matcher((CharSequence)object);
                if (!object4.find()) continue;
                string = object4.group(1).replace("//", "https://").replace("&amp;", "&");
                string2 = (String)true;
            } while (string2 != false);
        }
        catch (Throwable throwable) {}
        return arrayList;
    }

    public static final void main(String[] object) {
        new aR();
        object = getHTTPSpecial.a("audi", "a1", "2010", "Essence", "");
        Object object2 = object.iterator();
        while (object2.hasNext()) {
            object = (String)object2.next();
            new PrintStream(System.out, true, "ISO-8859-15").println((String)object);
        }
        object = getHTTPSpecial.a("", "TDI 105 CH", "10000", "13000", "2007", "20000", "125000", "Audi", "A1", "2", "1");
        object = object.iterator();
        while (object.hasNext()) {
            object2 = (String)object.next();
            new PrintStream(System.out, true, "ISO-8859-15").println((String)object2);
        }
    }

    public static String a(String object, String string, String string2, String string3, String string4, String string5, String string62, String object2, String string7, String string8) {
        String string9;
        string9 = "\u00a4\u00a4\u00a4\u00a4\u00a4";
        try {
            String string10 = string62;
            if (!object.contains("/voitures/") || string.contentEquals("") || string2.contentEquals("") || string3.contentEquals("")) {
                return string9;
            }
            string = string.toUpperCase();
            string2 = string2.toUpperCase();
            string = string.replace("-", "_").replace(" ", "+");
            string2 = string2.replace(" ", "+");
            object = getHTTPSpecial.a(string.toLowerCase(), string2.toLowerCase(), string3, (String)object2, string8);
            if ((object = getHTTPSpecial.a((List)object, string8)).contentEquals("")) {
                return string9;
            }
            string8 = object.split("\u00a4", -1)[0];
            String string11 = object.split("\u00a4", -1)[1];
            object = object.split("\u00a4", -1)[2];
            string = a.o(string.toLowerCase());
            string2 = a.o(string2.toLowerCase());
            String string12 = getHTTPSpecial.U(string62);
            string62 = getHTTPSpecial.V(string62);
            String string13 = getHTTPSpecial.S(string5);
            String string14 = getHTTPSpecial.T(string5);
            object2 = getHTTPSpecial.W((String)object2);
            string7 = getHTTPSpecial.X(string7);
            if (Integer.valueOf(string62) < Integer.valueOf(string12)) {
                return string9;
            }
            List list = getHTTPSpecial.a(string8, string11, string12, string62, string3, string13, string14, string, string2, (String)object2, string7);
            if (list.size() == 0 && (list = getHTTPSpecial.a(string11, string8, string12, string62, string3, string13, string14, string, string2, (String)object2, string7)).size() == 0) {
                list = getHTTPSpecial.a("", string8, string12, string62, string3, string13, string14, string, string2, (String)object2, string7);
            }
            string = "";
            int n2 = 999999;
            for (String string62 : list) {
                int n3 = Integer.valueOf(string62.split("\u00a4")[2].replace(" ", "").replace("&nbsp;", "").replaceAll("<[^>]*>", ""));
                if (n3 >= n2) continue;
                string = "https://www.leboncoin.fr" + string62.split("\u00a4")[0];
                n2 = n3;
            }
            if (n2 == 999999) {
                string9 = "\u00a4\u00a4" + string + "\u00a4" + (String)object + "\u00a4" + string8.replace("*", "").replace("%", "") + "\u00a4" + string11.replace("*", "").replace("%", "");
                return string9;
            }
            int n4 = getHTTPSpecial.a((String)object, string5.replaceAll("\\s+", "").replace("KM", "").replace("km", ""), string4.trim(), string3);
            if (n4 < n2) {
                n2 = n4;
            }
            object2 = getHTTPSpecial.a(n2, string10);
            string9 = String.valueOf(n2) + "\u00a4" + (String)object2 + "\u00a4" + string + "\u00a4" + (String)object + "\u00a4" + string8.replace("*", "").replace("%", "") + "\u00a4" + string11.replace("*", "").replace("%", "");
        }
        catch (Throwable throwable) {}
        return string9;
    }

    private static String a(int n2, String string) {
        String string2;
        string2 = "";
        try {
            int n3 = Integer.valueOf(string.replaceAll("[^0-9]", ""));
            if (n2 < n3) {
                n2 = n3 - n2;
                string2 = "+" + n2;
            } else if (n2 > n3) {
                string2 = "-" + (n2 -= n3);
            } else if (n2 == n3) {
                string2 = "0";
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String R(String string) {
        try {
            string = string.replaceAll("(?i) [a-z] ", " ");
            string = string.replaceAll("(?i) 2wd", " ");
            string = string.replaceAll("(?i) 4x2", " ");
            string = string.replaceAll("(?i) 4x4", " ");
            string = string.replaceAll("(?i) 4wd", " ");
            string = string.replaceAll("(?i) airdream", " ");
            string = string.replaceAll("(?i) all mode", " ");
            string = string.replaceAll("(?i) all", " ");
            string = string.replaceAll("(?i) blue", " ");
            string = string.replaceAll("(?i) blueefficiency", " ");
            string = string.replaceAll("(?i) bluemotion technology", " ");
            string = string.replaceAll("(?i) bluemotion", " ");
            string = string.replaceAll("(?i) bluetec", " ");
            string = string.replaceAll("(?i) cdi", " ");
            string = string.replaceAll("(?i) d-4d", " ");
            string = string.replaceAll("(?i) eco2", " ");
            string = string.replaceAll("(?i) ecoflex", " ");
            string = string.replaceAll("(?i) efficient dynamics", " ");
            string = string.replaceAll("(?i) efficient", " ");
            string = string.replaceAll("(?i) energy", " ");
            string = string.replaceAll("(?i) fap", " ");
            string = string.replaceAll("(?i) pack", " ");
            string = string.replaceAll("(?i) powershift", " ");
            string = string.replaceAll("(?i) s&s", " ");
            string = string.replaceAll("(?i) s&amp;s", " ");
            string = string.replaceAll("(?i) s&amps", " ");
            string = string.replaceAll("(?i) s/s", " ");
            string = string.replaceAll("(?i) start/stop", " ");
            string = string.replaceAll("(?i) tdi", " ");
            string = string.replaceAll("(?i) technology", " ");
            string = string.replace("  ", " ");
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static String a(List list, String string) {
        String string2;
        string2 = "";
        try {
            String string3;
            String string4;
            boolean bl2;
            boolean bl3;
            for (String string5 : list) {
                string4 = string5.split(";")[0];
                string5 = string5.split(";")[1];
                string3 = a.b(string5, "([0-9]{2,3}) ");
                string5 = a.b(getHTTPSpecial.R(string5), "[0-9]{2,3} (.*?) |[0-9]{2,3} (.*)$");
                if (string3.contentEquals("") || string5.contentEquals("")) continue;
                bl3 = false;
                if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " cv") || string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " ch")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "cv")) {
                    string3 = String.valueOf(string3) + "%";
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "ch")) {
                    string3 = String.valueOf(string3) + "%";
                    bl3 = true;
                } else if (string.toLowerCase().contains(" " + string3.toLowerCase() + " ")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(string3.toLowerCase())) {
                    string3 = "%" + string3 + "%";
                    bl3 = true;
                }
                bl2 = false;
                if (a.j(string.toLowerCase()).contains(" " + a.j(string5.toLowerCase()) + " ")) {
                    bl2 = true;
                }
                if (!bl3 || !bl2) continue;
                string2 = String.valueOf(string3) + "\u00a4" + string5 + "\u00a4" + string4;
                return string2;
            }
            for (String string5 : list) {
                string4 = string5.split(";")[0];
                string5 = string5.split(";")[1];
                string3 = a.b(string5, "([0-9]{2,3}) ");
                string5 = a.b(getHTTPSpecial.R(string5), "[0-9]{2,3} (.*?) |[0-9]{2,3} (.*)$");
                if (string3.contentEquals("") || string5.contentEquals("")) continue;
                bl3 = false;
                if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " cv") || string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " ch")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "cv")) {
                    string3 = String.valueOf(string3) + "cv";
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "ch")) {
                    string3 = String.valueOf(string3) + "ch";
                    bl3 = true;
                } else if (string.toLowerCase().contains(" " + string3.toLowerCase() + " ")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(string3.toLowerCase())) {
                    string3 = "%" + string3 + "%";
                    bl3 = true;
                }
                bl2 = false;
                if (a.j(string.toLowerCase()).contains(" " + a.j(string5.toLowerCase()))) {
                    string5 = "%" + string5;
                    bl2 = true;
                }
                if (!bl3 || !bl2) continue;
                string2 = String.valueOf(string3) + "\u00a4" + string5 + "\u00a4" + string4;
                return string2;
            }
            for (String string5 : list) {
                string4 = string5.split(";")[0];
                string5 = string5.split(";")[1];
                string3 = a.b(string5, "([0-9]{2,3}) ");
                string5 = a.b(getHTTPSpecial.R(string5), "[0-9]{2,3} (.*?) |[0-9]{2,3} (.*)$");
                if (string3.contentEquals("") || string5.contentEquals("")) continue;
                bl3 = false;
                if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " cv") || string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " ch")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "cv")) {
                    string3 = String.valueOf(string3) + "cv";
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "ch")) {
                    string3 = String.valueOf(string3) + "ch";
                    bl3 = true;
                } else if (string.toLowerCase().contains(" " + string3.toLowerCase() + " ")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(string3.toLowerCase())) {
                    string3 = "%" + string3 + "%";
                    bl3 = true;
                }
                bl2 = false;
                if (a.j(string.toLowerCase()).contains(String.valueOf(a.j(string5.toLowerCase())) + " ")) {
                    string5 = String.valueOf(string5) + "%";
                    bl2 = true;
                }
                if (!bl3 || !bl2) continue;
                string2 = String.valueOf(string3) + "\u00a4" + string5 + "\u00a4" + string4;
                return string2;
            }
            for (String string5 : list) {
                string4 = string5.split(";")[0];
                string5 = string5.split(";")[1];
                string3 = a.b(string5, "([0-9]{2,3}) ");
                string5 = a.b(getHTTPSpecial.R(string5), "[0-9]{2,3} (.*?) |[0-9]{2,3} (.*)$");
                if (string3.contentEquals("") || string5.contentEquals("")) continue;
                bl3 = false;
                if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " cv") || string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + " ch")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "cv")) {
                    string3 = String.valueOf(string3) + "cv";
                    bl3 = true;
                } else if (string.toLowerCase().contains(String.valueOf(string3.toLowerCase()) + "ch")) {
                    string3 = String.valueOf(string3) + "ch";
                    bl3 = true;
                } else if (string.toLowerCase().contains(" " + string3.toLowerCase() + " ")) {
                    bl3 = true;
                } else if (string.toLowerCase().contains(string3.toLowerCase())) {
                    string3 = "%" + string3 + "%";
                    bl3 = true;
                }
                bl2 = false;
                if (a.j(string.toLowerCase()).contains(a.j(string5.toLowerCase()))) {
                    string5 = "%" + string5 + "%";
                    bl2 = true;
                }
                if (!bl3 || !bl2) continue;
                string2 = String.valueOf(string3) + "\u00a4" + string5 + "\u00a4" + string4;
                return string2;
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String S(String string) {
        String string2;
        string2 = "";
        try {
            int n2 = Integer.valueOf(string.replaceAll("\\s+", "").replace("KM", "").replace("km", ""));
            string2 = n2 <= 10000 ? "0" : "10000";
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String T(String string) {
        String string2;
        string2 = "";
        try {
            int n2 = Integer.valueOf(string.replaceAll("\\s+", "").replace("KM", "").replace("km", ""));
            if (n2 <= 1000) {
                string2 = "";
            } else if (n2 <= 10000) {
                string2 = "10000";
            } else if (n2 <= 20000) {
                string2 = "20000";
            } else if (n2 <= 30000) {
                string2 = "30000";
            } else if (n2 <= 40000) {
                string2 = "40000";
            } else if (n2 <= 50000) {
                string2 = "50000";
            } else if (n2 <= 60000) {
                string2 = "60000";
            } else if (n2 <= 70000) {
                string2 = "70000";
            } else if (n2 <= 80000) {
                string2 = "80000";
            } else if (n2 <= 90000) {
                string2 = "90000";
            } else if (n2 <= 100000) {
                string2 = "100000";
            } else if (n2 <= 125000) {
                string2 = "125000";
            } else if (n2 <= 150000) {
                string2 = "150000";
            } else if (n2 <= 175000) {
                string2 = "175000";
            } else if (n2 <= 200000) {
                string2 = "200000";
            } else if (n2 <= 225000) {
                string2 = "225000";
            } else if (n2 <= 250000) {
                string2 = "250000";
            } else if (n2 <= 999999) {
                string2 = "999999";
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String U(String string) {
        String string2;
        string2 = "";
        try {
            int n2 = Integer.valueOf(string.replaceAll("[^0-9]", ""));
            string2 = n2 < 10000 ? "0" : "10000";
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String V(String string) {
        String string2;
        string2 = "";
        try {
            int n2 = Integer.valueOf(string.replaceAll("[^0-9]", ""));
            string2 = n2 <= 250 ? "250" : (n2 <= 500 ? "500" : (n2 <= 750 ? "750" : (n2 <= 1000 ? "1000" : (n2 <= 1500 ? "1500" : (n2 <= 2000 ? "2000" : (n2 <= 2500 ? "2500" : (n2 <= 3000 ? "3000" : (n2 <= 3500 ? "3500" : (n2 <= 4000 ? "4000" : (n2 <= 4500 ? "4500" : (n2 <= 5000 ? "5000" : (n2 <= 5500 ? "5500" : (n2 <= 6000 ? "6000" : (n2 <= 6500 ? "6500" : (n2 <= 7000 ? "7000" : (n2 <= 7500 ? "7500" : (n2 <= 8000 ? "8000" : (n2 <= 8500 ? "8500" : (n2 <= 9000 ? "9000" : (n2 <= 9500 ? "9500" : (n2 <= 10000 ? "10000" : (n2 <= 11000 ? "11000" : (n2 <= 12000 ? "12000" : (n2 <= 13000 ? "13000" : (n2 <= 14000 ? "14000" : (n2 <= 15000 ? "15000" : (n2 <= 17500 ? "17500" : (n2 <= 20000 ? "20000" : (n2 <= 22500 ? "22500" : (n2 <= 25000 ? "25000" : (n2 <= 27500 ? "27500" : (n2 <= 30000 ? "30000" : (n2 <= 32500 ? "32500" : (n2 <= 35000 ? "35000" : (n2 <= 37500 ? "37500" : (n2 <= 40000 ? "40000" : (n2 <= 42500 ? "42500" : (n2 <= 45000 ? "45000" : (n2 <= 47500 ? "47500" : (n2 <= 50000 ? "50000" : "max"))))))))))))))))))))))))))))))))))))))));
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String W(String string) {
        String string2;
        string2 = "";
        try {
            if ("Essence".equalsIgnoreCase(string)) {
                string2 = "1";
            } else if ("Diesel".equalsIgnoreCase(string)) {
                string2 = "2";
            } else if ("GPL".equalsIgnoreCase(string)) {
                string2 = "3";
            } else if ("Electrique".equalsIgnoreCase(string)) {
                string2 = "4";
            } else if ("Autre".equalsIgnoreCase(string)) {
                string2 = "5";
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }

    private static String X(String string) {
        String string2;
        string2 = "";
        try {
            if ("manuelle".equalsIgnoreCase(string)) {
                string2 = "1";
            } else if ("automatique".equalsIgnoreCase(string)) {
                string2 = "2";
            }
        }
        catch (Throwable throwable) {}
        return string2;
    }
}

