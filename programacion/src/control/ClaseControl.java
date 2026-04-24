package control;

import dao.ClaseDAO;
import vo.Clase;
import java.util.ArrayList;

public class ClaseControl {

    public void verClases() {
        ArrayList<Clase> lista = ClaseDAO.getClases();

        for (Clase c : lista) {
            System.out.println(
                c.getId() + " - " +
                c.getNombre() + " - " +
                c.getHorario()
            );
        }
    }

    public void insertar(String nombre, String horario) {
        ClaseDAO.insertar(nombre, horario);
    }

    public void actualizar(int id, String horario) {
        ClaseDAO.actualizar(id, horario);
    }

    public void eliminar(int id) {
        ClaseDAO.eliminar(id);
    }
}