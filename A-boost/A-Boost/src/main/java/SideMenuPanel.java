
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;

class SideMenuPanel extends JPanel {
    private int tamañoMinimo;
    private int tamañoMaximo;
    private JButton botonMenu;
    private JButton botonInventario;

    SideMenuPanel(int min, int max) {
        super();
        tamañoMinimo = min;
        tamañoMaximo = max;
        setPreferredSize(new Dimension(tamañoMinimo, 600));
        setBackground(Color.red);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        botonMenu = new JButton("\u2630");
        botonMenu.setAlignmentX(CENTER_ALIGNMENT);
        botonInventario = new JButton("Inventario");
        botonInventario.setAlignmentX(CENTER_ALIGNMENT);
        
        add(botonMenu);
        add(botonInventario);
    }
}
