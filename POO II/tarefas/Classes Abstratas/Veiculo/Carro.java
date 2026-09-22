package Veiculo;
public class Carro implements Veiculo {

    private int velocidadeAtual;

    public Carro() {
        this.velocidadeAtual = 0;
    }

    @Override
    public String ligar() {
        return "O carro foi ligado.";
    }

    @Override
    public String desligar() {
        velocidadeAtual = 0;
        return "O carro foi desligado.";
    }

    @Override
    public String acelerar(int velocidade) {
        velocidadeAtual = velocidade;
        return "O carro acelerou para " + velocidadeAtual + " km/h.";
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}