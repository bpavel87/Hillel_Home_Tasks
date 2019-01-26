package hometask_08;

import java.util.Random;


public class RandomTest {

    public static void main(String[] args) {

        Random myRandom = new Random();
        int result = myRandom.nextInt(5) + 1; // для генерации от 1 до 6;
        System.out.println(result);




        for(int i = 0; i < 5; i++){     //генерация 5ти чисел типа int

            System.out.println(result + "x");
        }


        int min = 100;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);

    }

}
