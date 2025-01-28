import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

//        System.out.println("Introduce el numero de horas ");
//        int datoentero = scn.nextInt();
//
//        System.out.println("Introduce el coste por hora");
//        double datodecimal = scn.nextDouble();
//
//        double multiplicacion = datoentero * datodecimal;
//
//        System.out.println("El coste total es de: " + multiplicacion);


        System.out.println("Introduce tu nombre completo : ");
        String nombre = scn.nextLine();

        System.out.println("Tu nombre en mayusculas es: "+ nombre.toUpperCase()+ "");

        System.out.println("Introduce tu nombre completo : ");
        String nombrem = scn.nextLine();

        System.out.println("Tu nombre en mayusculas es: "+ nombre.toLowerCase()+ "");

        System.out.println("Introduce tu nombre: ");
        String nombrei = scn.nextLine();

        System.out.println("Nombre con la primea mayuscula: " + capitalize (nombrei));




    }

}