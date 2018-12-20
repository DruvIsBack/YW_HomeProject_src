/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

final class x
implements Runnable {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;

    x(String string, String string2) {
        this.f = string;
        this.g = string2;
    }

    @Override
    public final void run() {
        ((JWebBrowser)GUI.b().get(this.f)).navigate(this.g);
    }
}

