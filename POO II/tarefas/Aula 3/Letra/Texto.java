import java.util.Scanner;

public class Texto {

    private Letra[] letras;
    private int qtdLetras;

    // Construtor
    public Texto() {
        letras = new Letra[1];
        qtdLetras = 0;
    }

    // Insere uma letra no texto
    public boolean inserir(Letra letra) {

        // Se o vetor estiver cheio, cria um novo com o dobro do tamanho
        if (qtdLetras == letras.length) {
            Letra[] novoVetor = new Letra[letras.length * 2];

            // Copia as letras para o novo vetor
            for (int i = 0; i < qtdLetras; i++) {
                novoVetor[i] = letras[i];
            }

            // Substitui o vetor antigo
            letras = novoVetor;
        }

        // Insere a nova letra
        letras[qtdLetras] = letra;
        qtdLetras++;

        return true;
    }

    // Verifica se dois textos são iguais
    public boolean éIgual(Letra[] outro) {

        if (qtdLetras != outro.length) {
            return false;
        }

        for (int i = 0; i < qtdLetras; i++) {
            if (letras[i].getLetra() != outro[i].getLetra()) {
                return false;
            }
        }

        return true;
    }

    // Verifica se o texto começa com determinado conjunto de letras
    public boolean começaCom(Letra[] inicio) {

        if (inicio.length > qtdLetras) {
            return false;
        }

        for (int i = 0; i < inicio.length; i++) {
            if (letras[i].getLetra() != inicio[i].getLetra()) {
                return false;
            }
        }

        return true;
    }

    // Verifica se o texto termina com determinado conjunto de letras
    public boolean terminaCom(Letra[] fim) {

        if (fim.length > qtdLetras) {
            return false;
        }

        int inicio = qtdLetras - fim.length;

        for (int i = 0; i < fim.length; i++) {
            if (letras[inicio + i].getLetra() != fim[i].getLetra()) {
                return false;
            }
        }

        return true;
    }

    // Verifica se existe uma letra em determinada posição
    public boolean letraNaPosicao(int p) {

        if (p < 0 || p >= qtdLetras) {
            return false;
        }

        return true;
    }

    // Substitui todas as ocorrências de uma letra por outra
    public boolean substituir(char essa, char porEssa) {

        boolean encontrou = false;

        for (int i = 0; i < qtdLetras; i++) {

            if (letras[i].getLetra() == essa) {
                letras[i].setLetra(porEssa);
                encontrou = true;
            }
        }

        return encontrou;
    }

    // Retorna a quantidade de letras do texto
    public int tamanhoTexto() {
        return qtdLetras;
    }

    // Retorna as posições onde determinada letra aparece
    public char[] posicoesDaLetra(char letra) {

        int quantidade = 0;

        // Primeiro conta quantas ocorrências existem
        for (int i = 0; i < qtdLetras; i++) {
            if (letras[i].getLetra() == letra) {
                quantidade++;
            }
        }

        // Cria vetor com a quantidade necessária
        char[] posicoes = new char[quantidade];

        int j = 0;

        // Guarda as posições
        for (int i = 0; i < qtdLetras; i++) {
            if (letras[i].getLetra() == letra) {
                posicoes[j] = (char) i;
                j++;
            }
        }

        return posicoes;
    }

    // Inverte o texto
    public void inverterTexto() {

        for (int i = 0; i < qtdLetras / 2; i++) {

            Letra aux = letras[i];

            letras[i] = letras[qtdLetras - 1 - i];

            letras[qtdLetras - 1 - i] = aux;
        }
    }

    // Verifica se o texto é um palíndromo
    public boolean éPalíndromo() {

        for (int i = 0; i < qtdLetras / 2; i++) {

            if (letras[i].getLetra() != letras[qtdLetras - 1 - i].getLetra()) {
                return false;
            }
        }

        return true;
    }

    // Método auxiliar para mostrar o texto
    public void mostrarTexto() {

        for (int i = 0; i < qtdLetras; i++) {
            System.out.print(letras[i].getLetra());
        }

        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Texto texto = new Texto();

        System.out.print("Digite um texto: ");
        String entrada = scanner.nextLine();

        // Insere cada caractere como um objeto Letra
        for (int i = 0; i < entrada.length(); i++) {

            Letra letra = new Letra(entrada.charAt(i));

            texto.inserir(letra);
        }

        System.out.println("\nTexto digitado:");
        texto.mostrarTexto();

        System.out.println("Tamanho do texto: " + texto.tamanhoTexto());

        // Teste do método éPalíndromo
        if (texto.éPalíndromo()) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }

        // Teste de letra em posição
        System.out.print("\nDigite uma posição para verificar: ");
        int posicao = scanner.nextInt();

        if (texto.letraNaPosicao(posicao)) {
            System.out.println("Existe uma letra na posição " + posicao);
        } else {
            System.out.println("Posição inválida.");
        }

        scanner.close();
    }
}