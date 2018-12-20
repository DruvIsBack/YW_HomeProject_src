/*
 * Decompiled with CFR 0_132.
 */
public final class f
implements Runnable {
    private GUI a;
    private String e;

    public f(GUI object, String string) {
        Object object2 = object;
        object = this;
        this.a = object2;
        object2 = string;
        object = this;
        this.e = object2;
    }

    @Override
    public final void run() {
        try {
            Thread.currentThread().getStackTrace();
            f f2 = this;
            f f3 = f2;
            f3 = this;
            f2.a.h(f3.e);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

