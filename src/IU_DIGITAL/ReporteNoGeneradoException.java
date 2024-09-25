package IU_DIGITAL;

// Clase de excepción personalizada que extiende Exception
public class ReporteNoGeneradoException extends Exception {

    // Constructor que recibe un mensaje y lo pasa a Exception
    public ReporteNoGeneradoException(String mensaje) {
        super(mensaje);
    }
}
