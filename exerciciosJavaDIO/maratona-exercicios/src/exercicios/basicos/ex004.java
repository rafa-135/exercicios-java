package exercicios.basicos;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class ex004 {
    public static void main(String[] args) {
       int A = 20;
       int predecessor = A - 1;
       int successor = A + 1;

        System.out.println("Predecessor to " + A + ": " + predecessor);
        System.out.println("Successor to " + A + ": " + successor);
    }
}
