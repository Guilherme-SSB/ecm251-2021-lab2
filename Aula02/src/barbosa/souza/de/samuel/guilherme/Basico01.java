package barbosa.souza.de.samuel.guilherme;

public class Basico01 {
    // Tipos primitivos
    public static void main(String[] args) {
        int hp;
        boolean megaEvolui;
        float atk;
        double satk; // Float por padrão é double
        String nome;

        // Atribuições
        hp = 100;
        megaEvolui = true;
        atk = 50.0f;
        satk = 55.0;
        nome = "Gengar";


        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + hp);
        System.out.println("Mega Evolui? " + megaEvolui);
        System.out.println("Atk: " + atk + "\tAtk Especial: " + satk);
        
    }
}

// Para dobrar uma linha no vscode: shift + alt + seta