import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PromedioCalificacionesEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un HashMap para almacenar nombres de estudiantes y listas de calificaciones
        Map<String, List<Integer>> calificacionesPorEstudiante = new HashMap<>();

        // Solicitar al usuario ingresar los nombres de los estudiantes y sus calificaciones
        System.out.println("Ingrese los nombres de los estudiantes y sus calificaciones (Ingrese FIN para terminar):");
        String nombre = scanner.next();
        while (!nombre.equals("FIN")) {
            // Crear una lista para almacenar las calificaciones del estudiante
            List<Integer> calificaciones = new ArrayList<>();

            // Solicitar al usuario ingresar las calificaciones del estudiante
            System.out.println("Ingrese las calificaciones del estudiante " + nombre + " (separadas por espacios):");
            while (scanner.hasNextInt()) {
                int calificacion = scanner.nextInt();
                calificaciones.add(calificacion);
            }

            // Agregar el nombre del estudiante y su lista de calificaciones al HashMap
            calificacionesPorEstudiante.put(nombre, calificaciones);
            nombre = scanner.next();
        }

        // Calcular el promedio de calificaciones para cada estudiante
        Map<String, Double> promediosPorEstudiante = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : calificacionesPorEstudiante.entrySet()) {
            String estudiante = entry.getKey();
            List<Integer> calificaciones = entry.getValue();
            double suma = 0;
            for (int calificacion : calificaciones) {
                suma += calificacion;
            }
            double promedio = suma / calificaciones.size();
            promediosPorEstudiante.put(estudiante, promedio);
        }

        // Mostrar el promedio de calificaciones para cada estudiante
        System.out.println("Promedio de calificaciones por estudiante:");
        for (Map.Entry<String, Double> entry : promediosPorEstudiante.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}

