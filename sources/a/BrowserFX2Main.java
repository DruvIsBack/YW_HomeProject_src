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
 *  javafx.scene.web.WebView
 */
import java.awt.Component;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BrowserFX2Main {
    public static void main(String[] arrstring) {
        SwingUtilities.invokeLater(new E());
    }

    static /* synthetic */ void a(JFXPanel jFXPanel) {
        Group group = new Group();
        Scene scene = new Scene((Parent)group);
        BrowserFX2 browserFX2 = new BrowserFX2(600, 600, 600, 600);
        group.getChildren().add((Object)browserFX2.a());
        browserFX2.e("https://www.pagesjaunes.fr");
        group = scene;
        jFXPanel.setScene((Scene)group);
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
        Platform.runLater((Runnable)new D(jFXPanel));
    }
}

