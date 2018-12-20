/*
 * Decompiled with CFR 0_132.
 */
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class G
implements X509TrustManager {
    G() {
    }

    @Override
    public final X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override
    public final void checkClientTrusted(X509Certificate[] arrx509Certificate, String string) {
    }

    @Override
    public final void checkServerTrusted(X509Certificate[] arrx509Certificate, String string) {
    }
}

