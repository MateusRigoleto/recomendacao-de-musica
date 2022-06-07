
package DAO;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DAOUsuario{
   
    
    
    public static Usuario obterUsuario(String email, String senha) throws Exception {
        String sql = "SELECT * FROM tb_usuarios WHERE email = ? AND senha = ?";
        try(Connection c = ConexaoDB.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2,senha);
            try(ResultSet rs = ps.executeQuery()){
              if(rs.next()){
                  Usuario usuario = Usuario.getInstance();
                  usuario.setCodigoUsuario(Integer.parseInt(rs.getString("codigo")));
                  usuario.setEmailUsuario(rs.getString("email"));
                  usuario.setNomeUsuario(rs.getString("nome"));
                  usuario.setSenhaUsuario(rs.getString("senha"));
                  return usuario;
              }
            }
            return null;
        }
    }
    
    
    public static boolean existe() throws Exception {
        String sql = "SELECT * FROM tb_usuarios WHERE email = ? AND senha = ?";
        try(Connection c = ConexaoDB.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, Usuario.getInstance().getEmailUsuario());
            ps.setString(2, Usuario.getInstance().getSenhaUsuario());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next(); 
            }
            
        }
    }

    public static boolean Inserir(Usuario usuario)throws Exception{
        String sql = "INSERT INTO tb_usuarios (nome,email,senha) VALUES (?, ?, ?);";
        try(Connection c = ConexaoDB.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario.getNomeUsuario());
            ps.setString(2, usuario.getEmailUsuario());
            ps.setString(3, usuario.getSenhaUsuario());
            ps.execute();
            return true;
            
        }
    }}
    
