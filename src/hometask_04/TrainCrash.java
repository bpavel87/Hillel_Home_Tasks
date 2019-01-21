package hometask_04;

public class TrainCrash {

    public static void main(String[] args) {

        trainCrash(3.2, 4.5);
    }


    public static boolean trainCrash(double v1, double v2) {
        double time1, time2;
        time1 = 4 / v1;
        time2 = 6 / v2;
        if (time1 < time2) {
            System.out.println("no crash");
            return false;
        } else {
            System.out.println("crash");
            return true;
        }
    }
}
