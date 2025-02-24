public class Main{
    public static void main(String[] args){

        //Creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan("John 117",100,90,"Rifle de asalto");
        Spartan reach = new Spartan("Emile",0,0,"Aguijoneador");


        //Usar sus metodos del jefe maestro
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(10);
        reach.correr(false);

        //EJEMPLO DEL GET Y SET CON EL OBJETO JEFEMAESTRO
        jefeMaestro.setNombre("Ivan Isay");
        jefeMaestro.mostrarInfo();
        System.out.println(jefeMaestro.getNombre());


    }
}//Llave del Main