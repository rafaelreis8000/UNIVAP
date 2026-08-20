package ex2;
import java.util.Scanner;

public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    void calcular() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        ladoA = scanner.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        ladoB = scanner.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        ladoC = scanner.nextDouble();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Esse triângulo é equilátero!");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("Esse triângulo é isósceles!");
        } else {
            System.out.println("Esse triângulo é escaleno");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.calcular();
    }
}
