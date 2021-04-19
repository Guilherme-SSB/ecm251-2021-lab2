package barbosa.souza.de.samuel.guilherme;

public class Pedra extends Jogada{
    @Override
    public Resultado verificaResultado(Jogada jogada) {
        if (jogada instanceof Tesoura) {
            return Resultado.GANHEI;
        } else if (jogada instanceof Papel) {
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }
}
