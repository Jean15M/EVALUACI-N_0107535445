/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author jeans
 */
public class Distribuidor implements Serializable{
    private String distribuidor;
    private Medicamento medicamento;
    public Distribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public Distribuidor() {
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "distribuidor=" + distribuidor + ", medicamento=" + medicamento + '}';
    }
}
