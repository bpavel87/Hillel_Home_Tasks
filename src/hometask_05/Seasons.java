package hometask_05;

import java.util.Scanner;


public class Seasons {

    public static void main(String[] args) {

        System.out.println("Введите любое число от 1 до 12");

        Scanner myScanner = new Scanner(System.in);

        int monthNumber = myScanner.nextInt();

        if(monthNumber >= 3 & monthNumber <= 5) {           //   вопрос: почему выделился текст если стоит "|"?
            System.out.println("Весна");
        }
        if(monthNumber >= 6 & monthNumber <= 8) {           //   вопрос: Если изменю на & выделение изчезнет, почему так?
            System.out.println("Лето");
        }
        if(monthNumber >= 9 & monthNumber <= 11) {
            System.out.println("Осень");
        }
        if(monthNumber == 12 | monthNumber == 1 | monthNumber == 2) {
            System.out.println("Зима");
            //  зачем нужен else? можно было бы без него просто с if описать?
            //  Или это не правильно или просто признак дурного тона потому что слишком тупо выглядит?)))
        } else {
            if(monthNumber > 12) {
                System.out.println("Ошибка, вы ввели число больше 12");
            }
                if (monthNumber == 0) {
                    System.out.println("Ошибка, вы ввели 0");
                }

        }

    }

}
