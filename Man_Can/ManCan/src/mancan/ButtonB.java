
package mancan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonB extends JButton implements ActionListener {
    
    public ButtonB() {
        setName("Up");
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt) {
        System.out.println("yolo");
        ScreenTest.x = ScreenTest.x + 20;
        System.out.println(ScreenTest.x);
    }
}
