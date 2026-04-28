package exercicios.basicos;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value;
        double readjustment;

        System.out.print("Enter a number: ");
        value = sc.nextInt();

        readjustment = value * 0.05;

        System.out.println(readjustment);

        sc.close();
    }
}
