import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Login extends JFrame {
    private JPanel contenido;
    private JLabel textoUsuario;
    private JTextField usuario;
    private JLabel textoContraseña;
    private JPasswordField contraseña;
    private JButton loginButton;

    public Login() {        
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(900, 600));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.colocarContenido();
        this.setVisible(true);
        requestFocusInWindow();
    }

    private void colocarContenido() {
        JPanel contenido = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                Graphics2D g2d = (Graphics2D) grphcs;
                GradientPaint gp = new GradientPaint(0, 0, Color.decode("#243338"),
                        getWidth(), getHeight(), Color.decode("#638b8d"));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight()); 

            }
        };
        contenido.setSize(900, 600);
        setText();
        setTextFields();
        setLoginButton();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        contenido.add(new Separador(usuario.getPreferredSize().width), gbc);
        gbc.gridy = 1;        
        contenido.add(textoUsuario, gbc);
        gbc.gridy = 2;        
        contenido.add(usuario, gbc);
        gbc.gridy = 3;
        contenido.add(new Separador(usuario.getPreferredSize().width), gbc);
        gbc.gridy = 4;
        contenido.add(textoContraseña, gbc);
        gbc.gridy = 5;
        contenido.add(contraseña, gbc);
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        contenido.add(loginButton, gbc);
        add(contenido, BorderLayout.CENTER);
    }

    private void setTextFields() {
        usuario = new JTextField("Example@gmail.com", 30);
        usuario.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usuario.getText().equals("Example@gmail.com")) {
                    usuario.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usuario.getText().isEmpty()) {
                    usuario.setText("Example@gmail.com");
                }
            }
        });
        usuario.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
        usuario.setOpaque(false);
        usuario.setBorder(null);
        usuario.setForeground(Color.decode("#e3f5f5"));
        contraseña = new JPasswordField(30);
        contraseña.setOpaque(false);
        contraseña.setBorder(null);
        contraseña.setForeground(Color.decode("#e3f5f5"));
        contraseña.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
    }

    private void setText() {
        textoUsuario = new JLabel();
        textoUsuario.setText("USUARIO");
        textoUsuario.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        textoUsuario.setForeground(Color.decode("#8a9ea0"));
        textoContraseña = new JLabel();
        textoContraseña.setText("CONTRASEÑA");
        textoContraseña.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        textoContraseña.setForeground(Color.decode("#8a9ea0"));
    }

    private void setLoginButton() {
        loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(usuario.getPreferredSize().width, 40));
        loginButton.setBackground(Color.decode("#a4b3b6"));
        loginButton.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO VALIDACION Y VERIFICACION
                if (contraseña.getPassword().length == 0 || usuario.getText().isEmpty()
                        || usuario.getText().equals("Example@gmail.com")) {
                    JOptionPane.showMessageDialog(null,
                    "Por favor ingrese un usuario y contraseña",
                    "Campos incompletos",
                    JOptionPane.WARNING_MESSAGE);
                } else {
                    SwingUtilities.getWindowAncestor(getContentPane()).dispose();
                    new MenuModulos();
                }

            }
        });
    }
}
