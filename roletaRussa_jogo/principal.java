package roletaRussa_jogo;
import java.util.Scanner;
import juiz.juiz;
import jogador.jogador;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Juiz juiz = new Juiz();
        
        System.out.println("=== ROLETA RUSSA v1.0 ===");
        System.out.println("1 - Jogar contra CPU");
        System.out.println("2 - Multiplayer Local (2 Jogadores)");
        System.out.println("3 - Sair");
        System.out.print("Escolha o modo: ");
        
        int escolha = leitor.nextInt();
        leitor.nextLine();

        switch (escolha) {
            case 1:
                System.out.print("Digite seu nome: ");
                Jogador p1 = new Jogador(leitor.nextLine());
                
                System.out.println("Puxando o gatilho...");
                if(juiz.apertarGatilho()) {
                    System.out.println("*BOOM!* " + p1.getNome() + " não sobreviveu.");
                } else {
                    System.out.println("*CLICK*... Sorte sua! Você está vivo.");
                }
                break;
                
            case 2:
                System.out.print("Nome do Jogador 1: ");
                Jogador j1 = new Jogador(leitor.nextLine());
                System.out.print("Nome do Jogador 2: ");
                Jogador j2 = new Jogador(leitor.nextLine());
                
                boolean fimDeJogo = false;
                while (!fimDeJogo) {
                    
                    System.out.println("\nVez de " + j1.getNome() + " [Pressione Enter]");
                    leitor.nextLine();
                    if(juiz.apertarGatilho()) {
                        System.out.println("*BOOM!* " + j1.getNome() + " morreu! " + j2.getNome() + " venceu.");
                        fimDeJogo = true;
                        break;
                    }
                    System.out.println("*CLICK*... " + j1.getNome() + " sobreviveu!");

                    
                    System.out.println("\nVez de " + j2.getNome() + " [Pressione Enter]");
                    leitor.nextLine();
                    if(juiz.apertarGatilho()) {
                        System.out.println("*BOOM!* " + j2.getNome() + " morreu! " + j1.getNome() + " venceu.");
                        fimDeJogo = true;
                    } else {
                        System.out.println("*CLICK*... " + j2.getNome() + " sobreviveu!");
                    }
                }
                break;
                
            case 3:
                System.out.println("Encerrando programa...");
                break;
                
            default:
                System.out.println("Opção inválida!");
        }
        leitor.close();
    }
}