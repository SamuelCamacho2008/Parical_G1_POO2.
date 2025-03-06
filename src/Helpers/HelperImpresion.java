/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;

public class HelperImpresion {
    
    public static void ImprimirPersona(Persona ObjPersona)
    {
         System.out.println("El nombre de la persona es:"+"\t"+ObjPersona.getNombre());
        System.out.println("El apellido de la persona es:"+"\t"+ObjPersona.getApellido());
        System.out.println("El id de la persona es:"+"\t"+ObjPersona.getId());
        System.out.println("El nombre del producto es:"+"\t"+ObjPersona.getObjProducto().getNombreProducto());
        System.out.println("El id del producto es:"+"\t"+ObjPersona.getObjProducto().getIdProducto());
        System.out.println("La descripcion del producto es:"+"\t"+ObjPersona.getObjProducto().getDescripcion());
        
    }
    
}
