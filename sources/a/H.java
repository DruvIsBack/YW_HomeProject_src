/*
 * Decompiled with CFR 0_132.
 */
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

final class H
implements HostnameVerifier {
    H() {
    }

    @Override
    public final boolean verify(String string, SSLSession sSLSession) {
        return true;
    }
}
