
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Separador extends JSeparator {
    public Separador(int width) {
        super(SwingConstants.HORIZONTAL);
        this.setBackground(Color.decode("#abbbbd"));
        this.setPreferredSize(new Dimension(width, 10));
    }
}
