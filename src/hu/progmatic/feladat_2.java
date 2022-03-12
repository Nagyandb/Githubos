package hu.progmatic;

import java.util.Scanner;

public class feladat_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg egy számot!");
        int number = sc.nextInt();
        sc.nextLine();


        int index = 1;
        int osztok = 0;


        for(index = 1; index <= number; index++) {
            if( number%index == 0 )
                osztok++;
        }

        System.out.println("Osztók száma: " + osztok);

    }
}
