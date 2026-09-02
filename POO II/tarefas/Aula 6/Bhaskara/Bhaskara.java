public class Bhaskara {
    private double a;
    private double b;
    private double c;

    // Counstrutores

    public Bhaskara() {}

    public Bhaskara(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public Bhaskara(float a, float b, float c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public Bhaskara(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    // Getters e Setters

    public double getA() {
        return a;
    } public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    } public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    } public void setC(double c) {
        this.c = c;
    }

    //Outras funções

    public double calcularDelta() {
        return (b*b) - (4*a*c);
    }

    public Double[] calcularRaizes() {
        double delta = calcularDelta();

        if (a==0) {
            return new Double[0];
        }

        if (delta < 0) {
            return new Double[0];
        }

        if (delta==0) {
            Double[] raizes = new Double[1];
            raizes[0] = -b/(2*a);

            return raizes;
        }

        Double[] raizes = new Double[2];
        raizes[0] = (-b + Math.sqrt(delta)) / (2*a);
        raizes[1] = (b + Math.sqrt(delta)) / (2*a);

        return raizes;
    }

    @Override
    public String toString() {

        double delta = calcularDelta();
        Double[] raizes = calcularRaizes();

        String resultado = "";

        resultado += "Equação: "
                + a + "x² + "
                + b + "x + "
                + c + " = 0\n";

        resultado += "Delta: " + delta + "\n";

        if (a == 0) {
            resultado += "Não é uma equação do segundo grau.";
        } 
        else if (delta < 0) {
            resultado += "A equação não possui raízes reais.";
        } 
        else if (delta == 0) {
            resultado += "Raiz: x = " + raizes[0];
        } 
        else {
            resultado += "Raiz 1: x1 = " + raizes[0] + "\n";
            resultado += "Raiz 2: x2 = " + raizes[1];
        }

        return resultado;
    }
}