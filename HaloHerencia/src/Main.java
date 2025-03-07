
public class Main {
    public static void main(String[] args) {

        SpartanII jefeMaestro = new SpartanII("Jonh", 100, "rifle de asalto", 0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();

        System.out.println("--------------------------------------------------");

        SpartanIII jefe = new SpartanIII("Jeff", 100, "Scar", 0);
        jefe.mostrarInfo();
        jefe.camuflajeActivo();
        jefe.atacar("Liang");
        jefe.recibirDano(80);
        jefe.recargarEscudo();

        System.out.println("----------------------------------------------------");

        SpartanIV Master = new SpartanIV("Jack", 100, "Scar", 0);
        Master.mostrarInfo();
        Master.usaPropulsores();
        Master.atacar("Narcki");
        Master.recibirDano(49);
        Master.recargarEscudo();


    }



}