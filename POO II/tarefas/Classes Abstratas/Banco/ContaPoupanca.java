package Banco;
public class ContaPoupanca extends ContaBancaria {

    private double rendimentoMensal;

    public ContaPoupanca(double saldoInicial, double rendimentoMensal) {
        super(saldoInicial);
        this.rendimentoMensal = rendimentoMensal;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        saldo += valor;
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    public double aplicarRendimento() {
        double rendimento = saldo * rendimentoMensal;
        saldo += rendimento;

        return rendimento;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }
}