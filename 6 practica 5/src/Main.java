import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de asteriscos en la base del árbol: ");
        int base = scanner.nextInt();


        if (base % 2 == 0) {
            base++;
        }


        int nivel = 1;
        while (nivel <= base) {

            int asteriscos = 2 * nivel - 1;

            int espacios = (base - asteriscos) / 2;


            int i = 0;
            while (i < espacios) {
                System.out.print(" ");
                i++;
            }


            while (i < asteriscos) {
                System.out.print("*");
                i++;
            }

            System.out.println();
            nivel++;
        }

        int troncoEspacios = (base - 1) / 2;
        int troncoAsteriscos = 1;
        int j = 0;
        while (j < troncoEspacios) {
            System.out.print(" ");
            j++;
        }
        while (j < troncoEspacios + troncoAsteriscos) {
            System.out.print("*");
            j++;
        }

        System.out.println();
    }
}
