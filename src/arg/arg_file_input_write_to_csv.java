/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arg;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author nazareno
 */
public class arg_file_input_write_to_csv extends arg_abstract
{
    @Override
    public void run()
    {
        System.out.println("Ejecucion de file_output");
        try {
            String input = "/src/input/fileInput.txt";
            String output = "/src/output/fileOutputCsv.txt";
            Path path = Path.of(System.getProperty("user.dir")+input);
            msg=convertToCSV(Files.readString(path).split("\r\n"));
            Files.writeString(Path.of(System.getProperty("user.dir")+output),
                    msg, StandardOpenOption.CREATE);
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
