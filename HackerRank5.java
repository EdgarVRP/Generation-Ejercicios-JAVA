
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class HackerRank5 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        /*
         * ArrayList<String> names = new ArrayList<String>();
         * ArrayList<Integer> phones = new ArrayList<Integer>();
         */
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            // names.add(in.nextLine());
            // phones.add(in.nextInt());
            in.nextLine();
            // System.out.println(names);
            // System.out.println(phones);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
            // System.out.println(in.nextLine());

        }
        System.out.println(phoneBook);
    }
}