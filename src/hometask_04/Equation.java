package hometask_04;

public class Equation {

    public static void main(String[] args) {

        double a, b, c, d;

        // a * x * x + b * x + c = 0;

        a = 4;
        b = 64;
        c = 36;


        d = b * b - 4 * a * c;

        if(d < 0) {
            System.out.println("корней нет");
        }

        if(d == 0) {
            System.out.println("Уравнение имеет один корень");
            double x;
            x = -b / (2 * a);
            System.out.println(x);

        }

        if(d > 0) {
            System.out.println("Уравнение имеет два корня");
            double x1;
            double x2;
            x1 = (- b + Math.sqrt(d)) / 2 * a;
            x2 = (- b - Math.sqrt(d)) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
