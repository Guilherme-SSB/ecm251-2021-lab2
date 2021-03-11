package barbosa.souza.de.samuel.guilherme;

public class Conta {
    // Atributos da classe
    private Cliente cliente; // Composição
    private double saldo;
    private int numero;

    // Getters e Setters
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public double getSaldo() {
        return this.saldo;
    }


    // Construtor da classe
    public Conta(String nomeCliente, double saldoInicial) {
        this.saldo = saldoInicial;
        this.cliente = new Cliente();
        
    }

    // Métodos da classe
    public void depositar(double valor) {
        this.saldo += valor; // Sempre que voce vai falar de um atributo, utilizar this.
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } 
        return false;
    }

    public void visualizarSaldo(String conta) {
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