import javax.swing.*;

public class AdministradorUsuarios {
    public static void mostrarAdministrarUsuarios() {
        JFrame frame = new JFrame("Administrar Usuarios");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel idUsuarioLabel = new JLabel("ID Usuario:");
        idUsuarioLabel.setBounds(10, 20, 80, 25);
        panel.add(idUsuarioLabel);

        JTextField idUsuarioText = new JTextField(20);
        idUsuarioText.setBounds(100, 20, 165, 25);
        panel.add(idUsuarioText);

        JButton buscarButton = new JButton("Buscar Usuario");
        buscarButton.setBounds(10, 60, 150, 25);
        panel.add(buscarButton);

        buscarButton.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Usuario encontrado con ID: " + idUsuarioText.getText()));
    }
}



