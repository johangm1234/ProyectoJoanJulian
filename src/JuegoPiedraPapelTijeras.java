import java.util.Random;
import java.util.Scanner;

public class JuegoPiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.print("Tu elección: ");
        int opcionUsuario = scanner.nextInt();

        String eleccionUsuario = "";
        switch (opcionUsuario) {
            case 1:
                eleccionUsuario = "Piedra";
                break;
            case 2:
                eleccionUsuario = "Papel";
                break;
            case 3:
                eleccionUsuario = "Tijeras";
                break;
            default:
                System.out.println("Opción no válida. Saliendo del juego.");
                return;
        }

        int opcionComputadora = random.nextInt(3) + 1;
        String eleccionComputadora = "";
        switch (opcionComputadora) {
            case 1:
                eleccionComputadora = "Piedra";
                break;
            case 2:
                eleccionComputadora = "Papel";
                break;
            case 3:
                eleccionComputadora = "Tijeras";
                break;
        }

        // Mostrar las elecciones
        System.out.println("La computadora elige: " + eleccionComputadora);
        System.out.println("Tú eliges: " + eleccionUsuario);

        // Determinar el ganador
        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("Piedra") && eleccionComputadora.equals("Tijeras")) ||
                (eleccionUsuario.equals("Papel") && eleccionComputadora.equals("Piedra")) ||
                (eleccionUsuario.equals("Tijeras") && eleccionComputadora.equals("Papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡La computadora gana!");
        }

        scanner.close();
    }
}
