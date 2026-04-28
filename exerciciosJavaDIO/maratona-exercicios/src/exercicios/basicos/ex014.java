package exercicios.basicos;

// 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

public class ex014 {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;

        System.out.println("A value: " + A);
        System.out.println("B value: " + B);

        int trade = A;
        A = B;
        B = trade;

        System.out.println("After the exchange, A: " + A);
        System.out.println("After the exchange, B: " + B);
    }
}
