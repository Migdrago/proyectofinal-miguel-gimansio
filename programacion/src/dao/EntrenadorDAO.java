package dao;

import java.sql.*;
import java.util.ArrayList;
import vo.Entrenador;

public class EntrenadorDAO {

    public static ArrayList<Entrenador> getEntrenadores() {
        ArrayList<Entrenador> lista = new ArrayList<>();

        try {
            Connection con = Database.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM entrenador");

            while (rs.next()) {
                lista.add(new Entrenador(
                        rs.getInt("id_entrenador"),
                        rs.getString("nombre"),
                        rs.getString("especialidad")
                ));
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        return lista;
    }

    public static void insertar(String nombre, String especialidad) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO entrenador(nombre, especialidad) VALUES (?, ?)"
            );

            ps.setString(1, nombre);
            ps.setString(2, especialidad);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void actualizar(int id, String especialidad) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE entrenador SET especialidad=? WHERE id_entrenador=?"
            );

            ps.setString(1, especialidad);
            ps.setInt(2, id);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void eliminar(int id) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM entrenador WHERE id_entrenador=?"
            );

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}