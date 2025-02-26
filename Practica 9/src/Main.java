import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Cuenta_Bancaria cuenta = new Cuenta_Bancaria(
                JOptionPane.showInputDialog("Ingrese el número de cuenta:"),
                JOptionPane.showInputDialog("Ingrese el nombre del titular:"),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:")),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"))
        );


        mostrarInfoCuenta(cuenta);


        cuenta.ingresar(500);
        cuenta.retirar(200);
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta.consultar_saldo());


        Cuenta_Bancaria otraCuenta = new Cuenta_Bancaria("12345", "Carlos Perez", 30, 1000);
        cuenta.depositar(otraCuenta, 300);


        cuenta.setNombre_titular("Nuevo Titular");
        mostrarInfoCuenta(cuenta);
        System.out.println("Nuevo titular: " + cuenta.getNombre_titular());
    }


    public static void mostrarInfoCuenta(Cuenta_Bancaria cuenta) {
        JOptionPane.showMessageDialog(null,
                "Cuenta: " + cuenta.getNumCuenta() +
                        "\nTitular: " + cuenta.getNombre_titular() +
                        "\nEdad: " + cuenta.getEdad() +
                        "\nSaldo: $" + cuenta.getSaldo());
    }
}