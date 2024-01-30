import javax.swing.*;
import java.awt.*;

public class InterfazMenu extends JPanel {
    protected BotonMenu inventario;
    private BotonMenu ventas;
    private BotonMenu gestionGanadera;
    private BotonMenu gestionZonaPastoreo;
    private BotonMenu administración;

    public InterfazMenu() {
        this.setBackground(new Color(192,192,192));
        //this.setBounds(x,y,ancho,largo);
        this.setLayout(new GridBagLayout());
        this.setPreferredSize(new Dimension(300,100));
        this.iniciarBotones();
        this.agregarBotones();
        this.establecerVisibilidad();
        this.setVisible(true);
    }

    private void establecerVisibilidad() {
        this.inventario.setVisible(true);
        this.ventas.setVisible(true);
        this.administración.setVisible(true);
        this.gestionGanadera.setVisible(true);
        this.gestionZonaPastoreo.setVisible(true);
    }

    private void agregarBotones() {
        this.add(this.inventario, this.inventario.getGbc());
        this.add(this.ventas,this.ventas.getGbc());
        this.add(this.administración, this.administración.getGbc());
        this.add(this.gestionGanadera, this.gestionGanadera.getGbc());
        this.add(this.gestionZonaPastoreo, this.gestionZonaPastoreo.getGbc());
    }


    private void iniciarBotones() {
        this.inventario = new BotonMenu("INVENTARIO",0,1);
        this.administración = new BotonMenu("ADMINISTRACION",0,2);
        this.gestionGanadera = new BotonMenu("GESTIÓN GANADERA",0,3);
        this.gestionZonaPastoreo = new BotonMenu("GESTIÓN ZONA PASTOREO",0,4);
        this.ventas = new BotonMenu("VENTAS",0,5);
    }


}
