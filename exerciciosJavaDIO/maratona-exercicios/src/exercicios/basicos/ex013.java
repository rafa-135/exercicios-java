package exercicios.basicos;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Name: " + name);

        if (age < 18) {
            System.out.println("You're underage");
        } else {
            System.out.println("You're of legal age");
        }

        sc.close();
    }
}
