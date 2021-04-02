/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gugacon@hotmail.com>
 * 
 */
package barbosa.souza.de.samuel.guilherme;

import java.util.Random;

public class Transacoes {  

    // Métodos
    private static int getRandomNumberInRange(int min, int max) {                       // Método utilizado para gerar um número inteiro aleatório
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
        
    public static String pegarQRcode(int idConta, String nome, double valor) {          // Método utiizado pelo gerar a string do QRCode
        String qrCode = (idConta + ";" + nome + ";" + valor + ";" + getRandomNumberInRange(1000, 9999));
        return qrCode;
    }


    public static boolean pagarRequisicao(Usuario pagador, Usuario recebedor, double valor) {   // Método utilizado pelo pagarUsuario para realizar a 
                                                                                                //transação entre duas contas
        if (pagador.getConta().getSaldo() >= valor) {
            Conta.pagar(pagador.getConta(), valor);
            Conta.receber(recebedor.getConta(), valor);
            return true;
        } 
        return false;
    }

    // Transacoes não possui um método toString() pois não possui atributos
}
