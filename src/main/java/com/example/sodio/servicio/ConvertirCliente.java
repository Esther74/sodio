/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.servicio;

import com.example.sodio.datos.ClienteDatos;
import com.example.sodio.entidades.Cliente;
import org.springframework.stereotype.Component;

/**
 *
 * @author soporte
 */

@Component
public class ConvertirCliente {
    
    public ClienteDatos toResponse(Cliente cli){
        ClienteDatos cliDat = new ClienteDatos(cli.getNombre(), cli.getApellido(), cli.getDireccion());
        //ClienteDatos cliDat = new ClienteDatos(cli.getNombre());
        return cliDat;
    }
    
    public Cliente toEntidad(ClienteDatos cliDat){
        Cliente cli = new Cliente(cliDat.getNombre(), cliDat.getApellido(), cliDat.getDireccion());
        //return new Cliente(cliDat.getNombre());
        return cli;
    }
    
}
