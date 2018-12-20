/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.embed.swing.JFXPanel
 */
import javafx.embed.swing.JFXPanel;

final class aU
implements Runnable {
    private final /* synthetic */ JFXPanel a;

    aU(JFXPanel jFXPanel) {
        this.a = jFXPanel;
    }

    @Override
    public final void run() {
        Main2.a(this.a);
    }
}

