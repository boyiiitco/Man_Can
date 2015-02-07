package mancan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class FrameLayout extends JFrame {
    JPanel decision;
    public static JButton[] dec = new JButton[4];
    
     public FrameLayout(JPanel screen) {
         super("ManCan");
         JSplitPane pane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
         pane.setDividerLocation(400);
         pane.setLastDividerLocation(400);
         pane.setEnabled(false);
         screen.setSize(400,400);
         decision = new JPanel();
         for(int i = 0; i < dec.length; i++) {
             dec[i] = new JButton();
             dec[i].setSize(400, 40);
             decision.add(dec[i]);
         }
         decision.setLayout(new GridLayout(4,1 ));
         pane.setTopComponent(screen);
         pane.setBottomComponent(decision);
         add(pane);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(500, 700);
         setVisible(true);
         setResizable(false);
     }
}
