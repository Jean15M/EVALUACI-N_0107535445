/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Distribuidor;
import modelo.Medicamento;
import modelo.TipoMedicamento;

/**
 *
 * @author jeans
 */
public class Principal {
    
 public ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
 public ArrayList<TipoMedicamento> listaTipoMedicamento = new ArrayList<>();
 public ArrayList<Distribuidor> listaDistribuidor = new ArrayList<>();
    public static void main (String [] main){
        
    }
    
    public void crearDatos(){
        TipoMedicamento tipo1 = new TipoMedicamento("Analgésico");
        TipoMedicamento tipo2 = new TipoMedicamento("Analéptico");
        TipoMedicamento tipo3 = new TipoMedicamento("Anestésico");
        TipoMedicamento tipo4 = new TipoMedicamento("Antiácido");
        TipoMedicamento tipo5 = new TipoMedicamento("Antidepresivo");
        TipoMedicamento tipo6 = new TipoMedicamento("Antibióticos");
        listaTipoMedicamento.add(tipo1);
        listaTipoMedicamento.add(tipo2);
        listaTipoMedicamento.add(tipo3);
        listaTipoMedicamento.add(tipo4);
        listaTipoMedicamento.add(tipo5);
        listaTipoMedicamento.add(tipo6);
        
        Medicamento med1 = new Medicamento("Loratodina", tipo6, 50);
        Medicamento med2 = new Medicamento("Enterogermina", tipo1, 50);
        Medicamento med3 = new Medicamento("Dilocaina", tipo3, 50);
        Medicamento med4 = new Medicamento("Diclofenaco", tipo4, 50);
        Medicamento med5 = new Medicamento("Insulina", tipo2, 50);
        Medicamento med6 = new Medicamento("Meltisol", tipo5, 50);
        listaMedicamento.add(med1);
        listaMedicamento.add(med2);
        listaMedicamento.add(med3);
        listaMedicamento.add(med4);
        listaMedicamento.add(med5);
        listaMedicamento.add(med6);
        
        Distribuidor dis = new Distribuidor("COFARMA");
        Distribuidor dis2 = new Distribuidor("EMPSEPHAR");
        Distribuidor dis3 = new Distribuidor("CEMEFAR");
        listaDistribuidor.add(dis);
        listaDistribuidor.add(dis2);
        listaDistribuidor.add(dis3);
    }
}
