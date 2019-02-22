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
public class Factura {
    /**
     * Almacena la fecha de cracion de la factura
     */
    private String fecha;
    /**
     * Identifica con un id serial cada factura generada
     */
    private int idFactura;
    /**
     * Identifica con un id unico cada cliente que esta almacenado
     */
    private int idCliente;
    /**
     * Identifica con un id unico cada venta que fue creada
     */
    private int idVenta;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
    
    
}


