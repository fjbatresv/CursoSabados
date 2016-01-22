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

    //Se declaran las variables segun el estandar de java como privadas
    private Connection conexion;
    private Statement statement;
    private static Conexion instancia;
//a traves de este metodo evitamos se duplique la conexion de db  evitamos tener que manejar aperutra y cierre, se cerrar si sse deja en desuso por mucho
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Conexion() {
        try {
            //primero obtenemos la clase del driver para conexion
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            //esto seria en caso de no encontrar la clase soliciada
            System.out.println("Error de clase: " + ex.getMessage());
        } catch (InstantiationException ex) {
            //aqui se llegara si el error es de instancia de la clase
            System.out.println("Error de instancia: " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            //en este caso es cuando el acceso es ilegal
            System.out.println("Error de acceso: " + ex.getMessage());
        }
        try {
            //aqui creamos una conexion con los parametros necesarios
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/kattari?user=root");
            //si se obtiene la conexion, creamos un statement o un cursor de base de datos.
            statement = conexion.createStatement();
            System.out.println("Conexion realizada con exito!");
        } catch (SQLException ex) {
            System.out.println("Conexion: " + ex.getMessage());
        }
    }

    //Este metodo se hace para obtener un resultado en base a un select, se separa pues se esperaa un resultado.
    public ResultSet hacerConsulta(String consulta) {
        ResultSet resultado = null;
        try {
            resultado = statement.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("busqeda | " + e.getMessage());
        }
        return resultado;
    }

    
    //Este metodo se hace con la ide de no tner una respuesta, ejecutando unicamene la sentencia sql como un insert, update, delete
    public void ejecutarSentencia(String sentencia) {
        try {
            statement.execute(sentencia);
        } catch (SQLException e) {
            System.out.println("sentencia | " + e.getMessage());
        }
    }

}
