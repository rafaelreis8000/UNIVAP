package Animal;
public class Pato extends Animal {

    public Pato(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return nome + " faz: Quá Quá!";
    }
}