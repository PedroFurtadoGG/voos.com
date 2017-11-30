/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Html.GeraHTML;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class Login extends GeraHTML{
    
    public String efetuarLogin(HttpServletRequest req) {
        try {
            
            String uEmail = req.getParameter("email");
            String uSenha = req.getParameter("senha");
            String sessao =  Double.toString(Math.random());
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionURL = "jdbc:mysql://localhost:3306/voos";
            Connection connection= DriverManager.getConnection(connectionURL, "root", "");
            PreparedStatement psmnt = connection.prepareStatement("SELECT * FROM usuarios WHERE email = '"+uEmail+"' AND senha ='"+uSenha+"'");
            ResultSet results = psmnt.executeQuery();
            HttpSession session = req.getSession();
            while(results.next()){
                
                session.setAttribute("tipo", results.getString(5));
                session.setAttribute("email", results.getString(2));
                session.setAttribute("sessao", sessao);
            }
            
            
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
}
