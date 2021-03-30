/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0
 * 
 */

package barbosa.souza.de.samuel.guilherme;

import java.util.Random;

public class Transacoes {


    // Métodos
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    private static String gerarQrCode(Conta destinatario, double valor) {
        return "";

        // "id da conta do destinatorio; nome de usuario do destinatario; valor; getRandomNumberInRange(1000, 9999)"
        // "5;PERIGO;1;1234"
    }

}
