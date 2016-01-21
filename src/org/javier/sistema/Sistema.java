/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javier.sistema;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.javier.conexion.Conexion;

/**
 *
 * @author javie
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResultSet resultado = Conexion.getInstancia().hacerConsulta("select usuario.nick from usuario;");
        try {
            while(resultado.next()){
                System.out.println(resultado.getString("nick"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
