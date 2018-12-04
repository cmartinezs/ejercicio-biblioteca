/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.geometricas.circunferencia;

import figuras.geometricas.base.Punto;

/**
 *
 * @author carlo
 */
public class Circulo {
    private Punto centro;
    private int radio;
    
    public Circulo(Punto punto, int valorRadio)
    {
        centro = punto;
        radio = valorRadio;
    }
    
    public Circulo(int x, int y, int r) {
        centro = new Punto(x, y);
        radio = r;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int obtenerCoordenadaX()
    {
        return centro.getX();
    }
    
    public int obtenerCoordenadaY()
    {
        return centro.getY();
    }
    
    public int calcularPerimetro()
    {
        // 2 * pi * r;
        int perimetro = 2 * (int)(Math.PI * radio);
        return perimetro;
    }
    
    public int calcularArea()
    {
        // pi * r^2
        int area = (int)(Math.PI * (radio * radio));
        return area;
    }
}
