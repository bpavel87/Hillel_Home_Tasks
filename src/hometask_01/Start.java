package hometask_01;

public class Start {

    public static void main(String[] args) {



        float addFloat2Result = Calculator.add(5F, 5.1F);   // не ориентируюсь в синтаксисе
        System.out.println(addFloat2Result);

        double addDoubleResult = Calculator.add(10.2, 10);  // перегрузка это когда совпадают имена методов но не совпадает тип данных?
        System.out.println(addDoubleResult);    // или перегрузка это когда в одном методе разные типы данных?

        int addIntResult = Calculator.add(5, 7);
        System.out.println(addIntResult);

        int subResult = Calculator.sub(100, 35);
        System.out.println(subResult);

        int divResult = Calculator.div(200, 50);
        System.out.println(divResult);

        System.out.println(Calculator.mul(33, 3)); //  почему нельзя вывести на печать одной командой все переменные сразу?


        testCalculator();


    }

    public static void testCalculator() {
        int actual = Calculator.mul(33,3);
        System.out.println("Check that 33*3 is 99, or actual result is " + actual);

        overloaded();
    }

    public static void overloaded() {

        float addFloatResult = Calculator.add(1, 3);
        System.out.println(addFloatResult);

        double addResult = Calculator.add(2D, 3.3);
        System.out.println(addResult);
    }

}
