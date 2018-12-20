/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

final class s
implements Runnable {
    private final /* synthetic */ String j;

    s(String string) {
        this.j = string;
    }

    @Override
    public final void run() {
        Object object = ((JWebBrowser)GUI.b().get("browser")).executeJavascriptWithResult(this.j);
        a.a(object.toString());
    }
}

