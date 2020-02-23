package ua.kpi.exceptions.article1;

public class Main28 {

    public static void main(String[] args) {
        // 1
        System.err.println(f());
    }

    public static int f() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }
}
