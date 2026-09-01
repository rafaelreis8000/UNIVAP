public class Pessoa {
    private String nome;
    private float peso;
    private int idade;
    private int altura;
    private String telefone;
    private String email;
    private String sexo;
    private long cpf;

    public Pessoa(
        String nome, float peso, int idade,
        int altura, String telefone, String email,
        String sexo, long cpf
    ) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    } public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    } public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    } public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    } public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTelefone() {
        return telefone;
    } public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    } public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    } public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getCpf() {
        return cpf;
    } public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}