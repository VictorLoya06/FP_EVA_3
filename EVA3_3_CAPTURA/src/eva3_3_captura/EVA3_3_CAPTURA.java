/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_captura;
import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturarTexto ("Introduce el nombre");
        String apellido = capturarTexto ( "Introduce el apellido");
        System.out.println("Nombre:"+ nombre);
        System.out.println("Apellido: "+ apellido);
    }
    
   public static String capturarTexto(String mensaje){
    Scanner captu =new Scanner(System.in);
    String texto;
    System.out.println(mensaje); 
    texto = captu.nextLine();
    return texto;
    }
   
}
