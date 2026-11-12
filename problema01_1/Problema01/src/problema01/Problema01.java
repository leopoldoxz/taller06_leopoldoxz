/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

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
        boolean puedeCalcular = true;

        System.out.println("Ingrese el primer numero por favor");
        numero1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero por favor");
        numero2 = entrada.nextDouble();

        System.out.println("Ingrese la operacion que desea realizar\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicacion\n"
                + "4. Division\n"
                + "5. Modulo\n"
                + "6. Potencia");
        opcion = entrada.nextInt();

        if (opcion >= 1 && opcion <= 6) {
            if (numero1 > numero2) {
                if (opcion == 1) {
                    operacion = "Suma";
                    resultado = numero1 + numero2;
                } else {
                    if (opcion == 2) {
                        operacion = "Resta";
                        resultado = numero1 - numero2;
                    } else {
                        if (opcion == 3) {
                            operacion = "Multiplicacion";
                            resultado = numero1 * numero2;
                        } else {
                            if (opcion == 4) {
                                operacion = "Division";
                                resultado = numero1 / numero2;
                            } else {
                                if (opcion == 5) {
                                    operacion = "Modulo";
                                    resultado = numero1 % numero2;
                                } else {
                                    operacion = "Potencia";
                                    resultado = Math.pow(numero1, numero2);
                                }
                            }
                        }
                    }
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
                    System.out.println("\nLa opción seleccionada no es válida.");
                }
            }
        }
    }
}
