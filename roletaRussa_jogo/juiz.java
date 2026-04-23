package roletaRussa_jogo;
import algoritmo.algoritmo;

public class juiz extends algoritmo {
    private int tambor;
    private int posicaoBala;

    public juiz() {
        this.posicaoBala = sortear(6); 
        this.tambor = 0;
    }

    public boolean apertarGatilho() {
        boolean disparou = (tambor == posicaoBala);
        
        tambor = (tambor + 1) % 6; 
        return disparou;
    }
    
   
    public void resetarArma() {
        this.posicaoBala = sortear(6);
        this.tambor = 0;
    }
}