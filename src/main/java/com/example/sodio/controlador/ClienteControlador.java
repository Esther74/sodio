/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.controlador;

import com.example.sodio.entidades.Cliente;
import com.example.sodio.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author soporte
 */

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    
    @GetMapping
    public Iterable<Cliente> findAll(){
        return clienteRepositorio.findAll();
    }
}
