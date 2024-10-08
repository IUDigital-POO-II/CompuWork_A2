package IU_DIGITAL;

public class EmpleadoPermanente extends Empleado{
    // Atributo privado salario de la clase EmpleadoPermanente
    private double salario;

    // Metodo constructor de la clase EmpleadoPermanente que llama al constructor de la clase padre Empleado
    public EmpleadoPermanente(String nombre, String id, String puesto, double salario) {
        super(nombre, id, puesto);
        this.salario = salario;
    }

    // Getter y Setter para el atributo salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Metodo toString para incluir el salario en la descripcion
    @Override

    public String toString() {
        return super.toString() + ", Salario=" + salario;
    }

}
