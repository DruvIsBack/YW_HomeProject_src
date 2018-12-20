/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Element
 *  org.jsoup.select.Elements
 */
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class getLaCentraleWebCrawler {
    private List a(String string, String string2, String object) {
        ArrayList<bs> arrayList;
        String string3;
        String string4;
        CharSequence charSequence;
        Object object2;
        arrayList = new ArrayList<bs>();
        object2 = null;
        try {
            string4 = object;
            string3 = string2;
            object = string;
            charSequence = new StringBuilder("http://www.lacentrale.fr/cote-voitures-");
            charSequence.append((String)object);
            charSequence.append("-");
            charSequence.append(string3);
            charSequence.append("--");
            charSequence.append(string4);
            charSequence.append("-.html");
            object2 = Jsoup.parse((URL)new URL(charSequence.toString()), (int)5000);
        }
        catch (IOException iOException) {}
        string = object2.select("div.listingResultLine.f14.auto");
        int n2 = 0;
        while (n2 < string.size()) {
            object = ((Element)string.get(n2)).select("a[href]").first();
            string3 = object;
            object = this;
            string4 = "http://www.lacentrale.fr/" + string3.attr("href");
            object2 = string3.getElementsByTag("span");
            charSequence = ((Element)object2.get(0)).text();
            string3 = ((Element)object2.get(1)).text();
            String string5 = ((Element)object2.get(2)).text();
            String string6 = ((Element)object2.get(3)).text();
            object2 = ((Element)object2.get(4)).text();
            object = new bs((getLaCentraleWebCrawler)object, string4, (String)charSequence, string3, string5, string6, (String)object2);
            arrayList.add((bs)object);
            ++n2;
        }
        return arrayList;
    }

    public static void main(String[] object) {
        object = new getLaCentraleWebCrawler();
        object = object.a("audi", "a1", "2010");
        int n2 = 0;
        while (n2 < object.size()) {
            ++n2;
        }
    }
}

