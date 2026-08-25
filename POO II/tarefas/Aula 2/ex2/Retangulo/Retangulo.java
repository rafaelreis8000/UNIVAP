public class Retangulo {

    double base;
    double altura;

    double calcularPerimetro() {
        return 2*(base + altura);
    }

    double calcularArea() {
        return (base * altura);
    }

    double calcularDiagonal() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    public static void main(String[] args) {
        
        Retangulo r1 = new Retangulo();
        r1.base = 4;
        r1.altura = 2;
        System.out.println(r1.calcularPerimetro());
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularDiagonal());
    }
}