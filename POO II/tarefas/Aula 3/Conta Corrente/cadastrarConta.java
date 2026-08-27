public class cadastrarConta {
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

    public cadastrarConta(String nomeBanco, String nome, long cpf, float saldo, float chequEspecial) {
        this.nomeBanco = nomeBanco;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.chequeEspecial = chequEspecial;
    }
}