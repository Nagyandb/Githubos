package hu.progmatic;

import java.util.Scanner;

public class feladat_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg egy számot!");
        int number = sc.nextInt();
        sc.nextLine();

        boolean nagyobbMintNulla = number > 0;
        int index = 1;
        int osztok = 0;

        while (index <= number && nagyobbMintNulla) {
            if (number % index == 0) {
                osztok++;
            }
            index++;
        }

        System.out.println("Osztók száma: " + osztok);

    }
}
