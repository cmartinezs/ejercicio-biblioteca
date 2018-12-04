/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.geometricas.base;

/**
 *
 * @author carlo
 */
public class Punto {
    private int x;
    private int y;
    
    //Este es el constructor
    public Punto(){
        x = 1;
        y = 1;
    }
    
    public Punto(int valorX, int valorY){
        x = valorX;
        y = valorY;
    }
    
    public void setX(int valorX)
    {
        x = valorX;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setY(int valorY)
    {
        y = valorY;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void asignarCoordenadas(int a, int b)
    {
        //x = a;
        //y = b;
        setX(a);
        setY(b);
    }
    
    public int distancia(Punto otroPunto)
    {
        int catetoA = otroPunto.x - this.x;
        int catetoB = otroPunto.y - this.y;
        int catA2 = catetoA * catetoA;
        int catB2 = catetoB * catetoB;
        int sumaCatetos2 = catA2 + catB2;
        double distancia = Math.sqrt(sumaCatetos2);
        return (int)distancia;
    }
}
