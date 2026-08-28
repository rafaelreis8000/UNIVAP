public class ContaCorrente {
    private String nomeBanco;
    private String nome;
    private long cpf;
    private float saldo;
    private float chequeEspecial;

    public String getNomeBanco() {
        return nomeBanco;
    } public void setnomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNome() {
        return nome;
    } public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    } public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    } public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    } public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(String nomeBanco, String nome,
         long cpf, float saldo, float chequeEspecial
        ) {
        this.nomeBanco = nomeBanco;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public void cadastrarConta(String nomeBanco, String nome,
        long cpf, float saldo, float chequeEspecial
    ) {
        new ContaCorrente(nomeBanco, nome, cpf, saldo, chequeEspecial);
    }

    public float depoistar(float valor) {
        saldo = saldo + valor;
        return this.saldo;
    }

    public float sacar(float valor) {
        saldo = saldo - valor;
        return this.saldo;
    }

    public float obterSaldo() {
        return this.saldo;
    }

    public String atualizarNomeCliente(String novoNome) {
        nome = novoNome;
        return nome;
    }
}