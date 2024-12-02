/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_examen_2da;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA3_5_EXAMEN_2da {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int resu;
     do(
      resu= PedirJugada ("Ingresa la jugada (1-Piedra,2-papel,3-Tijera,0-salir)")
             
             
     )while(resu !=0)  
             
    }
    
    public static int PedirJugada(String mensaje){
    Scanner captu= new Scanner(System.in);
    System.out.println(mensaje);
    int seleccion = captu.nextInt();
    return seleccion;       
    }
    public static int GenerarJugada(){
    int jugada;
    double valor;
    
    if((valor=math.random))
    else if ()
    else if ()
    else if () 
    else if () 
    else if () 
    else if () 
    else if ()
    }
    
}
