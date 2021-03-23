package barbosa.souza.de.samuel.guilherme;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) System.out.println ();
        System.out.println("----------------------");
        System.out.println("Programa inicializado!");
        System.out.println("----------------------");
        for (int i = 0; i < 5; ++i) System.out.println ();

        // Cria um objeto do tipo Conta
        Conta c1;

        // Instancia um objeto Conta
        c1 = new Conta("Saitama", 999.99); // Construtor da classe

        //c1.depositar(300);
        //c1.sacar(250);
        //c1.saldo = 300; // isso é um problema e gera vulnerabilidade
        c1.visualizarSaldo("c1");

    }
}