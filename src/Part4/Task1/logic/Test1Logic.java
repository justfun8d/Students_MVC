package Part4.Task1.logic;

import Part4.Task1.main.Test1;

public class Test1Logic {

    public int sumParameters(Test1 test) {
        return test.getParameter1() + test.getParameter2();
    }

    public int maxParameter(Test1 test) {
        return Math.max(test.getParameter1(), test.getParameter2());
    }
}