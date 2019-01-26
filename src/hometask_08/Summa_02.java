package hometask_08;

//  Просуммировать 100 случайно сгенерированных чисел в диапазоне
//  от -10 до +9, т.е   -10 <= random < 10
//  вывести полученную сумму на экран.

import java.util.Random;

public class Summa_02 {
    public static void main(String[] args) {



        Random myRandom = new Random();
        int result = 0;
        for(int x = 0; x < 100; x++) {
            int min = myRandom.nextInt(11);
            int max = myRandom.nextInt(11);
            int diff = min - max;
            System.out.println(diff);
            result = result + diff;
        }
        System.out.println("Summa: " + result);

    }
}
