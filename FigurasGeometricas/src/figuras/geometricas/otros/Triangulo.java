/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.geometricas.otros;

import figuras.geometricas.base.Punto;

/**
 *
 * @author carlo
 */
public class Triangulo {
    private Punto verticeA;
    private Punto verticeB;
    private Punto verticeC;
    
    public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC)
    {
        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.verticeC = verticeC;
    }

    public Punto getVerticeA() {
        return verticeA;
    }

    public void setVerticeA(Punto verticeA) {
        this.verticeA = verticeA;
    }

    public Punto getVerticeB() {
        return verticeB;
    }

    public void setVerticeB(Punto verticeB) {
        this.verticeB = verticeB;
    }

    public Punto getVerticeC() {
        return verticeC;
    }

    public void setVerticeC(Punto verticeC) {
        this.verticeC = verticeC;
    }
    
    public int ladoA()
    {
        return verticeB.distancia(verticeC);
    }
    
    public int ladoB()
    {
        return verticeA.distancia(verticeC);
    }
    
    public int ladoC()
    {
        return verticeB.distancia(verticeA);
    }
}
