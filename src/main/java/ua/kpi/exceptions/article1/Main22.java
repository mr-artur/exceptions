package ua.kpi.exceptions.article1;

public class Main22 {

    public static void main(String[] args) {
        // finally
        // Exception in thread "main" java.lang.RuntimeException
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}
