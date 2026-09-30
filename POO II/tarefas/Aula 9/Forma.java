abstract class Forma {
    String cor;

    abstract double calcularArea();
}

class Circulo extends Forma {

    private double raio;

    public double getRaio() {
        return raio;
    } public void setraio(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return (3.14 * (raio * raio));
    }

class Retangulo extends Forma {

    double largura;
    double altura;

    double calcularArea() {
        return (largura * altura);
    }
}
}