package IU_DIGITAL;

public class Departamento {
    //atributos clase departamento
    private String nombre;
    private ArrayList<Empleado> empleados;

    //metodo constructor
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // metodo get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo agregar empleado
    public void agregarEmpleado(Empleado empleado) throws EmpleadoYaAsignadoException {
        if (empleados.contains(empleado)) {
            throw new EmpleadoYaAsignadoException("El empleado " + empleado.getNombre() + " ya está asignado a este departamento.");
        }
        empleados.add(empleado);
        empleado.setDepartamento(this);
    }
}
