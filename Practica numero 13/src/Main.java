import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        String menu = "Seleccione una opción:\n"
                + "1. Registrar Vehículo\n"
                + "2. Registrar Conductor\n"
                + "3. Asignar Conductor a Vehículo\n"
                + "4. Registrar Envío\n"
                + "5. Registrar Entrega\n"
                + "6. Actualizar Estado de la Entrega\n"
                + "7. Mostrar Información\n"
                + "8. Salir";

        while (true) {
            String opcionStr = JOptionPane.showInputDialog(menu);
            int opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:

                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):"));
                    vehiculo = new Vehiculo(placa, modelo, capacidadCarga);
                    JOptionPane.showMessageDialog(null, "Vehículo registrado con éxito.");
                    break;

                case 2:

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese el numero de indentificacio  del coductor:");
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                    conductor = new Conductor(nombre, identificacion, licencia);
                    JOptionPane.showMessageDialog(null, "Conductor registrado con éxito.");
                    break;

                case 3:

                    if (vehiculo != null && conductor != null) {
                        vehiculo.asignarConductor(conductor);
                        JOptionPane.showMessageDialog(null, "Conductor asignado al vehículo con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero registre un vehículo y un conductor.");
                    }
                    break;

                case 4:

                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío registrado con éxito.");
                    break;

                case 5:

                    String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:");
                    entrega = new Entrega(numeroGuia);
                    JOptionPane.showMessageDialog(null, "Entrega registrada con éxito.");
                    break;

                case 6:

                    if (entrega != null) {
                        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");
                        entrega.actualizarEstado(nuevoEstado);
                        JOptionPane.showMessageDialog(null, "Estado de la entrega actualizado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero registre una entrega.");
                    }
                    break;

                case 7:

                    String informacion = "Información del sistema:\n";
                    if (vehiculo != null) {
                        informacion += "Vehículo:\n"
                                + "Placa: " + vehiculo.getPlaca() + "\n"
                                + "Modelo: " + vehiculo.getModelo() + "\n"
                                + "Capacidad de Carga: " + vehiculo.getCapacidadCarga() + "\n";
                    } else {
                        informacion += "No se ha registrado un vehículo.\n";
                    }

                    if (conductor != null) {
                        informacion += "Conductor:\n"
                                + "Nombre: " + conductor.getNombre() + "\n"
                                + "Identificación: " + conductor.getIdentificacion() + "\n"
                                + "Licencia: " + conductor.getLicencia() + "\n";
                    } else {
                        informacion += "No se ha registrado un conductor.\n";
                    }

                    if (envio != null) {
                        informacion += "Envío:\n"
                                + "Código de Envío: " + envio.getCodigoEnvio() + "\n"
                                + "Destino: " + envio.getDestino() + "\n"
                                + "Peso: " + envio.getPeso() + "\n";
                    } else {
                        informacion += "No se ha registrado un envío.\n";
                    }

                    if (entrega != null) {
                        informacion += "Entrega:\n"
                                + "Número de Guía: " + entrega.getNumeroGuia() + "\n"
                                + "Estado: " + entrega.getEstado() + "\n";
                    } else {
                        informacion += "No se ha registrado una entrega.\n";
                    }

                    JOptionPane.showMessageDialog(null, informacion);
                    break;

                case 8:

                    JOptionPane.showMessageDialog(null, "Programa cerrado.");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}


