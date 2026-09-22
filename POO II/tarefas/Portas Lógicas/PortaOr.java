public class PortaOr {

    private Porta a;
    private Porta b;
    private Porta saida;

    public PortaOr() {
        this.a = new Porta(false);
        this.b = new Porta(false);
        this.saida = new Porta(false);
    }

    public PortaOr(String a, String b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(
            this.a.getEstado() || this.b.getEstado()
        );
    }

    public PortaOr(Porta a, Porta b) {
        this.a = a;
        this.b = b;
        this.saida = new Porta(
            this.a.getEstado() || this.b.getEstado()
        );
    }

    public PortaOr(int a, int b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(
            this.a.getEstado() || this.b.getEstado()
        );
    }

    public PortaOr(boolean a, boolean b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(
            this.a.getEstado() || this.b.getEstado()
        );
    }

    public PortaOr or() {
        this.saida.setEstado(
            this.a.getEstado() || this.b.getEstado()
        );

        return this;
    }

    public boolean getEstadoSaida() {
        return this.saida.getEstado();
    }

    public PortaOr setPortaOr(Porta a, Porta b) {
        this.a = a;
        this.b = b;

        return or();
    }

    public PortaOr setPortaOr(boolean a, boolean b) {
        this.a.setEstado(a);
        this.b.setEstado(b);

        return or();
    }

    public PortaOr setPortaOr(int a, int b) {
        this.a.setEstado(a);
        this.b.setEstado(b);

        return or();
    }

    public Porta getA() {
        return this.a;
    }

    public Porta getB() {
        return this.b;
    }

    public PortaOr setA(Porta a) {
        this.a = a;
        return or();
    }

    public PortaOr setB(Porta b) {
        this.b = b;
        return or();
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