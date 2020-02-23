package ua.kpi.exceptions;

public class Main23 {

    public static void main(String[] args) {
        // finally
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }
}
