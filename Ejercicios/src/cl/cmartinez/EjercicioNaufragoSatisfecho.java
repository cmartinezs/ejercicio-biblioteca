/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EjercicioNaufragoSatisfecho 
{
    public static void main(String[] args) 
    {
        final String tipoPagoTC = "TC";
        final String tipoPagoE = "E";
        
        final String tipoS = "S";
        final String tipoD = "D";
        final String tipoT = "T";
        
        final double valorS = 20;
        final double valorD = 25;
        final double valorT = 28;
        final double recargoTC = 0.05;
        
        int cantTipoS = 0;
        int cantTipoD = 0;
        int cantTipoT = 0;
        
        System.out.println("¡Bienvenidos al \"Náufrago Satisfecho\"!");
        System.out.println("========================================");
        System.out.println();
        
        System.out.println("Menú");
        System.out.println("====");
        System.out.println();
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("¿Cuántas hamburguesas desea comprar?: ");
        
        int cantidadHamburguesas = lector.nextInt();
        
        double sumaPedido = 0;
        
        for(int i = 0; i < cantidadHamburguesas; i++)
        {
            String tipoHamburguesa;
            boolean tipoCorrecto;
            double valorHamburguesa = 0;
            
            do 
            {                
                System.out.print("Hamburguesa " + (i + 1) + " ¿Qué tipo? (S, D, T): ");
                tipoHamburguesa = lector.next();
                tipoCorrecto = true;
                if(tipoHamburguesa.equalsIgnoreCase(tipoS))
                {
                    valorHamburguesa = valorS;
                    cantTipoS++;
                }
                else if (tipoHamburguesa.equalsIgnoreCase(tipoD))
                {
                    valorHamburguesa = valorD;
                    cantTipoD++;
                }
                else if (tipoHamburguesa.equalsIgnoreCase(tipoT))
                {
                    valorHamburguesa = valorT;
                    cantTipoT++;
                }
                else
                {
                    tipoCorrecto = false;
                    System.out.println("Tipo de hamburguesa '" + tipoHamburguesa + "' no válido!");
                }
            } 
            while (!tipoCorrecto);
            
            sumaPedido = sumaPedido + valorHamburguesa;
        }
        
        System.out.println("Hamburguesas S: " + cantTipoS + ", Subtotal: " + (cantTipoS * valorS));
        System.out.println("Hamburguesas D: " + cantTipoD + ", Subtotal: " + (cantTipoD * valorD));
        System.out.println("Hamburguesas T: " + cantTipoT + ", Subtotal: " + (cantTipoT * valorT));
        System.out.println("Subtotal pedido: " + sumaPedido);
        
        String tipoPago;
        boolean tipoPagoIncorrecto; 
        do 
        {
            tipoPagoIncorrecto = false;
            System.out.print("Indique tipo de pago (TC: tarjeta de crédito, E: Efectivo): ");
            tipoPago = lector.next();
            
            if(tipoPago.equalsIgnoreCase(tipoPagoTC))
            {
                sumaPedido = sumaPedido * (1 + recargoTC);
                System.out.println("Recargo por TC: " + (sumaPedido * recargoTC));
            }
            else if(!tipoPago.equalsIgnoreCase(tipoPagoE))
            {
                tipoPagoIncorrecto = true;
                System.out.println("Tipo de pago '" + tipoPago + "' no válido!");
            }
        } 
        while (tipoPagoIncorrecto);
        
        System.out.println("Total pedido: " + sumaPedido);
    }
}
