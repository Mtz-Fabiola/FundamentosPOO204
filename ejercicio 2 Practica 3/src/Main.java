import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.println("Nombre en minúsculas: " + nombreCompleto.toLowerCase());
        System.out.println("Nombre en mayúsculas: " + nombreCompleto.toUpperCase());

    }
}

