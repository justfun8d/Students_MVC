package Part4.Task1.main;

import Part4.Task1.logic.Test1Logic;
import Part4.Task1.view.Test1View;

public class Test1 {

    private int parameter1;
    private int parameter2;

    public Test1() {
        this.setParameter1(0);
        this.setParameter2(0);
    }

    public void setParameter1(int parameter1) {
        this.parameter1 = parameter1;
    }

    public void setParameter2(int parameter2) {
        this.parameter2 = parameter2;
    }

    public int getParameter1() {
        return parameter1;
    }

    public int getParameter2() {
        return parameter2;
    }
}
