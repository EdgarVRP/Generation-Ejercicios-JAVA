import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Ejercicio01
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1: encontrar el área de un triángulo a partir de 3 lados");
        System.out.println("Los lados del triángulo son: 3, 4, 5");

        // pasar de doble a string
        // String lado1 = Double.toString(3);
        System.out.println("El área del triángulo es: " + metodo1(3.0, 4.0, 5.0));
        System.out.println("Ejercicio 2: encontrar el area y la circunferencia de un circulo");
        System.out.println("El radio del circulo es: 5");
        System.out.println("El área del circulo es: " + metodo2(5.0));
        System.out.println("Ejercicio 3: mostrar la hora del sistema");
        System.out.println("La hora del sistema es: " + metodo3());
        System.out.println("Ejercicio 4: convertir segundos a horas, minutos y segundos");
        System.out.println("Los segundos a convertir son: 3600");
        System.out.println("Los segundos convertidos son: " + metodo4(3600));
        System.out.println("Los segundos a convertir son: 4263");
        System.out.println("Los segundos convertidos son: " + metodo4(4263));
        System.out.println("Ejercicio 5: encontrar el volumen de una esfera");
        System.out.println("El radio de la esfera es: 5");
        System.out.println("El volumen de la esfera es: " + metodo5(5.0));
        System.out.println("Ejercicio 6: encontrar el volumen de un cono");
        System.out.println("El radio del cono es: 5");
        System.out.println("La altura del cono es: 10");
        System.out.println("El volumen del cono es: " + metodo6(5.0, 10.0));
        System.out.println("Ejercicio 7: encontrar el area superficial de un cubo");
        System.out.println("El lado del cubo es: 5");
        System.out.println("El area superficial del cubo es: " + metodo7(5.0));
        System.out.println("Ejercicio 8: descubrir si un año ingresado es bisiesto o no");
        System.out.println("El año a verificar es: 2020");
        System.out.println("El año es bisiesto: " + metodo8(2020));
        System.out.println("El año a verificar es: 2021");
        System.out.println("El año es bisiesto: " + metodo8(2021));
    }

    // 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3
    // lados ingresados
    // Revisar si es un triángulo válido
    public static double metodo1(Double lado1, Double lado2, Double lado3) {
        double area = 0;
        double s = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }

    // 2 Escribir un metodo para encontrar el area y la circunferencia de un circulo
    // dado el radio
    // Utilizar PI de la libreria de Java
    public static double metodo2(Double radio) {
        double area = 0;
        double circunferencia = 0;
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        return area;
    }

    // 3 Escribir un metodo que muestre por consola la hora actual del sistema
    // Utilizar e investigar la libreria de Java
    public static String metodo3() {
        LocalDateTime hora = LocalDateTime.now();
        return hora.toString();
    }

    // 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos,
    // segundos) segun sea el caso
    // ej 3600 = "1 hora = 60 min = 3600 seg"
    public static String metodo4(int segundos) {
        String resultado = "";
        double horas = 0;
        double minutos = 0;
        horas = (double) segundos / 3600;
        minutos = (double) segundos / 60;
        resultado = horas + " horas = " + minutos + " minutos = " + segundos + " segundos";
        return resultado;
    }

    // 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
    public static double metodo5(Double radio) {
        double volumen = 0;
        volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
        return volumen;
    }

    // 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y
    // la altura
    public static double metodo6(Double radio, Double altura) {
        double volumen = 0;
        volumen = (Math.PI * Math.pow(radio, 2) * altura) / 3;
        return volumen;
    }

    // 7 Encontrar el area superficial de un cubo dado un lado a
    public static double metodo7(Double lado) {
        double area = 0;
        area = 6 * Math.pow(lado, 2);
        return area;
    }

    // 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
    public static boolean metodo8(int anio) {
        boolean bisiesto = false;
        if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
            // El año es bisiesto
            bisiesto = true;
        } else {
            // El año no es bisiesto
            bisiesto = false;
        }
        return bisiesto;
    }
}