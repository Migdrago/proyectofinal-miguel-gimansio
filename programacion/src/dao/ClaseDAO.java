package dao;

import java.sql.*;
import java.util.ArrayList;
import vo.Clase;

public class ClaseDAO {

    public static ArrayList<Clase> getClases() {
        ArrayList<Clase> lista = new ArrayList<>();

        try {
            Connection con = Database.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM clase");

            while (rs.next()) {
                lista.add(new Clase(
                        rs.getInt("id_clase"),
                        rs.getString("nombre"),
                        rs.getString("horario")
                ));
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        return lista;
    }

    public static void insertar(String nombre, String horario) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO clase(nombre, horario) VALUES (?, ?)"
            );

            ps.setString(1, nombre);
            ps.setString(2, horario);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void actualizar(int id, String horario) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE clase SET horario=? WHERE id_clase=?"
            );

            ps.setString(1, horario);
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
                    "DELETE FROM clase WHERE id_clase=?"
            );

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}