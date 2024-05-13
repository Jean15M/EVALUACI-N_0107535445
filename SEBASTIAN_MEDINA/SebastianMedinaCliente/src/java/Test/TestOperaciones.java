/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import controlador.ControladorFarmacia;
import sw.Operaciones;
import sw.Operaciones_Service;
import vista.Farmacia;

/**
 *
 * @author jeans
 */
public class TestOperaciones {
    public static void main (String[] args){
        Operaciones_Service servicio = new Operaciones_Service();
        Operaciones cliente = servicio.getOperacionesPort();
        Farmacia vistaF = new Farmacia();
        ControladorFarmacia iniciar = new ControladorFarmacia(servicio, cliente, vistaF);
        iniciar.iniciarControlador();
        
    }
}
