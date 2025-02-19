package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        int qtdNumeros;
        int numero;
        int pares = 0, impares = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números Par: " + pares);
        System.out.println("Quantidade de números Ímpar: " + impares);
    }
}
