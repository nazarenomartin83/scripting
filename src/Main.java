import arg.*;
public class Main {
    public static void main(String[] args) {
        try
        {
            arg ObjetoArgumento;
            if (args.length > 0) // Si envío algun comando como argumento.
            {
                Class<?> ClaseArgumento = Class.forName("arg.arg_"+args[0]); // Obtengo e instancio el primer argumento dinámicamente. Si la clase no existe, entonces el comando envìado es incorrecto. Se cancela la operaciòn.
                var constructor = ClaseArgumento.getConstructor();
                ObjetoArgumento = (arg)constructor.newInstance(); // Se instancia el argumento recibido
                if (args.length > 1) // Si el comando cotiene parametros
                    ((arg)ObjetoArgumento).setParameter(args[1]);
            }
            else // Si no contiene argumentos, define como argumento Null.
                ObjetoArgumento = new arg_null();
            ObjetoArgumento.run(); // Ejecuta la acción correspondiente al argumento recibido.
            System.out.println(ObjetoArgumento.getResult()); // Imprimo el resultado en pantalla.
        }
        catch (ClassNotFoundException e) {System.out.println("Comando no válido. ");}
        catch (NoSuchMethodException e) {System.out.println("Método no válido.");}
        catch (Exception e) {System.out.println("Se generó el siguiente error: "+e.getMessage());}
    }
}