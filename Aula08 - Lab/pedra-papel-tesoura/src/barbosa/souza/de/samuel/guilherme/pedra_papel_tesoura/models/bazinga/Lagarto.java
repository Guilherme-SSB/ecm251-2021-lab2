package barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga;

import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.Jogada;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Papel;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Pedra;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada{
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Spoke);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
