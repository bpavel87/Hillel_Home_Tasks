package hometask_04;

public class Trains {
    public static void main(String[] args) {

        Compare2Numbers(4, 5);
    }
    public static void Compare2Numbers(int v1, int v2) {
        boolean result = v1 >= v2;
        if (result == true) {
            System.out.println("no crash");
        } else {
            System.out.println("crash!");
        }

    }

}
