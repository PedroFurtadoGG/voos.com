/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.servlet.http.HttpServletRequest;
import modelo.Avioes;
import persistencia.AviaoDAO;

/**
 *
 * @author Lenovo
 */
public class Aviao extends BaseGenerator{
    public String cadastrarAviao(HttpServletRequest req) {
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
    
    public String getListAviao(){
        try{
            AviaoDAO dao = new AviaoDAO();
            return html.getListAviao(dao.listarAvioes());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
    
    public String getAviaoSingle(HttpServletRequest req) {
        //preenche a interna do cliente com dados do banco :)
       try {
           String idAviao = req.getParameter("id_aviao");
 
           AviaoDAO dao = new AviaoDAO();
           return html.getFormAtualizarAviao(dao.visualizarAviao(Integer.parseInt(idAviao)));
       } catch (Exception ex) {
           return "Exceção: " + ex.getMessage();
       }
    }
    
    public String excluirAviao(HttpServletRequest req){
       try {
           String idAviao = req.getParameter("id_aviao");
            
           AviaoDAO dao = new AviaoDAO();
           dao.excluirAviao(Integer.parseInt(idAviao)); 
            
           return "Aviao excluido com sucesso!";
       } catch (Exception ex) {
           return "Exceção: " + ex.getMessage();
       }
   }
}
