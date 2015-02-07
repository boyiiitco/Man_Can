
package mancan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ButtonA extends JButton implements ActionListener {
    
    public ButtonA() {
        setName("Up");
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt) {
        System.out.println("hello");
        ScreenTest.x = ScreenTest.x + -20;
        System.out.println(ScreenTest.x);
    }
}
