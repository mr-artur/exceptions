package ua.kpi.exceptions.article1;

public class Main29 {

    public static void main(String[] args) {
        // Exception in thread "main" java.lang.RuntimeException
        System.err.println(f());
    }

    public static int f() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
}
