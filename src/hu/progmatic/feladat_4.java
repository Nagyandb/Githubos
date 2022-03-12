package hu.progmatic;

import java.util.Scanner;

public class feladat_4 {

    public static void main(String[] args) {

        int a;
        int b;
        int i;
        int lKO = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg az első számot!");
        a = sc.nextInt();
        System.out.println("Add meg a második számot!");
        b = sc.nextInt();

        for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                lKO = i;
        }
        System.out.println("A legnagyobb közös osztó: " + lKO);

    }
}
