import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonMenu extends JButton {
    protected String texto;
    private GridBagConstraints gbc;
    private int x;
    private int y;

    public BotonMenu(String texto, int x, int y) {
        super(texto);
        this.x = x;
        this.y = y;
        this.setHorizontalAlignment(SwingConstants.CENTER); // Alineación horizontal al centro
        this.setVerticalAlignment(SwingConstants.CENTER); // Alineación vertical al centro
        this.setMargin(new Insets(10, 10, 10, 10));
        this.setPreferredSize(new Dimension(300,56));
        configurarGBC(x);
        this.texto = texto.toUpperCase();
        this.setFont(new Font("Arial", Font.BOLD, 14));
        this.setForeground(Color.WHITE);
        this.setBackground(new Color(192, 192, 192));
        //this.setBorder(BorderFactory.createLineBorder(new Color(41, 128, 185), 2));
        this.setFocusPainted(false);
    }

    private void configurarGBC(int x) {
        this.gbc = new GridBagConstraints();
        gbc.gridx = x;

        //gbc.insets = new Insets(10, 10, 10, 20);
    }


    public GridBagConstraints getGbc() {
        this.gbc.gridy = y;
        gbc.fill = GridBagConstraints.BOTH;

        return gbc;
    }
}
