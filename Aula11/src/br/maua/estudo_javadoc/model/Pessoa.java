package br.maua.estudo_javadoc.model;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    /**
     * Método construtor da classe Pessoa que inicializa seus parâmetros. 
     * @param nome Nome atribuído a instância de pessoa.
     * @param cpf Cpf atribuído a instância de pessoa, sempre deve existir.
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método construtor alternativo para classe <strong>Pessoa</strong>. Inicializa o atributo 
     * nome com uma String vazia.
     * @param cpf Cpf atribuído a instância de pessoa, sempre deve existir.
     */
    public Pessoa(String cpf) {
        this.nome = "";
        this.cpf = cpf;
    }
    
    /**
     * Getter do valor do nome da instância de Pessoa.
     * @return O valor do atributo nome.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter do valor do cpf da instância de Pessoa.
     * @return O valor do atributo cpf.
     */
    public String getCpf() {
        return this.cpf;
    }
    
}
