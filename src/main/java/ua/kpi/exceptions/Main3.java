package ua.kpi.exceptions;

public class Main3 {

    public static void main(String[] args) {
        f(null);
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            // Exception in thread "main" java.lang.StackOverflowError
            f(npe);
        }
    }
}
