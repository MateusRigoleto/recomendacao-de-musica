
package DAO;


import Model.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Model.Usuario;
import Telas.GenerosTela;
import javax.swing.JOptionPane;


public class DAOGeneros {
    public static List <Genero> obterGeneros () throws Exception{
        String sql = "SELECT codigo, genero \n" +
        "FROM tb_generos a	\n" +
        "WHERE codigo NOT IN (SELECT c.codigo\n" +
        "FROM tb_usuarios a\n" +
        "JOIN tb_usuario_genero b ON a.codigo = b.codigo_usuario\n" +
        "JOIN tb_generos c ON b.codigo_genero = c.codigo\n" +
        "WHERE a.codigo = ?)";
        List <Genero> generos = new ArrayList<>();
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,Usuario.getInstance().getCodigoUsuario());
             ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String genero = rs.getString("genero");
                generos.add(new Genero(genero));
            }
            return generos;
        }
    }
          public static List<Genero> obterGenerosPreferidos ()throws Exception{
        String sql = "SELECT c.genero \n FROM tb_usuarios a\n JOIN tb_usuario_genero b ON a.codigo = b.codigo_usuario\n JOIN tb_generos c ON b.codigo_genero = c.codigo\n WHERE a.codigo = ?";
        List <Genero> generosPreferidos = new ArrayList<>();
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Usuario.getInstance().getCodigoUsuario());
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String genero = rs.getString("genero");
                generosPreferidos.add(new Genero(genero));
            }
            return generosPreferidos;
            
        }
        
        
        }
          
       public static void adicionarFavorito (String genero) throws Exception{
       
       String sql = "SELECT codigo \n FROM tb_generos\n WHERE genero = ?";
        int codigo = 0;
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,genero);
            try {
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigo = rs.getInt("codigo");
            
            }
            catch(Exception e){
                e.printStackTrace();
            }
           
             }
            String sql2 = "INSERT INTO tb_usuario_genero (codigo_usuario, codigo_genero) VALUES (?, ?)";
            try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, Integer.toString(Usuario.getInstance().getCodigoUsuario()));
            ps.setString(2,Integer.toString(codigo));
            ps.execute();
            
            }
        }
       
       
       
       public static void removerFavorito (String genero) throws Exception{
       
       String sql = "SELECT codigo \n FROM tb_generos\n WHERE genero = ?";
        int codigo = 0;
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,genero);
            try {
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigo = rs.getInt("codigo");
            
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
             }
            String sql2 = "DELETE FROM tb_usuario_genero WHERE codigo_usuario = ? AND codigo_genero= ?";
            try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, Integer.toString(Usuario.getInstance().getCodigoUsuario()));
            ps.setString(2,Integer.toString(codigo));
            ps.execute();
            }
        }
}