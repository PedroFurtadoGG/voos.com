/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import modelo.Usuario;
import persistencia.UsuarioDAO;

/**
 *
 * @author Lenovo
 */
public class testeLogin {
    public static void main(String[] args) throws Exception{
        String email = "admin@admin.com.br";
        String senha = "admin@321";
         
        Usuario us = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        us = dao.efetuarLogin(email, senha);
        System.out.println(us.getEmail());
        System.out.println(us.getTipo());
        if(us.getTipo() == "A"){
            System.out.println("Login feito com sucesso");
        } else {
            System.out.println("Login ou senha invalidos");
        }
    }
}
