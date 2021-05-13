package br.maua.estudo_exececao;

public class TesteExececaoString {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
        novaFrase = frase.toUpperCase(); 
        }
        catch (NullPointerException exception) {
            System.out.println("Uma execeção aconteceu: " + exception.getMessage());
            frase = "";
            novaFrase = "";
        }
        System.out.println("Frase Antiga:" + frase);
        System.out.println("Frase Nova:" + novaFrase);
    }
}
