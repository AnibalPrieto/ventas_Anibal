/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.Orden;
import dominio.Producto;
import java.util.Scanner;


/**
 *
 * @author aniba
 */
public class ventas {
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        System.out.println("Programa de ventas");
        System.out.println("====================================");
        System.out.println("Añada el nombre del producto: ");
        String nombre = ent.nextLine();
        ent.nextLine();
        System.out.println("Añada el precio del producto: ");
        Double Precio = ent.nextDouble();
        ent.nextLine();
        System.out.println("¿Desea añadir otro producto?");
        String cad=ent.nextLine();
        System.out.println("Añada el nombre de otro producto: ");
        String nombre2 = ent.nextLine();
        ent.nextLine();
        System.out.println("Añada el precio del producto: ");
        Double Precio2 = ent.nextDouble();
        ent.nextLine();
        Producto p1 = new Producto("patata",3.89);
        Producto p2 = new Producto("tomate",1.89);
        Producto p3 = new Producto("Lechuga",0.89);
        Producto p5 = new Producto(nombre2,Precio2);
        Producto p = new Producto(nombre,Precio);
        Orden o1 = new Orden();
        o1.AgregProduct(p3);
        o1.AgregProduct(p1);
        o1.AgregProduct(p2);
        o1.AgregProduct(p5);
        o1.AgregProduct(p);
        o1.orden();
        o1.total();
        System.out.println("");
        System.out.println("Gracias por usar la aplicación");

        
    
        
    }
    
}
