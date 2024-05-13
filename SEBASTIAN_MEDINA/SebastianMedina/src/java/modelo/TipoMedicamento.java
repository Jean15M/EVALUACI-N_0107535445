/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jeans
 */
public class TipoMedicamento implements Serializable {
    private String nombre;
    private ArrayList<Medicamento> listaMedicamento;
    public TipoMedicamento() {
    }

    public TipoMedicamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(ArrayList<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

    @Override
    public String toString() {
        return "TipoMedicamento{" + "nombre=" + nombre + '}';
    }
    
    
}
