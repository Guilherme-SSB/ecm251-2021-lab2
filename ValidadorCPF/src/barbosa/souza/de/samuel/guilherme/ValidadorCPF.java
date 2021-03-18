package barbosa.souza.de.samuel.guilherme;

public class ValidadorCPF {

    private static final String[] invalidos_conhecidos = { // Vetor de Strings: String[] // final: garante que o valor não irá mudar
        "00000000000","11111111111", "22222222222",
        "33333333333", "44444444444", "55555555555",
        "66666666666", "77777777777", "88888888888", "99999999999"
    };

    private static final int[] multiplicadores_primeiro_digito = {
        10, 9, 8, 7, 6, 5, 4, 3, 2
    };

    private static final int[] multiplicadores_segundo_digito = {
        11, 10, 9, 8, 7, 6, 5, 4, 3, 2
    };

    private static final int TAMANHO_CPF = 11;

    public static boolean validarCpf(String cpf) {
        // Normaliza a string cpf
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        // Valida o tamanho do cpf
        if (cpf.length() != TAMANHO_CPF) {
            return false;
        }

        // Verifica se o cpf está dentro dos invalidos_conhecidos
        for (String cpf_invalido : invalidos_conhecidos) {
            if (cpf_invalido.equals(cpf)) {
                return false;
            }
        }    

        // Validação do primeiro e do segundo digito
        if (validarDigito(multiplicadores_primeiro_digito, cpf) && (validarDigito(multiplicadores_segundo_digito, cpf))) {
            return true;
        } else {
            return false;
        }

        
    }

    private static boolean validarDigito(int[] multiplicadores, String cpf) {
        int somatoria = 0;

        for (int i = 0; i < multiplicadores.length; i++) {
            somatoria += multiplicadores[i] * Integer.parseInt("" + cpf.charAt(i)); // Soma-se com uma String vazia para transformar em String
        }
        return ("" + ((somatoria*10)%11)%10).equals("" + cpf.charAt(multiplicadores.length));
    }
}
