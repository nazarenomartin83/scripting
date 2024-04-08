/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author nazareno
 */
public class arg_file_input_to_csv extends arg_abstract
{
    @Override
    public void run()
    {
        System.out.println("Ejecucion de file_output");
        try {
            String input = "/src/input/fileInput.txt";
            Path path = Path.of(System.getProperty("user.dir")+input);
            msg=convertToCSV(Files.readString(path).split("\r\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String convertToCSV(String[] data)
    {
        return Stream.of(data)
                .map(this::getSpecialCharactects)
                .collect(Collectors.joining("\r\n"));
    }
    private String getSpecialCharactects(String data)
    {
        return data.replace(" ",",");
    }
}
