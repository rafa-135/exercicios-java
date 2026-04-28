package exercicios.basicos;

/*
 * 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme
 * a escolha da forma de pagamento  pelo comprador e imprima na tela o valor final do produto a ser pago.
 * Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 *  Tabela de Código de Condições de Pagamento
 *  1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 *  2 - À Vista no cartão de crédito, recebe 10% de desconto
 *  3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 *  4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double productValue;
        double amountToBePaid = 0;
        int paymentMethod;

        System.out.print("Enter the value of price: ");
        productValue = sc.nextDouble();

        System.out.println("Choose one of the options:");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        paymentMethod = sc.nextInt();

        switch (paymentMethod) {
            case 1:
                amountToBePaid = productValue * 0.15;
                break;
            case 2:
                amountToBePaid = productValue * 0.1;
                break;
            case 3:
                amountToBePaid = productValue;
                break;
            case 4:
                amountToBePaid = productValue + (productValue * 0.1);
                break;
        }

        System.out.printf("Tot value to be paid: R$%.2f%n", amountToBePaid);

        sc.close();
    }
}
