package hometask_05;

import java.util.Scanner;


public class Test_Scaner {

    public static void main(String[] args) {

        System.out.println("Введите любое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
    }
}


