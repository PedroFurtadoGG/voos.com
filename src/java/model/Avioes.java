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
public class Avioes {
    
    private long id_aviao;
    private String modelo;
    private int qtde_poltronas;

    /**
     * @return the id_aviao
     */
    public long getId_aviao() {
        return id_aviao;
    }

    /**
     * @param id_aviao the id_aviao to set
     */
    public void setId_aviao(long id_aviao) {
        this.id_aviao = id_aviao;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the qtde_poltronas
     */
    public int getQtde_poltronas() {
        return qtde_poltronas;
    }

    /**
     * @param qtde_poltronas the qtde_poltronas to set
     */
    public void setQtde_poltronas(int qtde_poltronas) {
        this.qtde_poltronas = qtde_poltronas;
    }
    
    
}
