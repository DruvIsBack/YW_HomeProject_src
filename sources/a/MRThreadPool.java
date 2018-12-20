/*
 * Decompiled with CFR 0_132.
 */
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MRThreadPool {
    private static BlockingQueue a = new ArrayBlockingQueue(1500);
    private static ThreadPoolExecutor a = new ThreadPoolExecutor(GUI.b(), GUI.b(), 0L, TimeUnit.MILLISECONDS, a);

    public static void f(bb bb2) {
        try {
            a.submit(new aT(bb2));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static boolean r() {
        try {
            ThreadPoolExecutor threadPoolExecutor;
            a.shutdownNow();
            a.getQueue().clear();
            a = threadPoolExecutor = new ThreadPoolExecutor(GUI.b(), GUI.b(), 0L, TimeUnit.MILLISECONDS, a);
        }
        catch (Throwable throwable) {}
        return false;
    }

    public static void D() {
        try {
            a.setCorePoolSize(GUI.b());
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void main(String[] object) {
        new aR();
        object = new bb();
        object.setUrl("http://www.jesus-lespectacle.com/");
        MRThreadPool.f((bb)object);
    }
}

