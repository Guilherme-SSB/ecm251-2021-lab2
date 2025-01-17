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
            
            case 3:
                System.out.println("Informe o valor para sacar");
                double valorParaSacar = scanner.nextDouble();
                if (this.conta.sacar(valorParaSacar)) {
                    System.out.println("Operação realizada com sucesso!");
                } else {
                    System.out.println("Algo de errado aconteceu: Saldo!");
                }
                break;

            case 5:
                System.out.println("Nome do título a pagar: ");
                String nomeTitulo = scanner.next();

                System.out.println("Valor do título: ");
                double valorTitulo = scanner.nextDouble();
                
                System.out.println("Valor do juros por dia: ");
                double valorJurosPorDia = scanner.nextDouble();

                System.out.println("Informe a data de vencimento (aaaa-mm-dd): ");
                String dataVencimentoTitulo = scanner.next();

                Titulo titulo = new Titulo(valorTitulo, nomeTitulo, valorJurosPorDia, dataVencimentoTitulo);

                if (this.conta.sacar(titulo.getValorPagamento())) {
                    System.out.println("Operação realizada com sucesso!");
                } else {
                    System.out.println("Não foi possível realizar a operação!");
                }
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