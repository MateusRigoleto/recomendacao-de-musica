
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Usuario {
    private static Usuario instance;
    private int codigoUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    

    public static Usuario getInstance(){
    if(instance == null){
        instance = new Usuario();
        }
        return instance;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

}
