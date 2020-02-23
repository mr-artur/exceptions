package ua.kpi.exceptions;

public class Main26 {

    public static void main(String[] args) {
        // Process finished with exit code 42
        try {
            Runtime.getRuntime().halt(42);
        } finally {
            System.err.println("finally");
        }
    }
}
