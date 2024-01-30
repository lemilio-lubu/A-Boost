import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuModulos extends JFrame implements ActionListener {
    private JPanel panelPrincipal;
    protected InterfazBarra panelSuperior;
    protected InterfazMenu panelMenu;
    //private interfazInvetario panelInventario;
    //private interfazVentas panelVentas;
    //private interfazGestionGanadera panelGestiónGanadera;
    //private interfazZonaPatoreo  panelGestiónZonaPastoreo;
    //private interfazAdministración panelAdministración;
    public MenuModulos() throws HeadlessException {
        this.panelPrincipal = new JPanel(new BorderLayout());
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1480,1000);
        this.iniciarMenu();
        this.setVisible(true);
    }


    private void iniciarMenu() {
        this.panelMenu = new InterfazMenu();
        this.panelSuperior = new InterfazBarra();
        this.panelPrincipal.add(panelMenu, BorderLayout.WEST);
        this.panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        this.add(panelPrincipal);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
