package IU_DIGITAL;

public class ReporteDesempenio {
    private Empleado empleado;
    private String evaluacion;

    // Constructor que lanza la excepción si el empleado es nulo
    public ReporteDesempenio(Empleado empleado, String evaluacion) throws ReporteNoGeneradoException {
        if (empleado == null) {
            throw new ReporteNoGeneradoException("No se puede generar el reporte porque el empleado es inexistente.");
        }
        this.empleado = empleado;
        this.evaluacion = evaluacion;

        // Getters y Setters
        public Empleado getEmpleado() {
            return empleado;
        }

        public void setEmpleado(Empleado empleado) {
            this.empleado = empleado;
        }

        public String getEvaluacion() {
            return evaluacion;
        }

        public void setEvaluacion(String evaluacion) {
            this.evaluacion = evaluacion;
        }
}
