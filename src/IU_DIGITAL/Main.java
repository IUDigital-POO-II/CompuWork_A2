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
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}