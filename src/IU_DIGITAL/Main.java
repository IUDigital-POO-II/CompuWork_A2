package IU_DIGITAL;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");

            int[] numeros = {1, 2, 3};

            System.out.println("Accediendo al índice 5: " + numeros[5]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}