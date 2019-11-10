package Part4.Task3.logic;

import Part4.Task3.main.Student;

public class StudentLogic {

    public boolean isExcellentStudent(Student student) {

        for (int i = 0; i < student.getProgress().length; i++) {
            if (student.getProgress()[i] != 9 && student.getProgress()[i] != 10) {
                return false;
            }
        }

        return true;
    }

    public int getCountExcellentStudents(Student[] students) {

        int countExcellentStudents = 0;

        for (Student student : students) {
            if (this.isExcellentStudent(student)) {
                countExcellentStudents++;
            }
        }

        return countExcellentStudents;
    }

    public Student[] excellentStudents(Student[] students) {

        int count = this.getCountExcellentStudents(students);

        Student[] excellentStudents = new Student[count];

        int size=0;

        for (int i = 0; i < students.length; i++) {
            if(this.isExcellentStudent(students[i])){
                excellentStudents[size]=students[i];
            }
        }
        
        return excellentStudents;
    }
}