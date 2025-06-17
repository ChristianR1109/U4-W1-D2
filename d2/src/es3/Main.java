package es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1;

        String stop = ":q";

        do {
            System.out.println("Inserisci una stringa, per uscire dal ciclo inserisci ':q' ");
            s1 = scanner.nextLine();
            int n = s1.length();
//            String s2[] = new String[n];
//
//            for (int i = 0; i < n; i++) {
//                s2[i] = (s1.charAt(i) + ",");
//          }
//
//          for (int j = 0; j < n; j++) {
//               System.out.println(s2[j]);
//          }
            String s3 = "";
            if (!s1.equals(stop)) {
                for (int i = 0; i < n; i++) {
                    s3 += (s1.charAt(i) + ",");
                }
                

                System.out.println(s3);
            }
        } while (!s1.equals(stop));


    }
}
