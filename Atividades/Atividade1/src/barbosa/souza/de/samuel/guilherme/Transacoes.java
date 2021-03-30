/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 
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
    
    public static String gerarQrCode(Conta destinatario, double valor) {
        // "id da conta do destinatorio; nome de usuario do destinatario; valor; getRandomNumberInRange(1000, 9999)"
        String qrcode = (destinatario.getIdConta() + ";") + (destinatario.getUsuario().getNome() + ";") + (valor + ";") + (getRandomNumberInRange(1000, 9000) + "");

        return qrcode;
    }

}
