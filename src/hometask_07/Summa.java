package hometask_07;

//Посчитать сумму чисел от 1..100 с помощью цикла for.
//Вывести сумму на экран.

public class Summa {

    public static void main(String[] args) {

        int x = 0;
        int result = 0;

        for(x = 0; x <= 100; x = x + 1) {
            result = result + x;
            System.out.println(result);
        }
    }
}
