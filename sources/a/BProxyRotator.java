/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 *  org.jsoup.Connection
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Document
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class BProxyRotator {
    private static List b = new ArrayList();

    public static void main(String[] object2) {
        object2 = new BProxyRotator();
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+fraternit\u00e9%2C+arras+(62000)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+vanves%2C+clamart+(92140)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+brissiaud+chapterie%2C+bellac+(87300)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+pont+briand%2C+gael+(35290)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+philippe+auguste%2C+les+andelys+(27700)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+alexandre+gervais%2C+cassis+(13260)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+des+edelweiss%2C+vigneux+sur+seine+(91270)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+p\u00e9martin%2C+oloron+ste+marie+(64400)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+la+gourdine%2C+challans+(85300)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+charles+mathis%2C+niederbronn+les+bains+(67110)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+lamar%2C+la+reole+(33190)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+feuillantines%2C+montrond+les+bains+(42210)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+verdun%2C+villeparisis+(77270)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+8+mai+1945%2C+haillicourt+(62940)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+cimeti\u00e8re%2C+jametz+(55600)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+l\u00e9on+gambetta%2C+frais+marais+(59500)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+source%2C+bresson+(38320)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+l+eglise%2C+cabestany+(66330)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+l+yerres%2C+soignolles+en+brie+(77111)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+ecuries%2C+ste+marie+aux+mines+(68160)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+cassel%2C+courcelles+les+lens+(62970)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+pont%2C+bellegarde+sur+valserine+(01200)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+charles+jullian%2C+bourg+les+valence+(26500)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+pierre+brossolette%2C+yerres+(91330)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+creuse%2C+ranspach+(68470)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+ch\u00e2tel%2C+arfeuilles+(03640)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+montaigne%2C+poitiers+(86000)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+paul+vaillant+couturier%2C+st+cyr+l+ecole+(78210)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+bois+de+rem\u00e9mont%2C+entre+deux+eaux+(88650)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+du+chene+vert%2C+la+chapelle+thouarault+(35590)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+vent\u00f4se%2C+abbeville+(80100)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+sundgau%2C+hegenheim+(68220)&proximite=0");
        b.add("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+ribas%2C+bias+(47300)&proximite=0");
        BProxyRotator.super.a(3);
        block0 : for (Object object2 : b) {
            String string;
            int n2 = 1;
            while (n2 < 15) {
                String string2 = BProxyRotator.t((String)object2);
                if (string2 != null) {
                    string = string2;
                    continue block0;
                }
                ++n2;
            }
            string = "";
        }
    }

    private List a(int n2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        int[] arrn = new int[1];
        int[] arrn2 = new int[1];
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (String string : b) {
            executorService.submit(new b(this, string, arrayList, arrn, arrn2));
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        }
        catch (Exception exception) {}
        return arrayList;
    }

    private static Document a(String string) {
        try {
            String string2;
            String string3;
            String string4 = "http://falcon.proxyrotator.com:51337/?apiKey=FGKb6TcnwUgXP47LkmS9A8NdVhr5syYx";
            String string5 = "";
            int n2 = 1;
            while (n2 < 10) {
                string3 = Jsoup.connect((String)string4).ignoreContentType(true).userAgent("Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36").ignoreHttpErrors(true).timeout(20000).get();
                string2 = string3.text();
                if (!string2.contains("\"error\":")) {
                    string5 = string3.text();
                    break;
                }
                ++n2;
            }
            JSONObject jSONObject = new JSONObject(string5);
            string3 = jSONObject.getString("ip");
            string2 = jSONObject.getString("port");
            return Jsoup.connect((String)string).ignoreContentType(true).proxy(string3, Integer.valueOf(string2).intValue()).header("Host", "www.pagesjaunes.fr").header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8").header("Accept-Language", "en-US,en;q=0.5").header("Accept-Encoding", "gzip, deflate, br").header("Connection", "keep-alive").userAgent("Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36").ignoreHttpErrors(true).timeout(20000).get();
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String t(String object) {
        try {
            Object object2 = "http://falcon.proxyrotator.com:51337/?apiKey=FGKb6TcnwUgXP47LkmS9A8NdVhr5syYx";
            CharSequence charSequence = "";
            int n2 = 1;
            while (n2 < 10) {
                Document document = Jsoup.connect((String)object2).ignoreContentType(true).userAgent("Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.106 Safari/537.36").ignoreHttpErrors(true).timeout(20000).get();
                String string = document.text();
                if (!string.contains("\"error\":")) {
                    charSequence = document.text();
                    break;
                }
                ++n2;
            }
            Object object3 = new JSONObject((String)charSequence);
            object3.getString("ip");
            object3.getString("port");
            object2 = Proxys.b();
            object = (HttpURLConnection)new URL((String)object).openConnection((Proxy)object2);
            object.setConnectTimeout(GUI.b());
            object.setReadTimeout(GUI.b());
            object.setRequestMethod("GET");
            object.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
            object.setRequestProperty("Accept-Encoding", "*");
            object.setRequestProperty("Accept-Language", "fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4");
            object.setRequestProperty("Connection", "keep-alive");
            object.setRequestProperty("Host", "www.pagesjaunes.fr");
            object.setRequestProperty("Referer", "https://www.google.com/");
            object.setRequestProperty("Upgrade-Insecure-Requests", "1");
            object.setRequestProperty("User-Agent", a.f());
            object.setUseCaches(false);
            object = object.getInputStream();
            object2 = new BufferedReader(new InputStreamReader((InputStream)object));
            charSequence = new StringBuilder();
            while ((object3 = object2.readLine()) != null) {
                charSequence.append((String)object3);
                charSequence.append('\r');
            }
            object2.close();
            object.close();
            return charSequence.toString();
        }
        catch (Exception exception) {
            return null;
        }
    }

    static /* synthetic */ Document a(BProxyRotator object, String string) {
        object = string;
        int n2 = 1;
        while (n2 < 15) {
            Document document = BProxyRotator.a((String)object);
            if (document != null && !document.text().contains("YOU HAVE BEEN BLOCKED ! ! !") && !document.text().contains("You have been blocked")) {
                return document;
            }
            ++n2;
        }
        return null;
    }
}

