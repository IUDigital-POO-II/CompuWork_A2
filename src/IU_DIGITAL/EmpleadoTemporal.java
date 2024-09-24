package IU_DIGITAL;

public class EmpleadoTemporal {
    // Atributo privado duracionContratoMeses de la clase EmpleadoTemporal
    private int duracionContratoMeses;

    // Constructor de la clase EmpleadoTemporal que llama a la clase padre Empleado
    public EmpleadoTemporal(String nombre, String id, String puesto, int duracionContratoMeses) {
        super(nombre, id, puesto);
        this.duracionContratoMeses = duracionContratoMeses;
    }

    // Getter y Setter de la clase EmpleadoTemporal
    public int getDuracionContratoMeses() {
        return duracionContratoMeses;
    }

    public void setDuracionContratoMeses(int duracionContratoMeses) {
        this.duracionContratoMeses = duracionContratoMeses;
    }

}
