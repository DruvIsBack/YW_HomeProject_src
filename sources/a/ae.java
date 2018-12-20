/*
 * Decompiled with CFR 0_132.
 */
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;

final class ae
implements AWTEventListener {
    private /* synthetic */ GUI c;

    ae(GUI gUI) {
        this.c = gUI;
    }

    @Override
    public final void eventDispatched(AWTEvent aWTEvent) {
        if (aWTEvent instanceof KeyEvent && (aWTEvent = (KeyEvent)aWTEvent).isControlDown()) {
            switch (aWTEvent.getKeyCode()) {
                case 70: {
                    switch (aWTEvent.getID()) {
                        case 401: 
                        case 402: {
                            GUI.a(this.c);
                        }
                    }
                    return;
                }
                case 82: {
                    switch (aWTEvent.getID()) {
                        case 401: 
                        case 402: {
                            GUI.b(this.c);
                        }
                    }
                }
            }
        }
    }
}

