package barbosa.souza.de.samuel.guilherme;


public class Main {
    public static void main(String[] args) throws Exception {
        
        // Pessoa pessoa = new Pessoa("Deku", "1234");
        // System.out.println(pessoa);

        //Exemplo de sobrecarga
        System.out.println("\n\n\n------------Sobrecarga--------------------");


        Estudante estudante1 = new Estudante("Guilherme", "11", "01");
        Estudante estudante2 = new Estudante("Gustavo", "22");

        System.out.println(estudante1);
        System.out.println(estudante2);


        //Exemplo de sobreposição
        System.out.println("\n------------Sobreposição----------------------");

        Pessoa pessoa1 = new Estudante("Shinji", "33", "03");
        Estudante estudante3 = new Estudante("Kaoru", "44", "04");
        Object estudante4 = new Estudante("Han Solo", "00", "00");

        System.out.println("Estudante como Pessoa: " + pessoa1);
        System.out.println("Estudante como Estudante: " + estudante3);
        System.out.println("Estudante como Object: " + estudante4);


        //IMPORTANTE
        System.out.println("\n------------Cuidado com a Herança:------------");

        System.out.println("Olá de Estudante como Pessoa: " + pessoa1.Ola());
        
        System.out.println("Olá de Estudante como Estudante: " + estudante3.Ola()); // Estudante é uma pessoa, então os métodos da pessoa funcionam no estudante
        
        // System.out.println("Olá de Estudante como Object: " + estudante4.Ola()); Não compila pois a classe pai não acessa a classe filha
        System.out.println("Olá de Estudante como Object: " + ((Estudante)estudante4).Ola()); // Cast, porém é perigoso!

        // Estudante estudante5 = new Pessoa("Murilo", "123"); Type mismatch: cannot convert from Pessoa to Estudante


        System.out.println("\n------------getClass():-----------------------");

        System.out.println("Estudante como Pessoa: " + pessoa1.getClass());
        System.out.println("Estudante como Estudante: " + estudante3.getClass());
        System.out.println("Estudante como Object: " + estudante4.getClass());
        // Os três são Estudante


    }
}

