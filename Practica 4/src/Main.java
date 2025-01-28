import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contraG = "Yousuario";

        System.out.print("Introduce la contraseña: ");
        String Usuario = scanner.nextLine();

        if (contraG.equalsIgnoreCase(Usuario)) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }

    }
}
