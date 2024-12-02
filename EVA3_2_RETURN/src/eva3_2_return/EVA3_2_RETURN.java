/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_return;

/**
 *
 * @author noziv
 */
public class EVA3_2_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { }

    int valor;
    valor = sumardosenteros(100, 50);
    
    System.out.pritln("RESULTADO =" + valor );
    
    System.out.pritln("RESULTADO =" + sumardosenteros(100,50));
    
    sumardosenteros(100, 50);

    public static int sumardosenteros(int num1, int num2) {
      int resu;
      resu= num1 + num2;
      return resu;
    } 
}   

