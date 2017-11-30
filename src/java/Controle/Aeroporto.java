/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.servlet.http.HttpServletRequest;
import modelo.Aeroportos;
import persistencia.AeroportosDAO;

/**
 *
 * @author Bruno
 */
public class Aeroporto extends BaseGenerator {
    public String cadastrarAeroporto(HttpServletRequest req){
        try {
            
            String nome = req.getParameter("nome");
            String link_localizacao = req.getParameter("link_localizacao");
            String id_cidade = req.getParameter("id_cidade");
            
            Aeroportos a = new Aeroportos();
            a.setNome(nome);
            a.setLink_localizacao(link_localizacao);
            a.setId_cidade(Long.parseLong(id_cidade));
            
            AeroportosDAO dao = new AeroportosDAO();
            dao.cadastrarAeroporto(a);
            
            System.out.println("Aeroporto cadastrado");
            
            return "Sucesso aeroporto";
            
        } catch (Exception e) {
            return "Exceção : "+e.getMessage();
        }
    }
    
    public String getListAeroporto(){
        try {
            
            AeroportosDAO dao = new AeroportosDAO();
            return html.getListAeroportos(dao.listarAeroporto());
            
        } catch (Exception e) {
            return "Exceção:"+e.getMessage();
        }
    }
    
    public String excluirAeroporto(HttpServletRequest req){
        try {
            
            String id_aeroporto = req.getParameter("id_aeroporto");
            AeroportosDAO dao = new AeroportosDAO();
            dao.excluirAeroporto(Integer.parseInt(id_aeroporto));
            
            return "Aviao Excluido !!!";
            
        } catch (Exception e) {
            return "Exceção"+e.getMessage();
        }
    }
    
    public String getAeroportoSingle(HttpServletRequest req){
        try {
            
            String id_aeroporto = req.getParameter("id_aeroporto");
            AeroportosDAO dao = new AeroportosDAO();
            return html.getFormAtualizarAeroporto(dao.visualizarAeroporto(Integer.parseInt(id_aeroporto)));
            
        } catch (Exception e) {
            return "Exceção: "+e.getMessage();
        }
    }
    
}
