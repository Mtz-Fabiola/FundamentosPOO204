import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce el numero de horas ");
        int datoentero = scn.nextInt();

        System.out.println("Introduce el coste por hora");
        double datodecimal = scn.nextDouble();

        double multiplicacion = datoentero * datodecimal;

        System.out.println("El coste total es de: " + multiplicacion);


    }

}