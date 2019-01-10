package hometask_04;

public class Summa {

    public static void main(String[] args) {
        // 438
        int a = 438;
        int b = a / 100;
        int c = (a - b * 100)/10;
        int d = a % 10;
        int e = b + c + d;
        System.out.println(e);
    }
}
