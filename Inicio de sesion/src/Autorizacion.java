import javax.swing.*;

public class Autorizacion {

    public static void mostrarAutorizacion() {
        JFrame frame = new JFrame("Autorización");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel solicitudLabel = new JLabel("ID de Solicitud:");
        solicitudLabel.setBounds(10, 20, 150, 25);
        panel.add(solicitudLabel);

        JTextField solicitudText = new JTextField(20);
        solicitudText.setBounds(160, 20, 165, 25);
        panel.add(solicitudText);

        JLabel autorizacionLabel = new JLabel("Estado de Autorización:");
        autorizacionLabel.setBounds(10, 50, 150, 25);
        panel.add(autorizacionLabel);

        String[] estados = { "Autorizado", "No Autorizado" };
        JComboBox<String> estadoComboBox = new JComboBox<>(estados);
        estadoComboBox.setBounds(160, 50, 165, 25);
        panel.add(estadoComboBox);

        JButton autorizarButton = new JButton("Autorizar Solicitud");
        autorizarButton.setBounds(10, 80, 150, 25);
        panel.add(autorizarButton);

        autorizarButton.addActionListener(e -> {
            String solicitudId = solicitudText.getText();
            String estado = (String) estadoComboBox.getSelectedItem();

            // Aquí podrías agregar la lógica para manejar la autorización
            JOptionPane.showMessageDialog(panel, "Solicitud " + solicitudId + " ha sido " + estado);
        });
    }
}






