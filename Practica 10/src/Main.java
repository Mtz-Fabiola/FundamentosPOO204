import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String inputLongitud = JOptionPane.showInputDialog("Ingresa la longitud :");
        int longitud = (inputLongitud != null && !inputLongitud.isEmpty()) ? Integer.parseInt(inputLongitud) : 8;
        if (longitud < 8) longitud = 8;

        int incluirMayus = JOptionPane.showConfirmDialog(null, "¿Quieres incluir mayusculas?", "Opcion", JOptionPane.YES_NO_OPTION);
        boolean mayusculas = (incluirMayus == JOptionPane.YES_OPTION);

        int incluirEsp = JOptionPane.showConfirmDialog(null, "¿Quieres incluir caracteres especiales?", "Opcion", JOptionPane.YES_NO_OPTION);
        boolean especiales = (incluirEsp == JOptionPane.YES_OPTION);

        Password passwordObj = new Password(longitud, mayusculas, especiales);
        String password = passwordObj.generarPassword();

        String fortaleza = Password.validarFortaleza(password);

        JOptionPane.showMessageDialog(null, "contraseña generada: " + password + "\nFortaleza: " + fortaleza);
    }
}