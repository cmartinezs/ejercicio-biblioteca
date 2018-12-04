/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.geometricas;

import figuras.geometricas.base.Punto;
import figuras.geometricas.circunferencia.Circulo;

/**
 *
 * @author carlo
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p = new Punto(5, 10);
        //p.asignarCoordenadas(5, 10);
        System.out.println("Valor x: " + p.getX());
        System.out.println("Valor y: " + p.getY());
        
        p.setX(0);
        p.setY(0);
        
        System.out.println("Valor x: " + p.getX());
        System.out.println("Valor y: " + p.getY());
        
        Circulo c = new Circulo(p, 10);
        //c.setCentro(p);
        //c.setRadio(10);
        
        System.out.println("El radio del circulo es: " + c.getRadio());
        System.out.println("Centro del circulo, coord. x: " + c.obtenerCoordenadaX());
        System.out.println("Centro del circulo, coord. y: " + c.obtenerCoordenadaY());
        
        p.setX(10);
        p.setY(10);
        System.out.println("Cambio de valores en coordenadas!");
        System.out.println("Centro del circulo, coord. x: " + c.obtenerCoordenadaX());
        System.out.println("Centro del circulo, coord. y: " + c.obtenerCoordenadaY());
    }
    
}
