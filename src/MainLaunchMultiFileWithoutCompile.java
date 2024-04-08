import classForLaunchMultiFile.test;

import java.util.Arrays;

public class MainLaunchMultiFileWithoutCompile {
    public static void main(String[] args) {
        System.out.println("Se puede ejecutar solo con: $java MainLaunchSingleFileWithoutCompile ");
        System.out.println("A partir de Java 22 (JEP 458) soporta multiples archivos sin compilación.");
        Integer sumArguments = Arrays.stream(args).mapToInt(Integer::parseInt).sum();
        System.out.println("Resultado: ");
        System.out.println(sumArguments);
        //  Java 22 > Primero si o si se debe compilar la clase <= Java 11
        //  $ javac MainLaunchSingleFileWithoutCompile.java
        // Java 22 =< funciona "multi-file".
        test t = new test();
        t.sum();
    }
}