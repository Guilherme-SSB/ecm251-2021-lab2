package barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga;

import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.Jogada;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Papel;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Pedra;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada{
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[] {new Spoke(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Pedra(), new Tesoura()};
    }

    @Override
    public String toString() {
        return "Lagarto";
    }

}
