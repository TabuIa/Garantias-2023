/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadegarantias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static sistemadegarantias.Configuracionserver.IPSUCURSAL;
import static sistemadegarantias.Configuracionserver.SUCURSAL;
import static sistemadegarantias.Configuracionserver.NOMBRESUCURSAL;
import static sistemadegarantias.Configuracionserver.TELEFONOSUCURSAL;
import static sistemadegarantias.Configuracionserver.IMPRESORA;

public class Configuracionserver {

    public static String IPSUCURSAL;
    public static String SUCURSAL;
    public static String NOMBRESUCURSAL;
    public static String TELEFONOSUCURSAL;
    public static String IMPRESORA;

}

class Leer_fichero {

    public static void leerconexion() {
        String texto;
        File ruta = new File("C:\\Program Files\\Sistema de Garantias/config.txt");
        if (ruta.exists()) {
            try {
                //  System.out.println(System.getProperty("user.name")); 
                // String user = System.getProperty("user.name");
                //  File archivo = new File("C:\\Users\\" + user + "\\Desktop\\LEEME.txt");
                File archivo = new File("C:\\Program Files\\Sistema de Garantias/config.txt");

                FileReader entrada = new FileReader(archivo);
                BufferedReader br = new BufferedReader(entrada);
                ArrayList arreglo = new ArrayList();
                while ((texto = br.readLine()) != null) {

                    arreglo.add(texto);

                }
                entrada.close();

                IPSUCURSAL = arreglo.get(0).toString();
                SUCURSAL = arreglo.get(1).toString();
                NOMBRESUCURSAL = arreglo.get(2).toString();
                TELEFONOSUCURSAL = arreglo.get(3).toString();
                IMPRESORA = arreglo.get(4).toString();
            } catch (IOException e) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "compruebe que config.TXT EXISTA Y/O tenga los parametros necesarios");
            System.out.println("No se ha encontrado el archivo:en C:\\Program Files\\Sistema de Garantias\\config.txt");
        }
    }
}
