package app;

import java.util.Scanner;
import control.ClienteControl;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Ver clientes");
            System.out.println("2. Añadir cliente");
            System.out.println("3. Modificar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    ClienteControl.verClientes();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Telefono: ");
                    String tel = sc.nextLine();

                    ClienteControl.insertar(nombre, email, tel);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nuevo telefono: ");
                    String t = sc.nextLine();

                    ClienteControl.actualizar(id, t);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int idDel = sc.nextInt();

                    ClienteControl.eliminar(idDel);
                    break;
            }

        } while (opcion != 0);
    }
}