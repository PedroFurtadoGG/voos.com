/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Conexao.Conexao;
import java.sql.Date;
import java.sql.PreparedStatement;
import model.Login;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class LoginDAO extends Conexao{
   
    
    public void addUsuario(Login lg) throws Exception{
        OpenDatabase();
        
         String sql = "INSERT INTO usuarios(nome,email,senha,tipo,dob,telefone,cpf)" +
 " VALUES(?,?,?,?,?,?,?)";
         
         ps = con.prepareStatement(sql);
         ps.setString(1, lg.getNome());
         ps.setString(2, lg.getEmail());
         ps.setString(3, lg.getSenha());
         ps.setString(4, lg.getTipo());
         ps.setDate(5, (Date) lg.getDob());
         ps.setString(6, lg.getTelefone());
         ps.setLong(7, lg.getCPF());
         ps.execute();
      
        
        CloseDatabase();
         
    }
    
    public void deleteUsuario(Long cpf) throws Exception{
        OpenDatabase();
        String sql = "DELETE FROM usuarios WHERE cpf = ?";
        
        ps = con.prepareCall(sql);
        ps.setLong(1, cpf);
        
        CloseDatabase();
    }
    
    public void updateUsuario(Login lg) throws Exception{
        
        String sql = "UPDATE usuarios SET nome=?,email=?,senha=?,tipo=?,dob=?,telefone=?,cpf=?" +
 " WHERE cpf = ?";
        
        ps = con.prepareStatement(sql);
        ps.setString(1, lg.getNome());
        ps.setString(2, lg.getEmail());
        ps.setString(3, lg.getSenha());
        ps.setString(4, lg.getTipo());
        ps.setDate(5, (Date) lg.getDob());
        ps.setString(6, lg.getTelefone());
        ps.setLong(7, lg.getCPF());
        ps.execute();
        
        CloseDatabase();
    }
    
    public List<Login> getUsuarios() throws Exception{
        OpenDatabase();
        
        String sql = "SELECT * FROM usuarios";
        
        List<Login> lgs = new ArrayList<Login>();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while(rs.next()){
            Login lg = new Login();
            
            lg.setCPF(rs.getLong("cpf"));
            lg.setNome(rs.getString("nome"));
            lg.setEmail(rs.getString("email"));
            lg.setSenha(rs.getString("senha"));
            lg.setDob(rs.getDate("dob"));
            lg.setTelefone(rs.getString("telefone"));
            lg.setTipo(rs.getString("tipo"));
            
            lgs.add(lg);
        }
        CloseDatabase();
        return lgs;
        
    }
    
}
