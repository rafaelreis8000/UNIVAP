package ex4;
import java.util.Scanner;

public class Matrizes {

    double tempoInicial;
    double tempoFinal;
    double [] T = new double [100];
    double [] S = new double [100];

    void calcular() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tempo inicial: ");
        tempoInicial = scanner.nextDouble();
        System.out.print("Agora informe o tempo final: ");
        tempoFinal = scanner.nextDouble();

        scanner.close();

        for (int i = 0 ; i < 100 ; i++) {

            T[i] = tempoInicial + (tempoFinal - tempoFinal) * i / 99;

            S[i] = 0.75 * T[i] * T[i] + 2.5 * T[i] + 12;
        }

        for (int i = 0 ; i < 100 ; i++) {
            System.out.printf("T[%d] = %.2f\nS[%d] = %.2f%n", i , T[i] , i , S[i]);
        }
    }

    public static void main(String[] args) {
        Matrizes m1 = new Matrizes();
        m1.calcular();
    }
}
