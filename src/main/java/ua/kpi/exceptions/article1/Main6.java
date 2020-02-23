package ua.kpi.exceptions.article1;

public class Main6 {

    public static void main(String[] args) {
        // Exception in thread "main" java.lang.RuntimeException
        double d = sqr(10.0); // d - никогда ничего не присвоится
        System.out.println(d); // ничего не напечатается
    }

    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}
