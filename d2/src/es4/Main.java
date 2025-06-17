package es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero per far partire il conto alla rovescia : ");
        int n = Integer.parseInt(scanner.nextLine());
        int counter = n;
        for (int i = 0; i <= n; i++) {
            System.out.println(counter);
            counter--;
        }
    }
}
