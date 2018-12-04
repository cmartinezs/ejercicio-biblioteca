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
public class Calculos {
    
    public static void main(String[] args) {
        Circulo c = new Circulo(0,0,5);
        int perimetro = c.calcularPerimetro();
        System.out.println("El perimetro es: " + perimetro);
        int area = c.calcularArea();
        System.out.println("El area es: " + area);

        Punto p0 = new Punto();
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(5, 7);
        int distancia = p1.distancia(p2);
        System.out.println("La distancia entre p1 y p2 es: " + distancia);
        
        c.setCentro(p1);
        Punto p4 = new Punto(2, 3);
        System.out.println("C: (" + c.obtenerCoordenadaX() + ", " + c.obtenerCoordenadaY() + ")");
        System.out.println("P1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("P4: (" + p4.getX() + ", " + p4.getY() + ")");
        
        p1.asignarCoordenadas(20, 40);
        System.out.println("C: (" + c.obtenerCoordenadaX() + ", " + c.obtenerCoordenadaY() + ")");
        System.out.println("P1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("P4: (" + p4.getX() + ", " + p4.getY() + ")");
        
        System.out.println("C: (" + c.getCentro() + ")");
        System.out.println("P1: (" + p1 + ")");
        System.out.println("P4: (" + p4 + ")");
    }  
}
