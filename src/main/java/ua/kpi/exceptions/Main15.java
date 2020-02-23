package ua.kpi.exceptions;

public class Main15 {

    public static void main(String[] args) throws Exception {
        //  0Exception in thread "main" java.lang.Exception
        try {
            System.err.print(" 0");
            if (true) {
                throw new Exception();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}
