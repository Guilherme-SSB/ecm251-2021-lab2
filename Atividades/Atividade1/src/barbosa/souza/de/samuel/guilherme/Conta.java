/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gugacon@hotmail.com>
 * 
 */

package barbosa.souza.de.samuel.guilherme;

public class Conta {
    // Atributos
    private int idConta;
    private double saldo;
    private static int numContas = 0;
    private String qrCode;


    // Construtor
    public Conta(double saldo) {
        numContas += 1;             // `numContas` é um atributo estático que recebe +1 cada vez que uma nova conta for criada
        this.idConta = numContas;   // o id de cada conta será igual ao "número de criação" da conta
        this.saldo = saldo;
    }

    public int getIdConta() {
        return this.idConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getQrCode() {
        return this.qrCode;
    }
    

    public void gerarQRCode(String nome, double valor) {
        this.qrCode = Transacoes.pegarQRcode(this.idConta, nome, valor);    // Esse método é utilizado para realizar a "marcação" do QRCode na conta do usuário
    }
    
    
    // Métodos
    public static void receber(Conta conta, double valor) {                 // Será utilizado pelo Transacoes.pagarRequisicao, soma o 
        conta.saldo += valor;                                               //valor da conta no saldo de quem criou a requisição
    }

    public static void pagar(Conta conta, double valor) {                   // Será utilizado pelo Transacoes.pagarRequisicao, subtrai o 
        conta.saldo -= valor;                                               //valor da conta do saldo de quem pagou a requisição
    }

    @Override                                                              // Retorna uma String formada com informações da conta
    public String toString() {
        return "{" +
            " idConta='" + getIdConta() + "'" +
            ", saldo='" + getSaldo() + "'" +
            ", qrCode='" + getQrCode() + "'" +
            "}";
    }   
}
