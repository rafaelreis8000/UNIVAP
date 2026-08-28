public class ControleRemoto {
    private int volume = 0;
    private int canal = 1;

    public int getVolume() {
        return volume;
    } public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    } public void setCanal(int canal) {
        this.canal = canal;
    }

    public ControleRemoto(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int aumentarVolume(int volume) {
        volume += 1;
        return volume;
    } public int diminuirVolume(int volume) {
        volume -= 1;
        return volume;
    }

    public int passarCanal(int canal) {
        canal += 1;
        return canal;
    } public int voltarCanal(int canal) {
        canal -= 1;
        return canal;
    }

    public int escolherCanal(int canal, int novoCanal) {
        canal = novoCanal;
        return canal;
    }

    public int[] mostrarStatus(int volume, int canal) {
        return new int[] {volume, canal};
    }
}