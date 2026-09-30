public class Ohm {
    private double r;
    private double i;
    private double v;

    //Construtores

    public Ohm() {}

    public Ohm(int r, int i, int v) {
        setR(r);
        setI(i);
        setV(v);
    }

    public Ohm(float r, float i, float v) {
        setR(r);
        setI(i);
        setV(v);
    }

    public Ohm(double r, double i, double v) {
        setR(r);
        setI(i);
        setV(v);
    }

    //Getters e Setters

    public double getR() {
        return this.r;
    } public void setR(double r) {
        this.r = r;
    }

    public double getI() {
        return this.i;
    } public void setI(double i) {
        this.i = i;
    }

    public double getV() {
        return this.v;
    } public void setV(double v) {
        this.v = v;
    }

    // Cálculos

    public double calcularV() {
        if (v == 0) {
            return 0;
        }
        return r*i;
    }

    public double calcularI() {
        if (r == 0) {
            return 0;
        }
        return v/r;
    }

    public double calcularR() {
        if (i == 0) {
            return 0;
        }
        return v/i;
    }

    @Override
    public String toString() {
        return "Resistência (R): " + r + " Ω\n" +
               "Corrente (I): " + i + " A\n" +
               "Potencial elétrico (V): " + v + " V";
    }
    
}