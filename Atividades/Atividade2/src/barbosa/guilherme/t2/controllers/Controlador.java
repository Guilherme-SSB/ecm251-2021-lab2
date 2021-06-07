package barbosa.guilherme.t2.controllers;

import java.util.ArrayList;

import barbosa.guilherme.t2.enums.Horarios;
import barbosa.guilherme.t2.models.Membro;

public class Controlador {
    
    /**
     * Atributos da classe
     */
    private ArrayList<Membro> listaMembros = new ArrayList<Membro>();
    private Horarios horarioTrabalho;

    /**
     * Contrutor da classe Controlador
     * @param horarioTrabalho
     */
    public Controlador(Horarios horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    /**
     * Getter para a lista de membros
     * @return
     */
    public ArrayList<Membro> getListaMembros() {
        return listaMembros;
    }

    /**
     * Getter para os horários de trabalho
     * @return
     */
    public Horarios getHorariosTrabalho() {
        return horarioTrabalho;
    }

    /**
     * Método que cadastra um novo membro no sistema
     * @param membro
     */
    public void cadastrarNovoMembro(Membro membro) {
        this.listaMembros.add(membro);
    }

    /**
     * Método que removo um membro informado
     * @param membro
     */
    public void excluirMembro(Membro membro) {
        this.listaMembros.remove(membro);
    }

    /**
     * Método que troca a carga horária de trabalho do Mask Society
     */
    public void trocarHorarioTrabalho() {
        //TODO
    }
    
    /**
     * Os filhos de membros podem chamar esse método para exibir suas informações
     */
    public void Apresentar() {
        for (Membro membro : listaMembros) {
            membro.Apresentar();
        }
    }
        
    /**
     * Os filhos de membro podem chamar esse método para exibir se o sistema 
     * está em horário de trabalho normal ou extra
     */
    public void PostarMensagem() {
        for (Membro membro : listaMembros) {
            membro.Mensagem(this.horarioTrabalho);
        }
    }

}
