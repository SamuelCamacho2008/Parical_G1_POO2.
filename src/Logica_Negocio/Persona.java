/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author luiskandor
 */
public class Persona {
   public String id, nombre, apellido;
    public Producto objProctucto;
    
    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, Producto objProctucto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.objProctucto = objProctucto;
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
        return objProctucto;
    }

    public void setObjProctucto(Producto objProctucto) {
        this.objProctucto = objProctucto;
    } 
}
