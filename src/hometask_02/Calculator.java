package hometask_02;

public class Calculator {

    public static int methodCalc01(int a, int b, int c) {
        int result = a + b * ( c / 2 );
        return result;
    }

    public static int methodCalc02(int a, int b) {
        int result = ( a * a + b * b ) % 3;
        return result;
    }

    public static int methodCalc03(int a, int b, int c) {
        int result = ( a + b ) / 12 * c % 4 + b;
        return result;
    }

    public static int methodCalc04(int a, int b, int c) {
        int result = (a - b * c) / (a + b) % c;
        return result;
    }


}
