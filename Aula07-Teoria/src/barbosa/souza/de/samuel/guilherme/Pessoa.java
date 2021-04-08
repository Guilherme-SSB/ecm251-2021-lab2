package barbosa.souza.de.samuel.guilherme;

public class Pessoa {

    private final String nome;
    private final String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String Ola() {
        return "Olá! Eu sou " + this.nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
            " nome='" + nome + "'" +
            ", cpf='" + cpf + "'" +
            "}";
    }

}
