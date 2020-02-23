package ua.kpi.exceptions.article1;

public class Main31 {

    public static void main(String[] args) {
        // 0 1 2 4 5 7 8
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }
}
