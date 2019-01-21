package hometask_05;

import java.util.Scanner;

public class DividingByFour {

    public static void main(String[] args) {

        System.out.println("Please input any number: ");

        Scanner myScanner = new Scanner(System.in);
        double input = myScanner.nextDouble();

        System.out.println("Your number is divided by 4, so: " + bitDivByFour(input));

    }

    public static long bitDivByFour(double input){
        long myLong = (long) input;
        // long simplNum = (long)input;
        return myLong >> 2; // bit moving, divide by 4, << - multiply

    }
}
