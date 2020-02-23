package ua.kpi.exceptions.article1;

public class Main25 {

    public static void main(String[] args) {
        // Process finished with exit code 42
        try {
            Runtime.getRuntime().exit(42);
        } finally {
            System.err.println("finally");
        }
    }
}
