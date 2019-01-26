package hometask_08;

import java.util.Random;

import java.util.Scanner;



public class RandomGame {
    public static void main(String[] args) {
        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);

        int x = 0;
        while(x < 5) {
            int rand = myRandom.nextInt(10) + 1;
//          System.out.println(rand);
            System.out.println("Введите число от 1 до 10");
            int input = myScanner.nextInt();
            if (input == 0 | input > 10) {
                System.out.println("ошибка");
            }
            if (input == rand) {
                System.out.println("Збс");
                x = 6;
            } else {
                x = x;
            }
        }
    }
}
