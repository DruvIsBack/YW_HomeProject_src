/*
 * Decompiled with CFR 0_132.
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Inserter {
    private BlockingQueue a;
    private boolean a;
    private static BlockingQueue b = new ArrayBlockingQueue(1500);
    private static ThreadPoolExecutor a = new ThreadPoolExecutor(GUI.b(), GUI.b(), 0L, TimeUnit.MILLISECONDS, b);
    private long a = 0L;

    public static void main(String[] object) {
        try {
            object = new Inserter();
            try {
                do {
                    Inserter.super.process();
                    Thread.sleep(3000L);
                } while (true);
            }
            catch (Throwable throwable) {
                return;
            }
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void process() {
        try {
            while (!this.a.isEmpty()) {
                ++this.a;
                this.a.poll();
                a.submit(new aL(this));
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

