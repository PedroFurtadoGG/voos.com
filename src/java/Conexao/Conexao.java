package Conexao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class Conexao {
    public  Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String SQL;
 
    public  void  OpenDatabase()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/voos?zeroDateTimeBehavior=convertToNull";
        String user = "root";  //Seu nome de usuário.
        String password = "";  //Sua senha, nesse caso o Banco esta sem senha.
        con = DriverManager.getConnection(url, user, password);
    }
 
    public void CloseDatabase() throws Exception{
        if(con != null){
            con.close();
        }
    }
}