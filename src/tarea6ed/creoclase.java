/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author dani_
 */
public class creoclase {
     public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=DESCUENTILLO;
            if (numProductos!=0){
            Total = precioProducto*0.8;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }else {
            Total = precioProducto*0.95;
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }   

    }
    private static final int DESCUENTILLO = 5;
}
