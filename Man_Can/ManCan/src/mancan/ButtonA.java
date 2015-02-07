
package mancan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonA extends JButton implements ActionListener {
    
    public ButtonA() {
        setName("Up");
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt) {
        
    }
}
