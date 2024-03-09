import java.util.Scanner;

public class CalcularDigitosRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validar que el número sea positivo
        if (numero < 0) {
            System.out.println("El número ingresado no es positivo.");
            return;
        }

        // Solicitar al usuario ingresar un dígito
        System.out.print("Ingrese un dígito: ");
        int digito = scanner.nextInt();

        // Validar que el dígito esté entre 0 y 9
        if (digito < 0 || digito > 9) {
            System.out.println("El dígito ingresado no es válido.");
            return;
        }

        // Contar la cantidad de veces que aparece el dígito en el número
        int contador = 0;
        int numeroTemporal = numero;
        while (numeroTemporal > 0) {
            int digitoActual = numeroTemporal % 10;
            if (digitoActual == digito) {
                contador++;
            }
            numeroTemporal /= 10;
        }

        // Mostrar el resultado
        System.out.println("El dígito " + digito + " aparece " + contador + " veces en el número " + numero + ".");

        scanner.close();
    }
}
