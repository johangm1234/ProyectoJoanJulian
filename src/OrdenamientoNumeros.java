import java.util.Scanner;

public class OrdenamientoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar tres números enteros
        System.out.println("Ingrese tres números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Determinar el número mayor
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        // Determinar el número menor
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Determinar el número intermedio
        int intermedio = (num1 + num2 + num3) - (mayor + menor);

        // Mostrar los números ordenados
        System.out.println("Los números ordenados de menor a mayor son: " + menor + ", " + intermedio + ", " + mayor);

        scanner.close();
    }
}
