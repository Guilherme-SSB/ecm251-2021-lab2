package barbosa.souza.de.samuel.guilherme;

public class Genin extends Ninja{
    private String missao;

    public Genin(String nome, String familia, String missao) {
        
        super(nome, familia);
        this.missao = missao;
    }


    public String getMissao() {
        return this.missao;
    }


}
