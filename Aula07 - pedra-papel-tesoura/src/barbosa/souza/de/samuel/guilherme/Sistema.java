package barbosa.souza.de.samuel.guilherme;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador jogador1;
    private Jogador jogador2;
    private Scanner sc;
    private final Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};


    public Sistema() {
        sc = new Scanner(System.in);
        inicializaJogadores();
    }

    private void inicializaJogadores() {
        System.out.println("Informe o nome do jogador 1: ");
        String nome = sc.next();
        jogador1 = new Jogador(nome, true);
        jogador2 = new Jogador("NPC");
    }

    public void run() {
        while (true) {
            System.out.println("\nPlayer1: " + jogador1 + " vs. Player2: " + jogador2);
            jogador1.setJogada(selecionaJogada());
            jogador2.setJogada(sorteiaJogada());
            clearScreen();
            System.out.println("Jogada Jogador 1: " + jogador1.getJogada());
            System.out.println("Jogada Jogador 2: " + jogador2.getJogada());
            System.out.println("Resultado: " + jogador1.getJogada().verificaResultado(jogador2.getJogada()));
        }
    }

    private Jogada selecionaJogada() {
        System.out.println("\nEscolha:\n0 - Pedra\n1 - Papel\n2 - Tesoura\n\n");
        int escolha = sc.nextInt();
        return jogadas[escolha];
    }

    private Jogada sorteiaJogada() {
        return jogadas[new Random().nextInt(jogadas.length)];
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
}
