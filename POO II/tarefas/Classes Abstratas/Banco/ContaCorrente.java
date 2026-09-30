package Banco;
public class ContaCorrente extends ContaBancaria {

    private double limiteChequeEspecial;

    public ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
        super(saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
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
        if (valor <= 0) {
            return false;
        }

        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}