/*
 * Decompiled with CFR 0_132.
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class BackgroundThreadaMultiRequestHttpsRequestPoster {
    static {
        TrustManager[] arrtrustManager = new TrustManager[]{new l()};
        m m2 = new m();
        try {
            System.setProperty("jsse.enableSNIExtension", "false");
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, arrtrustManager, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(m2);
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new ExceptionInInitializerError(generalSecurityException);
        }
    }

    public static void main(String[] object) {
        object = "https://www.leboncoin.fr/ar/send/0?ca=12_s&id=871472673";
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("name", "Test name");
        hashMap.put("email", "example@mail.com");
        hashMap.put("phone", "");
        hashMap.put("body", "This is some pretty body message");
        hashMap.put("send", "Envoyer votre message");
        BackgroundThreadaMultiRequestHttpsRequestPoster.a((String)object, hashMap);
    }

    private static String a(String object, Map object2) {
        try {
            Object object32;
            Object mail_data = object2;
            if (mail_data.get("send") == null) {
                mail_data.put("send", "Envoyer votre message");
            }
            if (mail_data.get("phone") == null) {
                mail_data.put("phone", "");
            }
            if (mail_data.get("cc") == null) {
                mail_data.put("cc", "1");
            }
            mail_data = BackgroundThreadaMultiRequestHttpsRequestPoster.a((String)object, "").getHeaderField("Set-Cookie");
            object = BackgroundThreadaMultiRequestHttpsRequestPoster.a((String)object, (String)mail_data);
            mail_data = object2;
            object2 = new StringBuilder();
            for (Object object32 : mail_data.keySet()) {
                object2.append((String)object32).append('=').append(BackgroundThreadaMultiRequestHttpsRequestPoster.v((String)mail_data.get(object32))).append('&');
            }
            object2 = object2.substring(0, object2.length() - 1);
            mail_data = object;
            mail_data.setDoOutput(true);
            object32 = new DataOutputStream(mail_data.getOutputStream());
            object32.writeBytes((String)object2);
            object32.flush();
            object32.close();
            object2 = Charset.defaultCharset();
            object = object.getInputStream();
            object2 = new BufferedReader(new InputStreamReader((InputStream)object, (Charset)object2));
            object32 = new StringBuffer();
            while ((mail_data = object2.readLine()) != null) {
                object32.append((String)mail_data);
                object32.append('\r');
            }
            object2.close();
            object.close();
            object = object32.toString();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        return object;
    }

    private static HttpsURLConnection a(String object, String string) {
        object = (HttpsURLConnection)new URL((String)object).openConnection();
        object.setRequestMethod("POST");
        object.setRequestProperty("User-Agent", "Mozilla/5.0");
        object.setRequestProperty("Cookie", string);
        return object;
    }

    private static String v(String string) {
        try {
            return URLEncoder.encode(string, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }
}

