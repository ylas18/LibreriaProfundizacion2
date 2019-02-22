/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libreriaprofundizacion2;

/**
 *
 * @author Yesid Avila
 */
public class Cliente {
    /**
     * Variable serial que identifica cada cliente ingresado
     */
    private int idCliente;
    /**
     * Variable de texto que almacena el nombre del cliente ingresado
     */
    private String nombre;
    /**
     * Variable de texto que almacena la direccion del cliente ingresado
     */
    private String direccion;
    /**
     * Variable de texto que almacena el telefono del cliente ingresado
     */
    private int telefono;
    /**
     * Variable de texto que almacena el correo del cliente ingresado
     */
    private String correo;
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
       
}
