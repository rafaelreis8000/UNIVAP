abstract class Produto {

    // Classe abstrata utilizada de molde para as próximas classes
    private String codigo;
    private String nome;
    private double precoBase;
    private int quantidade;

    // getters e setters
    public String getCodigo() {
        return codigo;
    } public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    } public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    } public void setPrecoBase(double precoBase) {

        if (precoBase <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero!");
        }

        this.precoBase = precoBase;
    }

    public int getQuantidade() {
        return quantidade;
    } public void setQuantidade(int quantidade) {

        if (quantidade <= 0) {
        throw new IllegalArgumentException("A quantidade deve ser maior que zero!");
        }
        this.quantidade = quantidade;
    }

    abstract double calcularPrecoFinal();

    double valorEmEstoque() {
        return (calcularPrecoFinal() * quantidade);
    }
}