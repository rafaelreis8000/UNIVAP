import java.util.Scanner;

public class Bhaskara {

    double a;
    double b;
    double c;
    double delta;
    double respostaUm;
    double respostaDois;

    void calcular() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = scanner.nextDouble();

        scanner.close();

        delta = (b * b) - 4 * (a * c);
        respostaUm = ((b * -1) + Math.sqrt(delta)) / (2 * a);
        respostaDois = ((b * -1) - Math.sqrt(delta)) / (2 * a);
    }

    void mostrar() {

        System.out.println("Para A = " + a + ", B = " + b + ", e C = " + c);

        if (delta >= 0) {

            System.out.println("Temos delta = " + delta + " E as soluções " + respostaUm + " e " + respostaDois);
        } else {
            System.out.println("Não há solução");
        }
    }

    public static void main(String[] args) {
        
        Bhaskara b1 = new Bhaskara();
        b1.calcular();
        b1.mostrar();
    }
}