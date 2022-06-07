package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
    private static String usuario = "root";
    private static String senha = "44ma4523";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "musicas";
    
    public static Connection obterConexao(){
        try{String url = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",host, porta,db );
        Connection c = DriverManager.getConnection(url, usuario, senha);
        return c;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}