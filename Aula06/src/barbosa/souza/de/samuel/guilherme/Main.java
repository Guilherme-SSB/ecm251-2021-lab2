package barbosa.souza.de.samuel.guilherme;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }

        String cpf = "509.630.298-94";
        System.out.println("CPF valido: " + ValidadorCPF.validarCpf(cpf));
    }
}
