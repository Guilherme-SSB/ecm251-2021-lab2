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

    public String gerarRequisicao(double valor) {                   // Esse é o método que o usuário irá chamar para gerar a requisição com um determinado valor
        this.conta.gerarQRCode(this.nome, valor);                   // "Marcar" na conta o usuario que fez a requisição a string do QRCode
        String qrCodeUser = Transacoes.pegarQRcode(this.conta.getIdConta(), this.nome, valor);
        return qrCodeUser;                                          // Retorna a string do QRCode que foi gerada pela requisição
    }


    public void pagarUsuario(Usuario user) {                        // Esse é o método que o usuário irá chamar para pagar a requisição feita por outro usuário
        String[] dados = user.conta.getQrCode().split(";");         // A string `dados` contém o QRCode que foi "marcado" na conta do usuário
        double valorDaConta = Double.parseDouble(dados[2]);         // Processamento da string `dados` a fim de obter apenas o valor a ser pago

        if (Transacoes.pagarRequisicao(this, user, valorDaConta)){
            System.out.println("Transação realizada com sucesso!");

        } else {
            System.out.println("Saldo insuficiente! Transação foi cancelada.");
        }
    }

    public void abrirConta(double saldo) {
        this.conta = new Conta(saldo);
    }

    @Override                                                      // Retorna uma String formada com informações da Usuario
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", senha='" + getSenha() + "'" +
            ", email='" + getEmail() + "'" +
            ", conta='" + getConta() + "'" +
            "}";
    }

}
