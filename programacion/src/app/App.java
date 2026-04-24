package app;

import java.util.Scanner;
import control.ClienteControl;
import control.ClaseControl;
import control.EntrenadorControl;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClienteControl clienteControl = new ClienteControl();
        ClaseControl claseControl = new ClaseControl();
        EntrenadorControl entrenadorControl = new EntrenadorControl();

        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Clientes");
            System.out.println("2. Clases");
            System.out.println("3. Entrenadores");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    menuClientes(sc, clienteControl);
                    break;

                case 2:
                    menuClases(sc, claseControl);
                    break;

                case 3:
                    menuEntrenadores(sc, entrenadorControl);
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }

    // -------- CLIENTES --------

    public static void menuClientes(Scanner sc, ClienteControl control) {
        int opcion;

        do {
            System.out.println("\n--- CLIENTES ---");
            System.out.println("1. Ver clientes");
            System.out.println("2. Añadir cliente");
            System.out.println("3. Editar cliente");
            System.out.println("4. Borrar cliente");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    control.verClientes();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    control.insertar(nombre, email, telefono);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String tel = sc.nextLine();
                    control.actualizar(id, tel);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int idEliminar = sc.nextInt();
                    control.eliminar(idEliminar);
                    break;
            }

        } while (opcion != 0);
    }

    // -------- CLASES --------

    public static void menuClases(Scanner sc, ClaseControl control) {
        int opcion;

        do {
            System.out.println("\n--- CLASES ---");
            System.out.println("1. Ver clases");
            System.out.println("2. Añadir clase");
            System.out.println("3. Editar clase");
            System.out.println("4. Borrar clase");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    control.verClases();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombreClase = sc.nextLine();
                    System.out.print("Horario: ");
                    String horarioClase = sc.nextLine();
                    control.insertar(nombreClase, horarioClase);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idClase = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo horario: ");
                    String nuevoHorario = sc.nextLine();
                    control.actualizar(idClase, nuevoHorario);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int idEliminarClase = sc.nextInt();
                    control.eliminar(idEliminarClase);
                    break;
            }

        } while (opcion != 0);
    }

    // -------- ENTRENADORES --------

    public static void menuEntrenadores(Scanner sc, EntrenadorControl control) {
        int opcion;

        do {
            System.out.println("\n--- ENTRENADORES ---");
            System.out.println("1. Ver entrenadores");
            System.out.println("2. Añadir entrenador");
            System.out.println("3. Editar entrenador");
            System.out.println("4. Borrar entrenador");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    control.verEntrenadores();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombreEntrenador = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String especialidad = sc.nextLine();
                    control.insertar(nombreEntrenador, especialidad);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idEntrenador = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nueva especialidad: ");
                    String nuevaEspecialidad = sc.nextLine();
                    control.actualizar(idEntrenador, nuevaEspecialidad);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int idEliminarEntrenador = sc.nextInt();
                    control.eliminar(idEliminarEntrenador);
                    break;
            }

        } while (opcion != 0);
    }
}