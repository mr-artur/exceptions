package ua.kpi.exceptions;

public class Main4 {

    public static void main(String[] args) {
        // Can be either
        // >> sout
        // >> RUNTIME ERROR: Exception in thread "main" java.lang.Error
        // and
        // >> RUNTIME ERROR: Exception in thread "main" java.lang.Error
        // >> sout
        System.out.println("sout");
        throw new Error();
    }
}
