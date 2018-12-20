/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.concurrent.Worker
 *  javafx.concurrent.Worker$State
 *  javafx.scene.web.WebEngine
 *  javafx.scene.web.WebView
 */
import javafx.concurrent.Worker;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

final class z
implements Runnable {
    private /* synthetic */ BrowserFX a;

    z(BrowserFX browserFX) {
        this.a = browserFX;
    }

    @Override
    public final void run() {
        Worker.State state = this.a.a.getEngine().getLoadWorker().getState();
        if (state == Worker.State.SUCCEEDED) {
            this.a.k = "ready";
            return;
        }
        if (state == Worker.State.FAILED) {
            this.a.k = this.a.a.getEngine().getLoadWorker().getException().getMessage();
            return;
        }
        if (state == Worker.State.RUNNING || state == Worker.State.READY || state == Worker.State.SCHEDULED) {
            this.a.k = "loading";
            return;
        }
        if (state == Worker.State.CANCELLED) {
            this.a.k = "canceled";
            return;
        }
        this.a.k = "unknown";
    }
}

