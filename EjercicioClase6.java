import java.util.Scanner;

public class EjercicioClase6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while (numero > 0) {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
        }
        System.out.println("El numero ingresado es negativo");
        // programa que pide un numero menor o a 100 (si lee numero o a 100, se detiene)

    }
}
