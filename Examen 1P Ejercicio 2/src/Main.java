import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        double temperatura;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Celsius a Kelvin");
            System.out.println("3. Fahrenheit a Celsius");
            System.out.println("4. Kelvin a Celsius");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la temperatura en Celsius: ");
                    temperatura = sc.nextDouble();
                    System.out.println("temperatura en Fahrenheit es: " + ((temperatura * 9 / 5) + 32));
                    break;
                case 2:
                    System.out.print("Ingrese la temperatura en Celsius: ");
                    temperatura = sc.nextDouble();
                    System.out.println("Temperatura en Kelvin es: " + (temperatura + 273.15));
                    break;
                case 3:
                    System.out.print("Ingresa la temperatura en Fahrenheit: ");
                    temperatura = sc.nextDouble();
                    System.out.println("Temperatura en Celsius es: " + ((temperatura - 32) * 5 / 9));
                    break;
                case 4:
                    System.out.print("Ingresa la temperatura en Kelvin: ");
                    temperatura = sc.nextDouble();
                    System.out.println("Temperatura en Celsius es: " + (temperatura - 273.15));
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Elija una opcion ");
            }
            System.out.println();

        } while (opcion != 5);


    }
}
