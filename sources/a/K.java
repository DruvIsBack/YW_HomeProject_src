/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.apache.commons.codec.binary.Base64
 *  org.jsoup.Connection
 *  org.jsoup.Connection$Response
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Document
 */
import java.net.Proxy;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class K {
    private static String X = "ce6ci est ma p4hrase secret\u00e9e pour encry\u00e0\u00a4pter l!es chaines#";
    private static String Y = "0123456789abcdef";
    private static String Z = "fedcba9876543210";
    private static String aa = "0123456789abcdef";
    private static String ab = "fedcba9876543210";

    public static void main(String[] arrstring) {
        try {
            new aR();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String E(String arrby) {
        String string;
        string = "";
        try {
            Object object = new DESKeySpec(X.getBytes("UTF8"));
            Object object2 = SecretKeyFactory.getInstance("DES");
            object = object2.generateSecret((KeySpec)object);
            arrby = Base64.decodeBase64((String)arrby);
            object2 = Cipher.getInstance("DES");
            object2.init(2, (Key)object);
            arrby = object2.doFinal(arrby);
            string = new String(arrby, "UTF-8");
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String F(String arrby) {
        String string;
        string = "";
        try {
            Object object = new DESKeySpec(X.getBytes("UTF8"));
            Object object2 = SecretKeyFactory.getInstance("DES");
            object = object2.generateSecret((KeySpec)object);
            arrby = arrby.getBytes("UTF8");
            object2 = Cipher.getInstance("DES");
            object2.init(1, (Key)object);
            string = Base64.encodeBase64String((byte[])object2.doFinal(arrby));
        }
        catch (Throwable throwable) {}
        return string;
    }

    public static String[] a(String string, String string2, String string3) {
        String[] arrstring = new String[2];
        String[] arrstring2 = arrstring;
        arrstring[0] = "";
        arrstring2[1] = "";
        String string4 = string;
        try{
            String string5;
            Object object = Pattern.compile("http://(.*?)/");
            object = object.matcher(string4);
            while (object.find()) {
                string4 = object.group(1);
            }
            object = "c";
            String string6 = GUI.D();
            String string7 = a.a();
            string7 = string7.replaceAll("[^a-zA-Z0-9 ]", "");
            string7 = Base64.encodeBase64String((byte[])string7.getBytes("UTF-8"));
            arrstring2[1] = string5 = UUID.randomUUID().toString();
            aS aS2 = new aS(ab, aa);
            object = aS.b(aS2.b((String)object));
            string2 = aS.b(aS2.b(string2));
            string6 = aS.b(aS2.b(string6));
            string3 = aS.b(aS2.b(string3));
            arrstring2[0] = K.e(String.valueOf(string) + "?s=" + (String)object + "&licence=" + string2 + "&version=" + string6 + "&info=" + string7 + "&id=" + string5 + "&type=" + string3, "text");
        }catch (Throwable throwable) {
            arrstring2[0] = String.valueOf(aM.G("dlg_lic_error8")) + string4;
        }
        return arrstring2;
    }

    public static String[] b(String string, String string2, String string3) {
        String string4 = string2;
        String string5 = string3;
        String[] arrstring = new String[2];
        String[] arrstring2 = arrstring;
        arrstring[0] = "";
        arrstring2[1] = "";
        try {
            String string6;
            String string7 = "a";
            String string8 = GUI.D();
            String string9 = a.a();
            string9 = string9.replaceAll("[^a-zA-Z0-9 ]", "");
            string9 = Base64.encodeBase64String((byte[])string9.getBytes("UTF-8"));
            arrstring2[1] = string6 = UUID.randomUUID().toString();
            aS aS2 = new aS(ab, aa);
            string7 = aS.b(aS2.b(string7));
            string8 = aS.b(aS2.b(string8));
            string3 = aS.b(aS2.b(string3));
            string2 = aS.b(aS2.b(string2));
            arrstring2[0] = K.e(String.valueOf(string) + "?s=" + string7 + "&licence=" + string2 + "&version=" + string8 + "&info=" + string9 + "&id=" + string6 + "&type=" + string3, "text");
        }
        catch (Throwable throwable) {
            if (string.startsWith("https")) {
                arrstring2 = K.b(string.replace("https://", "http://"), string4, string5);
            }
            arrstring2[0] = "Probl\u00e8me de connexion, impossible de se connecter au serveur, veuillez v\u00e9rifier votre connexion \u00e0 Internet ou r\u00e9essayer dans quelques minutes";
        }
        return arrstring2;
    }

    private static String e(String string, String string2) {
        String string3;
        string3 = "";
        try {
            string = Jsoup.connect((String)string).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36").ignoreHttpErrors(true).validateTLSCertificates(false).followRedirects(true).timeout(30000).proxy(Proxy.NO_PROXY).execute();
            int n2 = string.statusCode();
            if (n2 == 200) {
                string = string.parse();
                string = string2.contentEquals("text") ? string.text() : string.outerHtml();
                string3 = string;
            }
        }
        catch (Throwable throwable) {}
        return string3;
    }

    public static String J() {
        return Y;
    }

    public static String K() {
        return Z;
    }

    public static String L() {
        return aa;
    }

    public static String M() {
        return ab;
    }
}

