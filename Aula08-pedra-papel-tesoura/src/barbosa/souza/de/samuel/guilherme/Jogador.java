package barbosa.souza.de.samuel.guilherme;


public class Jogador {
    private String nome;
    private boolean ehHumano;
    private Jogada jogada;

    // Polimorfismo de sobrecarga
    public Jogador(String nome, boolean ehHumano) {
        this.nome = nome;
        this.ehHumano = ehHumano;
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.ehHumano = false;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public boolean isEhHumano() {
        return this.ehHumano;
    }

    public Jogada getJogada() {
        return this.jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }

    // Polimorfismo de sobreescrita (estou sobreescrevendo do objeto Object) 
    @Override
    public String toString() {
        return getNome();
    }
}
