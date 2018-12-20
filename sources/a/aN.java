/*
 * Decompiled with CFR 0_132.
 */
final class aN
extends Thread {
    private final /* synthetic */ String ad;
    private final /* synthetic */ String ae;
    private final /* synthetic */ String af;

    aN(String string, String string2, String string3) {
        this.ad = string;
        this.ae = string2;
        this.af = string3;
    }

    @Override
    public final void run() {
        try {
            String[] arrstring = a.b();
            if (arrstring.contentEquals("mac")) {
                arrstring = new String[]{this.ad, this.ae, "-Dprism.order=sw", "-Dfile.encoding=utf-8", "-Djava.net.preferIPv4Stack=true", "-cp", this.af, "Updater"};
                Runtime.getRuntime().exec(arrstring);
                return;
            }
            arrstring = new String[]{this.ad, "-Dfile.encoding=utf-8", "-Djava.net.preferIPv4Stack=true", "-cp", this.af, "Updater"};
            Runtime.getRuntime().exec(arrstring);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

