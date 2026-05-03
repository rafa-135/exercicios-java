package exercicios.orientacaoObjetos.domain;

/*Crie uma classe Aluno com os seguintes atributos:

nome
idade
nota // três notas devem ser armazenadas

Crie dois métodos:

Para imprimir os dados
Para calcular a média das notas e imprimir o resultado*/

public class Student {
    public String name;
    public int age;
    public double[] grade;

    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if(grade == null) {
            return;
        }

        System.out.println("Grades: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(grade[i]);
        }

        averageStudent();
    }

    public void averageStudent() {
        if(grade == null) {
            return;
        }

        double average = 0;

        for (int i = 0; i < 3; i++) {
            average += grade[i];
        }
        average /= grade.length;

        System.out.printf("Student average: %.1f%n", average);
    }
}
