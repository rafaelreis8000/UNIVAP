public class Letra {
    private char letra;

    public char getLetra() {
        return letra;
    } public void setLetra(char letra) {
        this.letra = letra;
    }

    public Letra(char letra) {
        this.letra = letra;
    }

    void converterMaiusculo() {
        letra = Character.toUpperCase(letra);
    }

    void converterMinusculo() {
        letra = Character.toLowerCase(letra);
    }

    public boolean eNumero() {
        if (Character.isDigit(letra)) {
            return true;
        } else {
            return false;
        }
    }
}