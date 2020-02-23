package ua.kpi.exceptions.article2;

public class Main3 {

    public static void main(String[] args) throws Exception {
        Throwable t = new Exception(); // и лететь будет Exception
        // throw t; но тут ошибка компиляции
    }
}
