package IU_DIGITAL;

public class EmpleadoPermanente {
    // Atributo privado salario de la clase EmpleadoPermanente
    private double salario;

    // Metodo constructor de la clase EmpleadoPermanente que llama al constructor de la clase padre Empleado
    public EmpleadoPermanente(String nombre, String id, String puesto, double salario) {
        super(nombre, id, puesto);
        this.salario = salario;
    }
}
