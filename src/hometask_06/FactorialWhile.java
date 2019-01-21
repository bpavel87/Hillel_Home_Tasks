package hometask_06;

import java.util.Scanner;

// 5! = 1 * 2 * 3 * 4 * 5 = 120

public class FactorialWhile {

    public static void main(String[] args) {

        System.out.println("Введите число");

        Scanner myScanner = new Scanner(System.in);

        int fact = myScanner.nextInt();

        int x = 1;
        int result = 1;

        while ( x <= fact) {
            System.out.println(x + "! = " + result);
            x = x + 1;
            result = result * x;
        }
    }

}