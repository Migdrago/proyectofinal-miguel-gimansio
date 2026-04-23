package control;

import dao.ClienteDAO;
import vo.Cliente;
import java.util.ArrayList;

public class ClienteControl {

    public static void verClientes() {
        ArrayList<Cliente> lista = ClienteDAO.getClientes();

        for (Cliente c : lista) {
            System.out.println(c.getId() + " - " + c.getNombre());
        }
    }

    public static void insertar(String nombre, String email, String telefono) {
        ClienteDAO.insertar(nombre, email, telefono);
    }

    public static void actualizar(int id, String telefono) {
        ClienteDAO.actualizar(id, telefono);
    }

    public static void eliminar(int id) {
        ClienteDAO.eliminar(id);
    }
}