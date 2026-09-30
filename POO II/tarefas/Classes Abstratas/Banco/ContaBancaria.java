package Banco;
public abstract class ContaBancaria {

    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract boolean depositar(double valor);

    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}