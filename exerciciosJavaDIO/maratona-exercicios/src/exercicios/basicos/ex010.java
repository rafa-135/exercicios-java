package exercicios.basicos;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] grade = new double[3];
        double m;

        for (int i = 0; i <= 2; i++) {
            System.out.print("Enter the " + (i+1) + "º grade: ");
            grade[i] = sc.nextDouble();
        }

        m = (grade[0] + grade[1] + grade[2]) / 3;

        System.out.printf("Your average: %.1f", m);

        sc.close();
    }
}
