/*
 * Decompiled with CFR 0_132.
 */
import java.util.List;

final class aE
implements Runnable {
    private final /* synthetic */ List h;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ String T;
    private final /* synthetic */ String U;

    aE(GUI gUI, List list, boolean bl2, String string, String string2) {
        this.h = list;
        this.c = bl2;
        this.T = string;
        this.U = string2;
    }

    @Override
    public final void run() {
        GUI.a(this.h, this.c, this.T, this.U, "normal", null);
    }
}

