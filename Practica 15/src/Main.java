import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        while (true) {

            String[] opciones = {"Agregar Empleado", "Listar Empleados", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == 0) {
                String tipoEmpleado = JOptionPane.showInputDialog("Ingrese el tipo de empleado (Conductor/Administrativo):");

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

                if (tipoEmpleado.equalsIgnoreCase("Conductor")) {
                    String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia del conductor:");
                    Conductor conductor = new Conductor(nombre, id, salario, licencia);
                    empleados.add(conductor);
                } else if (tipoEmpleado.equalsIgnoreCase("Administrativo")) {
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
                    Administrativo administrativo = new Administrativo(nombre, id, salario, departamento);
                    empleados.add(administrativo);
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de empleado no válido.");
                }

            } else if (seleccion == 1) {
                if (empleados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                } else {
                    StringBuilder listaEmpleados = new StringBuilder("Lista de Empleados:\n\n");
                    for (Empleado empleado : empleados) {
                        listaEmpleados.append("\n-------------------------\n");
                        empleado.mostrarInfo(); // Usando polimorfismo
                        listaEmpleados.append("-------------------------\n");
                    }
                    JOptionPane.showMessageDialog(null, listaEmpleados.toString());
                }

            } else if (seleccion == 2) { // Salir
                JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
                break;
            }
        }
    }
}
