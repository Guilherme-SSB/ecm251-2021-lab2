package br.maua.estudo_exececao;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
            
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("OPA! Fora do limite do vetor!");
        }
        
        System.out.println("Fim do metodo2");
    }
}
