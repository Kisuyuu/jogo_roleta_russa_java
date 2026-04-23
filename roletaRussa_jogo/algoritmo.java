package roletaRussa_jogo;
import java.util.Random;

public class algoritmo {
    protected Random random = new Random();

    public int sortear(int limite) {
        return random.nextInt(limite);
    }
}