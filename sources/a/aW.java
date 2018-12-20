/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.embed.swing.JFXPanel
 */
import javafx.embed.swing.JFXPanel;

final class aW
implements Runnable {
    private final /* synthetic */ JFXPanel a;

    aW(JFXPanel jFXPanel) {
        this.a = jFXPanel;
    }

    @Override
    public final void run() {
        MainClass.a(this.a);
    }
}

