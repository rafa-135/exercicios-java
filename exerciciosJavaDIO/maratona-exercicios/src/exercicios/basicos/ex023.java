package exercicios.basicos;

/*
 * 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
 * As informações fornecidas serão: valor da hora aula, número de aulas lecionadas
 * no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
 */


import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double netSalary, grossSalary, valueHourClass, discountINSS, percentageINSS;
        int totClassMonth;

        System.out.print("Enter the price per hour of class: R$");
        valueHourClass = sc.nextDouble();

        System.out.print("Enter the number of class hours in the month: ");
        totClassMonth = sc.nextInt();

        System.out.print("Enter the INSS percentage value: ");
        percentageINSS = sc.nextDouble();

        grossSalary = valueHourClass * totClassMonth;
        discountINSS = grossSalary * (percentageINSS / 100);
        netSalary = grossSalary - discountINSS;

        System.out.printf("Value of the net salary: R$%.2f%n", netSalary);

        sc.close();
    }
}
