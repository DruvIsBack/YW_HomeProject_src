/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.scene.Parent
 *  javafx.scene.Scene
 *  javafx.scene.web.WebView
 */
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

final class y
implements Runnable {
    private /* synthetic */ BrowserFX a;

    y(BrowserFX browserFX) {
        this.a = browserFX;
    }

    @Override
    public final void run() {
        this.a.a = new WebView();
        Scene scene = new Scene((Parent)this.a.a);
        this.a.setScene(scene);
    }
}

