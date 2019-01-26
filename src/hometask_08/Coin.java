package hometask_08;

import java.util.Random;


// Смоделировать игру “Орел и Решка”.
// Бросить монетку 2000 раз и посчитать сколько раз выпал “орел”, а сколько раз “решка”.
// Подсказка: использовать генератор случайных чисел с генерацией чисел в диапазоне от 0 до 1.
// Если генератор выдает 1 - орёл, а 0 - решка.

public class Coin {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int orel = 0;
        int reshka = 0;

        for (int x = 0; x < 8; x++) {
            int result = myRandom.nextInt(2);
//            System.out.println(result);
            if (result == 0) {
                orel += 1;
            }
            if (result == 1) {
                reshka += 1;
            }
        }
        System.out.println("orel: " + orel);
        System.out.println("reshka: " + reshka);

        if (orel > reshka)
            System.out.println("orel");
        else
        System.out.println("reshka");
    }
}
