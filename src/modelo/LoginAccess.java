package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class LoginAccess {

    LinkedList<Vendedor> lista = new LinkedList<Vendedor>();

    public boolean serch(String nombre, String password) {
        cargar();
        try {
            for (Vendedor v : lista) {
                if (v.getNombre().equals(nombre) && v.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al encontrar vendedor", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR" + e);
        }

        return false;
    }

    public void guardar() {
        try {
            FileOutputStream fileOut = new FileOutputStream("lista.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lista);
            out.close();
            fileOut.close();
            System.out.println("La lista se ha serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargar() {
        try {
            FileInputStream fileIn = new FileInputStream("lista.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //tomamos la lista ya creada
            lista = (LinkedList<Vendedor>) in.readObject();
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
