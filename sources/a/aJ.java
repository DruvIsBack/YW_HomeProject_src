/*
 * Decompiled with CFR 0_132.
 */
import java.text.DecimalFormat;
import javax.swing.JLabel;

final class aJ
implements Runnable {
    private final /* synthetic */ JLabel d;
    private final /* synthetic */ DecimalFormat b;
    private final /* synthetic */ int i;

    aJ(JLabel jLabel, DecimalFormat decimalFormat, int n2) {
        this.d = jLabel;
        this.b = decimalFormat;
        this.i = n2;
    }

    @Override
    public final void run() {
        this.d.setText("<html><br /><br /><br /><br />" + aM.G("dlg_start_step0") + this.b.format((float)this.i / (float)aI.d().size() * 100.0f) + " %<br /><br /></html>");
    }
}

