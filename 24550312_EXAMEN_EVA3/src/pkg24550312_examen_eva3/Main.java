/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24550312_examen_eva3;

import java.util.Scanner;

/**
 *
 * @author noziv
 */

public class Main {
    
public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        // el número de estudiantes
        System.out.print("¿Cuál es el total de estudiantes? ");
        int totalEstudiantes = captu.nextInt();

        if (totalEstudiantes <= 0) {
            System.out.println("El número de estudiantes debe ser mayor a 0.");
            return;
        }
        int[] calificaciones = new int[totalEstudiantes];

        // las calificaciones de los estudiantes
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            int cal = captu.nextInt();

            if (cal < 0 || cal > 100) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                i--; // Repetir la entrada para este estudiante
            } else {
                calificaciones[i] = cal;
            }
        }

        // el promedio
        double promedio = calcularPromedio(calificaciones);
        System.out.println("Promedio de calificaciones: " + promedio);

        // la calificación más alta
        int calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);
        System.out.println("Calificación más alta: " + calificacionMasAlta);

        // la calificación más baja
        int calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);
        System.out.println("Calificación más baja: " + calificacionMasBaja);

        // estudiantes tienen calificación mayor o igual al promedio
        int cantidadMayoresAlPromedio = contarCalificacionesMayoresAlPromedio(calificaciones, promedio);
        System.out.println("Número de estudiantes con calificación mayor o igual al promedio (con error): " + cantidadMayoresAlPromedio);
    }
    //  calcular el promedio 
    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int cal : calificaciones) {
            suma += cal;
        }
        return (double) suma / calificaciones.length;
    }

    // la calificación más alta
    public static int obtenerCalificacionMasAlta(int[] calificaciones) {
        int max = calificaciones[0];
        for (int cal : calificaciones) {
            if (cal > max) {
                max = cal;
            }
        }
        return max;
    }

    // la calificación más baja
    public static int obtenerCalificacionMasBaja(int[] calificaciones) {
        int min = calificaciones[0];
        for (int cal : calificaciones) {
            if (cal < min) {
                min = cal;
            }
        }
        return min;
    }

    // cuántos estudiantes tienen calificación mayor o igual al promedio
    public static int contarCalificacionesMayoresAlPromedio(int[] calificaciones, double promedio) {
        int contador = 0;
        for (int cal : calificaciones) {
            
            if (cal <= promedio) { 
                contador++;
            }
        }
        return contador; // Esto devolverá un número incorrecto de calificaciones mayores o iguales al promedio
    }

    
}

    

