import java.util.Scanner;

public class SumaDigitos {
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

        // Calcular la suma de los dígitos del número
        int sumaDigitos = 0;
        while (numero > 0) {
            sumaDigitos += numero % 10; // Obtiene el último dígito y lo suma
            numero /= 10; // Elimina el último dígito
        }

        // Mostrar el resultado
        System.out.println("La suma de los dígitos del número es: " + sumaDigitos);

        scanner.close();
    }
}
