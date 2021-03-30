/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0
 * 
 */

package barbosa.souza.de.samuel.guilherme;

import java.beans.DesignMode;
import java.util.Random;

public class Transacoes {


    // Métodos
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    public static String gerarQrCode(Conta destinatario, double valor) { // TODO
        // "id da conta do destinatorio; nome de usuario do destinatario; valor; getRandomNumberInRange(1000, 9999)"
        // "5;PERIGO;1;1234"

        String qrcode = (destinatario.getIdConta() + ";") + (destinatario.getUsuario().getNome() + ";") + (valor + ";") + (getRandomNumberInRange(1000, 9000) + "");

        return qrcode;
    }

}
