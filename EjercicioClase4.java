public class EjercicioClase4 {
    public static void main(String[] args) {
        int temp = 32;
        switch (temp) {
            case 21:
                System.out.println("Puedes incubar Gallinas");
                break;
            case 28:
                System.out.println("Puedes incubar pavo");
                break;
            case 32:
                System.out.println("Puedes incubar patos");
                break;
            case 33:
                System.out.println("Puedes incubar pavos reales");
                break;
            default:
                System.out.println("No se que hacer");
        }
        // Ejemplo usando continue con switch
        /*
         * switch (temp) {
         * case 21:
         * System.out.println("La incubadora esta apagada");
         * continue;
         * case 28:
         * System.out.println("Puedes incubar pavo");
         * continue;
         * case 32:
         * System.out.println("Puedes incubar patos");
         * continue;
         * case 33:
         * System.out.println("Puedes incubar pavos reales");
         * continue;
         * default:
         * System.out.println("No se que hacer");
         * continue;
         * }
         */

    }
}
