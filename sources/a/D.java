/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.embed.swing.JFXPanel
 */
import javafx.embed.swing.JFXPanel;

final class D
implements Runnable {
    private final /* synthetic */ JFXPanel a;

    D(JFXPanel jFXPanel) {
        this.a = jFXPanel;
    }

    @Override
    public final void run() {
        BrowserFX2Main.a(this.a);
    }
}

