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
public class Crawler {
    private BlockingQueue a;
    private boolean a;
    private static BlockingQueue b = new ArrayBlockingQueue(1500);
    private static ThreadPoolExecutor a = new ThreadPoolExecutor(GUI.b(), GUI.b(), 0L, TimeUnit.MILLISECONDS, b);
    private long a = 0L;

    public static void main(String[] object) {
        try {
            object = new Crawler();
            Crawler crawler = object;
            try {
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+fraternit\u00e9%2C+arras+(62000)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+vanves%2C+clamart+(92140)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+brissiaud+chapterie%2C+bellac+(87300)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+pont+briand%2C+gael+(35290)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+philippe+auguste%2C+les+andelys+(27700)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+alexandre+gervais%2C+cassis+(13260)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+des+edelweiss%2C+vigneux+sur+seine+(91270)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+p\u00e9martin%2C+oloron+ste+marie+(64400)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+la+gourdine%2C+challans+(85300)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+charles+mathis%2C+niederbronn+les+bains+(67110)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+lamar%2C+la+reole+(33190)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+feuillantines%2C+montrond+les+bains+(42210)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+verdun%2C+villeparisis+(77270)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+8+mai+1945%2C+haillicourt+(62940)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+cimeti\u00e8re%2C+jametz+(55600)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+l\u00e9on+gambetta%2C+frais+marais+(59500)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+source%2C+bresson+(38320)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+l+eglise%2C+cabestany+(66330)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+de+l+yerres%2C+soignolles+en+brie+(77111)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+ecuries%2C+ste+marie+aux+mines+(68160)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+cassel%2C+courcelles+les+lens+(62970)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+pont%2C+bellegarde+sur+valserine+(01200)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+charles+jullian%2C+bourg+les+valence+(26500)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+pierre+brossolette%2C+yerres+(91330)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+creuse%2C+ranspach+(68470)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+ch\u00e2tel%2C+arfeuilles+(03640)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+montaigne%2C+poitiers+(86000)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+paul+vaillant+couturier%2C+st+cyr+l+ecole+(78210)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+bois+de+rem\u00e9mont%2C+entre+deux+eaux+(88650)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+du+chene+vert%2C+la+chapelle+thouarault+(35590)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+vent\u00f4se%2C+abbeville+(80100)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+sundgau%2C+hegenheim+(68220)&proximite=0"));
                crawler.a.add(new bb("https://www.pagesjaunes.fr/pagesblanches/recherche?ou=rue+ribas%2C+bias+(47300)&proximite=0"));
            }
            catch (Throwable throwable) {}
            object.d();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void c() {
    }

    public final void d() {
        try {
            do {
                Crawler crawler = this;
                try {
                    while (!crawler.a.isEmpty()) {
                        ++crawler.a;
                        bb bb2 = (bb)crawler.a.poll();
                        a.submit(new F(crawler, bb2));
                    }
                }
                catch (Throwable throwable) {}
                Thread.sleep(3000L);
            } while (true);
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final BlockingQueue getQueue() {
        return this.a;
    }

    public static BlockingQueue a() {
        return b;
    }
}

