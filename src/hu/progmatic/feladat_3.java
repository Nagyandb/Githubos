package hu.progmatic;

import java.util.Scanner;

public class feladat_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg egy számot!");
        int number = sc.nextInt();
        sc.nextLine();

        boolean nagyobbMintNulla = number > 0;
        long index = 1;
        int osztok = 0;

        for(index = 1; index <= number; index++) {
            if( number%index == 0 )
                osztok++;
        }

        System.out.println(osztok == 2 ? "Prímszám.":"Nem prímszám.");
    }
}
