package barbosa.guilherme.t2.models;

import barbosa.guilherme.t2.enums.Funcoes;
import barbosa.guilherme.t2.enums.Horarios;

public class BigBrothers extends Membro {

    /**
     * Contrutor da super classe
     * @param email
     * @param nome
     * @param funcao
     */
    public BigBrothers(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
    }

    /**
     * Implementação do método Mensagem para a classe
     * dos Big Brothers
     */
    @Override
    public void Mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                break;
            case EXTRA:
                System.out.println("...");
                break;
        }
    }

    /**
     * Implementação do método Apresentar para a classe 
     * dos Big Brothers
     */
    @Override
    public void Apresentar() {
        System.out.println(toString());
    }    
}
