package hu.progmatic;

public class Attila {

    public static void main(String[] args) {

        // Gyakorló 3.
        // Számjegyösszegző

        /*int number = -5483229;
        int result = 0;

        if (number < 0) {
            number = number * -1;
        }

        while (number > 0) {
            int digit = number % 10;
            result += digit;
            number /= 10;
        }

        System.out.println(result);*/

        // Hatványozás
        /*int base = 7, exponent = 5, result = 1;

        for (int i = exponent; i > 0; i--) {
            result *= base;
        }

        if (base == exponent) {
            System.out.println("Az eredmény: 1");
        } else {
            System.out.println("Az eredmény: " + result);
        }*/

        // Minimum keresés
        /*int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int minValue = Integer.MAX_VALUE, temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i];
            if (temp < minValue) {
                minValue = temp;
            }
        }

        System.out.println(minValue);*/

    }
}
