/*
 * Decompiled with CFR 0_132.
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aK
extends JPanel {
    private Image a;
    private Dimension a;

    public aK(Image object, Dimension dimension) {
        try {
            Object object2 = object;
            object = this;
            this.a = object2;
            object2 = dimension;
            object = this;
            this.a = object2;
            this.setPreferredSize(dimension);
            object2 = dimension;
            object = this;
            this.a = object2;
            this.setLayout(null);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    @Override
    public final void paintComponent(Graphics graphics) {
        try {
            graphics = (Graphics2D)graphics;
            graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            aK aK2 = this;
            graphics.drawImage(aK2.a, 0, 0, this.getWidth(), this.getHeight(), null);
            aK2 = this;
            if (aK2.a.equals(new Dimension(400, 300))) {
                graphics.setFont(new Font("Constantia", 3, 48));
                graphics.drawString("IQUALIF", 21, 50);
                graphics.drawString(GUI.D().replace("IQUALIF ", "").replace("White and Yellow", "").replace("White", "").replace("Yellow", ""), 21, 110);
                return;
            }
        }
        catch (Throwable throwable) {}
    }
}

