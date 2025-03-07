/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;


import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
import Helpers.HelperValidacion;
import Helpers.HelperImpresion;
import java.util.Scanner;

/**
 *
 * @author maryt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String id, nombre, apellido;
        String idProducto, nombreProducto, descripcion;
        Persona objPersona;
        Producto objProducto;
        int rta, conteo;
        //definimos las variables y los objetos
        
        
        System.out.println("Digite el nombre del producto");
        nombreProducto = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(nombreProducto);

        while (rta > 0) {
            System.out.println("Digite el nombre del producto");
            nombreProducto = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(nombreProducto);
        }

        conteo = HelperValidacion.ValidarTodo(nombreProducto);

        while (conteo != 0) {
            System.out.println("Digite el nombre del producto");
            nombreProducto = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombreProducto);
        }
        // termina nombre del producto 
        
         System.out.println("Digite el id del producto");
        idProducto = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(idProducto);

        while (rta > 0) {
            System.out.println("Digite el id del producto");
            idProducto = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(idProducto);
        }

        conteo = HelperValidacion.ValidarTodoLetra(idProducto);

        while (conteo != 0) {
            System.out.println("Digite el id del producto");
            idProducto = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(idProducto);
        }
        // termina id del producto
        
        System.out.println("Digite la descripcion del producto");
        descripcion = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(descripcion);

        while (rta > 0) {
            System.out.println("Digite la descripcion del producto");
            descripcion = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(descripcion);
        }
        
        conteo = HelperValidacion.ValidarTodo(descripcion);

        while (conteo != 0) {
            System.out.println("Digite la descripcion del producto");
            descripcion = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(descripcion);
        }
        //termina descripción del producto
        
        objProducto = new Producto(idProducto, nombreProducto, descripcion);
        //se guarda todo lo ingresado en la variable objProducto

        System.out.println("Digite el nombre del comprador");
        nombre = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("Digite el nombre del comprador");
            nombre = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);
        }

        conteo = HelperValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("Digite el nombre del comprador");
            nombre = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombre);
        }
        //termina nombre de la persona 
        
        System.out.println("Digite el apellido del comprador");
        apellido = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(apellido);

        while (rta > 0) {
            System.out.println("Digite el apellido del comprador");
            apellido = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(apellido);
        }

        conteo = HelperValidacion.ValidarTodo(apellido);

        while (conteo != 0) {
            System.out.println("Digite el apellido del comprador");
            apellido = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(apellido);
        }
        //termina apellido de la persona
        
        System.out.println("Digite el id del comprador");
        id = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(id);

        while (rta > 0) {
            System.out.println("Digite el id del comprador");
            id = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(id);
        }

        conteo = HelperValidacion.ValidarTodoLetra(id);

        while (conteo != 0) {
            System.out.println("Digite el id del comprador");
            id = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(id);
        }
        //termina id de la persona
        
        objPersona = new Persona(id, nombre, apellido, objProducto);
        //se guarda todo lo ingresado en la variable objPersona
        
        Helpers.HelperImpresion.ImprimirPersona(objPersona);
        //se imprimen los datos guardados con la ayuda del HelperImpresion
    }
}
