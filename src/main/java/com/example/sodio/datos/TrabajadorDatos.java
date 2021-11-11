/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.datos;

/**
 *
 * @author soporte
 */
public class TrabajadorDatos {
    private String nombre;
    private String apellido;
    private String email;

    public TrabajadorDatos(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "TrabajadorDatos{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }
    
    
    
}
