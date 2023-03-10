import java.util.Scanner;

public class EjercicioClase3 {
    public static void main(String[] args) {
        // Ejemplo de operador ternario en java
        int a = 5;
        int b = 10;
        String resultado = (a > b) ? "a es mayor que b" : "b es mayor que a";
        System.out.println(resultado);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calificacion: ");
        int calificacionIngresada = sc.nextInt();
        String resultado2 = (calificacionIngresada >= 6) ? "Aprobado" : "Reprobado";
        System.out.println(resultado2);
        // imprimiendo con el operdor ternario
        System.out.println((calificacionIngresada >= 6) ? "Aprobado" : "Reprobado");
    }
}
