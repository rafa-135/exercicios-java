package exercicios.basicos;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] value = new boolean[2];

        for (int i = 0; i <= 1; i++) {
            System.out.print("Enter the "+ (i+1) +" value(true/false): ");
            value[i] = sc.nextBoolean();
        }

        if (value[0] && value[1]) {
            System.out.println("Both values are TRUE");
        } else if (!value[0] && !value[1]) {
            System.out.println("Both values are FALSE");
        } else {
            System.out.println("The values are DIFFERENT");
        }

        sc.close();
    }
}
