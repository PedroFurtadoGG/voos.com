/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import persistencia.UsuarioDAO;
/**
 *
 * @author Lenovo
 */
public class Usuario extends BaseGenerator{
    public String cadastrarUsuario(HttpServletRequest req){
        try {
            String email = req.getParameter("email");
            String nome = req.getParameter("nome");
            String senha = req.getParameter("senha");
            String tipo = req.getParameter("tipo");
            String dataNascimento = req.getParameter("data_nascimento");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String telefone = req.getParameter("telefone");
            String cpf = req.getParameter("cpf");
            
            modelo.Usuario ux = new modelo.Usuario();
            ux.setNome(nome);
            ux.setEmail(email);
            ux.setSenha(senha);
            ux.setTipo(tipo);
            ux.setTelefone(telefone);
            ux.setCpf(cpf);
            ux.setData_nascimento(new java.sql.Date(sdf.parse(dataNascimento).getTime()));
            
            
            
            UsuarioDAO dao = new UsuarioDAO();
            dao.cadastrarUsuario(ux);
            
             System.out.println("Atualizado!");
            
           return "Projeto atualizado com sucesso";
            
        } catch (Exception ex) {
            return "Exceção: "+ex.getMessage();
        }
    
    }
    
    public String excluirUsuario(HttpServletRequest request){
     try {
         String idUsuario = request.getParameter("id_usuario");

         UsuarioDAO dao = new UsuarioDAO();
         dao.excluirUsuario(Integer.parseInt(idUsuario)); 

         return "Usuário excluído com sucesso!";
     } catch (Exception ex) {
         return "Exceção: " + ex.getMessage();
    }
   }
    
    public String atualizarUsuario(HttpServletRequest req){
        try {
            String email = req.getParameter("email");
            String nome = req.getParameter("nome");
            String senha = req.getParameter("senha");
            String tipo = req.getParameter("tipo");
            String dataNascimento = req.getParameter("data_nascimento");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String telefone = req.getParameter("telefone");
            String cpf = req.getParameter("cpf");
            
            modelo.Usuario ux = new modelo.Usuario();
            ux.setNome(nome);
            ux.setEmail(email);
            ux.setSenha(senha);
            ux.setTipo(tipo);
            ux.setTelefone(telefone);
            ux.setCpf(cpf);
            ux.setData_nascimento(new java.sql.Date(sdf.parse(dataNascimento).getTime()));
            
            UsuarioDAO dao = new UsuarioDAO();
            dao.atualizarUsuario(ux);
                       
            return "Espaço físico atualizado com sucesso";
            
        } catch (Exception e) {
            return "Excecccção: "+e.getMessage();
        }
    }
    
    public String getListUsuario(){
        try{
            UsuarioDAO dao = new UsuarioDAO();
            return html.getListUsuario(dao.listarUsuario());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
    
    public String getUsuarioSingle(HttpServletRequest req) {
        //preenche a interna do cliente com dados do banco :)
       try {
           String idUsuario = req.getParameter("id_usuario");
 
           UsuarioDAO dao = new UsuarioDAO();
           return html.getFormAtualizarUsuario(dao.visualizarUsuario(Integer.parseInt(idUsuario)));
       } catch (Exception ex) {
           return "Exceção: " + ex.getMessage();
       }
   }
}
