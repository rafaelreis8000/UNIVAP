public class PortaAnd {

    private Porta a;
    private Porta b;
    private Porta saida;

    // Construtor padrão
    public PortaAnd() {
        this.a = new Porta(false);
        this.b = new Porta(false);
        this.saida = new Porta(false);
    }

    // Construtor com String
    public PortaAnd(String a, String b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(this.a.getEstado() && this.b.getEstado());
    }

    // Construtor com Porta
    public PortaAnd(Porta a, Porta b) {
        this.a = a;
        this.b = b;
        this.saida = new Porta(
            this.a.getEstado() && this.b.getEstado()
        );
    }

    // Construtor com int
    public PortaAnd(int a, int b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(
            this.a.getEstado() && this.b.getEstado()
        );
    }

    // Construtor com boolean
    public PortaAnd(boolean a, boolean b) {
        this.a = new Porta(a);
        this.b = new Porta(b);
        this.saida = new Porta(
            this.a.getEstado() && this.b.getEstado()
        );
    }

    // Executa a operação AND
    public PortaAnd and() {
        this.saida.setEstado(
            this.a.getEstado() && this.b.getEstado()
        );

        return this;
    }

    // Retorna o estado da saída
    public boolean getEstadoSaida() {
        return this.saida.getEstado();
    }

    // Define as portas usando objetos Porta
    public PortaAnd setPortaAnd(Porta a, Porta b) {
        this.a = a;
        this.b = b;

        return and();
    }

    // Define as portas usando boolean
    public PortaAnd setPortaAnd(boolean a, boolean b) {
        this.a.setEstado(a);
        this.b.setEstado(b);

        return and();
    }

    // Define as portas usando int
    public PortaAnd setPortaAnd(int a, int b) {
        this.a.setEstado(a);
        this.b.setEstado(b);

        return and();
    }

    public Porta getA() {
        return this.a;
    }

    public Porta getB() {
        return this.b;
    }

    public PortaAnd setA(Porta a) {
        this.a = a;
        return and();
    }

    public PortaAnd setB(Porta b) {
        this.b = b;
        return and();
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