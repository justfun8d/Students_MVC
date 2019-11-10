package Part4.Task1.view;

import Part4.Task1.main.Test1;

public class Test1View {

    public void printTaskMessage() {

        System.out.println("1. Создайте класс Test1 двумя переменными. \n" +
                "Добавьте метод вывода на экран и методы изменения этих переменных. \n" +
                "Добавьте метод, который находит сумму значений этих переменных, \n" +
                "и метод, который находит наибольшее значение из этих двух переменных.\n");
    }

    public void printTest1(Test1 test) {

        System.out.println("parameter1 = " + test.getParameter1());
        System.out.println("parameter2 = " + test.getParameter2());
    }

    public void printSum(int sum) {
        System.out.println("sum parameters = " + sum);
    }

    public void printMax(int max) {
        System.out.println("max parameter = " + max);
    }
}
