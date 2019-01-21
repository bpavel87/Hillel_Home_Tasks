package hometask_05;

import java.util.Scanner;

public class Test_Scanner_02 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Input name:");
        String name = myScanner.nextLine();

        System.out.println("Input age:");
        int age = myScanner.nextInt();

        System.out.println("Input height:");
        float height = myScanner.nextFloat();

        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);
    }
}
