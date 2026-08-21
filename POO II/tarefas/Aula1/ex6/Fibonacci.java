package ex6;

import java.util.Scanner;

public class Fibonacci {

    int numero;
    int[] vetor;

    void lerNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        scanner.close();
    }

    void gerarFibonacci() {

        int tamanho = 0;

        int a = 0;
        int b = 1;

        while (a <= numero) {
            tamanho++;

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        vetor = new int[tamanho];

        a = 0;
        b = 1;

        for (int i = 0; i < tamanho; i++) {

            vetor[i] = a;

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }

    void mostrar() {
        System.out.println("Série de Fibonacci: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}