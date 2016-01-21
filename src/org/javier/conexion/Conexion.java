/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javier.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author javie
 */
public class Conexion {

    private Connection conexion;
    private Statement statement;
    private static Conexion instancia;

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de clase: " + ex.getMessage());
        } catch (InstantiationException ex) {
            System.out.println("Error de instancia: " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println("Error de acceso: " + ex.getMessage());
        }
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/kattari?user=root");
            statement = conexion.createStatement();
            System.out.println("Conexion realizada con exito!");
        } catch (SQLException ex) {
            System.out.println("Conexion: " + ex.getMessage());
        }
    }

    public ResultSet hacerConsulta(String consulta) {
        ResultSet resultado = null;
        try {
            resultado = statement.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("busqeda | " + e.getMessage());
        }
        return resultado;
    }

    public void ejecutarSentencia(String sentencia) {
        try {
            statement.execute(sentencia);
        } catch (SQLException e) {
            System.out.println("sentencia | " + e.getMessage());
        }
    }

}
