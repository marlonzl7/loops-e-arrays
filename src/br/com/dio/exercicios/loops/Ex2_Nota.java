package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        int nota;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida. Tente novamente: ");
            nota = scanner.nextInt();
        }
    }

}
