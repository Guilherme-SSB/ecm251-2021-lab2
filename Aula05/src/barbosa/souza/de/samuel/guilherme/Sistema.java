package barbosa.souza.de.samuel.guilherme;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

    public Sistema() {
        this.executarSistema = true;
        this.scanner = new Scanner(System.in); // Cria um scanner para o teclado (entrada padrão)
        this.conta = new Conta("Luigi",1235, 1000);
    }

    public void executar() {
        int opcao;
        while (executarSistema) {
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }
    

    private void avaliarOpcao(int opcao) { //TODO limpar tela a cada case
        switch(opcao) {
            default:
                System.out.println("Opção ainda não implementada!");
                break;

            case 0: 
                System.out.println("Obrigado por utilizar o sistema!");
                this.executarSistema = false;
                break;
            
            case 1:
                System.out.println("Saldo: R$" + this.conta.getSaldo());
                break;

            case 2: 
                System.out.println("Informe um valor para depositar: ");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Operação realizada com sucesso!");
                break;
            
            
        }
    }

    private void exibirMenu() {
        System.out.println("Bem vindo ao MauaBank!");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Transferir dinheiro");
        System.out.println("5 - Pagar conta (título) ");
        System.out.println("0 - Encerrar Sistema");
    }
}