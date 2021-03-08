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
        c1 = new Conta(); // Construtor da classe

        // Pede para a conta exibir o saldo
        //c1.visualizarSaldo("c1");

        // Modificar o saldo
        //c1.saldo = 100;
        //c1.visualizarSaldo("c1");

        // Cria um novo objeto do tipo Conta
        Conta c2 = new Conta();
        c2.saldo = 123.0;

        c1.depositar(400);
        c2.depositar(100);
        
        /*
        c1.visualizarSaldo("c1");
        c2.visualizarSaldo("c2");
        
        if(c1.sacar(4000)) {
            System.out.println("Hoje tem Playstation!!");
        } else {
            System.out.println("Deu ruim!");
        }
        c1.visualizarSaldo("c1");
        */
        //c1.visualizarSaldo("c1");
        //c2.visualizarSaldo("c2");

        if(c1.transferirDinheiro(c2, 250)) {
            System.out.println("Transferencia realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();

        //c1.visualizarSaldo("c1");
        //c2.visualizarSaldo("c2");

        System.out.println("C1: " + c1.toString());

    }
}