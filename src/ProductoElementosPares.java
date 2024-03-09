import java.util.Scanner;

public class ProductoElementosPares {
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

        // Calcular el producto de los elementos pares del vector
        int productoPares = 1;
        for (int i = 0; i < tamaño; i++) {
            if (vector[i] % 2 == 0) {
                productoPares *= vector[i];
            }
        }

        // Mostrar el producto de los elementos pares del vector
        System.out.println("El producto de los elementos pares del vector es: " + productoPares);

        scanner.close();
    }
}
