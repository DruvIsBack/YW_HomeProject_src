/*
 * Decompiled with CFR 0_132.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailGet {
    public static void main(String[] arrstring) {
    }

    public static String a(String string, String object, Integer object2) {
        String string2;
        block37 : {
            string2 = "";
            try {
                ArrayList arrayList = new ArrayList();
                Serializable serializable = new ArrayList<Object>();
                if (!object.contains("@")) {
                    Object object3;
                    if (string.contentEquals("")) {
                        return string2;
                    }
                    string = a.c(string, "");
                    object = new URL(string);
                    object = (HttpURLConnection)object.openConnection();
                    object.setRequestProperty("User-Agent", a.f());
                    object.setConnectTimeout(15000);
                    object.setReadTimeout(15000);
                    object.connect();
                    Object object4 = false;
                    int n2 = object.getResponseCode();
                    if (n2 != 200 && (n2 == 302 || n2 == 301 || n2 == 303)) {
                        object4 = true;
                    }
                    if (object4) {
                        string = object.getHeaderField("Location");
                        String string3 = object.getHeaderField("Set-Cookie");
                        object = (HttpURLConnection)new URL(string).openConnection();
                        object.setRequestProperty("Cookie", string3);
                        object.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
                        object.addRequestProperty("User-Agent", "Mozilla");
                        object.addRequestProperty("Referer", "google.com");
                    }
                    object4 = object.getResponseCode() >= 400;
                    object = object4 ? object.getErrorStream() : object.getInputStream();
                    Object object5 = new BufferedReader(new InputStreamReader((InputStream)object));
                    Object object6 = "";
                    while ((object3 = object5.readLine()) != null) {
                        object6 = String.valueOf(object6) + (String)object3;
                    }
                    object5.close();
                    object.close();
                    arrayList.addAll(a.a((String)object6));
                    if (arrayList.size() > 0 && object2.intValue() == 1) {
                        a.a(arrayList);
                        object = "";
                        object5 = "";
                        int n3 = 0;
                        while (n3 < arrayList.size()) {
                            object6 = (String)arrayList.get(n3);
                            String string4 = ".*@(.*)\\..*";
                            Pattern pattern = Pattern.compile(".*@(.*)\\..*");
                            Matcher matcher = pattern.matcher((CharSequence)object6);
                            while (matcher.find()) {
                                string4 = matcher.group(1);
                                if (string.contains(string4)) {
                                    object = String.valueOf(object) + (String)object6 + ",";
                                    continue;
                                }
                                object5 = String.valueOf(object5) + (String)object6 + ",";
                            }
                            ++n3;
                        }
                        string2 = String.valueOf(object) + (String)object5;
                        if (string2.length() > 1 && string2.endsWith(",")) {
                            string2 = string2.substring(0, string2.length() - 1);
                        }
                        return string2;
                    }
                    object = "href=\"(.*?)\"";
                    object5 = Pattern.compile("href=\"(.*?)\"");
                    object3 = object5.matcher((CharSequence)object6);
                    while (object3.find()) {
                        object6 = object3.group(1);
                        if (object6.length() > 2 && object6.startsWith("(") && object6.endsWith(")")) {
                            object6 = object6.substring(1, object6.length() - 1);
                        }
                        if (GUI.D().contentEquals("IQUALIF Italy Yellow") && bn.Q("detailcapture").contentEquals("0") && (object6.contains("virgilio") || object6.contains("overplace.com"))) continue;
                        serializable.add(object6);
                    }
                    a.a(serializable);
                    Collections.sort(serializable);
                    object6 = new ArrayList();
                    Object object7 = new ArrayList();
                    int n4 = 0;
                    while (n4 < serializable.size()) {
                        String string5 = (String)serializable.get(n4);
                        if (((String)serializable.get(n4)).toLowerCase().matches(".*plan.*") || ((String)serializable.get(n4)).toLowerCase().matches(".*acces.*") || ((String)serializable.get(n4)).toLowerCase().matches(".*conditions?.?utilisation.*") || ((String)serializable.get(n4)).toLowerCase().matches(".*mentions?.?legale.*") || ((String)serializable.get(n4)).toLowerCase().matches(".*plan.?acces.*") || ((String)serializable.get(n4)).toLowerCase().matches(".*contact.*") || ((String)serializable.get(n4)).toLowerCase().matches(".*recrute.*") || ((String)serializable.get(n4)).toLowerCase().matches(".*infos?.?legale.*")) {
                            object6.add(string5);
                        } else {
                            object7.add(string5);
                        }
                        ++n4;
                    }
                    serializable.clear();
                    serializable.addAll(object6);
                    serializable.addAll(object7);
                    String string6 = a.l(string);
                    string6 = string6.substring(0, string6.indexOf("."));
                    int n5 = 0;
                    while (n5 < serializable.size()) {
                        block36 : {
                            object7 = (String)serializable.get(n5);
                            if (object2.intValue() == 1 && n5 > 5 || object2.intValue() == 1 && n5 > 20 || GUI.D().contentEquals("IQUALIF Italy Yellow") && bn.Q("detailcapture").contentEquals("0") && object2.intValue() == 1 && n5 > 0) {
                                return string2;
                            }
                            object = new String[]{"^javascript:.*", "^mailto:.*", ".*\\.w3\\.org.*", ".*\\.webrankinfo.*", ".*\\.avi$", ".*\\.bmp$", ".*\\.css$", ".*\\.gif$", ".*\\.ico$", ".*\\.jpg$", ".*\\.jpeg$", ".*\\.js$", ".*\\.mkv$", ".*\\.mov$", ".*\\.mp4$", ".*\\.pdf$", ".*\\.png$", ".*\\.rar$", ".*\\.zip$"};
                            int n6 = 0;
                            while (n6 < ((String[])object).length) {
                                if (!object7.toLowerCase().matches(object[n6])) {
                                    ++n6;
                                    continue;
                                }
                                break block36;
                            }
                            if ((object7 = a.c(string, (String)object7)).toLowerCase().contains(string6.toLowerCase())) {
                                Object object8;
                                try {
                                    object = new URL((String)object7);
                                    object = (HttpURLConnection)object.openConnection();
                                    object.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:20.0) Gecko/20100101 Firefox/20.0");
                                    object.setConnectTimeout(15000);
                                    object.setReadTimeout(15000);
                                    object.connect();
                                    n6 = object.getResponseCode() >= 400 ? 1 : 0;
                                    object = n6 != 0 ? object.getErrorStream() : object.getInputStream();
                                    object8 = new BufferedReader(new InputStreamReader((InputStream)object));
                                    object6 = "";
                                    while ((object3 = object8.readLine()) != null) {
                                        object6 = String.valueOf(object6) + (String)object3;
                                    }
                                    object8.close();
                                    object.close();
                                }
                                catch (MalformedURLException malformedURLException) {
                                    break block36;
                                }
                                catch (FileNotFoundException fileNotFoundException) {
                                    break block36;
                                }
                                arrayList.addAll(a.a((String)object6));
                                if (arrayList.size() > 0 && object2.intValue() == 1) {
                                    a.a(arrayList);
                                    object8 = "";
                                    object2 = "";
                                    int n7 = 0;
                                    while (n7 < arrayList.size()) {
                                        object3 = (String)arrayList.get(n7);
                                        object6 = ".*@(.*)\\..*";
                                        object = Pattern.compile(".*@(.*)\\..*");
                                        object = object.matcher((CharSequence)object3);
                                        while (object.find()) {
                                            object6 = object.group(1);
                                            if (string.contains((CharSequence)object6)) {
                                                object8 = String.valueOf(object8) + (String)object3 + ",";
                                                continue;
                                            }
                                            object2 = String.valueOf(object2) + (String)object3 + ",";
                                        }
                                        ++n7;
                                    }
                                    string2 = String.valueOf(object8) + (String)object2;
                                    if (string2.length() > 1 && string2.endsWith(",")) {
                                        string2 = string2.substring(0, string2.length() - 1);
                                    }
                                    return string2;
                                }
                            }
                        }
                        ++n5;
                    }
                    if (arrayList.size() > 0 && object2.intValue() == 2) {
                        a.a(arrayList);
                        a.a(arrayList);
                        String string7 = "";
                        object7 = "";
                        int n8 = 0;
                        while (n8 < arrayList.size()) {
                            object4 = (String)arrayList.get(n8);
                            object2 = ".*@(.*)\\..*";
                            serializable = Pattern.compile(".*@(.*)\\..*");
                            object3 = serializable.matcher((CharSequence)object4);
                            while (object3.find()) {
                                object6 = object3.group(1);
                                if (string.contains((CharSequence)object6)) {
                                    string7 = String.valueOf(string7) + (String)object4 + ",";
                                    continue;
                                }
                                object7 = String.valueOf(object7) + (String)object4 + ",";
                            }
                            ++n8;
                        }
                        string2 = String.valueOf(string7) + (String)object7;
                        if (string2.length() > 1 && string2.endsWith(",")) {
                            string2 = string2.substring(0, string2.length() - 1);
                        }
                    }
                    break block37;
                }
                string2 = object;
            }
            catch (Throwable throwable) {}
        }
        return string2;
    }
}

