package ua.kpi.exceptions.article1;

public class Main24 {

    public static void main(String[] args) {
        // Process finished with exit code 42
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }
}
