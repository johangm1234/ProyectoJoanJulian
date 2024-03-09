import java.util.Random;
import java.util.Scanner;

public class GeneracionNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar dos números enteros aleatorios entre 1 y 10
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;

        // Calcular la suma de los dos números
        int sumaCorrecta = num1 + num2;

        // Solicitar al usuario ingresar la suma de los dos números
        System.out.print("Ingrese la suma de " + num1 + " y " + num2 + ": ");
        int sumaUsuario = scanner.nextInt();

        // Verificar si la respuesta es correcta
        if (sumaUsuario == sumaCorrecta) {
            System.out.println("¡Respuesta correcta!");
        } else {
            System.out.println("Respuesta incorrecta. La suma correcta es " + sumaCorrecta);
        }

        scanner.close();
    }
}
