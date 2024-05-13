/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sw.Medicamento;
import sw.Operaciones;
import sw.Operaciones_Service;
import sw.TipoMedicamento;
import vista.IngresoProductos;


/**
 *
 * @author jeans
 */
public class ControladorCrearProducto {
    private Operaciones_Service servicio;
    private Operaciones cliente;
    private IngresoProductos vistaIngreso;

    public ControladorCrearProducto(Operaciones_Service servicio, Operaciones cliente, IngresoProductos vistaIngreso) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.vistaIngreso = vistaIngreso;
        vistaIngreso.setVisible(true);
        llenarComboBox();
    }
    
    public void iniciarControlador(){
        vistaIngreso.getBtnCrear().addActionListener(l->crearProducto());
    }
    
    public void crearProducto(){
        String nombre = vistaIngreso.getTxtNombre().getText();
        int stock = Integer.parseInt(vistaIngreso.getTxtStock().getText());
        String tipo = vistaIngreso.getCbTipo().getSelectedItem().toString();
        cliente.crearProducto(nombre, null, stock);
        JOptionPane.showMessageDialog(null, "Ingresado correctamente");
        
    }
    
    public void llenarComboBox() {
        JComboBox<String> combo = vistaIngreso.getCbTipo();
        for (int i = 0; i < cliente.cargarMedicamentos().size(); i++) {
            combo.addItem(cliente.cargarMedicamentos().get(i).getTipoMedicamento().getNombre());
        }
    }
    
    
    
    
    
    
    
    
}
