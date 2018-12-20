/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Document
 *  org.jsoup.nodes.Element
 *  org.jsoup.select.Elements
 */
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class getLeBonCoinWebCrawler {
    private List a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
        int n2;
        ArrayList<bv> arrayList = new ArrayList<bv>();
        Document document = null;
        int n3 = 1;
        do {
            String string11;
            Object object;
            int n4;
            Object object2;
            String string12;
            String string13;
            Object object3;
            String string14;
            try {
                String string15 = String.valueOf(n3);
                bu bu2 = bu.a(string10);
                bt bt2 = bt.a(string9);
                object3 = string8;
                String string16 = string7;
                string12 = string6;
                string11 = string5;
                string14 = string4;
                string13 = string3;
                object2 = string2;
                String string17 = string;
                object = this;
                object = new StringBuilder();
                object.append("https://www.leboncoin.fr/voitures/offres/ile_de_france/occasions/?o=");
                object.append(string15);
                object.append("&q=");
                object.append(string17);
                object.append("%20");
                object.append((String)object2);
                object.append("&parrot=0&ps=");
                int n5 = Integer.valueOf(string13);
                object2 = Arrays.asList(0, 250, 500, 750, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500, 9000, 9500, 10000, 11000, 12000, 13000, 14000, 15000, 17500, 20000, 22500, 25000, 27500, 30000, 32500, 35000, 37500, 40000, 42500, 45000, 47500, 50000);
                object.append(object2.indexOf(n5));
                object.append("&rs=");
                object.append(string14);
                object.append("&ms=");
                object.append(string11);
                object.append("&me=");
                object.append(string12);
                object.append("&brd=");
                object.append(string16);
                object.append("&mdl=");
                object.append((String)object3);
                object.append("&fu=");
                object.append(bt2.aB());
                object.append("&gb=");
                object.append(bu2.aC());
                document = Jsoup.parse((URL)new URL(object.toString()), (int)5000);
            }
            catch (IOException iOException) {}
            object3 = document.select("section.tabsContent.block-white.dontSwitch").select("a[href]");
            if (object3.isEmpty()) {
                return arrayList;
            }
            int n6 = Integer.valueOf(document.select("span.tabsSwitchNumbers.small-hidden.tiny-hidden").first().text());
            n2 = n6 / (n4 = object3.size());
            if (n2 * n4 != n6) {
                ++n2;
            }
            n6 = 0;
            while (n6 < n4) {
                Object object4 = object = (Element)object3.get(n6);
                object = this;
                object2 = object4.attr("href").substring(2);
                string13 = object4.attr("title");
                string14 = getLeBonCoinWebCrawler.a((Element)object4);
                string11 = object4.select("h3.item_price").attr("content");
                string12 = object4.select("aside").first().select("p").text();
                arrayList.add(new bv((getLeBonCoinWebCrawler)object, (String)object2, string13, string14, string11, string12));
                ++n6;
            }
        } while (++n3 <= n2);
        return arrayList;
    }

    private static String a(Element element) {
        element = ((Element)element.select("p.item_supp").get(1)).children();
        StringBuilder stringBuilder = new StringBuilder();
        String string = "";
        int n2 = 0;
        while (n2 < element.size()) {
            stringBuilder.append(string);
            stringBuilder.append(((Element)element.get(n2)).attr("content"));
            string = " / ";
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] object) {
        object = new getLeBonCoinWebCrawler();
        object = object.a("", "ambition", "3000", "2007", "20000", "250000", "Audi", "A3", "ESSENCE", "MANUELLE");
        object = object.iterator();
        while (object.hasNext()) {
            object.next();
        }
    }
}

