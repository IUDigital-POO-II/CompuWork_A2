package IU_DIGITAL;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    private String nombre;
    private List<Empleado> empleados;

    // Constructor
    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para gestionar empleados en el departamento
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(int idEmpleado) {
        empleados.removeIf(empleado -> empleado.getId() == idEmpleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    // Método para mostrar información del departamento
    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}

