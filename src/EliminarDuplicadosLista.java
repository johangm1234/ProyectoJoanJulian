import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EliminarDuplicadosLista {
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

        // Eliminar duplicados utilizando un conjunto (HashSet)
        Set<Integer> conjunto = new HashSet<>(lista);
        lista.clear();
        lista.addAll(conjunto);

        // Mostrar la lista sin duplicados
        System.out.println("Lista sin duplicados:");
        for (int num : lista) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
