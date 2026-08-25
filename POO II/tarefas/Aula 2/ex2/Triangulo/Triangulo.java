public class Triangulo {
    
    double base;
    double altura;
    double ladoA;
    double ladoB;
    double ladoC;

    double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    double calcularArea() {
        return (base * altura) / 2;
    }

    boolean eTriangulo() {
        return (ladoA + ladoB > ladoC) &&
        (ladoA + ladoC > ladoB) &&
        (ladoB + ladoC > ladoA);
    }

    boolean eEquilatero() {
        if (!eTriangulo()) {
            return false;
        }

        return ladoA == ladoB && ladoB == ladoC;
    }

    boolean eIsosceles() {
        if (!eTriangulo()) {
            return false;
        }

        return ladoA == ladoB ||
        ladoA == ladoC ||
        ladoB == ladoC;
    }

    boolean eEscaleno() {
        if (!eTriangulo()) {
            return false;
        }

        return ladoA != ladoB &&
        ladoA != ladoC &&
        ladoB != ladoC;
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.ladoA = 4;
        t1.ladoB = 2;
        t1.ladoC = 6;
    }
}