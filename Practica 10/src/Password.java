import java.util.Random;

public class Password {

    // ATRIBUTOS
    public int longitud;
    Boolean mayusculas;
    Boolean especiales;

    //METODOS
    public Password(int longitud, Boolean mayusculas, Boolean especiales) {
        this.longitud = (longitud >= 8) ? longitud : 8;
        this.mayusculas = mayusculas;
        this.especiales = especiales;
    }

    public String generarPassword() {
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String especialess = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        String caracteres = minusculas + numeros;
        if (mayusculas) {
            caracteres += mayusculass;
        }
        if (especiales) {
            caracteres += especialess;
        }

        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = rand.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }

    public static String validarFortaleza(String password) {
        boolean tieneMayuscula = false, tieneMinuscula = false, tieneNumero = false, tieneEspecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            if (Character.isLowerCase(c)) tieneMinuscula = true;
            if (Character.isDigit(c)) tieneNumero = true;
            if ("!@#$%^&*()-_=+[]{}|;:,.<>?".contains(String.valueOf(c))) tieneEspecial = true;
        }

        if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial) {
            return "Muy buena";
        } else if ((tieneMayuscula || tieneMinuscula) && tieneNumero) {
            return "Buena";
        } else {
            return "Mala";
        }
    }
}
