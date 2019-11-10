package Part4.Task1.main;

import Part4.Task1.logic.Test1Logic;
import Part4.Task1.view.Test1View;

public class Runner {

    public static void main(String[] args) {

        Test1 test = new Test1();

        Test1View view = new Test1View();
        Test1Logic logic = new Test1Logic();

        view.printTaskMessage();

        view.printTest1(test);

        test.setParameter1(1);
        test.setParameter2(2);

        view.printTest1(test);

        int newParameter1 = (int) (Math.random() * 40 - 20);
        int newParameter2 = (int) (Math.random() * 40 - 20);
        test.setParameter1(newParameter1);
        test.setParameter2(newParameter2);

        view.printTest1(test);

        int sum = logic.sumParameters(test);
        view.printSum(sum);

        int max = logic.maxParameter(test);
        view.printMax(max);
    }
}