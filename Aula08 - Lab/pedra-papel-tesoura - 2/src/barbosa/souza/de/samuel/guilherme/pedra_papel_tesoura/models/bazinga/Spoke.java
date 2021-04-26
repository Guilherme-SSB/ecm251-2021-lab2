package barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga;

import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.Jogada;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Papel;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Pedra;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[] {new Tesoura(), new Pedra()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Papel(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Spoke";
    }

}
