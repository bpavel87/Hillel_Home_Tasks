package hometask_08;

public class Cycles {

    public static void main(String[] args) {
        int y;  // символы по оси y
        int x;  // символы по оси x

        for(y = 5; y > 0; y--) {
            for (x = 1; x <= 5; x++) {  // игрался и отзеркалил результат
                if(y == x) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}
