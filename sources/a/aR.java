/*
 * Decompiled with CFR 0_132.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public final class aR {
    public aR() {
        try {
            new StringBuilder(String.valueOf(GUI.w())).append("temp_%g_%u.txt");
            if (GUI.u().contentEquals("mac") || GUI.w() != null) {
                // empty if block
            }
            return;
        }
        catch (Throwable throwable) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            simpleDateFormat.format(date);
            return;
        }
    }
}

