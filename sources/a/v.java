/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

final class v
implements Runnable {
    private final /* synthetic */ String f;

    v(String string) {
        this.f = string;
    }

    @Override
    public final void run() {
        a.a(((JWebBrowser)GUI.b().get(this.f)).getStatusText());
    }
}

