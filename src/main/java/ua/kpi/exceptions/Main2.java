package ua.kpi.exceptions;

public class Main2 {

    public static void main(String[] args) {
        Error ref = new Error(); // создаем экземпляр
        // Exception in thread "main" java.lang.Error
        throw ref;               // "бросаем" его
    }
}
