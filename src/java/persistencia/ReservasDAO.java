/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import modelo.Reservas;

/**
 *
 * @author Bruno
 */
public class ReservasDAO extends Conexao {
    
    public void cadastrarReserva(Reservas r) throws Exception{
        OpenDatabase();
        SQL = "INSERT INTO reservas (classe, valor, status, data_ida, data_volta, qtde, id_usuario, id_aeroporto, id_poltrona, hr_embraque)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(SQL);
        
        ps.setString(1, r.getClasse());
        ps.setDouble(2, r.getValor());
        ps.setString(3, r.getStatus());
        ps.setDate(4, r.getData_ida());
        ps.setDate(5, r.getData_volta());
        ps.setInt(6, r.getQtde());
        ps.setLong(7, r.getId_usuario());
        ps.setLong(8, r.getId_aeroporto());
        ps.setLong(9, r.getId_poltrona());
        ps.setDate(10, r.getHr_embarque());
        
        ps.execute();
        CloseDatabase();
        
    } 
    
    public void atualizarReserva(Reservas r) throws Exception{
        OpenDatabase();
        
        SQL = "UPDATE reservas SET classe=?, valor=?, status=?, data_ida=?, data_volta=?,"
            + " qtde=?, id_usuario=?, id_aeroporto=?, id_poltrona=?, hr_embraque=? WHERE id_reserva=?";
        
        ps = con.prepareStatement(SQL);
        
        ps.setString(1, r.getClasse());
        ps.setDouble(2, r.getValor());
        ps.setString(3, r.getStatus());
        ps.setDate(4, r.getData_ida());
        ps.setDate(5, r.getData_volta());
        ps.setInt(6, r.getQtde());
        ps.setLong(7, r.getId_usuario());
        ps.setLong(8, r.getId_aeroporto());
        ps.setLong(9, r.getId_poltrona());
        ps.setDate(10, r.getHr_embarque());
        
        ps.execute();
        CloseDatabase();
    }
    
    public void excluirReserva(long id_reserva)throws Exception{
        OpenDatabase();
        
        SQL= "DELETE * FROM reservas WHERE id_reserva=?";
        ps=con.prepareStatement(SQL);
        ps.setLong(1, id_reserva);
        ps.execute();
        CloseDatabase();
    }
    
    public List listarReservas()throws Exception{
        OpenDatabase();
        
        SQL= "SELECT * FROM reservas ORDER BY id_reserva";
        ps= con.prepareStatement(SQL);
        rs = ps.executeQuery();
        
       List lista = new ArrayList();
       while(rs.next()){
           Reservas r = new Reservas();
           r.setClasse(rs.getString("classe"));
           r.setValor(rs.getDouble("valor"));
           r.setStatus(rs.getString("status"));
           r.setData_ida(rs.getDate("data_ida"));
           r.setData_volta(rs.getDate("data_volta"));
           r.setQtde(rs.getInt("qtde"));
           r.setId_usuario(rs.getLong("id_usuario"));
           r.setId_aeroporto(rs.getLong("id_aeroporto"));
           r.setId_poltrona(rs.getLong("id_poltrona"));
           r.setHr_embarque(rs.getDate("hr_embarque"));
        }
       
       CloseDatabase();
       return lista;
    }
    
    
}
