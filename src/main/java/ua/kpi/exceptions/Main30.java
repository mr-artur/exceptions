package ua.kpi.exceptions;

public class Main30 {

    public static void main(String[] args) {
        // Exception in thread "main" java.lang.RuntimeException
        System.err.println(f());
    }

    public static int f() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
}
