public class Porta {

    private boolean estado;

    // Construtor padrão
    public Porta() {
        this.estado = false;
    }

    // Construtor com boolean
    public Porta(boolean estado) {
        this.estado = estado;
    }

    // Construtor com int
    public Porta(int estado) {
        setEstado(estado);
    }

    // Construtor com String
    public Porta(String estado) {
        if (estado.equalsIgnoreCase("on")) {
            this.estado = true;
        } else if (estado.equalsIgnoreCase("off")) {
            this.estado = false;
        } else {
            throw new IllegalArgumentException(
                "O estado deve ser \"on\" ou \"off\"."
            );
        }
    }

    // Inverte o estado
    public Porta not() {
        this.estado = !this.estado;
        return this;
    }

    // Liga a porta
    public Porta on() {
        this.estado = true;
        return this;
    }

    // Desliga a porta
    public Porta off() {
        this.estado = false;
        return this;
    }

    // Retorna o estado como 0 ou 1
    public int getEstadoInt() {
        return this.estado ? 1 : 0;
    }

    // Retorna o estado como boolean
    public boolean getEstado() {
        return this.estado;
    }

    // Setter boolean
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Setter int
    public void setEstado(int estado) {
        if (estado == 0) {
            this.estado = false;
        } else if (estado == 1) {
            this.estado = true;
        } else {
            throw new IllegalArgumentException(
                "O estado deve ser 0 ou 1."
            );
        }
    }

    @Override
    public String toString() {
        return "{\"estado\":\"" + getEstadoInt() + "\"}";
    }
}