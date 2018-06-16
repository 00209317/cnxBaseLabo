/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Filtro {
    private int id;
    
    private String codigo;
    private String Marca;
    private int stock;
    private Boolean esistencia;
    
    public Filtro(){
        
    }

    public Filtro(int id, String codigo, String Marca, int stock, Boolean esistencia) {
        this.id = id;
        this.codigo = codigo;
        this.Marca = Marca;
        this.stock = stock;
        this.esistencia = esistencia;
    }



    public Filtro(String codigo, String Marca, int stock, Boolean esistencia) {
        this.codigo = codigo;
        this.Marca = Marca;
        this.stock = stock;
        this.esistencia = esistencia;
    }

    public Filtro(String Marca, int stock, Boolean esistencia) {
        this.Marca = Marca;
        this.stock = stock;
        this.esistencia = esistencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Boolean getEsistencia() {
        return esistencia;
    }

    public void setEsistencia(Boolean esistencia) {
        this.esistencia = esistencia;
    }
    

    
    
}
