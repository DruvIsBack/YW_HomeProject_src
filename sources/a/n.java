/*
 * Decompiled with CFR 0_132.
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public final class n {
    public static void a(bb bb2) {
        try {
            Object object = bn.Q("lastSearchHistory");
            String string = bb2.O();
            if ((string.contentEquals("firstpage") || string.contentEquals("nextpage") || string.contentEquals("detailpage")) && object.contentEquals("browser")) {
                if ((string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Belgium White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Belgium 07 Yellow") || string.contentEquals("nextpage") && GUI.D().contains("Canada ") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contains(" Portugal ") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contains(" Hungary ") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contains(" United States ") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contains(" Viva ") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF BCoin White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contains("Switzerland ") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contains(" Kapa ") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF 712 White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF AConcession Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Africa Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Anbis White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Australia Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Austria Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Auto24 White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Bangladesh Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Canada White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Canada 41 White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Croatia Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Denmark Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Dominica White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Germany White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Germany Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Finland Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF First Name White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF France White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF France Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Immo24 White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Italy White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Italy Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Italy PG Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Lucia White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Luxembourg Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Netherlands Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Norway Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Philippines Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Peru Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Saudi Arabia Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Singapore Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Sbito White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Spain White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Spain Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Sweden Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF TAdvisor Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF Tuti White and Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF United Kingdom White") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF United Kingdom Yellow") || (string.contentEquals("nextpage") || string.contentEquals("detailpage")) && GUI.D().contentEquals("IQUALIF United States White") || string.contentEquals("nextpage") && GUI.D().contains("Madagascar ") || string.contentEquals("nextpage") && GUI.D().contains("Luxembourg ") || string.contentEquals("nextpage") && GUI.D().contains("Morocco ")) {
                    if (GUI.D().contains("United Kingdom ")) {
                        bb2.G("save");
                        if (GUI.D().contentEquals("IQUALIF United Kingdom White")) {
                            Thread.sleep(10000L);
                        }
                    }
                } else {
                    n.d(bb2);
                    return;
                }
            }
            object = Integer.valueOf(bn.Q("httpmethod"));
            if (GUI.D().contentEquals("IQUALIF United Kingdom White")) {
                Thread.sleep(10000L);
            }
            if (GUI.D().contentEquals("IQUALIF France Yellow")) {
                BJsoup.b(bb2);
                bi.d(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF France White")) {
                if (bn.Q("lastSearchHistory").contentEquals("browser")) {
                    if (string.contentEquals("nextpage")) {
                        BJsoup.b(bb2);
                        bi.d(bb2);
                        return;
                    }
                    n.d(bb2);
                    return;
                }
                if (string.contentEquals("firstpage")) {
                    object = bb2.getUrl();
                    string = a.a((String)object, "ou=(.*?)&").replace("%2C", ",").replace("%0D", "").replace("+", " ");
                    if (!(string = a.a(string, bb2)).contentEquals("")) {
                        object = object.replace("&proximite=", "&idOu=" + string + "&proximite=");
                    }
                    bb2.setUrl((String)object);
                    Thread.sleep(600L);
                }
                BJsoup.b(bb2);
                bi.d(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF France PI Yellow")) {
                if (bb2.O().contentEquals("nextpage")) {
                    object = a.a(bb2);
                    bb2.H((String)object);
                    return;
                }
                n.b(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Belgium Yellow")) {
                n.b(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Italy Yellow")) {
                n.d(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Canada 41 White") && string.contentEquals("firstpage")) {
                bb2.H(BJsoup.b(bb2));
                object = bi.a(bb2, string);
                if (object != bb2.getUrl()) {
                    bb2.setUrl((String)object);
                    n.b(bb2);
                    return;
                }
                n.b(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF United States WP White")) {
                n.e(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Bangladesh Yellow")) {
                n.d(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                BJsoup.b(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Belgium White")) {
                BJsoup.b(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Austria Yellow") && string.contentEquals("detailpage") || GUI.D().contentEquals("IQUALIF Croatia Yellow") && string.contentEquals("detailpage") || GUI.D().contentEquals("IQUALIF Australia Yellow")) {
                Thread.sleep(3000L);
                n.d(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Singapore Yellow")) {
                Thread.sleep(10000L);
                n.d(bb2);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF United Kingdom YL Yellow")) {
                n.b(bb2);
                Thread.sleep(8000L);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF PAnnonces White and Yellow")) {
                n.d(bb2);
                return;
            }
            if (object.intValue() == 0) {
                n.b(bb2);
                return;
            }
            n.c(bb2);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void b(bb bb2) {
        try {
            Object object;
            Object object2;
            String string = bn.Q("lastSearchHistory");
            Object object3 = bb2.O();
            if (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) {
                string = a.a(bb2);
                bb2.H(string);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Belgium White to delete")) {
                string = "";
                if (object3.contentEquals("firstpage")) {
                    string = k.c(bb2);
                } else if (object3.contentEquals("nextpage") || object3.contentEquals("detailpage")) {
                    string = k.d(bb2);
                }
                bb2.H(string);
                return;
            }
            if (GUI.D().contentEquals("IQUALIF Italy Yellow") && object3.contentEquals("detailpage")) {
                bb2.G("use");
            } else if (GUI.D().contentEquals("IQUALIF United States White") && object3.contentEquals("firstpage") && string.contentEquals("browser")) {
                n.d(bb2);
                return;
            }
            string = String.valueOf(GUI.w()) + bb2.V();
            Object object4 = "";
            Object object5 = Charset.defaultCharset();
            System.setProperty("http.keepAlive", "false");
            Object object6 = new CookieManager();
            object6.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
            CookieHandler.setDefault((CookieHandler)object6);
            String string2 = bb2.getUrl();
            Object object7 = new URL(string2);
            if (Proxys.isEnabled()) {
                object = Proxys.a(bb2);
                object7 = (HttpURLConnection)object7.openConnection((Proxy)object);
            } else {
                object7 = (HttpURLConnection)object7.openConnection();
            }
            object7.setConnectTimeout(GUI.b());
            object7.setReadTimeout(GUI.b());
            if (!(GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow") || GUI.D().contentEquals("IQUALIF Belgium Yellow") || GUI.D().contentEquals("IQUALIF Netherlands Yellow") || GUI.D().contentEquals("IQUALIF United States Yellow"))) {
                object7.setRequestMethod("GET");
                object7.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
                object7.setRequestProperty("Accept-Encoding", "*");
                object7.setRequestProperty("Accept-Language", "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4");
                object7.setRequestProperty("Connection", "keep-alive");
                object7.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
                object7.setRequestProperty("Referer", "https://www.google.com/");
                object7.setRequestProperty("Upgrade-Insecure-Requests", "1");
                object7.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
                object7.setUseCaches(false);
            }
            if (!a.fileExists(string) || bb2.W() == "save") {
                object7.getContent();
                object = object6.getCookieStore();
                object5 = object.getCookies();
                object2 = object5.iterator();
                while (object2.hasNext()) {
                    object6 = object2.next();
                    object4 = String.valueOf(object4) + object6 + "; ";
                }
                if (object4.length() > 1) {
                    object4 = object4.substring(0, object4.length() - 2);
                }
                a.a(string, (String)object4);
            } else if (bb2.W() == "use") {
                object = a.a(string);
                object4 = object5.decode(ByteBuffer.wrap(object)).toString();
                object7.setRequestProperty("Cookie", (String)object4);
                object7.connect();
            }
            if (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) {
                object7.setRequestMethod("GET");
                object7.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
                object7.setRequestProperty("Accept-Encoding", "*");
                object7.setRequestProperty("Accept-Language", "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4");
                object7.setRequestProperty("Connection", "keep-alive");
                object7.setRequestProperty("Host", "www.pagesjaunes.fr");
                object7.setRequestProperty("Referer", "https://www.google.com/");
                object7.setRequestProperty("Upgrade-Insecure-Requests", "1");
                object7.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36");
                object7.setUseCaches(false);
            }
            if (GUI.D().contentEquals("IQUALIF United States WP White")) {
                if (object3.contentEquals("firstpage")) {
                    object7.setRequestProperty("Referer", "http://www.whitepages.com");
                } else {
                    object7.setRequestProperty("Referer", "http://www.whitepages.com/name/John/New-York");
                }
                object7.setRequestProperty("DNT", "1");
            }
            object = String.valueOf(string) + "_total.html";
            object5 = Charset.defaultCharset();
            if (!GUI.D().contains(" Kapa ")) {
                GUI.D().contentEquals("IQUALIF BCoin White and Yellow");
            }
            boolean bl2 = object7.getResponseCode() >= 400;
            object2 = bl2 ? object7.getErrorStream() : object7.getInputStream();
            object3 = new BufferedReader(new InputStreamReader((InputStream)object2, (Charset)object5));
            string = "";
            while ((object4 = object3.readLine()) != null) {
                string = String.valueOf(string) + (String)object4;
            }
            object4 = object7.getErrorStream();
            if (GUI.a().equals(Level.FINEST)) {
                a.a((String)object, string, "UTF-8");
            }
            if (object4 != null) {
                object4.close();
            }
            object3.close();
            if (object2 != null) {
                object2.close();
            }
            bb2.setUrl(string2);
            bb2.H(string);
            return;
        }
        catch (Throwable throwable) {
            if (GUI.d() == 1 && GUI.b() > 1 || GUI.D().contentEquals("IQUALIF BCoin White and Yellow")) {
                try {
                    String string = BJsoup.b(bb2);
                    bb2.H(string);
                    return;
                }
                catch (Throwable throwable2) {
                    bb2.H("");
                    return;
                }
            }
            if (GUI.c() == 1 || GUI.c() == 2) {
                n.d(bb2);
                return;
            }
            try {
                String string = BJsoup.b(bb2);
                bb2.H(string);
                return;
            }
            catch (Throwable throwable3) {
                bb2.H("");
                return;
            }
        }
    }

    public static String e(bb bb2) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Object object5;
            int n2;
            Object object2;
            String string = bb2.O();
            String string2 = String.valueOf(GUI.w()) + bb2.V();
            Object object3 = Charset.defaultCharset();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            Object object4 = "__qca=P0-1579572501-1466420695222; bkrid=112767099; wp_pid=TjTmUzs0oRjDKsWTjUs55A; upsellMetaData=%7B%7D; in_person_details_test_set=false; in_person_details_landing_page=people.serp; optimizelyEndUserId=oeu1466420960260r0.6038202415521658; __gads=ID=2b5c6b4ddea1cdc8:T=1466420961:S=ALNI_MZoSHEWGmdzxq7QmiIuv6fiKEro7w; OX_plg=swf|shk|pm; ewp=39; _gat=1; _gat_old=1; _whitepages_session=eGxpajZMcitXUFRqRWgzaGJ0L3d5TnlnWVhFaHJWdlUwV1BBQUNaL0NvU0kzZW9lR2lQZlIwbWxUYnp4ZFRWZUJycTgxbUMxVEFkeERkYlBpc1p4T1JMa2xWZzhRV090cFA0cUgyMHFZSFdTTEgzL2trc0FmQjBKalcyMzdaWCt6cXF1VSttNFlvOTduY2EvZ1d6WXVtRjJ3Q0V1WUNmM21GS3M3czZ3cG5PU0xEYzNHYnVic3dNdGRmVGVveXczWFplL2hSK1NIc0tEU0VuSy94MG1hWkZxS2N3a1FqbzBBVHRPWTdxbkxOZz0tLS96VjJpVDZZR3l2WWpFbkprL1pEQ3c9PQ%3D%3D--1ea49454dd1eec7567930d271d06fa8479b73c88; amplitude_idwhitepages.com=eyJkZXZpY2VJZCI6IjhjMzlkNDBhLWM5MDEtNDAwZi05YTJlLTk0ZTFiYTRlNDg0MiIsInVzZXJJZCI6bnVsbCwib3B0T3V0IjpmYWxzZX0=; wp-gen=%7B%22v%22%3A%7B%22usage%22%3A%7B%22visitsThisWeek%22%3A1%2C%22visitsLastWeek%22%3A0%2C%22searchesThisWeek%22%3A2%2C%22searchesLastWeek%22%3A0%2C%22phoneSearchesThisWeek%22%3A0%2C%22phoneSearchesLastWeek%22%3A0%2C%22searchesThisMonth%22%3A2%2C%22searchesLastMonth%22%3A0%7D%7D%7D; optimizelySegments=%7B%223470110271%22%3A%22false%22%2C%223483830239%22%3A%22gc%22%2C%223486770236%22%3A%22direct%22%7D; optimizelyBuckets=%7B%7D; _ga=GA1.2.757177662.1466420695; D_SID=41.251.87.17:1DljUEzfdYVlM2nMcKF88SIl2zTjKaOrhSpoPTgtchU; D_PID=76416757-4B87-3009-9C7C-B4659DA98A9C; D_IID=97BCA496-B399-3EC9-869C-E1C8EB29954D; D_UID=1DE21C2D-1ADE-3DAF-BF01-1CFCA05CD4E7; D_HID=xg9is90z9flDyJNLZIvGpNkXq5w5AEgGCfy8XeRurFQ; eb=39; wp_endemic_provider=D";
            if (bb2.W() == "use") {
                object2 = a.a(string2);
                object4 = object3.decode(ByteBuffer.wrap(object2)).toString();
            }
            object2 = bb2.getUrl();
            object3 = new URL((String)object2);
            object3 = (HttpURLConnection)object3.openConnection();
            object3.setRequestMethod("GET");
            object3.setDoOutput(true);
            object3.setReadTimeout(10000);
            object3.setRequestProperty("User-Agent", a.f());
            object3.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            object3.setRequestProperty("Accept-Language", "en-US;q=0.6,en;q=0.4");
            object3.setRequestProperty("Host", "www.whitepages.com");
            object3.setRequestProperty("Cache-Control", "max-age=0");
            object3.setRequestProperty("Keep-Alive", "115");
            object3.setRequestProperty("Connection", "keep-alive");
            if (!(string != null && string.contentEquals("firstpage") || string == null)) {
                object3.setRequestProperty("Referer", "http://www.whitepages.com/name/John/New-York");
            }
            object3.setRequestProperty("Cookie", (String)object4);
            object3.setRequestProperty("Upgrade-Insecure-Requests", "1");
            object3.connect();
            if (object4.endsWith(";")) {
                object4 = a.q((String)object4);
            }
            hashMap.clear();
            do {
                n2 = object4.indexOf(61);
                int n3 = object4.indexOf(59);
                if (n2 < 0 || n3 < 0) break;
                hashMap.put(object4.substring(0, n2), object4.substring(n2 + 1, n3 + 2));
                object4 = object4.substring(n3 + 2, object4.length());
            } while (true);
            n2 = 0;
            do {
                int n4;
                int n5;
                object5 = object3.getHeaderFieldKey(n2);
                object4 = object3.getHeaderField(n2);
                if (object5 != null && object4 != null && object5.length() >= 10 && object5.substring(0, 10).equals("Set-Cookie") && (n4 = object4.indexOf(61)) + 1 != (n5 = object4.indexOf(59))) {
                    hashMap.put(object4.substring(0, n4), object4.substring(n4 + 1, n5 + 2));
                }
                if (object5 == null && object4 == null) break;
                ++n2;
            } while (true);
            StringBuilder stringBuilder = new StringBuilder();
            for (Object object5 : hashMap.keySet()) {
                stringBuilder.append((String)object5);
                stringBuilder.append('=');
                stringBuilder.append((String)hashMap.get(object5));
            }
            object4 = stringBuilder.toString();
            if (bb2.W() == "save") {
                a.a(string2, (String)object4);
            }
            object5 = new BufferedReader(new InputStreamReader(object3.getInputStream(), "UTF8"));
            while ((object4 = object5.readLine()) != null) {
                stringBuffer.append((String)object4).append("\n");
            }
            object3.disconnect();
            bb2.H(stringBuffer.toString());
        }
        catch (Throwable throwable) {
            bb2.H("");
        }
        return stringBuffer.toString();
    }

    private static void c(bb bb2) {
        try {
            CharSequence charSequence = String.valueOf(GUI.w()) + bb2.V();
            String string = "";
            Object object = Charset.defaultCharset();
            System.setProperty("http.keepAlive", "false");
            Object object2 = new CookieManager();
            object2.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
            CookieHandler.setDefault((CookieHandler)object2);
            Object object3 = bb2.getUrl();
            object3 = object3.split("\\?");
            Object object4 = object3[0];
            String string2 = "";
            if (((String[])object3).length > 1) {
                string2 = object3[1];
            }
            object3 = new URL((String)object4);
            if (!bb2.Q().contentEquals("")) {
                object4 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(bb2.Q(), Integer.parseInt(bb2.R())));
                object3 = (HttpURLConnection)object3.openConnection((Proxy)object4);
            } else {
                object3 = (HttpURLConnection)object3.openConnection();
            }
            object3.setRequestMethod("POST");
            object3.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            object3.setRequestProperty("Content-Length", Integer.toString(string2.getBytes().length));
            object3.setRequestProperty("Content-Language", "en-US");
            object3.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.01; Windows NT 5.0)");
            if (GUI.D().contentEquals("IQUALIF Morocco White")) {
                object3.setRequestProperty("Referer", "http://www.pj.ma/pagesblanches");
            }
            if (bb2.W() == "use") {
                object4 = a.a((String)charSequence);
                object = object.decode(ByteBuffer.wrap((byte[])object4)).toString();
                object3.setRequestProperty("Cookie", (String)object);
            }
            object3.setConnectTimeout(GUI.b());
            object3.setReadTimeout(GUI.b());
            object3.setUseCaches(false);
            object3.setDoInput(true);
            object3.setDoOutput(true);
            object4 = new DataOutputStream(object3.getOutputStream());
            object4.writeBytes(string2);
            object4.flush();
            object4.close();
            if (bb2.W() == "save") {
                object3.getContent();
                object = object2.getCookieStore();
                object2 = object.getCookies();
                object4 = object2.iterator();
                while (object4.hasNext()) {
                    object = (HttpCookie)object4.next();
                    string = String.valueOf(string) + object + "; ";
                }
                string = string.substring(0, string.length() - 2);
                a.a((String)charSequence, string);
            }
            object = Charset.defaultCharset();
            if (GUI.D().contains(" Kapa ") || GUI.D().contains("IQUALIF BCoin White and Yellow")) {
                object = Charset.forName("ISO-8859-15");
            } else {
                GUI.D().contains(" Germany ");
            }
            object2 = object3.getInputStream();
            object = new BufferedReader(new InputStreamReader((InputStream)object2, (Charset)object));
            charSequence = new StringBuffer();
            while ((object4 = object.readLine()) != null) {
                charSequence.append((String)object4);
                charSequence.append('\r');
            }
            object.close();
            object2.close();
            charSequence = charSequence.toString();
            bb2.H((String)charSequence);
            return;
        }
        catch (Throwable throwable) {
            bb2.H("");
            return;
        }
    }

    public static void d(bb bb2) {
        try {
            Object object = bn.Q("lastSearchHistory");
            String string = bb2.O();
            String string2 = String.valueOf(GUI.w()) + bb2.V();
            String string3 = "";
            String string4 = "";
            Charset charset = Charset.defaultCharset();
            if (string.contentEquals("firstpage") && object.contentEquals("browser")) {
                object = o.a("browser");
                string4 = o.c("browser");
                a.a(string2, string4);
                bb2.setUrl(o.d("browser"));
                bb2.H((String)object);
                return;
            }
            if ((string.contentEquals("nextpage") || string.contentEquals("detailpage")) && object.contentEquals("browser") || (string.contentEquals("firstpage") || string.contentEquals("nextpage") || string.contentEquals("detailpage")) && !object.contentEquals("browser") && (GUI.c() == 1 || GUI.c() == 2) || GUI.D().contentEquals("IQUALIF Australia Yellow") || GUI.D().contentEquals("IQUALIF Belgium White") || GUI.D().contentEquals("IQUALIF Italy Yellow") || GUI.D().contentEquals("IQUALIF Spain Yellow") || GUI.D().contentEquals("IQUALIF United Kingdom YL Yellow") || GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) {
                String string5 = bb2.getUrl();
                if ((string.contentEquals("firstpage") || string.contentEquals("nextpage") || string.contentEquals("detailpage")) && !object.contentEquals("browser") && (GUI.c() == 1 || GUI.c() == 2) || GUI.D().contentEquals("IQUALIF Belgium White") || GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow") || GUI.D().contentEquals("IQUALIF Australia Yellow") || GUI.D().contentEquals("IQUALIF United Kingdom YL Yellow") || GUI.D().contentEquals("IQUALIF Spain Yellow")) {
                    o.a("overview", string5);
                } else {
                    if (GUI.D().contentEquals("IQUALIF Italy Yellow") && string.contentEquals("firstpage")) {
                        a.a(string2, string4);
                    } else if (a.fileExists(string2)) {
                        object = a.a(string2);
                        string3 = charset.decode(ByteBuffer.wrap(object)).toString();
                    }
                    object = new HashMap<String, String>();
                    object.put("Cookie", string3);
                    if (GUI.D().contentEquals("IQUALIF BCoin White and Yellow") || GUI.D().contentEquals("IQUALIF Bangladesh Yellow")) {
                        o.a("overview", string5);
                    } else {
                        o.a("overview", string5, (HashMap)object);
                    }
                }
                Thread.sleep(3500L);
                int n2 = 0;
                while (n2 < 30) {
                    string = o.e("overview");
                    string2 = o.f("overview");
                    if (string2.contains("100") && string.contains("pfChangerPage") || string2.contentEquals("ready")) break;
                    Thread.sleep(200L);
                    ++n2;
                }
                String string6 = o.a("overview");
                bb2.setUrl(o.d("overview"));
                bb2.H(string6);
                return;
            }
        }
        catch (Throwable throwable) {
            bb2.H("");
        }
    }

    static HashMap a() {
        LinkedHashMap<String, String> linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, String>();
        try {
            String string = a.f();
            linkedHashMap.put("User-Agent", string);
            if (GUI.D().contentEquals("IQUALIF Belgium White")) {
                linkedHashMap.put("Host", "www.pagesblanches.be");
            } else if (GUI.D().contentEquals("IQUALIF France White")) {
                linkedHashMap.put("Host", "www.pagesjaunes.fr");
                linkedHashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                linkedHashMap.put("Accept-Language", "en-US,en;q=0.5");
                linkedHashMap.put("Accept-Encoding", "gzip, deflate, br");
                linkedHashMap.put("Connection", "keep-alive");
                linkedHashMap.put("Referer", "https://www.google.com/");
            } else if (GUI.D().contentEquals("IQUALIF France Yellow")) {
                linkedHashMap.put("Host", "www.pagesjaunes.fr");
                linkedHashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                linkedHashMap.put("Accept-Language", "en-US,en;q=0.5");
                linkedHashMap.put("Accept-Encoding", "gzip, deflate, br");
                linkedHashMap.put("Connection", "keep-alive");
                linkedHashMap.put("Referer", "https://www.google.com/");
            } else {
                linkedHashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                linkedHashMap.put("Accept-Language", "en-US,en;q=0.5");
                linkedHashMap.put("Accept-Encoding", "gzip, deflate, br");
                linkedHashMap.put("Connection", "keep-alive");
                linkedHashMap.put("Referer", "https://www.google.com/");
            }
        }
        catch (Throwable throwable) {}
        return linkedHashMap;
    }
}

