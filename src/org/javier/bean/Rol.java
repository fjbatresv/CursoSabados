/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javier.bean;

/**
 *
 * @author javie_000
 */
public class Rol {

    private int id;
    private String nombre;

    public Rol() {
    }

    public Rol(String nombre, int id) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
