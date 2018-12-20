/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters;

final class q
implements Runnable {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ WebBrowserNavigationParameters a;

    q(String string, String string2, WebBrowserNavigationParameters webBrowserNavigationParameters) {
        this.f = string;
        this.g = string2;
        this.a = webBrowserNavigationParameters;
    }

    @Override
    public final void run() {
        ((JWebBrowser)GUI.b().get(this.f)).navigate(this.g, this.a);
    }
}

