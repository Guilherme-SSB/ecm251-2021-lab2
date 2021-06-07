package barbosa.guilherme.t2.models;

import barbosa.guilherme.t2.enums.Funcoes;
import barbosa.guilherme.t2.interfaces.Apresentacao;
import barbosa.guilherme.t2.interfaces.PostarMensagem;

public abstract class Membro implements PostarMensagem, Apresentacao{
    
    /**
     * Atributos da classe
     */
    private String email;
    private String nome;
    private Funcoes funcao;

    /**
     * Construtor dos atributos da classe Membro
     * @param email
     * @param nome
     * @param funcao
     */
    public Membro(String email, String nome, Funcoes funcao) {
        this.email = email;
        this.nome = nome;
        this.funcao = funcao;
    }

    /**
     * Getter do email do membro
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter do email do membro
     * @param email
     * @return String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter do nome do membro
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter do nome do membro
     * @param nome
     * @return String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter do funcao do membro
     * @return Funcoes
     */
    public Funcoes getFuncao() {
        return funcao;
    }

    /**
     * Setter da funcao do membro
     * @param funcao
     * @return Funcoes
     */
    public void setFuncao(Funcoes funcao) {
        this.funcao = funcao;
    }

    /**
     * Printa os atributos do membro
     * @return String
     */
    @Override
    public String toString() {
        return "Membro [email=" + email + ", funcao=" + funcao + ", nome=" + nome + "]";
    }
}
