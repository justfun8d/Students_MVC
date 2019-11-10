package Part4.Task2.view;

import Part4.Task2.main.Test2;

public class Test2View {

    public void printTaskMessage() {

        System.out.println("2. Создйте класс Test2 двумя переменными. \n" +
                "Добавьте конструктор с входными параметрами. \n" +
                "Добавьте конструктор, инициализирующий члены класса по умолчанию. \n" +
                "Добавьте set- и get- методы для полей экземпляра класса.\n");
    }

    public void printTest2(Test2 test) {

        System.out.println("parameter1 = " + test.getParameter1());
        System.out.println("parameter2 = " + test.getParameter2());
    }
}
