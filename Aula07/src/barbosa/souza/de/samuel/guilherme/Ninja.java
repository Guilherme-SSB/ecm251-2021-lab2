package barbosa.souza.de.samuel.guilherme;

public class Ninja {
    private String nome;
    private String familia;

    public Ninja(String nome, String familia) {
        this.nome = nome;
        this.familia = familia;
    }
    
    public String getFamilia() {
        return this.familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String apresentacao(){
        return "Olá! Sou o " + nome + " da família " + familia;
    }


}
