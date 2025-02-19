package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        int numero, soma = 0, maiorNumero = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = scanner.nextInt();

            soma += numero;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Média: " + soma / 5);
    }
}
