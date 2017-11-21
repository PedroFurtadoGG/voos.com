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
public class Voos {
    
    private long id_voo;
    private String status;
    private long id_aviao;

    /**
     * @return the id_voo
     */
    public long getId_voo() {
        return id_voo;
    }

    /**
     * @param id_voo the id_voo to set
     */
    public void setId_voo(long id_voo) {
        this.id_voo = id_voo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

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
    
    
    
}
