package barbosa.guilherme.t2.models;

import barbosa.guilherme.t2.enums.Funcoes;
import barbosa.guilherme.t2.enums.Horarios;

public class HeavyLifters extends Membro {

    /**
     * Contrutor da super classe
     * @param email
     * @param nome
     * @param funcao
     */
	public HeavyLifters(String email, String nome, Funcoes funcao) {
        super(email, nome, funcao);
    }

    /**
     * Implementação do método Mensagem para a classe
     * dos Heavy Lifters
     */
    @Override
	public void Mensagem(Horarios horario) {
		switch (horario) {
            default:
                break;
            case NORMAL:
                System.out.println("Podem contar conosco!");
                break;
            case EXTRA:
                System.out.println("N00b_qu3_n_Se_r3pita.bat");
                break;
        }
	}

    /**
     * Implementação do método Apresentar para a classe 
     * dos Heavy Lifters
     */
	@Override
	public void Apresentar() {
		System.out.println(toString());		
	}
}
