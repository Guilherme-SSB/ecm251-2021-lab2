package barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.classico;

import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.Jogada;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga.Lagarto;
import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models.bazinga.Spoke;

public class Papel extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[] {new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Tesoura(), new Lagarto()};
    }  

    @Override
    public String toString() {
        return "Papel";
    }
}
