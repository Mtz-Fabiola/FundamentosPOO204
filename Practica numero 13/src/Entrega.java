import javax.swing.*;

public class Entrega {
    private String numeroGuia;
    private String estado;

    // Constructor
    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";  // Estado por defecto
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado inválido. Solo se puede actualizar a 'En tránsito' o 'Entregado'.");
        }
    }

    // Métodos getter y setter
    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }
}

