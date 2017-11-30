/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Matheus
 */
public class Reservas {
    
    private long id_reserva;
    private String classe;
    private Double valor;
    private String status;
    private Date data_ida;
    private Date data_volta;
    private int qtde;
    private long id_usuario;
    private long id_aeroporto;
    private long id_poltrona;
    private String hr_embarque;
    
    
    /**
     * @return the id_reserva
     */
    public long getId_reserva() {
        return id_reserva;
    }

    /**
     * @param id_reserva the id_reserva to set
     */
    public void setId_reserva(long id_reserva) {
        this.id_reserva = id_reserva;
    }

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

    /**
     * @return the valor
     */
    

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
     * @return the data_ida
     */
    public Date getData_ida() {
        return data_ida;
    }

    /**
     * @param data_ida the data_ida to set
     */
    public void setData_ida(Date data_ida) {
        this.data_ida = data_ida;
    }

    /**
     * @return the data_volta
     */
    public Date getData_volta() {
        return data_volta;
    }

    /**
     * @param data_volta the data_volta to set
     */
    public void setData_volta(Date data_volta) {
        this.data_volta = data_volta;
    }

    /**
     * @return the qtde
     */
    public int getQtde() {
        return qtde;
    }

    /**
     * @param qtde the qtde to set
     */
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    /**
     * @return the id_usuario
     */
    public long getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

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
     * @return the id_poltrona
     */
    public long getId_poltrona() {
        return id_poltrona;
    }

    /**
     * @param id_poltrona the id_poltrona to set
     */
    public void setId_poltrona(long id_poltrona) {
        this.id_poltrona = id_poltrona;
    }

    /**
     * @return the hr_embarque
     */
    public String getHr_embarque() {
        return hr_embarque;
    }

    /**
     * @param hr_embarque the hr_embarque to set
     */
    public void setHr_embarque(String hr_embarque) {
        this.hr_embarque = hr_embarque;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}
