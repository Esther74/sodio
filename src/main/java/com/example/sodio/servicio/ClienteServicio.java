/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.servicio;

import com.example.sodio.datos.ClienteDatos;
import com.example.sodio.entidades.Cliente;
import com.example.sodio.repositorios.ClienteRepositorio;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author soporte
 */

@Service
public class ClienteServicio {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    
    @Autowired
    private ConvertirCliente convertirCliente;
    
    public List<ClienteDatos> getClientes(){
        
        List<Cliente> listCliente = clienteRepositorio
                .findAll();
        
        return listCliente
                .stream()
                .map(convertirCliente::toResponse)
                .collect(Collectors.toList());
        /* 
            return listCliente
                .stream()
                .map(cli -> { return convertirCliente.toResponse(cli); })
                .collect(Collectors.toList());
        */        
    }
    
    public Cliente addCliente(ClienteDatos cliDat){
        Cliente cli = convertirCliente.toEntidad(cliDat);
        clienteRepositorio.save(cli);
        return cli;
    }
    
}
