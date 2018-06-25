/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naldana.data.dao;

import com.naldana.data.Connection;
import com.naldana.data.entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DanielLeonardo
 */
public class Materias {
    
    private final String TABLE_NAME = "materias";
    private final String ID = "_id";
    private final String NOMBRE = "nombre";
    private final String UV = "uv";
    
    
    public void insert(Materia materia) {
        java.sql.Connection con = null;
        try {
            con = Connection.getInstance().getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(
                    "INSERT INTO " + TABLE_NAME +
                            "(" + NOMBRE + "," + UV + ")"
                            + " VALUES(?,?)");
            preparedStatement.setString(1, materia.getNombre());
            preparedStatement.setInt(2, materia.getUv());

            preparedStatement.execute();

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
