package roletaRussa_jogo;

public class jogador {
    private String nome;
    private boolean vivo;

    public Jogador(String nome) {
        this.nome = nome;
        this.vivo = true;
    }

    public String getNome() { return nome; }
    public boolean isVivo() { return vivo; }
    public void morrer() { this.vivo = false; }
}