/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Ejecutable05 {
    public static void main(String[] args) {
        Hospital miHospital = new Hospital();
        Scanner sc = new Scanner(System.in);
        
        // Dar valores a los atributos
        // los valores ingresar por teclado
        System.out.print("Ingrese nombre de hospital: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese número de camas: ");
        int numCamas = sc.nextInt();
        System.out.print("Ingrese el presupuesto: ");
        double presupuesto = sc.nextDouble();
        
        miHospital.establecerNombre(nombre);
        miHospital.establecerNumeroCamas(numCamas);
        miHospital.establecerPresupuesto(presupuesto);
        
        // presentar los valores del objeto
        System.out.printf("%s - %d - %.2f\n",miHospital.obtenerNombre(),
                miHospital.obtenerNumeroCamas(),miHospital.obtenerPresupuesto());
    }
}
