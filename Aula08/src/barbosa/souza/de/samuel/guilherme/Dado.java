package barbosa.souza.de.samuel.guilherme;

import java.util.Random;

public class Dado {
    
    private int numeroLados;
    private int faceAtual;
    private int[] FACES;

    public Dado(int numeroLados) {
        this.numeroLados = numeroLados;

        FACES = new int[this.numeroLados];
        for (int i = 0; i < FACES.length; i++) {
            FACES[i] = i+1;
        }

        lancarDado();
    }


    /**
     * Método que realiza o lançamento do dado e atribui na faceAtual o valor do lançamento.
     */
    private void lancarDado() {
        Random random = new Random();
        this.faceAtual = random.nextInt(this.numeroLados);
    }

    /**
     * Método que devolve o valor da face atual do dado.
     * @return Face atual sorteada
     */
    public int lerFaceAtual() {
        return FACES[this.faceAtual];
    }

    /**
     * Método que realiza o lançamento e devolve o valor da face atual do dado.
     * @return Face atual recém sorteada
     */
    public int lancarDadoELerFace() {
        lancarDado();
        return lerFaceAtual();
    }

}
