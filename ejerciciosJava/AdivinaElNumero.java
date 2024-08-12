package ejerciciosJava;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        int numeroAleatorio = (int) (Math.random() * 100) + 1; // Generate random number

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Adivina un número entre 1 y 100"); // Clear instructions

        int numeroUsuario;

        do {
            System.out.print("Ingresa tu número: "); // Use print for prompt
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor.");
            }
        } while (numeroUsuario != numeroAleatorio); // Correct loop condition

        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
    }
}
