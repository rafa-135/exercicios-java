package exercicios.basicos;

/* 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
 * imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado
 * aprovado sua média final deve ser maior ou igual a 7.
 */

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] grade = new double[4];
        double sum = 0;
        double media = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.print("Enter your " + (i+1) + "º grade: ");
            grade[i] = sc.nextDouble();

            sum += grade[i];
        }

        media = sum / 4;

        System.out.println("-------------------");

        System.out.println("The student: Rafael");

        if (media < 7) {
            System.out.println("Situation: Reproved");
        } else {
            System.out.println("Situation: Approved");
        }

        sc.close();
    }
}
