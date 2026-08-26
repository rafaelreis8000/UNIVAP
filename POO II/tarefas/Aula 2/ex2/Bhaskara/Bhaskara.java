public class Bhaskara {
    int a;
    int b;
    int c;
    int delta;
    double r1;
    double r2;

    void calcularBhaskara() {
        delta = (b * b) - 4 * a * c;
        r1 = (-b + Math.sqrt(delta)) / 2 * a;
        r2 = (-b - Math.sqrt(delta)) / 2 * a;

        if (delta >= 0) {
            System.out.println("As raizes sao: " + r1 + "e " + r2);
        } else {
            System.out.println("Não existem raízes reais");
        }
    }

    public static void main(String[] args) {
        Bhaskara b1 = new Bhaskara();
        b1.a = 6;
        b1.b = 8;
        b1.c = 2;

        b1.calcularBhaskara();
    }
}