/*
 * Decompiled with CFR 0_132.
 */
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.JLabel;

final class bl
implements Runnable {
    private final /* synthetic */ HashMap v;
    private final /* synthetic */ DecimalFormat c;
    private final /* synthetic */ int j;
    private final /* synthetic */ int k;

    bl(HashMap hashMap, DecimalFormat decimalFormat, int n2, int n3) {
        this.v = hashMap;
        this.c = decimalFormat;
        this.j = n2;
        this.k = n3;
    }

    @Override
    public final void run() {
        ((JLabel)this.v.get("text0")).setText("<html><br /><br /><br /><br />" + a.n(aM.G("dlg_start_step").toLowerCase().trim()) + " 3 / 4 : " + this.c.format((float)this.j / (float)this.k * 100.0f) + " %<br /><br /></html>");
    }
}

