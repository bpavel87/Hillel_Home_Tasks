package hometask_07;

// Попросить пользователя ввести год рождения.
//Определить его возраст учитывая, что сейчас 2019 год.
//Вывести текущий возраст пользователя.


import java.util.Scanner;

public class UserAge {

    public static void main(String[] args) {

        System.out.println("Введите год своего рождения:");

        Scanner myScanner = new Scanner(System.in);
        int yearBirth = myScanner.nextInt();

        if (yearBirth < 1900 | yearBirth > 2020) {
            System.out.println("ERROR");
        } else {
            if (yearBirth > 1900 | yearBirth < 2020) {
                int age = 2019 - yearBirth;
                System.out.println(age);
            }
        }
    }
}