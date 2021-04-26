package barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico;

import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.Jogada;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga.Lagarto;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga.Spoke;

public class Tesoura extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Spoke);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}






