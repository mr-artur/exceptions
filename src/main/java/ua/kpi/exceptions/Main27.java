package ua.kpi.exceptions;

public class Main27 {

    public static void main(String[] args) {
        // 1
        System.err.println(f());
    }

    public static int f() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
