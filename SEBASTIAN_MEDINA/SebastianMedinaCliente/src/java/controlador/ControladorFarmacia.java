/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sw.Medicamento;
import sw.Operaciones;
import sw.Operaciones_Service;
import vista.Farmacia;
import vista.GestionMedicamentos;

/**
 *
 * @author jeans
 */
public class ControladorFarmacia {

    private Operaciones_Service servicio;
    private Operaciones cliente;
    private Farmacia vistaFarmacia;

    public ControladorFarmacia(Operaciones_Service servicio, Operaciones cliente, Farmacia vistaFarmacia) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.vistaFarmacia = vistaFarmacia;
        vistaFarmacia.setVisible(true);
        llenarComboBox();
    }

    public void iniciarControlador() {
        vistaFarmacia.getBtnReservar().addActionListener(l->realizarReserva());
        vistaFarmacia.getBtnDesarrollador().addActionListener(l->llamarControl());
        vistaFarmacia.getCbMedicamentos().addActionListener(l->llenarCampo());
    }

    public void llenarComboBox() {
        JComboBox<String> combo = vistaFarmacia.getCbMedicamentos();
        JComboBox<String> combo2 = vistaFarmacia.getCbDistribuidor();
        JComboBox<String> combo3 = vistaFarmacia.getCbSucursal();
        combo3.addItem("PRINCIPAL");
        combo3.addItem("SECUNDARIA");
        for (int i = 0; i < cliente.cargarMedicamentos().size(); i++) {
            combo.addItem(cliente.cargarMedicamentos().get(i).getNombre());
        }

        for (int i = 0; i < cliente.cargarDistribuidor().size(); i++) {
            combo2.addItem(cliente.cargarDistribuidor().get(i).getDistribuidor());
        }

    }

    public void realizarReserva() {
        if (Integer.parseInt(vistaFarmacia.getTxtCantidad().getText()) > 0 || vistaFarmacia.getCbMedicamentos().getSelectedIndex() != 0) {
            String medicamento = vistaFarmacia.getCbMedicamentos().getSelectedItem().toString();
            String tipo = vistaFarmacia.getTxtTipoMedicamento().getText();
            int cantidad = Integer.parseInt(vistaFarmacia.getTxtCantidad().getText());
            String distribuidor = vistaFarmacia.getCbDistribuidor().getSelectedItem().toString();
            String sucursal = vistaFarmacia.getCbSucursal().getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Pedido realizado correctamente, sus datos son: \n" + "Medicamento: " + medicamento + "\n" + "Tipo Medicamento: " + tipo + "\n" + "Cantidad: " + cantidad + "\n" + "Distribuidor: " + distribuidor + "\n" + "Sucursal: " + sucursal);
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
        }

    }

    public void llenarCampo() {
        if (vistaFarmacia.getCbMedicamentos().getSelectedIndex()!= 0) {
            String eleccion = vistaFarmacia.getCbMedicamentos().getSelectedItem().toString();
            for (int i = 0; i < cliente.cargarMedicamentos().size(); i++) {
                if (cliente.cargarMedicamentos().get(i).getNombre().equals(eleccion)) {
                    vistaFarmacia.getTxtTipoMedicamento().setText(cliente.cargarMedicamentos().get(i).getTipoMedicamento().getNombre());
                }
            }
        }
    }
    
    public void llamarControl(){
        Operaciones_Service servicio = new Operaciones_Service();
        Operaciones cliente = servicio.getOperacionesPort();
        GestionMedicamentos vistaG = new GestionMedicamentos();
        ControladorGestionMedicamentos iniciar = new ControladorGestionMedicamentos(servicio, cliente, vistaG);
        iniciar.iniciarControlador();
    }

}
