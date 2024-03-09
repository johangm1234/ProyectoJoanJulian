import java.util.Scanner;

public class CalculoMaximoComunDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números enteros positivos
        System.out.print("Ingrese el primer número entero positivo: ");
        int num1 = Math.abs(scanner.nextInt());

        System.out.print("Ingrese el segundo número entero positivo: ");
        int num2 = Math.abs(scanner.nextInt());

        // Calcular el máximo común divisor (MCD)
        int mcd = calcularMCD(num1, num2);

        // Mostrar el resultado
        System.out.println("El máximo común divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);

        scanner.close();
    }

    // Método para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
