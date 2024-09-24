package IU_DIGITAL;

public class Empleado {
    // Creacion de los atributos de la clase Empleado con los atributos privados nombre, id, puesto, Departamento
    private String nombre;
    private String id;
    private String puesto;
    private Departamento departamento;

    // Metodo Constructor para inicializar los atributos de la clase Empleado
    public Empleado(String nombre, String id, String puesto) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
    }

    // Getters y Setters para obtener y modificar los atributos de la clase Empleado

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Metodo toString para mostrar los atributos de la clase Empleado
    @Override

    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", puesto='" + puesto + '\'' +
                ", departamento=" + (departamento != null ? departamento.getNombre() : "No asignado") +
                '}';
    }

}
