package ua.kpi.exceptions.article1;

public class Main19 {

    public static void main(String[] args) {
        // 0 2.1 2.2 2.4 2.5 4
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {
                    throw new Error();
                }
                System.err.print(" 2.3");
            } catch (Throwable t) {
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) {
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}
