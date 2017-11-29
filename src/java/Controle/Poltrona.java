/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.servlet.http.HttpServletRequest;
import persistencia.UsuarioDAO;
import modelo.Poltronas;
import persistencia.PoltronaDAO;
/**
 *
 * @author Lenovo
 */
public class Poltrona extends BaseGenerator{
    public String cadastroPoltronas(HttpServletRequest req){
        try {
            String status = req.getParameter("status");
            String tipo = req.getParameter("tipo");
            String nome = req.getParameter("nome");
            String idAviao = req.getParameter("idAviao");
            
            Poltronas p = new Poltronas();
            p.setStatus(status);
            p.setId_aviao(Long.parseLong(idAviao));
            p.setTipo(tipo);
            p.setNome(nome);
            
            PoltronaDAO dao = new PoltronaDAO();
            dao.cadastroPoltronas(p);
            
            System.out.println("Atualizado!");

            return "Projeto atualizado com sucesso";
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
}
