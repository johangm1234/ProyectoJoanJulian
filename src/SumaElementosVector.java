import java.util.Scanner;

public class SumaElementosVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = scanner.nextInt();

        // Crear el vector con el tamaño especificado por el usuario
        int[] vector = new int[tamaño];

        // Solicitar al usuario ingresar los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Calcular la suma de los elementos del vector
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += vector[i];
        }

        // Mostrar la suma de los elementos del vector
        System.out.println("La suma de los elementos del vector es: " + suma);

        scanner.close();
    }
}
