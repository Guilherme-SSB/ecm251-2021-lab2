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


    // Construtor
    public Conta(double saldo) {
        numContas += 1;
        this.idConta = numContas;
        this.saldo = saldo;
    }

    public int getIdConta() {
        return this.idConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    
    // Métodos
    public static void receber(Conta conta, double valor) {
        conta.saldo += valor;
    }

    public static void pagar(Conta conta, double valor) {
        conta.saldo -= valor;
    }

    public String getInformacoes() {
        return String.format("Conta: {idConta: %s, saldo: %s}", this.idConta, this.saldo);
    }    
}
