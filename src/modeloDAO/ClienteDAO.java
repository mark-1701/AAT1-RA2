package modeloDAO;

import java.io.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class ClienteDAO {
    
    LinkedList<Cliente> listaC = new LinkedList<Cliente>();
    
    public DefaultTableModel listar() {
        cargar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("NIT");
        model.addColumn("Correo");
        model.addColumn("Genero");

        Object[] fila = new Object[5];

        try {
            for (Cliente c : listaC) {
                fila[0] = c.getCodigo();
                fila[1] = c.getNombre();
                fila[2] = c.getNit();
                fila[3] = c.getCorreo();
                fila[4] = c.getGenero();
                model.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla cliente", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }

        return model;
    }
    
    public void add(Cliente cliente) {
        cargar();
        try {
            listaC.add(cliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar cliente", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }
    
    //NO LLEVA CARGAR
    public Cliente serch(int codigo) {
        int i = 0;
        Cliente cliente = null;
        try {
            for (Cliente c : listaC) {
                if (c.getCodigo() == codigo) {
                    cliente = c;
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al encontrar cliente", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        return cliente;
    }
    
    public void editar(Cliente cliente) {
        cargar();
        int codigo = cliente.getCodigo();
        int i = 0;
        try {
            for (Cliente c : listaC) {
                if (c.getCodigo() == codigo) {
                    break;
                }
                i++;
            }
            listaC.set(i, cliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar cliente", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }
    
    //NO LLEVA CARGAR
    public void delete(int codigo) {
        int i = 0;
        try {
            for (Cliente c : listaC) {
                if (c.getCodigo() == codigo) {
                    break;
                }
                i++;
            }
            listaC.remove(i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }
        guardar();
    }
    
    public void guardar() {
        try {
            FileOutputStream fileOut = new FileOutputStream("clientes.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaC);
            out.close();
            fileOut.close();
            System.out.println("La lista se ha serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargar() {
        try {
            FileInputStream fileIn = new FileInputStream("Clientes.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //tomamos la lista ya creada
            listaC = (LinkedList<Cliente>) in.readObject();
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
