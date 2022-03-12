package hu.progmatic;

import java.util.Scanner;

public class feladat_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első számot!");
        int firstNumber = sc.nextInt();
        System.out.println("Kérem a második számot!");
        int secondNumber = sc.nextInt();
        sc.nextLine();

        boolean firstPlace = firstNumber > secondNumber;
    }
}
