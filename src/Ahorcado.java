import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intento = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control - Bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control - While
        while (!palabraAdivinada && intento < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ("
                    + palabraSecreta.length() + " letras)");
            System.out.println("Ingrese una letra: ");
            char letra = Character.toLowerCase(entrada.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intento++;
                System.out.println("¡Incorrecto!. Te quedan " + (intentosMaximos - intento) + " intentos.");

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Feliciades!. Has adivinado la palabra secreta. " + "(" + palabraSecreta + ")");
            }

        }
        if (!palabraAdivinada) {
            System.out.println("¡GAME OVER!. No has adivinado la palabra, te quedaste sin intentos.");
        }
        entrada.close();

    }
}
