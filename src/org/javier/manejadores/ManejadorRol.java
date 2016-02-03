/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javier.manejadores;

import org.javier.bean.Rol;
import org.javier.conexion.Conexion;

/**
 *
 * @author javie_000
 */
public class ManejadorRol {

    public boolean crear(Rol rol) {
        boolean respuesta = false;
        if (rol.getNombre() != null) {
            try {
                Conexion.getInstancia().ejecutarSentencia(
                        "insert into rol(nombre) values('"
                        + rol.getNombre() + "')");
                respuesta = true;
            } catch (Exception ex) {
            }
        }
        return respuesta;
    }

}
