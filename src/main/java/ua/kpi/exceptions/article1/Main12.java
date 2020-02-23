package ua.kpi.exceptions.article1;

public class Main12 {

    public static void main(String[] args) {
        // 0 2 3
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (Exception e) { // catch по Exception перехватывает
            // RuntimeException
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }
}
