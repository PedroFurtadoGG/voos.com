/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import modelo.Poltronas;

/**
 *
 * @author Bruno
 */
public class PoltronaDAO extends Conexao{
    
    public void cadastroPoltronas(Poltronas p) throws Exception{
        OpenDatabase();
        
        SQL = "INSERT INTO poltronas(status,tipo,nome) VALUES (?,?,?)";
        ps = con.prepareStatement(SQL);
        ps.setString(1, p.getStatus());
        ps.setString(2, p.getTipo());
        ps.setString(3, p.getNome());
        ps.execute();
        CloseDatabase();
                
    }
    
    public List listarPoltronas() throws Exception{
        OpenDatabase();
        SQL= "SELECT * FROM poltronas ORDER BY id_poltrona";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        
        List listaPoltronas = new ArrayList();
        while(rs.next()){
            Poltronas p = new Poltronas();
            p.setId_poltronas(rs.getLong("id_poltrona"));
            p.setStatus(rs.getString("status"));
            p.setTipo(rs.getString("tipo"));
            p.setNome(rs.getString("nome"));
            p.setId_aviao(rs.getLong("id_aviao"));
            
            listaPoltronas.add(p);
        }
        CloseDatabase();
        return listaPoltronas;
    }
    
    public void atualizarPoltronas(Poltronas p)throws Exception{
        OpenDatabase();
        
        SQL = "UPDATE poltronas SET staus=?, tipo=?, nome=? WHERE id_poltrona=?";
        ps = con.prepareStatement(SQL);
        ps.setString(1, p.getStatus());
        ps.setString(2, p.getTipo());
        ps.setString(3, p.getNome());
        
        ps.execute();
        
        CloseDatabase();
    }
    
    public void excluirPoltronas(long id_poltrona) throws Exception{
        OpenDatabase();
        
        SQL = "DELETE * FROM poltronas WHERE id_poltrona=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_poltrona);
        ps.execute();
        CloseDatabase();
    }
    
     
}
