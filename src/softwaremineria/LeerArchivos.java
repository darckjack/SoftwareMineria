package softwaremineria;

import java.io.*;

public class LeerArchivos {
    public static String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena = "";
        String aux;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((aux = b.readLine()) != null) {
            cadena += aux;
        }
        b.close();
        f.close();
        return cadena;
    }

    public static void guardarContenido(String archivo, String info) throws IOException {
        FileWriter f = new FileWriter(archivo);
        BufferedWriter b = new BufferedWriter(f);
        b.write(info);
        f.close();
    }


}