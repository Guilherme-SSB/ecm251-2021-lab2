package barbosa.souza.de.samuel.guilherme;

public class Conta {
    //Atributos
    private Cliente cliente;
    private int numero;
    private double saldo;
    
    // Construtor
    public Conta(String cliente, int numero, double saldo) {
        this.cliente = new Cliente(cliente);
        this.numero = numero;
        this.saldo = saldo;
    }
    

    //Métodos
    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if( this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean transferirDinheiro(Conta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}