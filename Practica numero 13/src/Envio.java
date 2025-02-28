import javax.swing.*;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    // Constructor sobrecargado
    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    // Métodos getter y setter
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static Envio crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso (opcional):");

        if (pesoStr.isEmpty()) {
            return new Envio(codigoEnvio, destino);
        } else {
            double peso = Double.parseDouble(pesoStr);
            return new Envio(codigoEnvio, destino, peso);
        }
    }
}

