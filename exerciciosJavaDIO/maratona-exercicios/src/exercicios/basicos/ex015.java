package exercicios.basicos;

/*
 * 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
 * meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
 * (Ex: 5 anos, 2 meses e 15 dias de vida)
 */

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yearOfBirth, totYears, totMonths, totDays;
        int currentYear = 2026;

        System.out.print("Enter the year you were born: ");
        yearOfBirth = sc.nextInt();

        totYears = currentYear - yearOfBirth;
        totMonths = totYears * 12;
        totDays = totYears * 365;

        System.out.println(totYears + " years, " + totMonths + " months and " + totDays + " days.");

        sc.close();
    }
}
