public class Rg {
    private long numeroRg;
    private String nome;
    private String nomePai;
    private String nomeMae;
    private LocalDate dataNascimento;
    private String naturalidadeCidade;
    private String naturalidadeEstado;
    private String orgaoExpeditor;
    private long cpf;



    // Construtores

    Rg() {}

    Rg(String nome, long numeroRg) {
        setNome(nome);
        setNumeroRg(numeroRg);
    }

    Rg(String nome, long numeroRg, long cpf) {
        setNome(nome);
        setNumeroRg(numeroRg);
        setCpf(cpf);
    }

    Rg(Rg rg) {
        setNumeroRg(rg.getNumeroRg());
        setNome(rg.getNome());
        setNomePai(rg.getNomePai());
        setNomeMae(rg.getNomeMae());
        setDataNascimento(rg.getDataNascimento());
        setNaturalidadeCidade(rg.getNaturalidadeCidade());
        setNaturalidadeEstado(rg.getNaturalidadeEstado());
        setOrgaoExpeditor(rg.getOrgaoExpeditor());
        setCpf(rg.getCpf());
    }

    Rg(String nome, long numeroRg, String nomeMae) {
        setNome(nome);
        setNumeroRg(numeroRg);
        setNomeMae(nomeMae);
    }

    //Getters e Setters

    public long getNumeroRg() {
        return this.numeroRg;
    } public void setNumeroRg(long numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getNome() {
        return this.nome;
    } public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePai() {
        return this.nomePai;
    } public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return this.nomeMae;
    } public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    } public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidadeCidade() {
        return this.naturalidadeCidade;
    } public void setNaturalidadeCidade(String naturalidadeCidade) {
        this.naturalidadeCidade = naturalidadeCidade;
    }

    public String getNaturalidadeEstado() {
        return this.naturalidadeEstado;
    } public void setNaturalidadeEstado(String naturalidadeEstado) {
        this.naturalidadeEstado = naturalidadeEstado;
    }

    public String getOrgaoExpeditor() {
        return this.orgaoExpeditor;
    } public void setOrgaoExpeditor(String orgaoExpeditor) {
        this.orgaoExpeditor = orgaoExpeditor;
    }

    public long getCpf() {
        return this.cpf;
    } public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    //Outros Métodos da Classe

    public boolean eCpfValido() {

        long cpf = this.cpf;

        // CPF precisa ter 11 dígitos
        if (cpf < 10000000000L || cpf > 99999999999L) {
            return false;
        }

        String cpfString = String.valueOf(cpf);

        // Verifica se todos os dígitos são iguais
        if (cpfString.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Primeiro dígito verificador
        int soma = 0;

        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpfString.charAt(i)) * (10 - i);
        }

        int resto = soma % 11;

        int primeiroDigito;

        if (resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }

        if (primeiroDigito != Character.getNumericValue(cpfString.charAt(9))) {
            return false;
        }

        // Segundo dígito verificador
        soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpfString.charAt(i)) * (11 - i);
        }

        resto = soma % 11;

        int segundoDigito;

        if (resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }

        return segundoDigito == Character.getNumericValue(cpfString.charAt(10));
    }

    public boolean eDataNascimentoValida() {

        if (dataNascimento == null) {
            return false;
        }

        LocalDate hoje = LocalDate.now();

        // Não pode ser uma data futura
        if (dataNascimento.isAfter(hoje)) {
            return false;
        }

        // Exemplo: considera idade máxima de 120 anos
        LocalDate dataMinima = hoje.minusYears(120);

        return !dataNascimento.isBefore(dataMinima);
    }

    //Versão String

    @Override
    public String toString() {

        return "RG{" +
                "numeroRg=" + numeroRg +
                ", nome='" + nome + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", naturalidadeCidade='" + naturalidadeCidade + '\'' +
                ", naturalidadeEstado='" + naturalidadeEstado + '\'' +
                ", orgaoExpedidor='" + orgaoExpeditor + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}