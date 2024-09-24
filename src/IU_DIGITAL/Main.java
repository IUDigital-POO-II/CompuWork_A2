package IU_DIGITAL;

public class Main {
    public static void main(String[] args) {
        try {
            // Creación de departamentos
            Departamento departamentoTI = new Departamento("Tecnología de la Información");
            Departamento departamentoRH = new Departamento("Recursos Humanos");

            // Creación de empleados permanentes
            EmpleadoPermanente empleado1 = new EmpleadoPermanente("Juan Pérez", "E001", "Desarrollador Senior", 5000);
            EmpleadoPermanente empleado2 = new EmpleadoPermanente("Ana Gómez", "E002", "Gerente de TI", 8000);

            // Creación de empleados temporales
            EmpleadoTemporal empleado3 = new EmpleadoTemporal("Carlos Ruiz", "E003", "Desarrollador Junior", 12);

            // Asignación de empleados a departamentos (con manejo de excepciones)
            departamentoTI.agregarEmpleado(empleado1);
            departamentoTI.agregarEmpleado(empleado2);
            departamentoRH.agregarEmpleado(empleado3);

            // Intento de asignar un empleado ya asignado (disparará excepción) Descomentar para probar
            //departamentoTI.agregarEmpleado(empleado1);  // Esto lanzará la excepción

            // Listar empleados por departamento
            departamentoTI.listarEmpleados();
            departamentoRH.listarEmpleados();

            // Creación de reportes de desempeño (con manejo de excepciones)
            ReporteDesempenio reporte1 = new ReporteDesempenio(empleado1, "Excelente desempeño en el último trimestre.");
            ReporteDesempenio reporte2 = new ReporteDesempenio(empleado3, "Buen desempeño, pero necesita mejorar en algunos aspectos.");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}