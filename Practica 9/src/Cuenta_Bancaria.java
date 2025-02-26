import javax.swing.JOptionPane;

public class Cuenta_Bancaria {

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cuenta_Bancaria(String numCuenta, String nombre_titular, int edad, double saldo) {
        this.numCuenta = numCuenta;
        this.nombre_titular = nombre_titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    // ATRIBUTOS
    private String numCuenta;
    private String nombre_titular;
    private int edad;
    private double saldo;

    // METODOS
    public double consultar_saldo() {
        return this.saldo;
    }

    public void ingresar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            JOptionPane.showMessageDialog(null, "Su saldo se ingreso correctamente: " + this.saldo);
        } else if (monto < 0) {
            JOptionPane.showMessageDialog(null, "El monto no puede ser negativo");
        } else {
            JOptionPane.showMessageDialog(null, "El monto no es valido");
        }
    }

    public double retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            JOptionPane.showMessageDialog(null, "Su retiro fue correcto: " + this.saldo);
            return monto;
        } else if (monto < 0) {
            JOptionPane.showMessageDialog(null, "El monto no puede ser negativo");
            return 0;
        } else {
            JOptionPane.showMessageDialog(null, "El monto no es suficiente");
            return 0;
        }
    }

    public boolean depositar(Cuenta_Bancaria otraCuenta, double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            otraCuenta.ingresar(monto);
            JOptionPane.showMessageDialog(null, "El deposito se realizo correctamente a la cuenta " + otraCuenta.numCuenta);
            return true;
        } else if (monto < 0) {
            JOptionPane.showMessageDialog(null, "El monto no puede ser negativo");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "El monto no es valido");
            return false;
        }
    }
}