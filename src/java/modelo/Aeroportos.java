/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matheus
 */
public class Aeroportos {
    
    private long id_aeroporto;
    private String nome;
    private String link_localizacao;
    private long id_cidade;

    /**
     * @return the id_aeroporto
     */
    public long getId_aeroporto() {
        return id_aeroporto;
    }

    /**
     * @param id_aeroporto the id_aeroporto to set
     */
    public void setId_aeroporto(long id_aeroporto) {
        this.id_aeroporto = id_aeroporto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the link_localizacao
     */
    public String getLink_localizacao() {
        return link_localizacao;
    }

    /**
     * @param link_localizacao the link_localizacao to set
     */
    public void setLink_localizacao(String link_localizacao) {
        this.link_localizacao = link_localizacao;
    }

    /**
     * @return the id_cidade
     */
    public long getId_cidade() {
        return id_cidade;
    }

    /**
     * @param id_cidade the id_cidade to set
     */
    public void setId_cidade(long id_cidade) {
        this.id_cidade = id_cidade;
    }
    
    
    
}
