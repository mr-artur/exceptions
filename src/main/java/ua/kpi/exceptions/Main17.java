package ua.kpi.exceptions;

public class Main17 {

    public static void main(String[] args) {
        // 0 2Exception in thread "main" java.lang.Error
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {
                throw new Error();
            }
        }
        System.err.println(" 3");
    }
}
