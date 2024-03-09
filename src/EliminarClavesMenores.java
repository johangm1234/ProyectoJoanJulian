import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EliminarClavesMenores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un HashMap para almacenar claves y valores
        Map<String, Integer> hashMap = new HashMap<>();

        // Solicitar al usuario ingresar las claves y valores del HashMap
        System.out.println("Ingrese las claves y valores del HashMap (Ingrese FIN para terminar):");
        String clave = scanner.next();
        while (!clave.equals("FIN")) {
            System.out.print("Ingrese el valor para " + clave + ": ");
            int valor = scanner.nextInt();
            hashMap.put(clave, valor);
            clave = scanner.next();
        }

        // Solicitar al usuario ingresar el número para comparar con los valores del HashMap
        System.out.print("Ingrese un número para comparar con los valores del HashMap: ");
        int numeroComparar = scanner.nextInt();

        // Eliminar claves con valores menores que el número dado
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) < numeroComparar) {
                hashMap.remove(key);
            }
        }

        // Mostrar el HashMap resultante
        System.out.println("HashMap después de eliminar claves con valores menores que " + numeroComparar + ":");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
