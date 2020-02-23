package ua.kpi.exceptions;

public class Main5 {

    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d); // d - никогда ничего не присвоится
    }

    public static double sqr(double arg) {
        while (true) ; // виснет навсегда
    }
}
