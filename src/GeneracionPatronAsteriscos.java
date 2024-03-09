import java.util.Scanner;

public class GeneracionPatronAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validar que el número sea positivo
        if (numero <= 0) {
            System.out.println("El número ingresado no es positivo.");
            return;
        }

        // Generar el patrón de asteriscos
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
