package ex3;
import java.util.Scanner;

public class Perfeito {
    int n;
    int soma;

    void calcular() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        if (n == soma) {
            System.out.println("Esse número é perfeito!");
        } else {
            System.out.println("Esse número não é perfeito");
        }
    }

    public static void main(String[] args) {
        Perfeito p1 = new Perfeito();
        p1.calcular();
    }
}
