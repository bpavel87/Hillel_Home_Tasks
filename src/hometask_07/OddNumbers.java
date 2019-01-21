package hometask_07;

// Вывести на экран все нечетные числа в диапазоне от 1 до 100.
//Включая 1 и исключая 100.

public class OddNumbers {

    public static void main(String[] args) {

        int x = 1;
        for (x = 1; x < 100; x += 2) {
            System.out.println(x);
        }
    }
}
