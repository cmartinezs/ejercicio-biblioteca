/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.claseinterna;

/**
 *
 * @author carlo
 */
public class ClaseExterna 
{
    private int atributoExterno;

    public int getAtributoExterno() {
        return atributoExterno;
    }

    public void setAtributoExterno(int atributoExterno) {
        this.atributoExterno = atributoExterno;
    }
    
    class ClaseInterna
    {
        int atributoInterno;

        public int getAtributoInterno() {
            return atributoInterno;
        }

        public void setAtributoInterno(int atributoInterno) {
            this.atributoInterno = atributoInterno;
        }
        
        public void mostrarAtributosInternosYExternos()
        {
            System.out.println("atributoExterno = " + atributoExterno);
            System.out.println("atributoInterno = " + atributoInterno);
        }
    }
}
