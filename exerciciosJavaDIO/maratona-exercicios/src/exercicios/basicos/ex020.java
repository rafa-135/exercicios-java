package exercicios.basicos;

// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();

        System.out.println("Multiplication table of " + n1);
        System.out.println("-----------------------------");

        for (int i = n1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + n1 * i);
        }

        sc.close();
    }
}
