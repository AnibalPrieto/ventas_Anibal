/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author aniba
 */
public class Orden {
    private int IdOrden;
    private ArrayList <Producto> productos;
    int ContadorOrdenes;
    final int MAX_PRODUCTOS=10;

    public Orden() {
        ContadorOrdenes++;
        this.IdOrden=ContadorOrdenes;
        ArrayList <Producto> list= new ArrayList<>();
        this.productos= list;
    }
    
    
    public void AgregProduct(Producto p){
        if (this.productos.size()<MAX_PRODUCTOS) {
            this.productos.add(p);
            System.out.println("Producto añadido correctamente");
        }else{
            System.out.println("Añada un articulo");
        }
    }
    
    public double total(){
        double total=0.00;
        for (Producto i:this.productos) {
            total= total+i.getPrecio();
        }
        System.out.println("El precio total ha pagar= "+total);
        return total;
    }
    
    public void orden(){
        System.out.println("Lista de productos: ");
        for (Producto i:this.productos) {
            System.out.println(i.toString());
            
        }
        
    }
    
    
}
