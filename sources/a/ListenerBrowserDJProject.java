/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  chrriis.dj.nativeswing.swtimpl.components.JWebBrowser
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserCommandEvent
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserListener
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowOpeningEvent
 *  chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowWillOpenEvent
 */
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserCommandEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserListener;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowOpeningEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowWillOpenEvent;

public class ListenerBrowserDJProject
implements WebBrowserListener {
    public static void main(String[] arrstring) {
    }

    public void commandReceived(WebBrowserCommandEvent webBrowserCommandEvent) {
    }

    public void loadingProgressChanged(WebBrowserEvent webBrowserEvent) {
        try {
            if (webBrowserEvent.getSource().getClass().toString().contains("chrriis.dj.nativeswing.swtimpl.components.JWebBrowser")) {
                webBrowserEvent = (JWebBrowser)webBrowserEvent.getSource();
                webBrowserEvent.getName();
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public void locationChangeCanceled(WebBrowserNavigationEvent webBrowserNavigationEvent) {
    }

    public void locationChanged(WebBrowserNavigationEvent webBrowserNavigationEvent) {
        try {
            String string;
            if (webBrowserNavigationEvent.getSource().getClass().toString().contains("chrriis.dj.nativeswing.swtimpl.components.JWebBrowser") && (string = (webBrowserNavigationEvent = (JWebBrowser)webBrowserNavigationEvent.getSource()).getName()).contentEquals("browser")) {
                webBrowserNavigationEvent.getResourceLocation();
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public void locationChanging(WebBrowserNavigationEvent webBrowserNavigationEvent) {
    }

    public void statusChanged(WebBrowserEvent webBrowserEvent) {
        try {
            if (webBrowserEvent.getSource().getClass().toString().contains("chrriis.dj.nativeswing.swtimpl.components.JWebBrowser")) {
                webBrowserEvent = (JWebBrowser)webBrowserEvent.getSource();
                webBrowserEvent.getName();
                return;
            }
        }
        catch (Throwable throwable) {}
    }

    public void titleChanged(WebBrowserEvent webBrowserEvent) {
    }

    public void windowClosing(WebBrowserEvent webBrowserEvent) {
    }

    public void windowOpening(WebBrowserWindowOpeningEvent webBrowserWindowOpeningEvent) {
    }

    public void windowWillOpen(WebBrowserWindowWillOpenEvent webBrowserWindowWillOpenEvent) {
    }
}

