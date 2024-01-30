
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Modulos extends JFrame {
    private JPanel contenidoPanel;
    
    public Modulos() {
        this.setTitle("Modulos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(900, 600));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.colocarContenido();
        this.setVisible(true);
        requestFocusInWindow();
    }

    private void colocarContenido() {
        SideMenuPanel menu = new SideMenuPanel(100, 150);
        contenidoPanel = new PanelHome();
        add(menu, BorderLayout.WEST);
        add(Box.createRigidArea(new Dimension(20, 0)));
        add(contenidoPanel, BorderLayout.CENTER);
    }
}
