/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0
 * 
 */

package barbosa.souza.de.samuel.guilherme;

public class Conta {


    // Atributos
    private Usuario usuario;
    private int idConta;
    private double saldo;

    // Construtor
    public Conta(Usuario usuario, int idConta, double saldo) {
        this.usuario = usuario;
        this.idConta = idConta;
        this.saldo = saldo;
    }
    

    // Getters    
    public Usuario getUsuario() {
        return this.usuario;
    }

    public int getIdConta() {
        return this.idConta;
    }

    public double getSaldo() {
        return this.saldo;
    }


    // Métodos
    public boolean pagarRequisicao(String qrCode) { //TODO
        // qrCode será do tipo "5;PERIGO;1;1234"
        // 1. Separar String qrCode a cada ';'
        // 2. 

        return false;
    }
    

    @Override
    public String toString() {
        return "{" +
            " usuario='" + getUsuario() + "'" +
            ", idConta='" + getIdConta() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }


}
