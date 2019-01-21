package hometask_06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("Введите число");

        Scanner myScanner = new Scanner(System.in);
        int fact = myScanner.nextInt();
        int x = 1;
        int result = 1;


        for (x = 1; x <= fact; x = x + 1) {
            result = result * x;
            System.out.println(x + "! = " + result);
        }
        System.out.println(result);
    }
}
