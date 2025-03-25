import java.util.Random;

public class Matricula {

    public static String generarMatricula(String nombre, String apellidoPaterno, String apellidoMaterno, String anioNacimiento) {
        String primeraLetraNombre = nombre.substring(0, 1).toUpperCase();
        String primerasLetrasApellidoPaterno = apellidoPaterno.substring(0, 2).toUpperCase();
        String primerasLetrasApellidoMaterno = apellidoMaterno.substring(0, 2).toUpperCase();
        String dosUltimosDigitosAnio = anioNacimiento.substring(2, 4);

        Random random = new Random();
        int digitosAleatorios = 10 + random.nextInt(90);

        String matricula = primeraLetraNombre + primerasLetrasApellidoPaterno + primerasLetrasApellidoMaterno
                + dosUltimosDigitosAnio + digitosAleatorios;

        return matricula;
    }
}


