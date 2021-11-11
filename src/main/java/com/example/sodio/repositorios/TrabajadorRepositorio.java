/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.repositorios;

import com.example.sodio.entidades.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author soporte
 */
public interface TrabajadorRepositorio extends JpaRepository <Trabajador,Integer>{
    
}
