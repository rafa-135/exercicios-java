package exercicios.orientacaoObjetos.main;

import exercicios.orientacaoObjetos.domain.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Rafael";
        student.age = 19;
        student.grade = new double[3];
        student.grade[0] = 10.0;
        student.grade[1] = 5.5;
        student.grade[2] = 7.3;

        student.printStudent();
    }
}
