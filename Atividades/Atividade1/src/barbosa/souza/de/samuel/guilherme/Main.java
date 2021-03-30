/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gustavoconsoleti@gmail.com>
 * 
 */

package barbosa.souza.de.samuel.guilherme;


public class Main {
    public static void main(String[] args) {


        // Criar usuários de teste
        Usuario user1 = new Usuario("All Might", "123", "allmight@maua.br");
        Usuario user2 = new Usuario("One For All", "456", "oneforall@maua.br");
        Usuario user3 = new Usuario("Bakugo", "789", "bakugo@maua.br");

        
        // Criar conta para cada usuário
        Conta contaUser1 = new Conta(user1, 1, 1000.0);
        Conta contaUser2 = new Conta(user2, 2, 250.0);
        Conta contaUser3 = new Conta(user3, 3, 3000.0);
        
        
        // Estado Inicial
        System.out.println("\n\n\nEstado Inicial: ");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + contaUser1.getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + contaUser2.getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + contaUser3.getSaldo());

        // Operações de teste

        // Estado Final
        System.out.println("\n\n\nEstado Final: ");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + contaUser1.getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + contaUser2.getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + contaUser3.getSaldo());
       
    }
}
