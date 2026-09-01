import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto(0, 0);
        c1.aumentarVolume();
        System.out.println(Arrays.toString(c1.mostrarStatus()));
    }
}