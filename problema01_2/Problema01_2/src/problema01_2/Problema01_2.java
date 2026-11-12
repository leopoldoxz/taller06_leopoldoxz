/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Problema01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double numero1;
        double numero2;
        int opcion;
        String operacion = "";
        double resultado = 0;
        boolean opcionValida = true;
        boolean puedeCalcular = false;

        System.out.println("Ingrese la operacion que desea realizar\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicacion\n"
                + "4. Division\n"
                + "5. Modulo\n"
                + "6. Potencia");
        opcion = entrada.nextInt();

        System.out.println("Ingrese el primer numero por favor");
        numero1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero por favor");
        numero2 = entrada.nextDouble();

        switch (opcion) {
            case 1:
                if (numero1 > numero2) {
                    operacion = "Suma";
                    resultado = numero1 + numero2;
                    puedeCalcular = true;
                }
                break;

            case 2:
                if (numero1 > numero2) {
                    operacion = "Resta";
                    resultado = numero1 - numero2;
                    puedeCalcular = true;
                }
                break;

            case 3:
                if (numero1 > numero2) {
                    operacion = "Multiplicacion";
                    resultado = numero1 * numero2;
                    puedeCalcular = true;
                }
                break;

            case 4:
                if (numero1 > numero2 && numero2 != 0) {
                    operacion = "Division";
                    resultado = numero1 / numero2;
                    puedeCalcular = true;
                }
                break;

            case 5:
                if (numero1 > numero2 && numero2 != 0) {
                    operacion = "Modulo";
                    resultado = numero1 % numero2;
                    puedeCalcular = true;
                }
                break;

            case 6:
                if (numero1 > numero2) {
                    operacion = "Potencia";
                    resultado = Math.pow(numero1, numero2);
                    puedeCalcular = true;
                }
                break;

            default:
                opcionValida = false;
                System.out.println("\nLa opcion seleccionada no es valida.");
                break;
        }

        if (puedeCalcular) {
            System.out.printf("\nOPERACIONES ARITMETICAS\n\n"
                    + "Primer numero: %.2f\n"
                    + "Segundo numero: %.2f\n"
                    + "Operacion seleccionada: %s\n\n"
                    + "Resultado: %.2f\n",
                    numero1,
                    numero2,
                    operacion,
                    resultado);
        } else {
            if (opcionValida) {
                System.out.println("\nNo es posible realizar la operacion: "
                        + "el primer numero debe ser mayor que el segundo ");
            }
        }
    }
}
