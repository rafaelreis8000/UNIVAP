package Veiculo;
public class Moto implements Veiculo {

    private int velocidadeAtual;

    public Moto() {
        this.velocidadeAtual = 0;
    }

    @Override
    public String ligar() {
        return "A moto foi ligada.";
    }

    @Override
    public String desligar() {
        velocidadeAtual = 0;
        return "A moto foi desligada.";
    }

    @Override
    public String acelerar(int velocidade) {
        velocidadeAtual = velocidade;
        return "A moto acelerou para " + velocidadeAtual + " km/h.";
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}