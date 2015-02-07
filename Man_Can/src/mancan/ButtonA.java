
package mancan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonA extends JButton implements ActionListener {
    public static String[] array = { "Up", "Down", "Left", "Right" };
    public String typedef;
    
    public ButtonA(String a) {
        typedef = a;
        setName(a);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt) {
        if (typedef == "Up") {
            ScreenTest.y = ScreenTest.y + 10;
        }
        if (typedef == "Down") {
            ScreenTest.y = ScreenTest.y - 10;
        }
        if (typedef == "Right") {
            ScreenTest.x = ScreenTest.x + 10;
        }
        if (typedef == "Left") {
            ScreenTest.x = ScreenTest.x - 10;
        }
    }
}
