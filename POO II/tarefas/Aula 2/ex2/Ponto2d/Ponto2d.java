public class Ponto2d {
    int x;
    int y;

    String mostrarPonto(int x , int y) {
        this.x = x;
        this.y = y;

        return "(" + x + ", " + y + ")";
    }

    double calcularDistancia(int x , int y) {
        this.x = x;
        this.y = y;

        double d = Math.sqrt((y * y) + (x * x));

        return d;
    }

    double calcularDistanciaDe(Ponto2d p2) {
        return Math.hypot(this.x - p2.x, this.y - p2.y);
    }

    double calcularDistanciaTotal(Ponto2d [] pontos) {
        double total = 0;

        for (Ponto2d ponto : pontos) {
            total += Math.hypot(ponto.x, ponto.y);
        }
        return total;
    }

    public static void main(String[] args) {
        Ponto2d p1 = new Ponto2d();
        p1.x = 3;
        p1.y = 4;
        Ponto2d p2 = new Ponto2d();
        p2.x = 2;
        p2.y = 8;

        System.out.println(p1.calcularDistanciaDe(p2));

    }
}