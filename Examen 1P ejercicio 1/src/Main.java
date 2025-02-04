import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();


        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();


        if (longitud1 > longitud2)
        {
            System.out.println("La palabra mas larga: " + palabra1);
            System.out.println("Tiene " + (longitud1 - longitud2) + " letras mas");
        }
        else if (longitud2 > longitud1)
        {
            System.out.println("La palabra mas larga: " + palabra2);
            System.out.println("Tiene " + (longitud2 - longitud1) + " letras mas.");
        }
        else
        {
            System.out.println("Las dos palabras tienen las mismas letras");
        }

    }
}






