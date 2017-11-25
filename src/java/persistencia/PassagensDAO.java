/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import modelo.Passagens;

/**
 *
 * @author Bruno
 */
public class PassagensDAO extends Conexao{
    
    public void cadastrarPassagens(Passagens p)throws Exception{
        OpenDatabase();
        
        SQL = "INSERT INTO passagens(portao_embarque, status, classe, hr_embraque, data_ida, data_volta, id_voo, id_reserva ,id_poltrona)"
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        ps = con.prepareStatement(SQL);
        
        ps.setString(1, p.getPortao_embarque());
        ps.setString(2, p.getStatus());
        ps.setString(3, p.getClasse());
        ps.setDate(4, p.getHr_embarque());
        ps.setDate(5, p.getData_ida());
        ps.setDate(6, p.getData_volta());
        ps.setLong(7, p.getId_voo());
        ps.setLong(8, p.getId_reserva());
        ps.setLong(9, p.getId_poltrona());
     
        
        ps.execute();
        CloseDatabase();
    }
    
    public void alterarPassagens(Passagens p)throws Exception{
        OpenDatabase();
        
        SQL = "UPDATE passagens SET portao_embarque=?, status=?, classe=?, hr_embraque=?, data_ida=?, data_volta=?, id_voo=?, id_reserva=? ,id_poltrona=?"
                + "WHERE id_passagem=?";
        
           ps = con.prepareStatement(SQL);
        
        ps.setString(1, p.getPortao_embarque());
        ps.setString(2, p.getStatus());
        ps.setString(3, p.getClasse());
        ps.setDate(4, p.getHr_embarque());
        ps.setDate(5, p.getData_ida());
        ps.setDate(6, p.getData_volta());
        ps.setLong(7, p.getId_voo());
        ps.setLong(8, p.getId_reserva());
        ps.setLong(9, p.getId_poltrona());
     
        
        ps.execute();
        CloseDatabase();
    }
    
    public void excluirPassagens(long id_passagem)throws Exception{
        
        OpenDatabase();
        
        SQL= "DELETE * FROM passagens WHERE id_passagem=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_passagem);
        ps.execute();
        CloseDatabase();
    }
    
    public List listarPassagens()throws Exception{
        OpenDatabase();
        
        SQL= "SELECT * FROM passagens ORDER BY id_passagem";
        ps= con.prepareStatement(SQL);
        rs = ps.executeQuery();
        
       List lista = new ArrayList();
       while(rs.next()){
           Passagens p = new Passagens();
           p.setId_passagem(rs.getLong("id_passagem"));
           p.setPortao_embarque(rs.getString("portao_embarque"));
           p.setStatus(rs.getString("status"));
           p.setClasse(rs.getString("classe"));
           p.setHr_embarque(rs.getDate("hr_embarque"));
           p.setData_ida(rs.getDate("data_ida"));
           p.setData_volta(rs.getDate("data_volta"));
           p.setId_voo(rs.getLong("id_voo"));
           p.setId_reserva(rs.getLong("id_reserva"));
           p.setId_poltrona(rs.getLong("id_poltrona"));
           
           lista.add(p);
       }
       CloseDatabase();
       
       return lista;
    }
    
    public Passagens consultarPassagens(long id_passagem)throws Exception{
        OpenDatabase();
        
        SQL= "SELECT portao_embarque, status, classe, hr_embraque, data_ida, data_volta, id_voo, id_reserva ,id_poltrona)"
                + "WHERE id_passagem=?";
        
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_passagem);
        rs = ps.executeQuery();
        
        Passagens p = new Passagens();
        if(rs.next()){
           p.setId_passagem(rs.getLong("id_passagem"));
           p.setPortao_embarque(rs.getString("portao_embarque"));
           p.setStatus(rs.getString("status"));
           p.setClasse(rs.getString("classe"));
           p.setHr_embarque(rs.getDate("hr_embarque"));
           p.setData_ida(rs.getDate("data_ida"));
           p.setData_volta(rs.getDate("data_volta"));
           p.setId_voo(rs.getLong("id_voo"));
           p.setId_reserva(rs.getLong("id_reserva"));
           p.setId_poltrona(rs.getLong("id_poltrona"));
        }
        CloseDatabase();
        return p;
    }
}
