/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gugacon@hotmail.com>
 * 
 */

package barbosa.souza.de.samuel.guilherme;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Atributos
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();

        String nome;
        String senha;
        String email;

        // Criar usuários de teste
        // Usuario user1 = new Usuario("All Might", "123", "allmight@maua.br");
        // Usuario user2 = new Usuario("One For All", "456", "oneforall@maua.br");
        // Usuario user3 = new Usuario("Bakugo", "789", "bakugo@maua.br");

        
        // Criar conta para cada usuário
        // Conta contaUser1 = new Conta(user1, 1, 1000.0);
        // Conta contaUser2 = new Conta(user2, 2, 250.0);
        // Conta contaUser3 = new Conta(user3, 3, 3000.0);
        

        // Cadastro e abertura de conta do usuário 1
        System.out.println("Informe o nome do usuário 1:");
        nome = scanner.nextLine();

        System.out.println("Informe a senha do usuário 1:");
        senha = scanner.nextLine();

        System.out.println("Informe o email do usuário 1:");
        email = scanner.nextLine();

        Usuario user1 = new Usuario(nome, senha, email);
        listaDeUsuarios.add(user1);
        Conta contaUser1 = new Conta(user1, 1000.0);
    

        // Cadastro e abertura de conta do usuário 2
        System.out.println("\n\nInforme o nome do usuário 2:");
        nome = scanner.nextLine();

        System.out.println("Informe a senha do usuário 2:");
        senha = scanner.nextLine();

        System.out.println("Informe o email do usuário 2:");
        email = scanner.nextLine();

        Usuario user2 = new Usuario(nome, senha, email);
        listaDeUsuarios.add(user2);
        Conta contaUser2 = new Conta(user2, 250.0);
        

        // Cadastro e abertura de conta do usuário 3
        System.out.println("\n\nInforme o nome do usuário 3:");
        nome = scanner.nextLine();

        System.out.println("Informe a senha do usuário 3:");
        senha = scanner.nextLine();

        System.out.println("Informe o email do usuário 3:");
        email = scanner.nextLine();

        Usuario user3 = new Usuario(nome, senha, email);
        listaDeUsuarios.add(user3);
        Conta contaUser3 = new Conta(user3, 3000.0);
        
        exibirEstados(listaDeUsuarios);
        
        // Estado Inicial
        // System.out.println("\n\n\nEstado Inicial: ");
        // System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + contaUser1.getSaldo());
        // System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + contaUser2.getSaldo());
        // System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + contaUser3.getSaldo());


        // Operações de teste
            // Usuário 1 gera uma operação de recebimento de 250;
            //String qrCodeUser1 = Transacoes.gerarQrCode(contaUser1, 250);
            // Usuário 2 paga a requisição do usuário 1;
            // Transacoes.pagarRequisicao();


        // Estado Final
        // System.out.println("\nEstado Final: ");
        // System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + contaUser1.getSaldo());
        // System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + contaUser2.getSaldo());
        // System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + contaUser3.getSaldo());

        scanner.close();
       
    }

    public static void exibirEstados(ArrayList<Usuario> usuarios){
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getInformacoes()); 
        }
    }

}
