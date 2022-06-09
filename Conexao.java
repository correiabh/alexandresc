/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexandresc;

import java.sql.*;

public class Conexao {
    String driver = "com.mysql.jdbc.Driver"; //Driver para conexao com o Banco
    String banco = "alexandresc"; //Nome do Banco de Dados
    String host = "localhost"; //Servidor de Banco de Dados
    String stringDeConexao = "jdbc:mysql://" + host + "3306" + "?serverTimezone=UTC"; //String de conexao com o Banco de Dados
    String usuario = "root"; //Usuario do Banco de Dados
    String senha = "Senha123"; //Senha do Usuario
    
    public Connection conexao;
    
    /** Creates a new instance of conexao */
    public Conexao()
    {
    }
    
    public Connection getConexao()
    {
        try 
        {
            Class.forName(driver); //Carrega o drive
            return DriverManager.getConnection(this.stringDeConexao,usuario, senha);    
        } 
        catch (Exception e) 
        {
             System.out.println(e.getMessage());
             return conexao;
        }
    }
    
    public ResultSet getResultSet(String sentenca)
    {
        try
        {
            Statement stm = new ConexaoBanco().getInstanceStatement();
            ResultSet rs = stm.executeQuery(sentenca);
            return rs;         
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public String atualizarBanco(String sentenca)
    {
        try 
        {
            Statement stm = new ConexaoBanco().getInstanceStatement();
            stm.executeUpdate(sentenca);
            return "1";     
        } 
        catch (SQLException e)
        {
            return e.getMessage();
        }
        catch (Exception ex)
        {
            return ex.getMessage();
        }
    }
}