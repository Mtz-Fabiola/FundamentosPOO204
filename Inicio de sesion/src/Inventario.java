import javax.swing.*;

public class Inventario {

    public static void mostrarInventario() {
        JFrame frame = new JFrame("Inventario");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel inventarioLabel = new JLabel("Consultar Inventario:");
        inventarioLabel.setBounds(10, 20, 150, 25);
        panel.add(inventarioLabel);

        JTextField inventarioText = new JTextField(20);
        inventarioText.setBounds(160, 20, 165, 25);
        panel.add(inventarioText);

        JButton consultarButton = new JButton("Consultar");
        consultarButton.setBounds(10, 50, 150, 25);
        panel.add(consultarButton);
    }
}




