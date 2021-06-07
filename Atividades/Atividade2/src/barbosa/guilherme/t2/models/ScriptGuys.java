package barbosa.guilherme.t2.models;

import barbosa.guilherme.t2.enums.Funcoes;
import barbosa.guilherme.t2.enums.Horarios;

public class ScriptGuys extends Membro {

    /**
     * Contrutor da super classe
     * @param email
     * @param nome
     * @param funcao
     */
    public ScriptGuys(String email, String nome, Funcoes funcao) {
		super(email, nome, funcao);
	}

    /**
     * Implementação do método Mensagem para a classe
     * dos Scripy Guys
     */
	@Override
    public void Mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("Prazer em ajudar novos amigos de código!");
                break;
            case EXTRA:
                System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
        }
    }

    /**
     * Implementação do método Apresentar para a classe 
     * dos Scripy Guys
     */
    @Override
    public void Apresentar() {
        System.out.println(toString());
    }    
}
