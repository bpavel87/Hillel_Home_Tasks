package hometask_05;

import java.util.Scanner;           //  класс Scanner находится в пакете java.util,
                                    //  поэтому мы вначале его импортируем с помощью инструкции import java.util.Scanner.

public class SeasonsSwitchCase {

    public static void main(String[] args) {

        System.out.println("Введите любое число от 1 до 12");

        Scanner myScanner = new Scanner(System.in);                     //  Для получения ввода с консоли в классе System определен объект in.
                                                                        //  Однако непосредственно через объект System.in не удобно работать,
                                                                        //  поэтому используют класс Scanner,
                                                                        //  который, в свою очередь использует System.in


        int monthNumber = myScanner.nextInt();      //  Чтобы получить введенное число, используется метод in.nextInt();
                                                    // который возвращает введенное с клавиатуры целочисленное значение.

        String season;

        switch (monthNumber) {
            case 3:;
            case 4:;
            case 5:;
                System.out.println("Spring");
                break;

            case 6:;
            case 7:;
            case 8:;
                System.out.println("Summer");
                break;

            case 9:;
            case 10:;
            case 11:;
                System.out.println("Autumn");
                break;

            case 12:;
            case 1:;
            case 2:;
                System.out.println("Winter");
                break;

            default:
                System.out.println("Wrong number");
        }
    }
}
