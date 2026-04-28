package exercicios.basicos;

/*
 * 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima
 * na tela o quociente e o resto da divisão inteira entre eles.
 */

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] value = new int[2];
        int quotient, restOfDivision;

        for (int i = 0; i <= 1; i++) {
            System.out.print("Enter the " + (i+1) + " value: ");
            value[i] = sc.nextInt();
        }

        quotient = value[0] / value[1];
        restOfDivision = value[0] % value[1];

        System.out.println("Quotient: " + quotient);
        System.out.println("Rest of the division: " + restOfDivision);

        sc.close();
    }
}
