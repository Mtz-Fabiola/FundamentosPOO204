
//IMPORTACIONES
//import java.util.Random;
import java.util.Scanner;

//CLASE PRINCIPAL
public class Main {

    //Metodo Principal (Main)
    public static void main(String[] args) {

//        System.out.printf("Hello, Fabiola Mtz R !");
//        String cadenas = "fabiola" + "martinez" + "rauda";
//
//        System.out.println(cadenas);
//
//        System.out.println(cadenas.length());
//
//        System.out.println(cadenas.substring(2,5));
//        System.out.println(cadenas.substring(2));
//        System.out.println(cadenas.substring(0,5));

//   3. Variables
//        int x=5,x2;
//        double y = 1.25,y2;
//        String z = "204",z1;
//
//        //Conversion de cadena a int
//        x2=Integer.parseInt(z);
//
//        //Conversion de double a cadena
//        z1= String.valueOf(y);
//
//        //Conversion de int a double
//        double asd = Double.valueOf(x);
//
//        //Conversion Implicita
//        int num = 12;
//        double numD = num;
//        System.out.println("Conversion Implicita"+numD);
//
//
//        System.out.println(x2);
//        System.out.println(z1);
//        System.out.println(x);
//
//        //Creamos un objeto rdn de clase Random
//        Random rdn = new Random();
//
//        //Generamos numeros y los guardamos
//        int numAleatorio = rdn.nextInt();
//        double numDouble = rdn.nextDouble();
//
//        System.out.println("Aleatorio entero: "+numAleatorio);
//        System.out.println("Aleatorio double: "+numDouble);

        //4. Solicitud de datos


//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Introduce cualquier dato ");
//        String dato = scn.nextLine();
//
//        System.out.println("Introduce dato entero");
//        int datoentero = scn.nextInt();
//
//        System.out.println("Introduce dato decimal ");
//        double datodecimal = scn.nextDouble();
//
//        System.out.println("Cualquier dato" + dato);


//        System.out.println("Dato Entero" + datoentero);
//        System.out.println("Dato Decimal" + datodecimal);


        //5.Boolean, operadores logicos y de comparacion

        System.out.println(10>9); //True
        System.out.println(10==9); //False
        System.out.println(10<9); //False
        System.out.println(10>=9); //True
        System.out.println(10<=9); //False
        System.out.println(10!=9); //True


        int x = 3;
        System.out.println(x< 5 && x>10);//False  se tienen que cumplir las dos
        System.out.println(x< 5 || x>10);//True  aunque se cumpla una
        System.out.println(!(x< 5 && x>10));//True  Se niegan ambas


        }
    }
