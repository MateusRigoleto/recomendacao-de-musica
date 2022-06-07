
package DAO;

import java.util.List;
import Model.Musica;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAOMusicas {
    public static List <Musica> obterMusicas()throws Exception{
        String sql = "SELECT musica \n" +
        "FROM tb_musicas a \n" +
        "WHERE codigo IN (SELECT codigo_musica \n" +
        "FROM tb_musica_genero\n" +
        "WHERE codigo_genero IN (SELECT c.codigo\n" +
        "FROM tb_usuarios a\n" +
        "JOIN tb_usuario_genero b ON a.codigo = b.codigo_usuario\n" +
        "JOIN tb_generos c ON b.codigo_genero = c.codigo\n" +
        "WHERE a.codigo = ?)) ";
        List <Musica> musicas = new ArrayList<>();
        try(Connection c = ConexaoDB.obterConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1,Integer.toString(Usuario.getInstance().getCodigoUsuario()));
        ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                String nome = rs.getString("musica");
                
                Musica musica = new Musica (nome);
                musicas.add(musica);
                
            }
            return musicas;
        }
    }
    
        
    
        public static boolean verificarAvaliacao(int codigo) throws Exception{
            String sql = "SELECT nota FROM tb_avaliacao WHERE codigo_usuario = ? AND codigo_musica = ? ";
          try(Connection c = ConexaoDB.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, Integer.toString(Usuario.getInstance().getCodigoUsuario()));
            ps.setString(2, Integer.toString(codigo));
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
            }
        }
    
    
    
        public static void adicionarNota (String musica, int nota) throws Exception{
       
       String sql = "SELECT codigo \n FROM tb_musicas\n WHERE musica = ?";
        int codigo = 0;
        
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,musica);
            try {
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigo = rs.getInt("codigo");
            
            }
            catch(Exception e){
                e.printStackTrace();
            }}
        
            if(verificarAvaliacao(codigo)){
            String sql2 = "UPDATE tb_avaliacao SET nota = ? WHERE codigo_usuario = ? AND codigo_musica = ? ";
            try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, Integer.toString(nota));
            ps.setString(2,Integer.toString(Usuario.getInstance().getCodigoUsuario()));
            ps.setString(3, Integer.toString(codigo));
            ps.execute();
            }
            }
            else{
            String sql2 = "INSERT INTO tb_avaliacao (codigo_usuario, codigo_musica, nota) VALUES (?, ?, ?)";
            try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, Integer.toString(Usuario.getInstance().getCodigoUsuario()));
            ps.setString(2,Integer.toString(codigo));
            ps.setString(3, Integer.toString(nota));
            ps.execute();   
            }
        }         
    }
        public static void removerNota (String musica) throws Exception{
       
       String sql = "SELECT codigo \n FROM tb_musicas\n WHERE musica = ?";
        int codigo = 0;
        
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,musica);
            try {
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigo = rs.getInt("codigo");
            
            
            }
            catch(Exception e){
                e.printStackTrace();
            }}
        
         String sql1 = "DELETE FROM tb_avaliacao WHERE codigo_usuario = ? AND codigo_musica = ?";
          try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setString(1, Integer.toString(Usuario.getInstance().getCodigoUsuario()));
            ps.setString(2,Integer.toString(codigo));
            ps.execute();
            }
        }
        
        
        public static List <Musica> obterRecomendacoes()throws Exception{
        String sql = "SELECT musica, mediaAvaliacao\n" +
        "FROM tb_musicas a \n" +
        "WHERE codigo IN (SELECT codigo_musica \n" +
        "FROM tb_musica_genero\n" +
        "WHERE codigo_genero IN (SELECT c.codigo\n" +
        "FROM tb_usuarios a\n" +
        "JOIN tb_usuario_genero b ON a.codigo = b.codigo_usuario\n" +
        "JOIN tb_generos c ON b.codigo_genero = c.codigo\n" +
        "WHERE a.codigo = ?)) ORDER BY mediaAvaliacao DESC";
        List <Musica> musicas = new ArrayList<>();
        try(Connection c = ConexaoDB.obterConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1,Integer.toString(Usuario.getInstance().getCodigoUsuario()));
        ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                String nome = rs.getString("musica");
                double media = rs.getDouble("mediaAvaliacao");
                
                Musica musica = new Musica (nome, media);
                musicas.add(musica);
                
            }
            return musicas;
        }}

    
        
    public static int getNota(String musica) throws SQLException{
        String sql = "SELECT codigo \n FROM tb_musicas\n WHERE musica = ?";
        int codigo = 0;
        
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,musica);
            try {
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigo = rs.getInt("codigo");
            
            }
            catch(Exception e){
                e.printStackTrace();
            }}
        
        String sql1 = "SELECT * FROM tb_avaliacao WHERE codigo_usuario = ? AND codigo_musica = ?";
            try(Connection c = ConexaoDB.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql1);
            ps.setInt(1, Usuario.getInstance().getCodigoUsuario());
            ps.setInt(2, codigo);
            try(ResultSet rs = ps.executeQuery()){
                rs.next();
                int nota = rs.getInt("nota");
                return  nota;
            }
            catch(Exception e){
            return 0;
            }
            
        }
    }
    

        public static void atualizarMedia(String musica) throws Exception {
        String sql = "SELECT codigo \n FROM tb_musicas\n WHERE musica = ?";
        int codigoMusica = 0;
        
        try(Connection con = ConexaoDB.obterConexao()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,musica);
            try {
            ResultSet rs = ps.executeQuery();
            rs.next();
            codigoMusica = rs.getInt("codigo");
            
            
            }
            catch(Exception e){
                e.printStackTrace();
            }}
    
        String sql1 = "SELECT AVG(nota) FROM tb_avaliacao WHERE codigo_musica = ? ;";
        String sql2 = "UPDATE tb_musicas SET mediaAvaliacao = ? WHERE codigo = ?";
        double notaMedia = 0.0;
        try(Connection c = ConexaoDB.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql1);
            ps.setInt(1,codigoMusica);
            
            try(ResultSet rs = ps.executeQuery()){
            rs.next();
            notaMedia = rs.getDouble("avg(nota)");
                }
            }
        try(Connection c = ConexaoDB.obterConexao()){
            PreparedStatement ps = c.prepareStatement(sql2);
            ps.setDouble(1,notaMedia);
            ps.setInt(2, codigoMusica);
            ps.execute();
                }
            }
}
