package hometask_06;

public class TestCycleFibonachi {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int result = 1;

        while (result < 20) {
            a = b;
            b = result;
            result = a + b;
            System.out.println(result);
        }
    }
}
