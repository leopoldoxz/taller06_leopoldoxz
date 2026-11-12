/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String empleado;
        int tipo;
        int aniosServicio;
        double sueldoInicial;
        double porcentaje = 0;
        double incremento = 0;
        double bonificacion = 0;
        double nuevoSueldo = 0;

        System.out.println("Ingrese el nombre del empleado por favor");
        empleado = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado por favor");
        tipo = entrada.nextInt();

        System.out.println("Ingrese los anios de servicio por favor");
        aniosServicio = entrada.nextInt();

        System.out.println("Ingrese el sueldo inicial por favor");
        sueldoInicial = entrada.nextDouble();

        switch (tipo) {
            case 1:
                porcentaje = 5;
                break;

            case 2:
                porcentaje = 7;
                break;

            case 3:
                porcentaje = 9;
                break;

            case 4:
                porcentaje = 12;
                break;

            default: 
                porcentaje = 15;
                break;
        }

        if (aniosServicio < 2) {
            bonificacion = 0.00;
        } else {
            if (aniosServicio < 5) {
                bonificacion = 30.00;
            } else {
                if (aniosServicio < 10) {
                    bonificacion = 60.00;
                } else {
                    bonificacion = 100.00;
                }
            }
        }

        incremento = (sueldoInicial * porcentaje) / 100;
        nuevoSueldo = sueldoInicial + incremento + bonificacion;

        System.out.printf("\nREPORTE DE INCREMENTO SALARIAL\n\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Anios de servicio: %d\n\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %.0f%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificacion por antiguedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n",
                empleado,
                tipo,
                aniosServicio,
                sueldoInicial,
                porcentaje,
                incremento,
                bonificacion,
                nuevoSueldo);
    }
}