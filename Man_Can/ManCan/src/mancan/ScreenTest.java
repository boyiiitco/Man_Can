package mancan;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ScreenTest extends JPanel {
    public static int x = 0, y=0;
    
    public ScreenTest() {
        setVisible(true);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            File f = new File("template.png");
            File w = new File ("mancanman.png");
            BufferedImage man = ImageIO.read(w);
            BufferedImage background = ImageIO.read(f);
            g.drawImage(background, x, y, 800, getHeight(), this);
            g.drawImage(man, 225, 180, 20, 40, this);
            repaint();
        } catch (IOException ex) {
        }
        
    }
    public static void main(String[] args) {
        ScreenTest s = new ScreenTest();
        FrameLayout f = new FrameLayout(s);
    }
}
