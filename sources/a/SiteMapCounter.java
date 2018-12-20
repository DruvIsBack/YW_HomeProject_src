/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Element
 *  org.jsoup.select.Elements
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SiteMapCounter {
    public SiteMapCounter() {
        try {
            a.a("/Users/v4/Downloads/xml/total.csv", "");
            String string = "https://www.seccionamarilla.com.mx/sitemap_sa_index.xml";
            this.p(string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void main(String[] arrstring) {
        try {
            new aR();
            new SiteMapCounter();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private boolean p(String string) {
        try {
            Object object = new bb(string);
            object = n.e((bb)object);
            a.a("/Users/v4/Downloads/xml/" + string.replace("https://www.seccionamarilla.com.mx/", ""), (String)object);
            object = SiteMapCounter.d((String)object);
            int n2 = 0;
            while (n2 < object.size()) {
                if (((String)object.get(n2)).endsWith(".xml") || ((String)object.get(n2)).contains(".xml?")) {
                    this.p((String)object.get(n2));
                }
                ++n2;
            }
            a.a("/Users/v4/Downloads/xml/total.csv", String.valueOf(string.replace("https://411.ca/", "")) + ";" + object.size() + "\n", "UTF-8");
        }
        catch (Throwable throwable) {}
        return false;
    }

    private static List d(String string) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        try {
            string = Jsoup.parse((String)string);
            string = string.select("loc");
            Iterator iterator = string.iterator();
            while (iterator.hasNext()) {
                string = (Element)iterator.next();
                arrayList.add(string.text());
            }
        }
        catch (Throwable throwable) {}
        return arrayList;
    }
}

