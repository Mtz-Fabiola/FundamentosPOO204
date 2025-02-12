public class Main{
    public static void main(String[] args){

        //Creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();

        //Asignamos los atributos al objeto

        jefeMaestro.nombre = "John 117";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Rifle de asalto";

        //Usar sus metodos del jefe maestro
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);


        // Segundo Objeto Reach
        reach.nombre = "Emile";
        reach.salud = 0;
        reach.escudo = 0;
        reach.armaPrincipal = "Aguijoneador";

        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(10);
        reach.correr(false);


    }
}//Llave del Main