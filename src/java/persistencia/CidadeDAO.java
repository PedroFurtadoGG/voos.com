/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import modelo.Cidades;
import Conexao.Conexao;

/**
 *
 * @author Matheus
 */
public class CidadeDAO extends Conexao {

    public void cadastrarCidades(Cidades c) throws Exception {
        OpenDatabase();
        SQL = "INSERT INTO cidades(uf, nome)"
                + "VALUES(?, ?)";
        ps = con.prepareStatement(SQL);
        ps.setString(1, c.getUf());
        ps.setString(2, c.getNome());
        ps.execute();
        CloseDatabase();
    }

    public List listarCidades() throws Exception {
        OpenDatabase();
        SQL = "SELECT * FROM cidades ORDER BY id_cidade";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaCidades = new ArrayList();
        while (rs.next()) {
            Cidades a = new Cidades();
            a.setId_cidade(rs.getLong("id_cidade"));
            a.setUf(rs.getString("uf"));
            a.setNome(rs.getString("nome"));

            listaCidades.add(a);
        }
        CloseDatabase();
        return listaCidades;

    }
    
    public Cidades visualizarCidade(long id_cidade) throws Exception {
        OpenDatabase();
        SQL = "SELECT * FROM cidades WHERE id_cidade=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_cidade);
        rs = ps.executeQuery();
        Cidades a = new Cidades();
        if (rs.next()) {
            a.setId_cidade(rs.getLong("id_cidade"));
        }
        a.setNome(rs.getString("nome"));
        a.setUf(rs.getString("uf"));

        CloseDatabase();

        return a;
    }

    public void atualizarCidades(Cidades a) throws Exception {
        OpenDatabase();
        SQL = "UPDATE cidades SET uf=?, nome=?, WHERE id_cidades=?";

        ps = con.prepareStatement(SQL);
        //ps.setLong(1, a.getId_cidade());
        ps.setString(1, a.getUf());
        ps.setString(2, a.getNome());
        ps.setLong(3, a.getId_cidade());
        ps.execute();
        CloseDatabase();
    }

    public void excluirCidades(long id_cidades) throws Exception {
        OpenDatabase();
        SQL = "DELETE FROM avioes WHERE id_cidades=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_cidades);
        ps.execute();
        CloseDatabase();
    }
}
