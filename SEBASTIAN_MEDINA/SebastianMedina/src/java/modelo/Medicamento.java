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
public class Medicamento implements Serializable {
    private String nombre;
    private TipoMedicamento tipoMedicamento;
    private int stock;

    public Medicamento() {
    }

    public Medicamento(String nombre, TipoMedicamento tipoMedicamento, int stock) {
        this.nombre = nombre;
        this.tipoMedicamento = tipoMedicamento;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMedicamento getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(TipoMedicamento tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", tipoMedicamento=" + tipoMedicamento + ", stock=" + stock + '}';
    }
    
    
}
