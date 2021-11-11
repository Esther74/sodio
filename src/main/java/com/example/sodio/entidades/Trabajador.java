/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author soporte
 */

/*

INSERT INTO trabajador (id, nombre, apellido, email) VALUES
  (1,'javi', 'casanueva', 'javi@email.com'),
  (2,'carlos', 'gonzalez', 'carlos@email.com'),
  (3,'eva', 'remedios', 'eva@email.com');

*/


@Entity

@Table
public class Trabajador {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="email")
    private String email;

    
    //constructor vacio
    public Trabajador() {
      
    }
    
    //constructor
    public Trabajador(String nombre, String apellido, String email) {
        
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    //getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    

    

 
    
    
    
}
