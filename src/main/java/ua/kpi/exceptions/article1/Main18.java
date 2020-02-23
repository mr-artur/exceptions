package ua.kpi.exceptions.article1;

public class Main18 {

    public static void main(String[] args) {
        // 0 2Exception in thread "main" java.lang.Error
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {
                throw new Error();
            }
        } catch (Error e) {
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}
