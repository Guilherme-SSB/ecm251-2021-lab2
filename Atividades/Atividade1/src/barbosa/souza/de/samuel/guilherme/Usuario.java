/**
 * 
 *  @author Guilherme Samuel de Souza Barbosa 19.00012-0 <gui.samuel10@gmail.com>
 *  @author Gustavo Consoleti Ramirez de Souza 19.00715-9 <gustavoconsoleti@gmail.com>
 * 
 */

package barbosa.souza.de.samuel.guilherme;


public class Usuario {
    // Atributos
    private String nome;
    private String senha;
    private String email;


    // Construtor
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getEmail() {
        return this.email;
    }


    // Métodos
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", senha='" + getSenha() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
}
