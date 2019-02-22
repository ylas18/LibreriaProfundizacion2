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
public class Libro {
    /**
     * Esta variable identifica de modo unico a cada libro ingresado
     */
    private int idLibro;
    /**
     * Esta variable almacena el nombre de cada libro
     */
    private String nombre;
    /**
     * Esta variable almacena el nombre del autor de cada libro ingresado
     */
    private String autor;
    /**
     * Esta variable almacena el nombre de la editorial de cada libro
     */
    private String editorial;
    /**
     * Esta variable almacena el costo de cada libro
     */
    private double costo;

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
