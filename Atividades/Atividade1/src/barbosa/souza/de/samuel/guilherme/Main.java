/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0
 * 
 */

package barbosa.souza.de.samuel.guilherme;


public class Main {
    public static void main(String[] args) {


        // Criar usuários de teste
        Usuario user1 = new Usuario("All Might", "123", "allmight@maua.br");
        Usuario user2 = new Usuario("One For All", "456", "oneforall@maua.br");
        Usuario user3 = new Usuario("Bakugo", "789", "bakugo@maua.br");

        // Criar contas - Cada usuário tem uma conta
        Conta contaUser1 = new Conta(user1, 1111, 1000.0);
        Conta contaUser2 = new Conta(user2, 2222, 250.0);
        Conta contaUser3 = new Conta(user3, 3333, 3000.0);
        

        // Operações
        

        // Estado inicial
        System.out.println("Estado inicial:");
        System.out.println("Nome Usuário: " + contaUser1.getUsuario().getNome() + " - Saldo: " + contaUser1.getSaldo());
        System.out.println("Nome Usuário: " + contaUser2.getUsuario().getNome() + " - Saldo: " + contaUser2.getSaldo());
        System.out.println("Nome Usuário: " + contaUser3.getUsuario().getNome() + " - Saldo: " + contaUser3.getSaldo());


        // Estado final
        System.out.println("Estado Final:");
        System.out.println("Nome Usuário: " + contaUser1.getUsuario().getNome() + " - Saldo: " + contaUser1.getSaldo());
        System.out.println("Nome Usuário: " + contaUser2.getUsuario().getNome() + " - Saldo: " + contaUser2.getSaldo());
        System.out.println("Nome Usuário: " + contaUser3.getUsuario().getNome() + " - Saldo: " + contaUser3.getSaldo());
    }
}
