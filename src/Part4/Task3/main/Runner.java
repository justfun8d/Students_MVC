package Part4.Task3.main;

import Part4.Task3.logic.StudentLogic;
import Part4.Task3.view.StudentView;

public class Runner {

    public static void main(String[] args) {

        StudentView view = new StudentView();

        view.printTaskMessage();

        Student student1 = new Student("Леонтьев М.К.", 2, new int[]{8, 7, 5, 4, 6});
        Student student2 = new Student("Гобзон М.К.", 2, new int[]{10, 10, 10, 10, 10});
        Student student3 = new Student("Шибстик М.К.", 2, new int[]{9, 9, 9, 9, 9});
        Student student4 = new Student("Невезучий М.К.", 2, new int[]{3, 9, 7, 3, 4});
        Student student5 = new Student("Уранов М.К.", 2, new int[]{7, 4, 8, 6, 3});
        Student student6 = new Student("Покидалов М.К.", 2, new int[]{9, 9, 9, 10, 10});
        Student student7 = new Student("Некодер М.К.", 2, new int[]{1, 7, 4, 3, 6});
        Student student8 = new Student("Чистик М.К.", 2, new int[]{9, 10, 9, 9, 9});
        Student student9 = new Student("Омаров М.К.", 2, new int[]{3, 9, 2, 8, 8});
        Student student10 = new Student("Кушалов М.К.", 2, new int[]{2, 7, 4, 5, 8});

        Student[] students = new Student[]{student1, student2, student3, student4, student5,
                student6,student7, student8, student9, student10};

        StudentLogic logic=new StudentLogic();

        Student[] excellentStudents=logic.excellentStudents(students);

        view.printExcellentStudent(excellentStudents);
    }
}