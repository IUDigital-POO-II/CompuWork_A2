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
}
