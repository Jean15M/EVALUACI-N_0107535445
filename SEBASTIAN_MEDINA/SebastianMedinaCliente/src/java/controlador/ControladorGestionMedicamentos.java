/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sw.Medicamento;
import sw.Operaciones;
import sw.Operaciones_Service;
import vista.GestionMedicamentos;
import vista.IngresoProductos;

/**
 *
 * @author jeans
 */
public class ControladorGestionMedicamentos {

    private Operaciones_Service servicio;
    private Operaciones cliente;
    private GestionMedicamentos vistaGestion;

    public ControladorGestionMedicamentos(Operaciones_Service servicio, Operaciones cliente, GestionMedicamentos vistaGestion) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.vistaGestion = vistaGestion;
        vistaGestion.setVisible(true);
        rellenarTabla();
    }

    public void iniciarControlador() {
        vistaGestion.getBtnBuscar().addActionListener(l->buscar());
        vistaGestion.getBtnCrear().addActionListener(l->crear());
        vistaGestion.getBtnEliminar().addActionListener(l->eliminarProducto());
    }

    public void rellenarTabla() {
        limpiartabla();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Nombre", "Tipo", "Stock"}, 0);
        String[] datos = new String[3];
        for (int i = 0; i < cliente.cargarMedicamentos().size(); i++) {
            datos[0] = cliente.cargarMedicamentos().get(i).getNombre();
            datos[1] = cliente.cargarMedicamentos().get(i).getTipoMedicamento().getNombre();
            datos[2] = String.valueOf(cliente.cargarMedicamentos().get(i).getStock());
            model.addRow(datos);
        }
        vistaGestion.getTbMedicamentos().setModel(model);
    }

    public void buscar() {
        String buscar = vistaGestion.getTxtBuscar().getText();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Nombre", "Tipo", "Stock"}, 0);
        for (Medicamento medicamento : cliente.cargarMedicamentos()) {
        if (medicamento.getNombre().equals(buscar)) {
            Object[] datos = new Object[3];
            datos[0] = medicamento.getNombre();
            datos[1] = medicamento.getTipoMedicamento().getNombre();
            datos[2] = medicamento.getStock();
            model.addRow(datos);
        }
    }
    
    vistaGestion.getTbMedicamentos().setModel(model);
    }
    
    public void crear(){
        Operaciones_Service servicio = new Operaciones_Service();
        Operaciones cliente = servicio.getOperacionesPort();
        IngresoProductos vistaI = new IngresoProductos();
        ControladorCrearProducto iniciar = new ControladorCrearProducto(servicio, cliente, vistaI);
    }

    public void limpiartabla() {
        DefaultTableModel temp = (DefaultTableModel) vistaGestion.getTbMedicamentos().getModel();
        int filas = vistaGestion.getTbMedicamentos().getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }
    
    public void eliminarProducto(){
        int fila = vistaGestion.getTbMedicamentos().getSelectedRow();
        if(fila != -1){
            String nombre = (String) vistaGestion.getTbMedicamentos().getValueAt(fila, 0);
            if(cliente.eliminar(nombre)==true){
                JOptionPane.showMessageDialog(null, "eliminado correctamente");
                rellenarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "no existe");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila primero...");
        }
    }

}
