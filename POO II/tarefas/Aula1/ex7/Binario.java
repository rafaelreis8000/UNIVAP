package ex7;
import java.util.Scanner;

public class Binario {

    int v;

    void lerValor() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inteiro: ");
        v = scanner.nextInt();
        scanner.close();
    }

    String converter() {
        if (v == 0) {
            return "0";
        }

        String binario = "";

        while (v > 0) {
            int resto = v % 2;
            binario = resto + binario;
            v = v / 2;
        }

        return binario;
    }

    public class Main {

        public static void main(String[] args) {
            
            Binario b1 = new Binario();
            b1.lerValor();
            System.out.print("Valor em binário é: " + b1.converter());
        }
    }
}
