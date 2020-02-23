package ua.kpi.exceptions;

public class Main16 {

    public static void main(String[] args) {
        //  0Exception in thread "main" java.lang.Error
        try {
            System.err.print(" 0");
            if (true) {
                throw new Error();
            }
            System.err.print(" 1");
        } catch (Exception e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}
