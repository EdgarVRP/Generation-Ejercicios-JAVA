import java.util.Scanner;

public class EjercicioClase7 {
    public static void main(String[] args) {
        int valor = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un valor entre 1 y 10");
            valor = sc.nextInt();
        } while (valor < 1 || valor > 10);
    }
}
