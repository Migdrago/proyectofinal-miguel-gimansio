package dao;

import java.sql.*;
import java.util.ArrayList;
import vo.Cliente;

public class ClienteDAO {

    public static ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> lista = new ArrayList<>();

        try {
            Connection con = Database.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cliente");

            while (rs.next()) {
                lista.add(new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono")
                ));
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        return lista;
    }

    public static void insertar(String nombre, String email, String telefono) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO cliente(nombre, email, telefono) VALUES (?, ?, ?)"
            );

            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.setString(3, telefono);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void actualizar(int id, String telefono) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE cliente SET telefono=? WHERE id_cliente=?"
            );

            ps.setString(1, telefono);
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
                    "DELETE FROM cliente WHERE id_cliente=?"
            );

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}