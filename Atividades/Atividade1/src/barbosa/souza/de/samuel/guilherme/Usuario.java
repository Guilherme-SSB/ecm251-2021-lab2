/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gugacon@hotmail.com>
 * 
 */

package barbosa.souza.de.samuel.guilherme;


public class Usuario {
    // Atributos
    private String nome;
    private String senha;
    private String email;
    private Conta conta;
    

    // Construtor
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getEmail() {
        return this.email;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void gerarRequisicao(double valor) {
        //1;All Might;250.0;9665
        String qrCodeUser1 = Transacoes.getQRCode(this.conta.getIdConta(), this.nome, valor);
        System.out.println(qrCodeUser1);
        

    }

    public void abrirConta(double saldo) {
        this.conta = new Conta(saldo);
    }

    // Métodos    
    public String getInformacoes() {
        // return String.format("Nome Usuário: %s - Saldo: %s", this.nome, this.conta.getSaldo()); // PROBLEMA!!! this.conta.getSaldo()
        return String.format("Nome Usuário: %s - Saldo: ", this.nome);
    }   
}
