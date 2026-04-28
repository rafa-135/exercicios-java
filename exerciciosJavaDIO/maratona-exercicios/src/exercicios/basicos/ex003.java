package exercicios.basicos;

/*
 * 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
 * deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um
 * dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
 */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        System.out.print("Enter the value of A: ");
        A = sc.nextInt();

        System.out.print("Enter the value of B: ");
        B = sc.nextInt();

        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println("C value: " + C);

        sc.close();
    }
}
