package Animal;
public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return nome + " faz: Au Au!";
    }
}