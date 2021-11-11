/* SODIO
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.controlador;

import com.example.sodio.entidades.Trabajador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.sodio.repositorios.TrabajadorRepositorio;

/**
 *
 * @author soporte
 */
@RestController
@RequestMapping("/trabajador")

public class TrabajadorControlador {
    @Autowired
    private TrabajadorRepositorio trabajadorRepositorio;
    
    @GetMapping
    public Iterable<Trabajador> findAll() {
        return trabajadorRepositorio.findAll();
    }
}
