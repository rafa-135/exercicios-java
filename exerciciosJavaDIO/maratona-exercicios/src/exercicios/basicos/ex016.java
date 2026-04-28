package exercicios.basicos;

/*
 * 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo
 * e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
 */

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] side = new double[3];

        for (int i = 0; i <= 2; i++) {
            System.out.print("Enter the " + (i + 1) + "º side: ");
            side[i] = sc.nextDouble();
        }

        if (side[0] > side[1] + side[2] || side[1] > side[2] + side[0] || side[2] > side[0] + side[1]) {
            System.out.println("The values aren't valid");
        } else {
            if (side[0] == side[1] && side[1] == side[2]) {
                System.out.println("The triangle is EQUILATERAL");
            } else if (side[0] == side[1] && side[0] != side[2] || side[0] == side[2] && side[0] != side[1] || side[1] == side[2] && side[1] != side[0]) {
                System.out.println("The triangle is ISOSCELES");
            } else {
                System.out.println("The triangle is SCALENE");
            }
        }

        sc.close();
    }
}
