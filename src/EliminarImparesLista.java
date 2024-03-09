import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EliminarImparesLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista para almacenar los elementos
        List<Integer> lista = new ArrayList<>();

        // Solicitar al usuario ingresar los elementos de la lista
        System.out.println("Ingrese los elementos de la lista (ingrese -1 para terminar):");
        int elemento = scanner.nextInt();
        while (elemento != -1) {
            lista.add(elemento);
            elemento = scanner.nextInt();
        }

        // Eliminar elementos impares de la lista
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            int num = iterador.next();
            if (num % 2 != 0) {
                iterador.remove();
            }
        }

        // Mostrar la lista sin elementos impares
        System.out.println("Lista sin elementos impares:");
        for (int num : lista) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
