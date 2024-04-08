/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arg;

/**
 *
 * @author nazareno
 */
public class arg_null extends arg_abstract {
    private String msg;
    public void run()
    {
        msg = "Parametros disponibles: "+ System.getProperty("line.separator") +
        "file_input: Lee un archivo."+ System.getProperty("line.separator") +
        "file_input_to_csv: Lee un archivo y lo convierte a csv."+ System.getProperty("line.separator") +
        "file_input_write_to_csv: Lee un archivo y lo graba como csv."+ System.getProperty("line.separator") +
        "http_get: Ejecuta llamada http por get. ";
    }
    public String getResult()
    {
        return this.msg;
    }
}
