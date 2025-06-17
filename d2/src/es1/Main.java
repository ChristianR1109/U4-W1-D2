package es1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------IF ELSE IF----------");
        System.out.println("Inserisci una stringa ");
        String s1 = scanner.nextLine();
        System.out.println(stringaPariDispari(s1));


        System.out.println("Inserisci un anno per controllare se è bisestile o meno!");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println(controlloBisestile(anno));


        scanner.close();


    }

    public static boolean stringaPariDispari(String s1) {
        int nChar = s1.length();
        boolean flag = true;
        if (nChar % 2 == 0) {
            flag = true;
            System.out.println("Il numero di caratteri è pari, risultato : ");
        } else {
            flag = false;
            System.out.println("Il numero di caratteri è dispari, risultato : ");
        }
        return flag;
    }

    public static boolean controlloBisestile(int anno) {

        boolean flag2 = true;
        if (anno % 4 == 0) {
            if (anno % 4 == 0 && anno % 100 == 0) {
                if (anno % 400 == 0) {
                    flag2 = true;
                    System.out.println("L'anno inserito è bisestile, risultato : ");
                } else {
                    flag2 = false;
                    System.out.println("L'anno inserito non è bisestile, risultato : ");
                }
            } else {
                flag2 = true;
                System.out.println("L'anno inserito è bisestile, risultato : ");
            }
        } else {
            flag2 = false;
            System.out.println("L'anno inserito non è bisestile, risultato : ");
        }
        return flag2;
    }
}