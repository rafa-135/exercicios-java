package exercicios.basicos;

/*
 * 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia
 * o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
 * Fórmula do IMC = peso / (altura) ²
 * Tabela Condições IMC
 *  Abaixo de 18,5   | Abaixo do peso
 *  Entre 18,6 e 24,9 | Peso ideal (parabéns)
 *  Entre 25,0 e 29,9 | Levemente acima do peso
 *  Entre 30,0 e 34,9 | Obesidade grau I
 *  Entre 35,0 e 39,9 | Obesidade grau II (severa)
 *  Maior ou igual a 40 | Obesidade grau III (mórbida)
 */

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight, height, IMC;

        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();

        System.out.print("Enter your height: ");
        height = sc.nextDouble();

        IMC = weight / Math.pow(height, 2);

        if (IMC <= 18.5) {
            System.out.println("Underweight");
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Ideal weight (Congratulations!!!)");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Slightly overweight");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Grade I obesity");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Grade II obesity (Severe)");
        } else {
            System.out.println("Grade III obesity (Morbid)");
        }

        sc.close();
    }
}
