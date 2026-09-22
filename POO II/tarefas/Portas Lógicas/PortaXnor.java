public class PortaXnor extends PortaXor {

    public PortaXnor() {
        super();
        xnor();
    }

    public PortaXnor(String a, String b) {
        super(a, b);
        xnor();
    }

    public PortaXnor(Porta a, Porta b) {
        super(a, b);
        xnor();
    }

    public PortaXnor(int a, int b) {
        super(a, b);
        xnor();
    }

    public PortaXnor(boolean a, boolean b) {
        super(a, b);
        xnor();
    }

    public PortaXnor xnor() {
        super.xor();

        getSaida().setEstado(
            !getSaida().getEstado()
        );

        return this;
    }

    @Override
    public PortaXnor xor() {
        xnor();
        return this;
    }

    @Override
    public String toString() {
        return "{\"a\":\"" + getA().getEstadoInt()
             + "\",\"b\":\"" + getB().getEstadoInt()
             + "\",\"saida\":\"" + getSaida().getEstadoInt()
             + "\"}";
    }
}