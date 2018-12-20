/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.jsoup.nodes.Document
 */
import java.util.List;
import org.jsoup.nodes.Document;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class b
implements Runnable {
    private /* synthetic */ BProxyRotator a;
    private final /* synthetic */ String b;
    private final /* synthetic */ List c;
    private final /* synthetic */ int[] a;
    private final /* synthetic */ int[] b;

    b(BProxyRotator bProxyRotator, String string, List list, int[] arrn, int[] arrn2) {
        this.a = bProxyRotator;
        this.b = string;
        this.c = list;
        this.a = arrn;
        this.b = arrn2;
    }

    @Override
    public final void run() {
        Document document = BProxyRotator.a(this.a, this.b);
        if (document != null) {
            this.c.add(document);
            int[] arrn = this.a;
            arrn[0] = arrn[0] + 1;
            return;
        }
        int[] arrn = this.b;
        arrn[0] = arrn[0] + 1;
    }
}

