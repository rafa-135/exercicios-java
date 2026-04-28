package exercicios.basicos;

/*
 * 2 - Faça um algoritmo para receber um número qualquer e imprimir
 * na tela se o número é par ou ímpar, positivo ou negativo.
 *
*/
public class ex002 {
    public static void main(String[] args) {
        int n1 = -12;

        if (n1 % 2 == 0) {
            System.out.println("The number " + n1 + " is even");
        } else {
            System.out.println("The number " + n1 + " is odd");
        }

        if (n1 > 0) {
            System.out.println("The number " + n1 + " is positive");
        } else {
            System.out.println("The number " + n1 + " is negative");
        }
    }
}
