/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Html.GeraHTML;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import modelo.Avioes;
import modelo.Usuario;
import persistencia.AviaoDAO;
import persistencia.UsuarioDAO;

/**
 *
 * @author Lenovo
 */
public class FormBase extends GeraHTML {

    public String efetuarLogin(HttpServletRequest req) {
        try {
            String uEmail = req.getParameter("email");
            String uSenha = req.getParameter("senha");

            Usuario u = new Usuario();
            u.setEmail(uEmail);
            u.setSenha(uSenha);

            UsuarioDAO dao = new UsuarioDAO();
            dao.efetuarLogin(uEmail, uSenha);
            HttpSession session = req.getSession();
            session.setAttribute("email", uEmail);
            session.setAttribute("tipo", dao.rs.getString("tipo"));
            return "Login efetuado com sucesso" + session;

        } catch (Exception ex) {
            return "Exceção:" + ex.getMessage();
        }

    }

    public String efetuarLogout(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.invalidate();
        return "DEU BOM";
    }

    public String salvarAviao(HttpServletRequest req) {
        try {

            String modelo = req.getParameter("modelo");
            String qtde_poltrona = req.getParameter("qtde_poltrona");

            Avioes a = new Avioes();
            a.setModelo(modelo);
            a.setQtde_poltronas(Integer.parseInt(qtde_poltrona));

            AviaoDAO dao = new AviaoDAO();
            dao.cadastrarAviao(a);

            System.out.println("Atualizado!");

            return "Projeto atualizado com sucesso";

        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
}
