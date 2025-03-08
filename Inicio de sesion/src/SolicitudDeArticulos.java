import javax.swing.*;

public class SolicitudDeArticulos {

    public static void mostrarSolicitud() {
        JFrame frame = new JFrame("Solicitar Artículos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel solicitudLabel = new JLabel("Artículo Solicitado:");
        solicitudLabel.setBounds(10, 20, 150, 25);
        panel.add(solicitudLabel);

        JTextField solicitudText = new JTextField(20);
        solicitudText.setBounds(160, 20, 165, 25);
        panel.add(solicitudText);

        JButton solicitarButton = new JButton("Solicitar Artículo");
        solicitarButton.setBounds(10, 50, 150, 25);
        panel.add(solicitarButton);
    }
}




