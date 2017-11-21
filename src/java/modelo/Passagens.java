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
public class Passagens {
    
    private long id_passagem;
    private String portao_embarque;
    private String status;
    private String classe;
    private Date hr_embarque;
    private Date data_ida;
    private Date data_volta;
    private long id_voo;
    private long id_reserva;

    /**
     * @return the id_passagem
     */
    public long getId_passagem() {
        return id_passagem;
    }

    /**
     * @param id_passagem the id_passagem to set
     */
    public void setId_passagem(long id_passagem) {
        this.id_passagem = id_passagem;
    }

    /**
     * @return the portao_embarque
     */
    public String getPortao_embarque() {
        return portao_embarque;
    }

    /**
     * @param portao_embarque the portao_embarque to set
     */
    public void setPortao_embarque(String portao_embarque) {
        this.portao_embarque = portao_embarque;
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
     * @return the hr_embarque
     */
    public Date getHr_embarque() {
        return hr_embarque;
    }

    /**
     * @param hr_embarque the hr_embarque to set
     */
    public void setHr_embarque(Date hr_embarque) {
        this.hr_embarque = hr_embarque;
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
    
    
    
}
