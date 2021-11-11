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
 
  INSERT INTO cliente (id,nombre, apellido, direccion) VALUES
  (1,'esther', 'santos', 'sevilla'),
  (2,'bego', 'gonzalez', 'sevilla'),
  (3,'sandra', 'moya', 'cadiz');
  
 * @author soporte
 */

@Entity
//@Table(name="CLIENTE")
@Table
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="direccion")
    private String direccion;
    
    
    //Como me interesa un constructor con argumentos, pongo de forma explicita el constructor sin argumentos
    public Cliente() {
       
    }
    
    //constructor con argumentos, menos el id
    public Cliente(String nombre, String apellido, String direccion) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    
    //getter and setters
    
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
