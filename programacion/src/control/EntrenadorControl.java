package control;

import dao.EntrenadorDAO;
import vo.Entrenador;
import java.util.ArrayList;

public class EntrenadorControl {

    public void verEntrenadores() {
        ArrayList<Entrenador> lista = EntrenadorDAO.getEntrenadores();

        for (Entrenador e : lista) {
            System.out.println(
                e.getId() + " - " +
                e.getNombre() + " - " +
                e.getEspecialidad()
            );
        }
    }

    public void insertar(String nombre, String especialidad) {
        EntrenadorDAO.insertar(nombre, especialidad);
    }

    public void actualizar(int id, String especialidad) {
        EntrenadorDAO.actualizar(id, especialidad);
    }

    public void eliminar(int id) {
        EntrenadorDAO.eliminar(id);
    }
}