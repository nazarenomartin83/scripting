import java.util.Arrays;

public class MainLaunchSingleFileWithoutCompile {
    public static void main(String[] args) {
        // Funciona con Java 11 (JEP 330).
        System.out.println("Se puede ejecutar solo con: $java MainLaunchSingleFileWithoutCompile ");
        System.out.println("A partir de Java 11 (JEP 330). Solo soporta un solo archivo sin compilación.");
        Integer sumArguments = Arrays.stream(args).mapToInt(Integer::parseInt).sum();
        System.out.println("Resultado: ");
        System.out.println(sumArguments);
    }
}