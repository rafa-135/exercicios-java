package exercicios.basicos;

/*
 * 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura
 * correspondente em grau Celsius. Imprima na tela as duas temperaturas.
 * Fórmula: C = (5 * ( F-32) / 9)
 */

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        double temperatureF, temperatureC;

        System.out.print("Enter the temperature in Fahrenheit: ");
        temperatureF = sc.nextDouble();

        temperatureC = (5 * (temperatureF - 32) / 9);

        System.out.println("Fahrenheit: " + temperatureF);
        System.out.println("Celsius: " + temperatureC);

        sc.close();
    }
}
