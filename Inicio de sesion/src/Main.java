import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Pestaña Inicio de Sesión
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        loginPanel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        loginPanel.add(userText);
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        loginPanel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        loginPanel.add(passwordText);
        JButton loginButton = new JButton("Iniciar Sesion");
        loginButton.setBounds(10, 80, 150, 25);
        loginPanel.add(loginButton);
        tabbedPane.addTab("Inicio de Sesión", loginPanel);

        JPanel articuloPanel = new JPanel();
        articuloPanel.setLayout(null);
        JLabel idLabel = new JLabel("ID Artículo:");
        idLabel.setBounds(10, 20, 120, 25);
        articuloPanel.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(140, 20, 165, 25);
        articuloPanel.add(idText);
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(10, 50, 120, 25);
        articuloPanel.add(nombreLabel);
        JTextField nombreText = new JTextField(20);
        nombreText.setBounds(140, 50, 165, 25);
        articuloPanel.add(nombreText);
        JLabel descripcionLabel = new JLabel("Descripción:");
        descripcionLabel.setBounds(10, 80, 120, 25);
        articuloPanel.add(descripcionLabel);
        JTextField descripcionText = new JTextField(20);
        descripcionText.setBounds(140, 80, 165, 25);
        articuloPanel.add(descripcionText);
        JLabel cantidadLabel = new JLabel("Cantidad Disponible:");
        cantidadLabel.setBounds(10, 110, 120, 25);
        articuloPanel.add(cantidadLabel);
        JTextField cantidadText = new JTextField(20);
        cantidadText.setBounds(140, 110, 165, 25);
        articuloPanel.add(cantidadText);
        JLabel unidadLabel = new JLabel("Unidad de Medida:");
        unidadLabel.setBounds(10, 140, 120, 25);
        articuloPanel.add(unidadLabel);
        JTextField unidadText = new JTextField(20);
        unidadText.setBounds(140, 140, 165, 25);
        articuloPanel.add(unidadText);
        JButton submitArticuloButton = new JButton("Guardar");
        submitArticuloButton.setBounds(10, 170, 150, 25);
        articuloPanel.add(submitArticuloButton);
        tabbedPane.addTab("Artículo", articuloPanel);

        // Pestaña Solicitud de Artículos
        JPanel solicitudPanel = new JPanel();
        solicitudPanel.setLayout(null);
        JLabel idSolicitudLabel = new JLabel("ID Solicitud:");
        idSolicitudLabel.setBounds(10, 20, 120, 25);
        solicitudPanel.add(idSolicitudLabel);
        JTextField idSolicitudText = new JTextField(20);
        idSolicitudText.setBounds(140, 20, 165, 25);
        solicitudPanel.add(idSolicitudText);
        JLabel idUsuarioLabel = new JLabel("ID Usuario:");
        idUsuarioLabel.setBounds(10, 50, 120, 25);
        solicitudPanel.add(idUsuarioLabel);
        JTextField idUsuarioText = new JTextField(20);
        idUsuarioText.setBounds(140, 50, 165, 25);
        solicitudPanel.add(idUsuarioText);
        JLabel articulosLabel = new JLabel("Artículos Solicitados:");
        articulosLabel.setBounds(10, 80, 120, 25);
        solicitudPanel.add(articulosLabel);
        JTextField articulosText = new JTextField(20);
        articulosText.setBounds(140, 80, 165, 25);
        solicitudPanel.add(articulosText);
        JButton submitSolicitudButton = new JButton("Crear Solicitud");
        submitSolicitudButton.setBounds(10, 110, 150, 25);
        solicitudPanel.add(submitSolicitudButton);
        tabbedPane.addTab("Solicitud de Artículos", solicitudPanel);

        // Pestaña Administrador de Usuarios
        JPanel adminUsuariosPanel = new JPanel();
        adminUsuariosPanel.setLayout(null);
        JLabel idUsuarioAdminLabel = new JLabel("ID Usuario:");
        idUsuarioAdminLabel.setBounds(10, 20, 120, 25);
        adminUsuariosPanel.add(idUsuarioAdminLabel);
        JTextField idUsuarioAdminText = new JTextField(20);
        idUsuarioAdminText.setBounds(140, 20, 165, 25);
        adminUsuariosPanel.add(idUsuarioAdminText);
        JLabel nombreAdminLabel = new JLabel("Nombre:");
        nombreAdminLabel.setBounds(10, 50, 120, 25);
        adminUsuariosPanel.add(nombreAdminLabel);
        JTextField nombreAdminText = new JTextField(20);
        nombreAdminText.setBounds(140, 50, 165, 25);
        adminUsuariosPanel.add(nombreAdminText);
        JLabel apellidoAdminLabel = new JLabel("Apellido:");
        apellidoAdminLabel.setBounds(10, 80, 120, 25);
        adminUsuariosPanel.add(apellidoAdminLabel);
        JTextField apellidoAdminText = new JTextField(20);
        apellidoAdminText.setBounds(140, 80, 165, 25);
        adminUsuariosPanel.add(apellidoAdminText);
        JLabel departamentoAdminLabel = new JLabel("Departamento:");
        departamentoAdminLabel.setBounds(10, 110, 120, 25);
        adminUsuariosPanel.add(departamentoAdminLabel);
        JTextField departamentoAdminText = new JTextField(20);
        departamentoAdminText.setBounds(140, 110, 165, 25);
        adminUsuariosPanel.add(departamentoAdminText);
        JLabel contraseñaAdminLabel = new JLabel("Contraseña:");
        contraseñaAdminLabel.setBounds(10, 140, 120, 25);
        adminUsuariosPanel.add(contraseñaAdminLabel);
        JPasswordField contraseñaAdminText = new JPasswordField(20);
        contraseñaAdminText.setBounds(140, 140, 165, 25);
        adminUsuariosPanel.add(contraseñaAdminText);
        JButton submitAdminButton = new JButton("Guardar Usuario");
        submitAdminButton.setBounds(10, 170, 150, 25);
        adminUsuariosPanel.add(submitAdminButton);
        tabbedPane.addTab("Administrador de Usuarios", adminUsuariosPanel);

        // Pestaña Inventario
        JPanel inventarioPanel = new JPanel();
        inventarioPanel.setLayout(null);
        JLabel idArticuloInvLabel = new JLabel("ID Artículo:");
        idArticuloInvLabel.setBounds(10, 20, 120, 25);
        inventarioPanel.add(idArticuloInvLabel);
        JTextField idArticuloInvText = new JTextField(20);
        idArticuloInvText.setBounds(140, 20, 165, 25);
        inventarioPanel.add(idArticuloInvText);
        JLabel nombreInvLabel = new JLabel("Nombre:");
        nombreInvLabel.setBounds(10, 50, 120, 25);
        inventarioPanel.add(nombreInvLabel);
        JTextField nombreInvText = new JTextField(20);
        nombreInvText.setBounds(140, 50, 165, 25);
        inventarioPanel.add(nombreInvText);
        JLabel cantidadInvLabel = new JLabel("Cantidad:");
        cantidadInvLabel.setBounds(10, 80, 120, 25);
        inventarioPanel.add(cantidadInvLabel);
        JTextField cantidadInvText = new JTextField(20);
        cantidadInvText.setBounds(140, 80, 165, 25);
        inventarioPanel.add(cantidadInvText);
        JButton agregarButton = new JButton("Agregar Artículo");
        agregarButton.setBounds(10, 110, 150, 25);
        inventarioPanel.add(agregarButton);
        tabbedPane.addTab("Inventario", inventarioPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}













