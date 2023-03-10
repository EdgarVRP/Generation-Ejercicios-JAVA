import java.util.Scanner;

public class EjercicioClase5 {
    /* Programa para crear un menu de restaurante */
    public static void main(String[] args) {
        // Ejemplo del uso de switch con un menu de rastaurante
        Scanner opcion = new Scanner(System.in);
        System.out.println("Bienvenido al restaurante");
        System.out.println("Ingresa 1 para hacer un pedido");
        System.out.println("Ingresa 2 para pagar el pedido");
        System.out.println("Ingresa 3 para cancelar el pedido");
        System.out.println("Ingresa 4 para revisar el estatus del pedido");
        System.out.println("Ingresa 5 para salir");
        int op = opcion.nextInt();
        switch (op) {
            case 1:
                System.out.println("Hacer un pedido");
                break;
            case 2:
                System.out.println("Pagar el pedido");
                break;
            case 3:
                System.out.println("Cancelar el pedido");
                break;
            case 4:
                System.out.println("Revisar el estatus del pedido");
                break;
            case 5:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }
}
