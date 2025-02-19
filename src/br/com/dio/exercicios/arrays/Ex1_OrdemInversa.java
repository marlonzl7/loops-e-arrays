package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};

        int i = vetor.length - 1;
        for (int numero : vetor) {
            System.out.print(vetor[i] + " ");
            i--;
        }
    }
}
