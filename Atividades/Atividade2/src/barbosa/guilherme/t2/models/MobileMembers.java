package barbosa.guilherme.t2.models;

import barbosa.guilherme.t2.enums.Funcoes;
import barbosa.guilherme.t2.enums.Horarios;

public class MobileMembers extends Membro {

    /**
     * Contrutor da super classe
     * @param email
     * @param nome
     * @param funcao
     */
    public MobileMembers(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
    }

    /**
     * Implementação do método Mensagem para a classe
     * dos Mobile Members
     */
    @Override
    public void Mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("Happy Coding!");
                break;
            case EXTRA:
                System.out.println("Happy_C0d1ng. Maskers");
                break;
        }        
    }

    /**
     * Implementação do método Apresentar para a classe 
     * dos Mobile Members
     */
    @Override
    public void Apresentar() {
        System.out.println(toString());        
    }    
}
