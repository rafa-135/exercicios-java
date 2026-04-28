package exercicios.basicos;

// 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class ex019 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table of " + i);
            System.out.println("-------------------");

            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }

            System.out.println("-------------------");
        }
    }
}
