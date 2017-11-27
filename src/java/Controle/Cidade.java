/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.servlet.http.HttpServletRequest;
import modelo.Cidades;
import persistencia.CidadeDAO;

/**
 *
 * @author Lenovo
 */
public class Cidade extends BaseGenerator{
    public String cadastrarCidade(HttpServletRequest req) {
        try {

            String nome = req.getParameter("nome");
            String uf = req.getParameter("uf");

            Cidades a = new Cidades();
            a.setNome(nome);
            a.setUf(uf);

            CidadeDAO dao = new CidadeDAO();
            dao.cadastrarCidades(a);

            System.out.println("Atualizado!");

            return "Projeto atualizado com sucesso";

        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
    
    public String getListCidade(){
        try{
            CidadeDAO dao = new CidadeDAO();
            return html.getListCidade(dao.listarCidades());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
    
    public String getCidadeSingle(HttpServletRequest req){
        try {
           String idCidade = req.getParameter("id_cidade");
 
           CidadeDAO dao = new CidadeDAO();
           return html.getFormAtualizarCidade(dao.visualizarCidade(Integer.parseInt(idCidade)));
       } catch (Exception ex) {
           return "Exceção: " + ex.getMessage();
       }
    }
}
