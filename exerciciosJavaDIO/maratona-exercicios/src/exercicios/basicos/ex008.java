package exercicios.basicos;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] value = new int[3];

        for (int i = 0; i <= 2; i++) {
            System.out.print("Enter the " + (i+1)  + "º value: ");
            value[i] = sc.nextInt();
        }

        if (value[0] > value[1] && value[0] > value[2]) {
            if (value[1] > value[2]) {
                System.out.println(value[0] + " > " + value[1] + " > " + value[2]);
            } else {
                System.out.println(value[0] + " > " + value[2] + " > " + value[1]);
            }
        } else if (value[1] > value[0] && value[1] > value[2]) {
            if (value[0] > value[2]) {
                System.out.println(value[1] + " > " + value[0] + " > " + value[2]);
            } else {
                System.out.println(value[1] + " > " + value[2] + " > " + value[0]);
            }
        } else if (value[2] > value[0] && value[2] > value[1]) {
            if (value[0] > value[1]) {
                System.out.println(value[2] + " > " + value[0] + " > " + value[1]);
            } else {
                System.out.println(value[2] + " > " + value[1] + " > " + value[0]);
            }
        }

        sc.close();
    }
}
