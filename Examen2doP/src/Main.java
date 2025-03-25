import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String apellidoPaterno = JOptionPane.showInputDialog("Ingresa tu apellido paterno:");
        String apellidoMaterno = JOptionPane.showInputDialog("Ingresa tu apellido materno:");
        String anioNacimiento = JOptionPane.showInputDialog("Ingresa tu año de nacimiento:");

        String matriculaGenerada = Matricula.generarMatricula(nombre, apellidoPaterno, apellidoMaterno, anioNacimiento);

        JOptionPane.showMessageDialog(null, "Tu matrícula generada es: " + matriculaGenerada);
    }
}
