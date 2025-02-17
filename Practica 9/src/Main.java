import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Cuenta_Bancaria cuenta = new Cuenta_Bancaria();

        cuenta.numCuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta:");
        cuenta.nombre_titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        cuenta.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad :"));
        cuenta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo:"));

        int opcion;
        do {
            String menu = """
                ** MENU **
                1. Consultar Saldo
                2. Ingresar Dinero
                3. Retirar Dinero
                4. Depositar a Otra Cuenta
                5. Salir
                Seleccione una opcion: """;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Saldo actual es: " + cuenta.consultar_saldo() );
                }
                case 2 -> {
                    double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto :"));
                    cuenta.ingresar(monto);
                }
                case 3 -> {
                    double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto:"));
                    cuenta.retirar(monto);
                }
                case 4 -> {
                    Cuenta_Bancaria otraCuenta = new Cuenta_Bancaria();
                    otraCuenta.numCuenta = JOptionPane.showInputDialog("Ingrese el numero de la otra cuenta:");
                    double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto :"));
                    cuenta.depositar(otraCuenta, monto);
                }
                case 5 -> JOptionPane.showMessageDialog(null, "Gracias por usar el menu");
                default -> JOptionPane.showMessageDialog(null, "La opcion no es valida ");
            }
        } while (opcion != 5);
    }
}