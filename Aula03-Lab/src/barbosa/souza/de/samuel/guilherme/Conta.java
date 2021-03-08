package barbosa.souza.de.samuel.guilherme;

public class Conta {
    // Atributos da classe
    Cliente cliente; // Composição
    double saldo;
    int numero;


    // Métodos da classe
    void depositar(double valor) {
        this.saldo += valor; // Sempre que voce vai falar de um atributo, utilizar this.
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferirDinheiro(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } 
        return false;
    }

    void visualizarSaldo(String conta) {
        System.out.println("Saldo atual da conta " + conta + ": R$" + this.saldo);
    }

    @Override  // _str__() do python
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }

}