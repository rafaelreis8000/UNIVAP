package ex5;
import java.util.Scanner;

public class Matriz {

    public static void preencherMatriz(double[][] matriz, Scanner sc) {
        System.out.println("Digite os valores da matriz 6 x 3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
    }

    public static double encontrarMaior(double[][] matriz) {
        double maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

    public static double encontrarMenor(double[][] matriz) {
        double menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }

    public static void encontrarPosicao(double[][] matriz, double valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    System.out.println("Linha: " + (i + 1));
                    System.out.println("Coluna: " + (j + 1));
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[6][3];

        // Preenche a matriz
        preencherMatriz(matriz, sc);

        // Encontra o maior e o menor
        double maior = encontrarMaior(matriz);
        double menor = encontrarMenor(matriz);

        // Exibe o maior
        System.out.println("\n--- MAIOR ELEMENTO ---");
        System.out.println("Valor: " + maior);
        encontrarPosicao(matriz, maior);

        // Exibe o menor
        System.out.println("\n--- MENOR ELEMENTO ---");
        System.out.println("Valor: " + menor);
        encontrarPosicao(matriz, menor);

        sc.close();
    }
}