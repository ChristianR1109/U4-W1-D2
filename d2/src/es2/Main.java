package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------SWITCH----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero, se compreso tra 0 e 3 verrà stampato in lettere.");
        int n = Integer.parseInt(scanner.nextLine());
        if (n >= 0 && n <= 3) {
            switch (n) {
                case 0:
                    System.out.println("Il valore inserito è : Zero");
                    break;
                case 1:
                    System.out.println("Il valore inserito è : Uno");
                    break;
                case 2:
                    System.out.println("Il valore inserito è : Due");
                    break;
                case 3:
                    System.out.println("Il valore inserito è : Tre");
                    break;
            }

        } else {
            System.out.println("Il valore inserito non è compreso tra 0 e 3.");
        }
    }
}
