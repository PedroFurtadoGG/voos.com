/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import modelo.Avioes;

/**
 *
 * @author Matheus
 */
public class aviaoDao extends Conexao {

    public void cadastrarAviao(Avioes a) throws Exception {
        OpenDatabase();
        SQL = "INSERT INTO avioes(modelo, qtde_poltronas"
                + "VALUES(?, ?)";
        ps = con.prepareStatement(SQL);
        ps.setString(1, a.getModelo());
        ps.setInt(2, a.getQtde_poltronas());
        ps.execute();
        CloseDatabase();
    }

    public Avioes visualizarAviao(long id_aviao) throws Exception {
        OpenDatabase();
        SQL = "SELECT * FROM avioes WHERE id_aviao=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_aviao);
        rs = ps.executeQuery();
        Avioes a = new Avioes();
        if (rs.next()) {
            a.setId_aviao(rs.getLong("id_aviao"));
        }
        a.setModelo(rs.getString("modelo"));
        a.setQtde_poltronas(rs.getInt("qtde_poltronas"));

        CloseDatabase();

        return a;
    }

    public List listarAvioes() throws Exception {
        OpenDatabase();
        SQL = "SELECT * FROM avioes ORDER BY id_avioes";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaAvioes = new ArrayList();
        while (rs.next()) {
            Avioes a = new Avioes();
            a.setId_aviao(rs.getLong("id_aviao"));
            a.setModelo(rs.getString("modelo"));
            a.setQtde_poltronas(rs.getInt("qtde_poltrona"));

            listaAvioes.add(a);
        }
        CloseDatabase();
        return listaAvioes;

    }

    public void atualizarAvioes(Avioes a) throws Exception {
        OpenDatabase();
        SQL = "UPDATE avioes SET id_avioes=?, modelo=?, qtde_poltrona=?, WHERE id_avioes=?";

        ps = con.prepareStatement(SQL);
        ps.setLong(1, a.getId_aviao());
        ps.setString(2, a.getModelo());
        ps.setInt(3, a.getQtde_poltronas());
        ps.setLong(4, a.getId_aviao());
        ps.execute();
        CloseDatabase();
    }

    public void excluirAviao(long id_avioes) throws Exception {
        OpenDatabase();
        SQL = "DELETE FROM avioes WHERE id_avioes=?";
        ps = con.prepareStatement(SQL);
        ps.setLong(1, id_avioes);
        ps.execute();
        CloseDatabase();
    }

}
