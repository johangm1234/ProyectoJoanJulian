import java.util.Scanner;

public class CalculadoraInteresesCompuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar la cantidad inicial invertida
        System.out.print("Ingrese la cantidad inicial invertida: ");
        double cantidadInicial = scanner.nextDouble();

        // Solicitar al usuario ingresar la tasa de interés anual
        System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
        double tasaInteresAnual = scanner.nextDouble();

        // Solicitar al usuario ingresar el número de años
        System.out.print("Ingrese el número de años: ");
        int numAnios = scanner.nextInt();

        // Calcular el monto final utilizando la fórmula de interés compuesto
        double tasaInteresDecimal = tasaInteresAnual / 100.0;
        double montoFinal = cantidadInicial * Math.pow((1 + tasaInteresDecimal), numAnios);

        // Mostrar el monto final
        System.out.println("El monto final después de " + numAnios + " años es: " + montoFinal);

        scanner.close();
    }
}
