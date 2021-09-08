package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
        
public class Conexao {
    public Connection getConexao(){
        try{
            Class.forName("org.apache.derby.jdbc.ClienteDriver");
            return DriverManager.getConnection("jdbc://localhost/bdtreino","reinaldo","123");
        }catch(Exception erro){
            throw new RuntimeException("Erro classe conexão: ",erro);
        }
    }
}