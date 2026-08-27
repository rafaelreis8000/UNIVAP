public class Caneta {
    public String modelo;
    private double ponta;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(Double ponta) {
        this.ponta = ponta;
    }

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5);
        c1.status();
    }
}