/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author luisk
 */
public class Persona {
    String id, nombre, apellido;
    Producto objProducto;
    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, Producto objProctucto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.objProducto = objProctucto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Producto getObjProctucto() {
        return objProducto;
    }

    public void setObjProctucto(Producto objProctucto) {
        this.objProducto = objProctucto;
    } 
}
