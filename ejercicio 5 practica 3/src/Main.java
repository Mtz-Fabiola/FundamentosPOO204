import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        final int PESO_PAYASO = 112;
        final int PESO_MUNECA = 75;
        System.out.print("Introduce el número de payasos vendidos: ");
        int numPayasos = scanner.nextInt();

        System.out.print("Introduce el número de muñecas vendidas: ");
        int numMunecas = scanner.nextInt();

        int pesoTotal = (numPayasos * PESO_PAYASO) + (numMunecas * PESO_MUNECA);


        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");

    }
}
