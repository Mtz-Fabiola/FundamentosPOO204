import javax.swing.*;

public class Articulo {

    public static void mostrarArticulo() {
        JFrame frame = new JFrame("Administrar Artículos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Nombre del Artículo:");
        nameLabel.setBounds(10, 20, 150, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(160, 20, 165, 25);
        panel.add(nameText);

        JLabel quantityLabel = new JLabel("Cantidad:");
        quantityLabel.setBounds(10, 50, 150, 25);
        panel.add(quantityLabel);

        JTextField quantityText = new JTextField(20);
        quantityText.setBounds(160, 50, 165, 25);
        panel.add(quantityText);

        JButton addButton = new JButton("Agregar Artículo");
        addButton.setBounds(10, 80, 150, 25);
        panel.add(addButton);
    }
}








