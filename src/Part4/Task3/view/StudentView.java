package Part4.Task3.view;

import Part4.Task3.main.Student;

import java.util.Arrays;

public class StudentView {

    public void printTaskMessage() {

        System.out.println("3. Создайте класс с именем Student, содержащий поля: \n" +
                "фамилия и инициалы, \n" +
                "номер группы, \n" +
                "успеваемость (массив из пяти элементов). \n" +
                "Создайте массив из десяти элементов такого типа. \n" +
                "Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, \n" +
                "равные только 9 или 10.\n");
    }

    public void printStudent(Student student) {

        System.out.println("Фамилия и инициалы: " + student.getShortName());
        System.out.println("Номер группы: " + student.getGroupNumber());
        System.out.println("Успеваемость: " + Arrays.toString(student.getProgress()));
    }

    public void printStudent(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            System.out.println("Фамилия и инициалы: " + students[i].getShortName());
            System.out.println("Номер группы: " + students[i].getGroupNumber());
            System.out.println("Успеваемость: " + Arrays.toString(students[i].getProgress()));
        }
    }

    public void printExcellentStudent(Student student){

        System.out.println("Фамилия: " + student.getShortName());
        System.out.println("Номер группы: " + student.getGroupNumber());
    }

    public void printExcellentStudent(Student[] students){

        for (int i = 0; i < students.length; i++) {
            printExcellentStudent(students[i]);
        }
    }
}
