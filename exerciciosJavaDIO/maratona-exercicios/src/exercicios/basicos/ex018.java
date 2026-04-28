package exercicios.basicos;

/*
 * 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
 * Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
 */

public class ex018 {
    public static void main(String[] args) {
        double heightFrancisco = 1.50;
        double heightSara = 1.10;
        int totAnos = 0;

        while (heightSara <= heightFrancisco) {
            heightSara += 0.03;
            heightFrancisco += 0.02;
            totAnos += 1;
        }

        System.out.println("It'll take " + totAnos + " years");
    }
}
