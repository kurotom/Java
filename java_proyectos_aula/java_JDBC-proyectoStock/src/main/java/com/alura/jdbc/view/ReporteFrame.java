package com.alura.jdbc.view;

import java.awt.Container;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.alura.jdbc.controller.CategoriaController;
import com.alura.jdbc.models.Categoria;
import com.alura.jdbc.models.Producto;



public class ReporteFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private JTable tablaReporte;
    private DefaultTableModel modelo;

    private CategoriaController categoriaController;

    public ReporteFrame(ControlDeStockFrame controlDeStockFrame) {
        super("Reporte de produtos del stock");

        this.categoriaController = new CategoriaController();

        Container container = getContentPane();
        setLayout(null);

        tablaReporte = new JTable();
        tablaReporte.setBounds(0, 0, 600, 400);
        container.add(tablaReporte);

        modelo = (DefaultTableModel) tablaReporte.getModel();
        
        modelo.addColumn("");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");

        cargaReporte();

        setSize(600, 400);
        setVisible(true);
        setLocationRelativeTo(controlDeStockFrame);
    }

    private void cargaReporte() {
    	List<Categoria> contenido = categoriaController.cargaReporte();
        
        // TODO
        contenido.forEach(filaCategoria -> {
//        	
//        	La primera fila se deja que pone la categoria y los demás espacios en blacos
//        	para separar
        	modelo.addRow(new Object[] { filaCategoria.getNombre(), "", "", "" });
        	
        	List<Producto> productos = filaCategoria.getProductos();
        	
//        	
//        	Agrega las líneas de producto, dejando la primera fila en blanco
        	productos.forEach(producto -> {
        		modelo.addRow(new Object[] {
        				"",
        				producto.getNombre(),
        				producto.getCantidad(),
        		});
        	});
//        	
        });
                
    }

}
