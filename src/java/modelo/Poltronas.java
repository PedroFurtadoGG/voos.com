/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Matheus
 */
public class Poltronas {
    
    private long id_poltronas;
    private String status;
    private String tipo;
    private String nome;
    private long id_avião;

    /**
     * @return the id_poltronas
     */
    public long getId_poltronas() {
        return id_poltronas;
    }

    /**
     * @param id_poltronas the id_poltronas to set
     */
    public void setId_poltronas(long id_poltronas) {
        this.id_poltronas = id_poltronas;
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
     * @return the id_avião
     */
    public long getId_avião() {
        return id_avião;
    }

    /**
     * @param id_avião the id_avião to set
     */
    public void setId_avião(long id_avião) {
        this.id_avião = id_avião;
    }
    
    
    
}
