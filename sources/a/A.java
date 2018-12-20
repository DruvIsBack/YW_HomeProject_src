/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.scene.web.WebEngine
 *  javafx.scene.web.WebView
 */
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class A
implements Runnable {
    private /* synthetic */ BrowserFX a;
    private final /* synthetic */ StringBuffer a;
    private final /* synthetic */ String g;
    private final /* synthetic */ String m;

    A(BrowserFX browserFX, StringBuffer stringBuffer, String string, String string2) {
        this.a = browserFX;
        this.a = stringBuffer;
        this.g = string;
        this.m = string2;
    }

    @Override
    public final void run() {
        try {
            if (this.a == null) {
                URI uRI = URI.create(BrowserFX.x(this.g));
                LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<String, List<String>>();
                linkedHashMap.put("Set-Cookie", Arrays.asList(this.m));
                CookieHandler.getDefault().put(uRI, linkedHashMap);
                this.a.a.getEngine().load(BrowserFX.x(this.g));
                return;
            }
            this.a.a.getEngine().loadContent(this.a.toString());
            this.a.l = "";
            return;
        }
        catch (IOException iOException) {
            BrowserFX.class.getName();
            return;
        }
    }
}

