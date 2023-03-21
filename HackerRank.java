import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // Usando el metodo reverse de la clase StringBuilder

        StringBuilder A1 = new StringBuilder(A);
        A1.reverse();
        // verificando si es palindromo
        if (A.equals(A1.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
