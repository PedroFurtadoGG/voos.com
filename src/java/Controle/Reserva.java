/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import modelo.Reservas;
import persistencia.ReservasDAO;

/**
 *
 * @author Lenovo
 */
public class Reserva extends BaseGenerator{
    public String cadastrarReserva(HttpServletRequest req){
        try {
            String classe = req.getParameter("classe");
            String valor = req.getParameter("valorPassagem");
            String status = req.getParameter("status");
            String data_id = req.getParameter("data_ida");
            SimpleDateFormat dtIda = new SimpleDateFormat("yyyy-MM-dd");
            String data_volta = req.getParameter("data_volta");
            SimpleDateFormat dtVolta = new SimpleDateFormat("yyyy-MM-dd");
            String id_usuario = req.getParameter("id_usuario");
            String id_aeroporto = req.getParameter("id_aeroporto");
            String id_poltrona = req.getParameter("id_poltrona");
            String hora = req.getParameter("hr_embarque");
            
            Reservas r = new Reservas();
            r.setClasse(classe);
            r.setValor(Double.parseDouble(valor));
            r.setStatus(status);                    
            r.setData_ida(new java.sql.Date(dtIda.parse(data_id).getTime()));
            r.setData_volta(new java.sql.Date(dtVolta.parse(data_volta).getTime()));
            r.setId_usuario(Long.parseLong(id_usuario));
            r.setId_aeroporto(Long.parseLong(id_aeroporto));
            r.setId_poltrona(Long.parseLong(id_poltrona));
            r.setHr_embarque(hora);
            
            ReservasDAO dao = new ReservasDAO();
            dao.cadastrarReserva(r);
            
            System.out.println("Atualizado!");

            return "Projeto atualizado com sucesso";
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
        
    }
    
}
