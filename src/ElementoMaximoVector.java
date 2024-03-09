import java.util.Scanner;

public class ElementoMaximoVector {
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

        // Encontrar el elemento máximo en el vector
        int maximo = vector[0];
        for (int i = 1; i < tamaño; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }

        // Mostrar el elemento máximo del vector
        System.out.println("El elemento máximo del vector es: " + maximo);

        scanner.close();
    }
}

