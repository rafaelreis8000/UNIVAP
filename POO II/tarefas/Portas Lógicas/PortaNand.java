public class PortaNand extends PortaAnd {

    public PortaNand() {
        super();
        nand();
    }

    public PortaNand(String a, String b) {
        super(a, b);
        nand();
    }

    public PortaNand(Porta a, Porta b) {
        super(a, b);
        nand();
    }

    public PortaNand(int a, int b) {
        super(a, b);
        nand();
    }

    public PortaNand(boolean a, boolean b) {
        super(a, b);
        nand();
    }

    public PortaNand nand() {
        getSaida().setEstado(
            !(getA().getEstado() && getB().getEstado())
        );

        return this;
    }

    @Override
    public PortaNand and() {
        nand();
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