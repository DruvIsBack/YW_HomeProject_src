/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.embed.swing.JFXPanel
 */
import javafx.embed.swing.JFXPanel;

final class B
implements Runnable {
    private final /* synthetic */ JFXPanel a;

    B(JFXPanel jFXPanel) {
        this.a = jFXPanel;
    }

    @Override
    public final void run() {
        BrowserFX2.a("browser", this.a);
    }
}

