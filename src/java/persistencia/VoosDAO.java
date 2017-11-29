/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import modelo.Voos;

/**
 *
 * @author Bruno
 */
public class VoosDAO extends Conexao{
    
  
   
   public void cadastroVoo(Voos u) throws Exception{
       OpenDatabase();
       SQL = "INSERT INTO voos(status, id_aviao)"        
               + "VALUES(?, ?)";
       ps = con.prepareStatement(SQL);
       ps.setString(1, u.getStatus());
       ps.setLong(2, u.getId_aviao());
       ps.execute();
       CloseDatabase();
    }
    
    
    public Voos consultarvoos(long id_voo) throws Exception{
        OpenDatabase();
        
        SQL = "SELECT status, id_aviao FROM voos WHERE id_voo =?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1,id_voo);
        rs = ps.executeQuery();
        
        Voos v = new Voos();
        if(rs.next()){
            v.setId_voo(rs.getLong("id_voo"));
            v.setStatus(rs.getString("status"));
            v.setId_aviao(rs.getLong("id_aviao"));
        }
        CloseDatabase();
           
        return v;  
        
        
    }
    public List listarVoos() throws Exception{
        OpenDatabase();
        SQL= "SELECT * FROM voos ORDER BY id_voos";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        
        List listaVoos = new ArrayList();
        while(rs.next()){
            Voos v = new Voos();
            v.setId_voo(rs.getLong("id_voo"));
            v.setStatus(rs.getString("status"));
            v.setId_aviao(rs.getLong("id_aviao"));
            listaVoos.add(v);
        }
        CloseDatabase();
        return listaVoos;
    }
    
    public void atualizarVoos(Voos v)throws Exception{
        OpenDatabase();
        
        SQL = "UPDATE voos SET status=?, id_aviao=? WHERE id_voo=?";
        ps = con.prepareStatement(SQL);
        ps.setString(1, v.getStatus());
        ps.setLong(2, v.getId_aviao());
        ps.execute();
        
        CloseDatabase();
    }
    
    public void excluirPoltronas(long id_voo) throws Exception{
        OpenDatabase();
        
        SQL = "DELETE * FROM voos WHERE id_voo=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_voo);
        ps.execute();
        CloseDatabase();
    }
}
