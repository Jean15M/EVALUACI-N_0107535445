/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import controlador.Principal;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Distribuidor;
import modelo.Medicamento;
import modelo.TipoMedicamento;

/**
 *
 * @author jeans
 */
@WebService(serviceName = "operaciones")
public class operaciones {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "crearProducto")
    public Medicamento crear(String nombre, TipoMedicamento tipo, int stock){
        Principal p = new Principal();
        Medicamento medicamentoCreado = new Medicamento(nombre, tipo, stock);
        
        return medicamentoCreado;
    }
    
     @WebMethod(operationName = "cargarMedicamentos")
     public List<Medicamento> cargarMedicamentos(){
         Principal p = new Principal();
         p.crearDatos();
         List<Medicamento> listaMedicamentos = null;
         if(!p.listaMedicamento.isEmpty()){
            listaMedicamentos = p.listaMedicamento;
         }
         return listaMedicamentos;
     }
     
     public List<Distribuidor> cargarDistribuidor(){
         Principal p = new Principal();
         p.crearDatos();
         List<Distribuidor> listaDistribuidor = null;
         if(!p.listaDistribuidor.isEmpty()){
            listaDistribuidor = p.listaDistribuidor;
         }
         return listaDistribuidor;
     }
     
     public boolean eliminar(String nombre){
         Principal p = new Principal();
         boolean bandera=false;
         p.crearDatos();
         for (int i = 0; i < p.listaMedicamento.size(); i++) {
             if(p.listaMedicamento.get(i).getNombre().equals(nombre)){
                 p.listaMedicamento.remove(p.listaMedicamento.get(i));
                 bandera=true;
                 
             }
         }
         return bandera;
     }
     
     
}
