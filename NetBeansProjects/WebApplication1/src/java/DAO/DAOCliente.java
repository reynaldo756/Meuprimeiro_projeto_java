package DAO;
import MODEL.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAOCliente {
    
        private Connection conn;
        private PreparedStatement stmt;
        
        public DAOCliente(){
            conn = new Conexao().getConexao();
        }
        
        public void InserirCliente(Cliente cliente){
            String sql = "INSERT INTO tb_clientes (nome,email) VALUES (?,?)";
            
            try{
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getEmail());
                stmt.execute();
                stmt.close();
                
            }catch(Exception erro){
                throw new RuntimeException("Erro Inserir Cliente: ",erro);
            }
        }
        
        public void remove(Cliente cliente){
            String sql = "Delete into tb_clientes (nome,email) VALUES (?,?)";
            
            try{
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getEmail());
                stmt.execute();
                
                System.out.println("Dados excluidos");
                
            }catch(Exception erro){
                throw new RuntimeException("Erro Inserir Cliente: ",erro);
            }
        }
}


