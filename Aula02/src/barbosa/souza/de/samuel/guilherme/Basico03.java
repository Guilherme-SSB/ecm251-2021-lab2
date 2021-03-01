package barbosa.souza.de.samuel.guilherme;

import java.util.Random;

public class Basico03 {
    // Estruturas de repetição

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) System.out.println ();
        /*
        int limite = 10;
        int cont = 0;

        for(cont = 0; cont < limite; cont++){
            System.out.println("Contador: " + cont);
        }
        */

        long tempoInicial = System.currentTimeMillis();

        int senha = 123456;
        // Objeto que possibilita pegar números aleatórios
        Random sorteador = new Random(); // Gera um import
        int chute = sorteador.nextInt(999999);
        int tentativas = 0;
        while (chute != senha){
            System.out.println("Tentativa: " + tentativas);
            System.out.println("Chute: " + chute);
            chute = sorteador.nextInt(999999);
            tentativas++;
        }
        System.out.println("Parabens Hackerman!");

        long tempoFinal = System.currentTimeMillis();

        System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

    }
}
