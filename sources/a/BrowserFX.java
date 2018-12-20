/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.application.Platform
 *  javafx.embed.swing.JFXPanel
 *  javafx.scene.web.WebEngine
 *  javafx.scene.web.WebView
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class BrowserFX
extends JFXPanel {
    WebView a = null;
    String k = "unknown";
    String l = "";

    public BrowserFX() {
        try {
            Platform.runLater((Runnable)new y(this));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final String h() {
        try {
            Platform.runLater((Runnable)new z(this));
        }
        catch (Throwable throwable) {}
        return this.k;
    }

    public final String i() {
        String string;
        string = "";
        try {
            Object object = this;
            object = object.a.getEngine().getDocument();
            string = BrowserFX.a((Document)object);
            if (string == null) {
                string = "";
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    private static String a(Document object) {
        try {
            object = new DOMSource((Node)object);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            Object object2 = TransformerFactory.newInstance();
            object2 = object2.newTransformer();
            object2.transform((Source)object, streamResult);
            return stringWriter.toString();
        }
        catch (TransformerException transformerException) {
            return null;
        }
    }

    public final String j() {
        return this.l;
    }

    public final String k() {
        BrowserFX browserFX = this;
        return browserFX.a.getEngine().getLocation();
    }

    private void a(StringBuffer stringBuffer) {
        try {
            this.a(null, null, stringBuffer);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void a(String string, HashMap object, HashMap object2) {
        try {
            object = "";
            object2 = "";
            if (object.length() == 0) {
                this.a(string, (String)object2, null);
                return;
            }
            this.a(String.valueOf(string) + "?" + (String)object, (String)object2, null);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private void a(String string, String string2, StringBuffer stringBuffer) {
        try {
            Platform.runLater((Runnable)new A(this, stringBuffer, string, string2));
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static String w(String string) {
        try {
            if (!string.toLowerCase().startsWith("http")) {
                string = "http://" + string;
            }
        }
        catch (Throwable throwable) {}
        return string;
    }

    public final void b(String string, HashMap object, HashMap serializable) {
        try {
            object = "";
            serializable = new StringBuffer();
            serializable.append("<HTML><BODY><form action='" + BrowserFX.w(string) + "' method='post'>");
            serializable.append("</form>");
            serializable.append("<script  language='javascript'>document.forms[0].submit();document.cookie='" + (String)object + "';</script></BODY></HTML>");
            this.a((StringBuffer)serializable);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static String l() {
        return "";
    }

    public static String m() {
        return "";
    }

    public static void b(String object, String string) {
        try {
            object = (BrowserFX)((Object)GUI.c.get(object));
            object = (JPanel)object.getParent();
            TitledBorder titledBorder = (TitledBorder)object.getBorder();
            titledBorder.setTitle(string);
            object.repaint();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static JPanel a(String string, String object, String string2) {
        JPanel jPanel;
        jPanel = new JPanel(new BorderLayout());
        try {
            if (GUI.c() == 0) {
                return jPanel;
            }
            JPanel jPanel2 = new JPanel(new BorderLayout());
            jPanel2.setLayout(new BoxLayout(jPanel2, 2));
            jPanel2.setBorder(BorderFactory.createTitledBorder((String)object));
            object = new BrowserFX();
            jPanel2.setName(string);
            object.setName(string);
            GUI.c.put(string, object);
            jPanel2.add((Component)object, "Center");
            jPanel.add((Component)jPanel2, "Center");
            object.setOpaque(true);
            jPanel2.setOpaque(true);
            BrowserFX.super.a(new StringBuffer(string2));
        }
        catch (Throwable throwable) {}
        return jPanel;
    }

    private static void a() {
        try {
            int n2 = 0;
            while (n2 < 1000) {
                Object object = new ArrayList<String>();
                object.add("https://www.google.fr/");
                Random random = new Random();
                object = (String)object.get(random.nextInt(object.size()));
                ((BrowserFX)((Object)GUI.c.get("browser"))).a((String)object, (HashMap)null, (HashMap)null);
                Thread.sleep(2500L);
                ++n2;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void main(String[] object) {
        try {
            new aR();
            GUI.n();
            GUI.o();
            object = new JDialog();
            object.add(BrowserFX.a("browser", GUI.D(), "<html><p>" + aM.G("loading") + "</p></html>"));
            object.setSize(700, 680);
            object.setLocationRelativeTo(null);
            object.setVisible(true);
            BrowserFX.a();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    static /* synthetic */ String x(String string) {
        return BrowserFX.w(string);
    }
}

