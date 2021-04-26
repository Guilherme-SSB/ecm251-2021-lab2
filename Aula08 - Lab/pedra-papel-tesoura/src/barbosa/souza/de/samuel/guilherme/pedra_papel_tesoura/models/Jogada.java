package barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.models;

import barbosa.souza.de.samuel.guilherme.pedra_papel_tesoura.enumeracoes.Resultado;

public abstract class Jogada {        // Classe abstrata não permite ser instânciada
    final public Resultado verificaResultado(Jogada jogada) {        // final: não pode ser sobrescrito
        if (verificaSeGanhei(jogada)) {
            return Resultado.GANHEI;
        }
        if (verificaSePerdi(jogada)) {
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }

    public abstract boolean verificaSeGanhei(Jogada jogada);
    
    public abstract boolean verificaSePerdi(Jogada jogada);
}