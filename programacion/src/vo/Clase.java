package vo;

public class Clase {

    private int id;
    private String nombre;
    private String horario;

    public Clase(int id, String nombre, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getHorario() { return horario; }
}