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
public class Inventario {
    /**
     * Identificador serial de cada invetario
     */
    private int idInventario;
    /**
     * Arreglo que almacena el identificador de cada libro ingresado
     */
    private int idLibro [];
    /**
     * Almacena la cantidad de libros con los que cuenta la libreria en la bodega
     */
    private int cantidadBodega;
    /**
     * Almacena una constante que indica el minimo de cada libro que se encuetra. Con esta hacemos el control y alerta de minimo en bodega
     */
    private int minimo;

    /**
     * Este constructor recibe los parametros minimos para ejecutar los metodos en esta clase
     * @param idInventario
     * @param idLibro
     * @param cantidadBodega
     * @param minimo 
     */
    public Inventario(int idInventario, int[] idLibro, int cantidadBodega, int minimo) {
        this.idInventario = idInventario;
        this.idLibro = idLibro;
        this.cantidadBodega = cantidadBodega;
        this.minimo = minimo;
    }
   /**
    * Este metodo recible los parametros de la clase Libro para almacenarlos en el arreglo o base de datos segun el caso
    */ 
   public void agregarLibro(){
   }
   /**
    * Este meetodo recible los parametros nuevos y edita la informacion anterior
    */
   public void editarLibro(){
   }
   /**
    * Este metodo recible el parametro identificador y elimina la informacion qu coincida con ese identificador
    */
   public void eliminarLibro(){
   }
   /**
    * Este metodo recoge todos los datos almacenados, los lista y los muestra
    */
   public void consularLibro(){
   }
   /**
    * Este metodo consulta y muestra el libro mas vendido
    */
   public void consularLibroMasCostoso(){
   }
   /**
    * Este metodo consulta y muestra el libro menos vendido
    */
   public void consularLibroMenosCostoso(){
   }

   public int getIdInventario() {
       return idInventario;
   }

   public void setIdInventario(int idInventario) {
       this.idInventario = idInventario;
   }

   public int[] getIdLibro() {
       return idLibro;
   }

   public void setIdLibro(int[] idLibro) {
       this.idLibro = idLibro;
   }

   public int getCantidadBodega() {
       return cantidadBodega;
   }

   public void setCantidadBodega(int cantidadBodega) {
       this.cantidadBodega = cantidadBodega;
   }

   public int getMinimo() {
       return minimo;
   }

   public void setMinimo(int minimo) {
       this.minimo = minimo;
   }
   
   
   
}
