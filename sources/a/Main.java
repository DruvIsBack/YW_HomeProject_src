/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.NativeInterface
 */
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] arrstring) {
        try {
            Object object = new ArrayList();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(object);
            arrayList2.addAll(arrayList);
            object = new ArrayList(object);
            object.retainAll(arrayList);
            arrayList2.removeAll((Collection<?>)object);
            object = arrayList2.iterator();
            while (object.hasNext()) {
                object.next();
            }
            GUI.n();
            GUI.t(a.b());
            GUI.u(System.getProperty("java.version"));
            GUI.o();
            NativeInterface.open();
            GUI.launch(arrstring);
            NativeInterface.runEventPump();
            return;
        }
        catch (Throwable throwable) {
            GUI.launch(arrstring);
            return;
        }
    }
}

