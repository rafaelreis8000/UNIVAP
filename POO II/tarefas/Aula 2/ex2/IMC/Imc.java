public class Imc {
    String nome;
    double altura;
    double peso;

    double calcularIMC() {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        Imc imc1 = new Imc();
        imc1.nome = "Rafael";
        imc1.altura = 1.88;
        imc1.peso = 62;
        
        System.out.println(imc1.calcularIMC());
    }
}