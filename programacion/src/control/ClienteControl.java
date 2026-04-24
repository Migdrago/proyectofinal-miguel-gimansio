package control;

import dao.ClienteDAO;
import vo.Cliente;
import java.util.ArrayList;

public class ClienteControl {

    public void verClientes() {

        ArrayList<Cliente> lista = ClienteDAO.getClientes();

        for (Cliente c : lista) {
            System.out.println(
                c.getId() + " - " +
                c.getNombre() + " - " +
                c.getEmail() + " - " +
                c.getTelefono()
            );
        }
    }

    public void insertar(String nombre, String email, String telefono) {
        ClienteDAO.insertar(nombre, email, telefono);
    }

    public void actualizar(int id, String telefono) {
        ClienteDAO.actualizar(id, telefono);
    }

    public void eliminar(int id) {
        ClienteDAO.eliminar(id);
    }
}