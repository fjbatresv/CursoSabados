/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javier.sistema;

import javafx.application.Application;
import org.javier.ui.Login;

/**
 *
 * @author javie Esta clase es la clase de arranque de la aplicacion la clase
 * principal
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Login.class, args);
//        Rol rol = new Rol();
//        rol.setNombre("Administrador");
//        ManejadorRol manejado = new ManejadorRol();
//
//    boolean respuesta = manejado.crear(rol);
//    System.out.println(respuesta);
        //Aqui utilizamos en base a la clase onexion y su UNICA instancia para hacer un select rapido al resultset
//        ResultSet resultado = Conexion.getInstancia().hacerConsulta("select rol.nombre from rol;");
//        try {
//            //de esta forma enviamos a imprimir en la consola cada resulado obtenido de la base de datos.
//            while(resultado.next()){
//                System.out.println(resultado.getString("nick"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
