package ua.kpi.exceptions.article1;

public class Main14 {

    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {
                throw e;
            }
        }
        System.err.println(" 3");
    }
}
