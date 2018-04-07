/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author DanielLeonardo
 */


//Clase Publica de tipo Producto
public class Producto {
    //Declaro los atributo de mi objeto producto
    private int id, costo, cantidad;
    private String nombre, tipo, proveedor, estado;
    //Inicializo el constructor con los valores que le mandare
    public Producto(int id, int costo, int cantidad, String nombre, String tipo, String proveedor, String estado) {
        this.id = id;
        this.costo = costo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.tipo = tipo;
        this.proveedor = proveedor;
        this.estado = estado;
    }
    //Getters
    public int getId() {
        return id;
    }

    public int getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getEstado() {
        return estado;
    }
    
    //Setters

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}


