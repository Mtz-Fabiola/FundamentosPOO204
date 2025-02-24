public class Spartan {

    //SET Y GET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    private void consultaCortana() {
        System.out.println("Conversacion privada.....");
    }


    //CONSTRUCTOR
    public Spartan(String nombre, int salud, int escudo, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.armaPrincipal = armaPrincipal;
    }
    //ATRIBUTOS DEL SPARTAN
    private String nombre;
    private int salud;
    private int escudo;
    private String armaPrincipal;

    //Metodos del Spartan
    public void mostrarInfo(){
        System.out.println("------Informacion del Spartan------");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Salud: "+ salud);
        System.out.println("Escudo: "+ escudo);
        System.out.println("Arma Principal: "+ armaPrincipal);
        System.out.println("-----------------------------------");
    }
    public void atacar(String enemigo){
        System.out.println(nombre +" atacar a "+ enemigo +" con "+ armaPrincipal );
    }

    public void recargarArma(int municiones){
        int restante  = 10;
        int total = restante + municiones;
        System.out.println("El arma " + armaPrincipal+ " tiene " + total + " balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El Spartan "+ nombre + " esta corriendo");
        }else{
            System.out.println("El Spartan "+ nombre + " se detuvo");
        }
    }

}//Llave de la clase
