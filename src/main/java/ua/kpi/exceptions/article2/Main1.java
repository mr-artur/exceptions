package ua.kpi.exceptions.article2;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Main1 {

    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
