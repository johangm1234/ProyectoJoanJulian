import java.util.Scanner;
public class AnioBisiesto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        boolean Bisies = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                Bisies = true;
            }
        }

        // Mostrar el resultado
        if (Bisies) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        scanner.close();
    }
}
