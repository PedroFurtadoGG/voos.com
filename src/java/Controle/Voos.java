/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.servlet.http.HttpServletRequest;
import persistencia.VoosDAO;
/**
 *
 * @author Lenovo
 */
public class Voos extends BaseGenerator{
    public String cadastroVoo(HttpServletRequest req){
        try {
            String status = req.getParameter("aviao");
            String idAviao = req.getParameter("idAviao");
            
            modelo.Voos v = new modelo.Voos();
            v.setStatus(status);
            v.setId_aviao(Long.parseLong(idAviao));
            
            VoosDAO dao = new VoosDAO();
            dao.cadastroVoo(v);
            
            System.out.println("Atualizado!");

            return "Projeto atualizado com sucesso";
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
}
