package vo;

public class Entrenador {

    private int id;
    private String nombre;
    private String especialidad;

    public Entrenador(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
}