import java.util.Scanner;

public class ConversorMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar la cantidad de dinero en la moneda original
        System.out.print("Ingrese la cantidad de dinero en la moneda original: ");
        double cantidadOriginal = scanner.nextDouble();

        // Solicitar al usuario ingresar la tasa de cambio
        System.out.print("Ingrese la tasa de cambio: ");
        double tasaCambio = scanner.nextDouble();

        // Calcular la cantidad en la moneda de destino
        double cantidadDestino = cantidadOriginal * tasaCambio;

        // Mostrar el resultado
        System.out.println("La cantidad equivalente en la moneda de destino es: " + cantidadDestino);

        scanner.close();
    }
}
