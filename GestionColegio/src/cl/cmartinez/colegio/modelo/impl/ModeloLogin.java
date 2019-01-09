/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cmartinez.colegio.modelo.impl;

import cl.cmartinez.colegio.modelo.Modelo;

/**
 *
 * @author carlo
 */
public class ModeloLogin implements Modelo
{
    private String username;
    private String password;

    public ModeloLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void cargarDatos()
    {
        this.username = "Carlos";
        this.password = "Carlos2019";
    }


}
