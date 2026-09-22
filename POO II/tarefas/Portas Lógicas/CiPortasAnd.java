public class CiPortasAnd {

    private PortaAnd[] portas;

    public CiPortasAnd(int qtdPortasAnd) {

        if (qtdPortasAnd < 0) {
            throw new IllegalArgumentException(
                "A quantidade de portas não pode ser negativa."
            );
        }

        this.portas = new PortaAnd[qtdPortasAnd];

        for (int i = 0; i < portas.length; i++) {
            portas[i] = new PortaAnd();
        }
    }

    public PortaAnd getPorta(int index) {
        return portas[index];
    }

    public PortaAnd[] getPorta() {
        return portas;
    }

    @Override
    public String toString() {

        String resultado = "";

        for (int i = 0; i < portas.length; i++) {
            resultado += "porta[" + i + "] = + " + portas[i];

            if (i < portas.length - 1) {
                resultado += "\n";
            }
        }

        return resultado;
    }
}