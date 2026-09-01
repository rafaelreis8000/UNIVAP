public class AgendaPessoas {

    private Pessoa[] pessoas;
    private int qtdPessoas;

    public AgendaPessoas() {
        pessoas = new Pessoa[1];
        qtdPessoas = 0;
    }

    public boolean inserir(Pessoa p) {

        if (p == null) {
            return false;
        }

        if (buscar(p.getCpf()) != null) {
            return false;
        }

        if (qtdPessoas == pessoas.length) {

            Pessoa[] novoVetor = new Pessoa[pessoas.length * 2];

            for (int i = 0; i < pessoas.length; i++) {
                novoVetor[i] = pessoas[i];
            }

            pessoas = novoVetor;
        }

        pessoas[qtdPessoas] = p;
        qtdPessoas++;

        return true;
    }

    public boolean remover(long cpf) {

        int posicao = -1;

        for (int i = 0; i < qtdPessoas; i++) {

            if (pessoas[i].getCpf() == cpf) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            return false;
        }

        for (int i = posicao; i < qtdPessoas - 1; i++) {
            pessoas[i] = pessoas[i + 1];
        }

        pessoas[qtdPessoas - 1] = null;
        qtdPessoas--;

        return true;
    }

    public Pessoa buscar(long cpf) {

        for (int i = 0; i < qtdPessoas; i++) {

            if (pessoas[i].getCpf() == cpf) {
                return pessoas[i];
            }
        }

        return null;
    }

    public String listarPessoas() {

        if (qtdPessoas == 0) {
            return "Agenda vazia.";
        }

        String resultado = "";

        for (int i = 0; i < qtdPessoas; i++) {
            resultado += pessoas[i].toString() + "\n";
        }

        return resultado;
    }

    public void ordenarIdade() {

        for (int i = 0; i < qtdPessoas - 1; i++) {

            for (int j = 0; j < qtdPessoas - 1 - i; j++) {

                if (pessoas[j].getIdade() > pessoas[j + 1].getIdade()) {

                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarAltura() {

        for (int i = 0; i < qtdPessoas - 1; i++) {

            for (int j = 0; j < qtdPessoas - 1 - i; j++) {

                if (pessoas[j].getAltura() > pessoas[j + 1].getAltura()) {

                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarAZ() {

        for (int i = 0; i < qtdPessoas - 1; i++) {

            for (int j = 0; j < qtdPessoas - 1 - i; j++) {

                if (pessoas[j].getNome()
                        .compareToIgnoreCase(pessoas[j + 1].getNome()) > 0) {

                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarZA() {

        for (int i = 0; i < qtdPessoas - 1; i++) {

            for (int j = 0; j < qtdPessoas - 1 - i; j++) {

                if (pessoas[j].getNome()
                        .compareToIgnoreCase(pessoas[j + 1].getNome()) < 0) {

                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }
    }

    public float mediaIdade() {

        if (qtdPessoas == 0) {
            return 0;
        }

        int soma = 0;

        for (int i = 0; i < qtdPessoas; i++) {
            soma += pessoas[i].getIdade();
        }

        return (float) soma / qtdPessoas;
    }

    // Média das alturas
    public float mediaAltura() {

        if (qtdPessoas == 0) {
            return 0;
        }

        int soma = 0;

        for (int i = 0; i < qtdPessoas; i++) {
            soma += pessoas[i].getAltura();
        }

        return (float) soma / qtdPessoas;
    }

    public int getQtdHomens() {

        int quantidade = 0;

        for (int i = 0; i < qtdPessoas; i++) {

            if (pessoas[i].getSexo().equalsIgnoreCase("masculino")) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public int getQtdMulheres() {

        int quantidade = 0;

        for (int i = 0; i < qtdPessoas; i++) {

            if (pessoas[i].getSexo().equalsIgnoreCase("feminino")) {
                quantidade++;
            }
        }

        return quantidade;
    }
}