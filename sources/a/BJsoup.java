/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.jsoup.Connection
 *  org.jsoup.Connection$Response
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Document
 *  org.jsoup.select.Elements
 */
import java.net.Proxy;
import java.util.Map;
import java.util.Set;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class BJsoup {
    public static void main(String[] arrstring) {
    }

    public static String b(bb bb2) {
        String string2;
        String string;
        string2 = "";
        string = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.85 Safari/537.36";
        try {
            String string3;
            Object object2;
            Object object;
            string3 = bb2.getUrl();
            string3 = Jsoup.connect((String)string3);
            object = string3;
            try {
                if (Proxys.isEnabled()) {
                    object2 = Proxys.getProxy();
                    object.proxy((Proxy)object2);
                } else if (GUI.D().contentEquals("IQUALIF France White") || GUI.D().contentEquals("IQUALIF France Yellow")) {
                    object2 = Proxys.a();
                    object.proxy((Proxy)object2);
                } else if (Proxys.u()) {
                    object2 = Proxys.a();
                    object.proxy((Proxy)object2);
                }
            }
            catch (Throwable throwable) {}
            string3.userAgent(string);
            object = string3;
            try {
                void var6_12;
                object2 = n.a();
                object2.get("User-Agent");
                for (Map.Entry object32 : object2.entrySet()) {
                    if (((String)object32.getKey()).contentEquals("User-Agent") || ((String)object32.getKey()).contentEquals("Referer")) continue;
                    object.header((String)object32.getKey(), (String)object32.getValue());
                }
                String string4 = (String)object2.get("Referer");
                if (string4 == null) {
                    String string5 = "https://www.google.com/";
                }
                object.referrer((String)var6_12);
                object.ignoreHttpErrors(true).validateTLSCertificates(false).followRedirects(true).timeout(30000);
            }
            catch (Throwable throwable) {}
            string3 = string3.execute();
            int n2 = string3.statusCode();
            if (n2 == 200) {
                String string4;
                string3 = string3.parse();
                string2 = string4 = string3.outerHtml();
                bb2.H(string4);
                if (bb2.getHtml().toLowerCase().contains("vous utilisez une version obsol")) {
                    bb2.H("");
                    a.a("/var/folders/pk/n2r8sfq15hn5kjm8qgx111mc0000gn/T/IQUALIF France White/list.csv", String.valueOf(string) + "\n", "UTF-8");
                }
                if (!bb2.getHtml().contentEquals("") && string3.select("doc.li.hideTel,div.bi-contact-tel").isEmpty()) {
                    a.a("/var/folders/pk/n2r8sfq15hn5kjm8qgx111mc0000gn/T/IQUALIF France White/list_no_phone.csv", String.valueOf(string) + "\n", "UTF-8");
                }
                if (!string3.select("doc.li.hideTel,div.bi-contact-tel").isEmpty()) {
                    a.a("/var/folders/pk/n2r8sfq15hn5kjm8qgx111mc0000gn/T/IQUALIF France White/ok.csv", String.valueOf(string) + "\n", "UTF-8");
                }
            }
        }
        catch (Throwable throwable) {}
        if (bb2.getHtml().contentEquals("")) {
            a.a("/var/folders/pk/n2r8sfq15hn5kjm8qgx111mc0000gn/T/IQUALIF France White/ko.csv", String.valueOf(string) + "\n", "UTF-8");
        }
        return string2;
    }
}

