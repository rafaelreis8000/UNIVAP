public class PortaXor {

    protected Porta a;
    protected Porta b;
    protected Porta saida;

    protected PortaAnd and1;
    protected PortaAnd and2;
    protected PortaOr or;

    public PortaXor() {
        this.a = new Porta(false);
        this.b = new Porta(false);
        this.saida = new Porta(false);

        montarCircuito();
        xor();
    }

    public PortaXor(String a, String b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(false);

        montarCircuito();
        xor();
    }

    public PortaXor(Porta a, Porta b) {
        this.a = a;
        this.b = b;
        this.saida = new Porta(false);

        montarCircuito();
        xor();
    }

    public PortaXor(int a, int b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(false);

        montarCircuito();
        xor();
    }

    public PortaXor(boolean a, boolean b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(false);

        montarCircuito();
        xor();
    }

    private void montarCircuito() {

        this.and1 = new PortaAnd();
        this.and2 = new PortaAnd();
        this.or = new PortaOr();
    }

    public PortaXor xor() {

        // AND 1 = a AND NOT b
        boolean notB = !this.b.getEstado();
        this.and1.setPortaAnd(
            this.a.getEstado(),
            notB
        );

        // AND 2 = NOT a AND b
        boolean notA = !this.a.getEstado();
        this.and2.setPortaAnd(
            notA,
            this.b.getEstado()
        );

        // OR das duas saídas
        this.or.setPortaOr(
            this.and1.getEstadoSaida(),
            this.and2.getEstadoSaida()
        );

        this.saida.setEstado(
            this.or.getEstadoSaida()
        );

        return this;
    }

    public boolean getEstadoSaida() {
        return this.saida.getEstado();
    }

    public PortaXor setPortaXor(Porta a, Porta b) {
        this.a = a;
        this.b = b;

        return xor();
    }

    public PortaXor setPortaXor(boolean a, boolean b) {
        this.a.setEstado(a);
        this.b.setEstado(b);

        return xor();
    }

    public PortaXor setPortaXor(int a, int b) {
        this.a.setEstado(a);
        this.b.setEstado(b);

        return xor();
    }

    public Porta getA() {
        return this.a;
    }

    public Porta getB() {
        return this.b;
    }

    public PortaXor setA(Porta a) {
        this.a = a;
        return xor();
    }

    public PortaXor setB(Porta b) {
        this.b = b;
        return xor();
    }

    public Porta getSaida() {
        return this.saida;
    }

    @Override
    public String toString() {
        return "{\"a\":\"" + a.getEstadoInt()
             + "\",\"b\":\"" + b.getEstadoInt()
             + "\",\"saida\":\"" + saida.getEstadoInt()
             + "\"}";
    }
}