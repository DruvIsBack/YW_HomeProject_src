/*
 * Decompiled with CFR 0_132.
 */
import java.util.logging.Level;

final class ad
implements Runnable {
    ad() {
    }

    @Override
    public final void run() {
        try {
            if (GUI.a() == Level.FINEST) {
                return;
            }
            new J();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

