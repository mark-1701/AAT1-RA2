package modeloDAO;

import java.io.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Sucursal;

public class SucursalDAO {
    
    LinkedList<Sucursal> listaS = new LinkedList<Sucursal>();
    
    public DefaultTableModel listar() {
        cargar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        model.addColumn("Correo");
        model.addColumn("Telefono");

        Object[] fila = new Object[5];

        try {
            for (Sucursal s : listaS) {
                fila[0] = s.getCodigo();
                fila[1] = s.getNombre();
                fila[2] = s.getDireccion();
                fila[3] = s.getCorreo();
                fila[4] = s.getTelefono();
                model.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla sucursales", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }

        return model;
    }
    
    public void add(Sucursal sucursal) {
        cargar();
        try {
            listaS.add(sucursal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar surcursal", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }
    
    //NO LLEVA CARGAR
    public Sucursal serch(int codigo) {
        int i = 0;
        Sucursal sucursal = null;
        try {
            for (Sucursal s : listaS) {
                if (s.getCodigo() == codigo) {
                    sucursal = s;
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al encontrar sucursal", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        return sucursal;
    }
    
    public void editar(Sucursal sucursal) {
        cargar();
        int codigo = sucursal.getCodigo();
        int i = 0;
        try {
            for (Sucursal s : listaS) {
                if (s.getCodigo() == codigo) {
                    break;
                }
                i++;
            }
            listaS.set(i, sucursal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar sucursal", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }
    
    //NO LLEVA CARGAR
    public void delete(int codigo) {
        int i = 0;
        try {
            for (Sucursal s : listaS) {
                if (s.getCodigo() == codigo) {
                    break;
                }
                i++;
            }
            listaS.remove(i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar sucursal", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }

        guardar();
    }
    
    public void guardar() {
        try {
            FileOutputStream fileOut = new FileOutputStream("sucursales.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaS);
            out.close();
            fileOut.close();
            System.out.println("La lista se ha serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargar() {
        try {
            FileInputStream fileIn = new FileInputStream("sucursales.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //tomamos la lista ya creada
            listaS = (LinkedList<Sucursal>) in.readObject();
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
