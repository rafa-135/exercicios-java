package exercicios.basicos;

// 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import java.util.Random;

public class ex021 {
    public static void main(String[] args) {
        Random rand = new Random();

        int drawnNumber = rand.nextInt(101);

        System.out.println("The winning number was: " + drawnNumber);
    }
}
