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

public class Login {
    private String usuario, codigo;

    public Login(String usuario, String codigo) {
        this.usuario = usuario;
        this.codigo = codigo;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
    
}
