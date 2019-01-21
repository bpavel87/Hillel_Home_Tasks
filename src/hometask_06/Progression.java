package hometask_06;

public class Progression {
    public static void main(String[] args) {

        int a = 2;
        int sdvig = 3;
        int iterations = 8;

        while(iterations > 0) {
            System.out.println(a);
            a = a + sdvig;
            iterations = iterations - 1;
        }
    }
}
