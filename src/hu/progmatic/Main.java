package hu.progmatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy évet!");
        int ev = scanner.nextInt();
        scanner.nextLine();

        boolean osztNegy = ev >= 1582 && ev % 4 == 0;
        boolean kerekEvek = osztNegy && ev % 100 == 0 && ev % 400 == 0;


        if (osztNegy && ev % 100 == 0) {
            System.out.println(kerekEvek?"Szökőév!":"Nem szökőév!");
        }   else if (osztNegy && kerekEvek) {
            System.out.println("Szökőév!");
        }   else if (osztNegy && !(ev % 100 == 0)) {
            System.out.println("Szökőév!");
        } else {
            System.out.println("Nem szökőév!");
        }

    }

}


