/*
 * Decompiled with CFR 0_132.
 */
import java.util.List;

final class aC
implements Runnable {
    private final /* synthetic */ List h;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ String T;
    private final /* synthetic */ String U;
    private final /* synthetic */ List i;

    aC(GUI gUI, List list, boolean bl2, String string, String string2, List list2) {
        this.h = list;
        this.c = bl2;
        this.T = string;
        this.U = string2;
        this.i = list2;
    }

    @Override
    public final void run() {
        GUI.a(this.h, this.c, this.T, this.U, "expert", this.i);
    }
}

