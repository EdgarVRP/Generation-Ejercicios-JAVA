public class EjercicioClase1 {
    public static void main(String[] args) {
        // Actividad 1: Si X, Y y Z son variables de tipo boolean con valores X = true,
        // Y= false, Z = true, determina el valor de las siguientes expresiones logicas:
        boolean x = true;
        boolean y = false;
        boolean z = true;
        boolean resultado = (x && y) || (x && z);
        System.out.println("Resultado 1: " + resultado);
        resultado = x || y && z;
        System.out.println("Resultado 2: " + resultado);
        resultado = x || y || x && !z && !y;
        System.out.println("Resultado 3: " + resultado);
        resultado = !x || !y || z && x && !y;
        System.out.println("Resultado 4: " + resultado);
        boolean w = false;
        x = true;
        y = true;
        z = false;
        resultado = w || y && x && w || z;
        System.out.println("Resultado 1: " + resultado);
        resultado = x && !y && !x || !w && y;
        System.out.println("Resultado 2: " + resultado);
        resultado = !(w || !y) && x || z;
        System.out.println("Resultado 3: " + resultado);
        resultado = !x && y && (!z || !x);
        System.out.println("Resultado 4: " + resultado);
    }
}
