/*
 * Decompiled with CFR 0_132.
 */
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class DisableCertificateValidation {
    public static void main(String[] object) {
        object = new TrustManager[]{new G()};
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, (TrustManager[])object, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        object = new H();
        HttpsURLConnection.setDefaultHostnameVerifier((HostnameVerifier)object);
    }
}

