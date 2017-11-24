/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import Conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import modelo.Aeroportos;
/**
 *
 * @author Matheus
 */
public class AeroportosDAO extends Conexao {
   
    public void cadastraAeroporto(Aeroportos a) throws Exception{
        
        OpenDatabase();
        SQL = "INSERT INTO aeroporotos(link_localizacao, nome)"
                + "VALUES (?,?)"; 
        ps = con.prepareStatement(SQL);
        ps.setString(1, a.getLink_localizacao());
        ps.setString(2, a.getNome());
        ps.execute();
        CloseDatabase();
        
    }
    
    public Aeroportos visualizarAeroporto(long id_aeroporto) throws Exception{
        OpenDatabase();
        SQL = "SELECT * FROM aeroportos WHERE id_aeroporto=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_aeroporto);
        rs = ps.executeQuery();
        Aeroportos a = new Aeroportos();
        if(rs.next()){
            a.setId_aeroporto(rs.getLong("id_aeroporto"));
            a.setId_cidade(rs.getLong("id_cidade"));
            a.setLink_localizacao(rs.getString("link_localizacao"));
            a.setNome(rs.getString("nome"));
        }
            CloseDatabase();
            
        return a;   
        
        
    }
    
    public List listarAeroporto() throws Exception{
        OpenDatabase();
        SQL = "SELECT * FROM aeroportos ORDER BY id_aeroporto";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaAeroportos = new ArrayList();
        while(rs.next()){
            Aeroportos a = new Aeroportos();
            a.setId_aeroporto(rs.getLong("id_aeroporto"));
            a.setId_cidade(rs.getLong("id_cidade"));
            a.setLink_localizacao(rs.getString("link_localizacao"));
            a.setNome(rs.getString("nome"));
            
            listaAeroportos.add(a);
        }
        CloseDatabase();
        return listaAeroportos;
    }
    
    public void atualizarAeroporto(Aeroportos a) throws Exception{
        OpenDatabase();
        SQL = "UPDATE aeroportos "
              + "SET id_aeroporto=?, nome=?, link_localizacao=?, id_cidade=?"
                + "WHERE id_aeroporto=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, a.getId_aeroporto());
        ps.setString(2, a.getNome());
        ps.setString(3, a.getLink_localizacao());
        ps.setLong(4, a.getId_cidade());
        ps.execute();
        CloseDatabase();
    }
    
    public void excluirAeroporto (long id_aeroporto) throws Exception{
        OpenDatabase();
        SQL = "DELETE FROM aeroportos WHEREid_aeroporto=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_aeroporto);
        ps.execute();
        CloseDatabase();
    }
}
