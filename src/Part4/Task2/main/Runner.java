package Part4.Task2.main;

import Part4.Task2.view.Test2View;

public class Runner {

    public static void main(String[] args) {

        Test2 test = new Test2();

        Test2View view = new Test2View();

        view.printTaskMessage();

        view.printTest2(test);

        test = new Test2(5, 8);

        view.printTest2(test);

        test.setParameter1(15);

        test.setParameter2(18);

        view.printTest2(test);
    }
}
