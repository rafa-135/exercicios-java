package exercicios.basicos;

import java.util.Scanner;

/*
* 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
* imprima na tela a soma entre A e B e mostre se a soma é menor que C.
*/
public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, S;

        System.out.print("Enter the value of A: ");
        A = sc.nextInt();

        System.out.print("Enter the value of B: ");
        B = sc.nextInt();

        System.out.print("Enter the value of C: ");
        C = sc.nextInt();

        S = A + B;
        System.out.println("The sum of " + A + " and " + B + " is equals than " + S);

        if (S < C) {
            System.out.println("The sum is less than " + C);
        } else if (S == C) {
            System.out.println("The sum is equals than " + C);
        } else {
            System.out.println("The sum is greater than " + C);
        }

        sc.close();
    }
}