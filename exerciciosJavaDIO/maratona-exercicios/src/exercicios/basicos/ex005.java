package exercicios.basicos;

/*
 * 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 * calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
 * (Base para o Salário mínimo R$ 1.293,20).
 */

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double minimumWage, salary;
        int totMinimumWage = 0;

        System.out.print("Enter the value of minimumWage: ");
        minimumWage = sc.nextDouble();

        System.out.print("Enter the value of salary: ");
        salary = sc.nextDouble();

        while (salary >= minimumWage) {
            salary -= minimumWage;
            totMinimumWage += 1;
        }

        System.out.println("Tot minimum wage: " + totMinimumWage);

        sc.close();
    }
}
