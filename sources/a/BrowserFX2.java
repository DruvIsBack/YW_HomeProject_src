/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javafx.application.Platform
 *  javafx.collections.ObservableList
 *  javafx.embed.swing.JFXPanel
 *  javafx.scene.Group
 *  javafx.scene.Parent
 *  javafx.scene.Scene
 *  javafx.scene.web.WebEngine
 *  javafx.scene.web.WebView
 */
import java.awt.Component;
import java.net.CookieHandler;
import java.net.CookieManager;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BrowserFX2 {
    private WebView b;
    private CookieManager a;

    public BrowserFX2() {
        this(500, 400, 500, 400);
    }

    public BrowserFX2(int n2, int n3, int n4, int n5) {
        Object object = new WebView();
        BrowserFX2 browserFX2 = this;
        this.b = object;
        browserFX2 = this;
        browserFX2.b.setMinSize((double)n2, (double)n3);
        browserFX2 = this;
        browserFX2.b.setPrefSize((double)n4, (double)n5);
        object = new CookieManager();
        browserFX2 = this;
        this.a = object;
        browserFX2 = this;
        CookieHandler.setDefault(browserFX2.a);
    }

    public final void e(String string) {
        BrowserFX2 browserFX2 = this;
        browserFX2.b.getEngine().load(string);
    }

    public static void main(String[] arrstring) {
        SwingUtilities.invokeLater(new C());
    }

    public final WebView a() {
        return this.b;
    }

    static /* synthetic */ void a(String string, JFXPanel jFXPanel) {
        Object object = new Group();
        Scene scene = new Scene((Parent)object);
        BrowserFX2 browserFX2 = new BrowserFX2(600, 600, 600, 600);
        ObservableList observableList = object.getChildren();
        object = browserFX2;
        observableList.add((Object)object.b);
        browserFX2.e("http://google.com");
        GUI.b().put(string, browserFX2);
        string = scene;
        jFXPanel.setScene((Scene)string);
    }

    static /* synthetic */ void b() {
        JFrame jFrame = new JFrame("Swing and JavaFX");
        JPanel jPanel = new JPanel();
        JFXPanel jFXPanel = new JFXPanel();
        jFrame.add(jPanel);
        jPanel.add((Component)jFXPanel);
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        Platform.runLater((Runnable)new B(jFXPanel));
    }
}

