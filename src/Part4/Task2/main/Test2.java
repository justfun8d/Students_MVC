package Part4.Task2.main;

public class Test2 {

    private int parameter1;
    private int parameter2;

    public Test2() {
        this.setParameter1(0);
        this.setParameter2(0);
    }

    public Test2(int parameter1, int parameter2) {
        this.setParameter1(parameter1);
        this.setParameter2(parameter2);
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
