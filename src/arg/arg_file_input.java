/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author nazareno
 */
public class arg_file_input extends arg_abstract
{
    @Override
    public void run() // Inicia la aplicación
    {
        System.out.println("Ejecucion de file_input");
        try {
            String input = "/src/input/fileInput.txt";
            Path path = Path.of(System.getProperty("user.dir")+input);
            msg = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
