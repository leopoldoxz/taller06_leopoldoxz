/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String propietario;
        int tipo;
        double avaluo;
        String descripcion = "";
        double porcentaje = 0; 
        double valorFijo = 0;
        double valorBase;
        double recargo = 0;
        double total;
        boolean particular = false;
        boolean tipoValido = true;

        System.out.println("Ingrese el nombre del propietario por favor");
        propietario = entrada.nextLine();

        System.out.println("Ingrese el tipo de vehiculo\n"
                + "1. Vehiculo liviano particular\n"
                + "2. Vehiculo grande particular\n"
                + "3. Taxi\n"
                + "4. Bus urbano");
        tipo = entrada.nextInt();

        switch (tipo) {
            case 1:
                descripcion = "Vehiculo liviano particular";
                porcentaje = 0.01;
                valorFijo = 2.00;
                particular = true;
                break;

            case 2:
                descripcion = "Vehiculo grande particular";
                porcentaje = 0.02;
                valorFijo = 2.50;
                particular = true;
                break;

            case 3:
                descripcion = "Taxi";
                porcentaje = 0.04;
                valorFijo = 1.50;
                break;

            case 4:
                descripcion = "Bus urbano";
                porcentaje = 0.05;
                valorFijo = 2.20;
                break;

            default:
                tipoValido = false;
                break;
        }

        if (tipoValido) {
            System.out.println("Ingrese el avaluo comercial del vehiculo por favor");
            avaluo = entrada.nextDouble();

            valorBase = (avaluo * porcentaje) / 100 + valorFijo;

            if (particular && avaluo > 30000) {
                recargo = 1.50;
            }

            total = valorBase + recargo;

            System.out.printf("\nPeaje \"Buena Via\"\n"
                    + "Propietario: %s\n"
                    + "Tipo: %s\n"
                    + "\tAvaluo: $%.2f\n"
                    + "\tValor base del peaje: $%.2f\n"
                    + "\tRecargo: $%.2f\n\n"
                    + "\tTotal a cancelar: $%.2f\n",
                    propietario,
                    descripcion,
                    avaluo,
                    valorBase,
                    recargo,
                    total);
        } else {
            System.out.println("\nEl tipo de vehiculo ingresado no es valido.");
        }

    }

}