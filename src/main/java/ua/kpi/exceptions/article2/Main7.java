package ua.kpi.exceptions.article2;

import java.io.IOException;

public class Main7 {

    public class Parent {
        public void f() throws IOException, InterruptedException {}
    }

    class ChildB extends Parent {
        // >> COMPILATION ERROR: overridden method does not throw 'java.lang.Exception'
        // @Override
        // public void f() throws Exception {}
    }
}
