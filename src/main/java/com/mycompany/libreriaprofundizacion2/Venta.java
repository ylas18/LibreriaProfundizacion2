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
public class Venta {
    /**
     * Esta variable identifica con un id cada venta realizada en la libreria
     */
    private int idVenta;
    /**
     * Esta variable identifica la factura en la que esta cada venta
     */
    private int idFactura;
    /**
     * Esta variable almacena el identificador de cada libro que esta alamacenado
     */
    private int idLibro;
    /**
     * Esta variable almacena la cantidad de libros que se venden
     */
    private int cantidad;
    /**
     * Esta variable almacena el total de las ventas
     */
    private double total;

    /**
     * Este contructor recilbe los parametros minimos para ejecutar los metodos que estan en la clase Venta
     * @param idVenta
     * @param idFactura
     * @param idLibro
     * @param cantidad
     * @param total 
     */
    public Venta(int idVenta, int idFactura, int idLibro, int cantidad, double total) {
        this.idVenta = idVenta;
        this.idFactura = idFactura;
        this.idLibro = idLibro;
        this.cantidad = cantidad;
        this.total = total;
    }
    
    /**
     * Este metodo consulta que libro a sido mas vendido
     */
    public void consultarLibroMasVendido(){
    }
    
    /**
     * Este metodo consulta que libro a sido menos vendido
     */
    public void consultarLibroMenosVendido(){
    }

    
    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
}
