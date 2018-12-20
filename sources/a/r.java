/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

final class r
implements Runnable {
    private final /* synthetic */ String h;
    private final /* synthetic */ String i;

    r(String string, String string2) {
        this.h = string;
        this.i = string2;
    }

    @Override
    public final void run() {
        ((JWebBrowser)GUI.b().get(this.h)).setHTMLContent(this.i);
    }
}

