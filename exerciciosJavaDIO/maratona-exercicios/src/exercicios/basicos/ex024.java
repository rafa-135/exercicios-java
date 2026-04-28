package exercicios.basicos;

/*
 * 24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo
 * que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem,
 * a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
 *    Fórmula: distância = tempo x velocidade.
 *       litros usados = distância / 12.
 */

import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double time, speed, distance, fuel;

        System.out.print("Enter the duration of your trip (hours): ");
        time = sc.nextDouble();

        System.out.print("Enter your average speed (km/h): ");
        speed = sc.nextDouble();

        distance = time * speed;
        fuel = distance / 12;

        System.out.println("Travel time: " + time + " hours");
        System.out.println("Average speed: " + speed + " km/h");
        System.out.println("Distance traveled: " + distance + " km");
        System.out.printf("Fuel used: %.2f liters%n", fuel);

        sc.close();
    }
}
