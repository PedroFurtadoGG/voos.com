/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Conexao.Conexao;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Lenovo
 */
public class UsuarioDAO extends Conexao {
    public Usuario efetuarLogin(String email, String senha)throws Exception{
        OpenDatabase();
        SQL = "SELECT * FROM usuarios WHERE email=? AND senha=?";
        ps = con.prepareStatement(SQL);
        ps.setString(1,email);
        ps.setString(2,senha);
        rs = ps.executeQuery();
        Usuario u = new Usuario();
        if(rs.next()){
            u.setEmail(rs.getString("email"));
            u.setTipo(rs.getString("tipo"));
        }
        return u;
        
    }
    public void cadastrarUsuario(Usuario u) throws Exception{
       OpenDatabase();
       SQL = "INSERT INTO usuarios(nome, email, senha, tipo,"
               + " data_nascimento, telefone, cpf)"        
               + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
       ps = con.prepareStatement(SQL);
       ps.setString(1, u.getNome());
       ps.setString(2, u.getEmail());
       ps.setString(3, u.getSenha());
       ps.setString(4, u.getTipo());
       ps.setDate(5, (Date) u.getData_nascimento());
       ps.setString(6, u.getTelefone());
       ps.setInt(7, u.getCpf());
       ps.execute();
       CloseDatabase();
    
    }
    
    public Usuario visualizarUsuario(Integer id_usuario) throws Exception{
        OpenDatabase();
        SQL = "SELECT * FROM usuarios WHERE id_usuario=?";
       ps = con.prepareStatement(SQL);
       ps.setInt(1, id_usuario);
       rs = ps.executeQuery();
       Usuario u = new Usuario();
       if(rs.next())
           u.setId_usuario(rs.getInt("id_usuario"));
           u.setNome(rs.getString("nome"));
           u.setEmail(rs.getString("email"));
           u.setSenha(rs.getString("senha"));
           u.setTipo(rs.getString("tipo"));
           u.setData_nascimento(rs.getDate("data_nascimento"));
           u.setTelefone(rs.getString("telefone"));
           u.setCpf(rs.getInt("cpf"));
           
           
           CloseDatabase();
          
       
       return u;
    }
    
    public List listarUsuario() throws Exception{
     OpenDatabase();
     SQL = "SELECT * FROM usuarios ORDER BY id_usuario";
     ps = con.prepareStatement(SQL);
     rs = ps.executeQuery();
     List listaUsuario = new ArrayList();
     while(rs.next()){
         Usuario u = new Usuario();
            u.setId_usuario(rs.getInt("id_usuario"));
           u.setNome(rs.getString("nome"));
           u.setEmail(rs.getString("email"));
           u.setSenha(rs.getString("senha"));
           u.setTipo(rs.getString("tipo"));
           u.setData_nascimento(rs.getDate("data_nascimento"));
           u.setTelefone(rs.getString("telefone"));
           u.setCpf(rs.getInt("cpf"));
           
           listaUsuario.add(u);
     }
      CloseDatabase();
      return listaUsuario  ;
     
    }
    
    public void atualizarUsuario(Usuario u) throws Exception{
        OpenDatabase();
        SQL =  "UPDATE usuarios SET id_usuario=?, nome=?, email=?,"
              + " senha=?, tipo=?, data_nascimento=?, telefone=?, cpf=? WHERE id_usuario=?";
       
        ps = con.prepareStatement(SQL);
        ps.setInt(1, u.getId_usuario());
        ps.setString(2, u.getNome());
        ps.setString(3, u.getEmail());
        ps.setString(4, u.getSenha());
        ps.setString(5, u.getTipo());
        ps.setDate(6, (Date) u.getData_nascimento());
        ps.setString(7, u.getTelefone());
        ps.setInt(8, u.getCpf());
        ps.setInt(9, u.getId_usuario());
        ps.execute();
        CloseDatabase();
    }
    
    public void excluirUsuario(Integer id_usuario) throws Exception{
        OpenDatabase();
        SQL = "DELETE FROM usuarios WHERE id_usuario=?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, id_usuario);
        ps.execute();
        CloseDatabase();
    }
}
