package barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga;

import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.Jogada;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Papel;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Pedra;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Pedra);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }

}
