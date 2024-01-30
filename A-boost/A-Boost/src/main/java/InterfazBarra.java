import javax.swing.*;
import java.awt.*;

public class InterfazBarra extends JPanel {
    public InterfazBarra() {
        this.setBackground(new Color(32,129,244));
        //this.setBounds(x,y,ancho,largo);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(100,100));

        this.setVisible(true);
    }
}
