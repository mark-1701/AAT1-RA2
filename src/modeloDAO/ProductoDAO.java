package modeloDAO;

import java.io.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

public class ProductoDAO {

    LinkedList<Producto> listaP = new LinkedList<Producto>();

    public DefaultTableModel listar() {
        cargar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Cantidad");
        model.addColumn("Precio");

        Object[] fila = new Object[5];

        try {
            for (Producto p : listaP) {
                fila[0] = p.getCodigo();
                fila[1] = p.getNombre();
                fila[2] = p.getDescripcion();
                fila[3] = p.getCantidad();
                fila[4] = p.getPrecio();
                model.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla productos", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }

        return model;
    }
    
    public void add(Producto producto) {
        cargar();
        try {
            listaP.add(producto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar producto", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }
    
    //NO LLEVA CARGAR
    public Producto serch(int codigo) {
        int i = 0;
        Producto producto = null;
        try {
            for (Producto p : listaP) {
                if (p.getCodigo() == codigo) {
                    producto = p;
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al encontrar producto", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        return producto;
    }
    
    public void editar(Producto producto) {
        cargar();
        int codigo = producto.getCodigo();
        int i = 0;
        try {
            for (Producto p : listaP) {
                if (p.getCodigo() == codigo) {
                    break;
                }
                i++;
            }
            listaP.set(i, producto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar producto", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }
    
    //NO LLEVA CARGAR
    public void delete(int codigo) {
        int i = 0;
        try {
            for (Producto p : listaP) {
                if (p.getCodigo() == codigo) {
                    break;
                }
                i++;
            }
            listaP.remove(i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar producto", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }

    public void guardar() {
        try {
            FileOutputStream fileOut = new FileOutputStream("productos.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaP);
            out.close();
            fileOut.close();
            System.out.println("La lista se ha serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargar() {
        try {
            FileInputStream fileIn = new FileInputStream("productos.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //tomamos la lista ya creada
            listaP = (LinkedList<Producto>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("La lista se ha deserializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
