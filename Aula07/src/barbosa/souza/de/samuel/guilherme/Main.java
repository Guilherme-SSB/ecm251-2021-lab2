package barbosa.souza.de.samuel.guilherme;

public class Main {
    public static void main(String[] args) {
        
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        System.out.println(ninja.apresentacao());

        Genin genin = new Genin("Sakura", "Haruno", "Atrapalhar o rolê");
        System.out.println(genin.apresentacao());
        System.out.println("Missão: " + genin.getMissao());

    }
}
