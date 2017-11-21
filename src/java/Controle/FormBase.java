/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import persistencia.UsuarioDAO;

/**
 *
 * @author Lenovo
 */
public class FormBase {
    public String efetuarLogin(HttpServletRequest req){
        try {
            String uEmail = req.getParameter("email");
            String uSenha = req.getParameter("senha");
            
            Usuario u = new Usuario();
            u.setEmail(uEmail);
            u.setSenha(uSenha);
            
            UsuarioDAO dao = new UsuarioDAO();
            dao.efetuarLogin(uEmail, uSenha);
            HttpSession session = req.getSession(true);
            session.setAttribute("PjtLoginFiltro_logado", true);
            session.setAttribute("PjtLoginFiltro_nome", u.getNome());
            session.setAttribute("PjtLoginFiltro_cargo", u.getTipo());
            req.getRequestDispatcher("index.jsp");  
            return "Login efetuado com sucesso" + session;
            
        } catch (Exception ex) {
            return "Exceção:" + ex.getMessage();
        }
       
    }
}
