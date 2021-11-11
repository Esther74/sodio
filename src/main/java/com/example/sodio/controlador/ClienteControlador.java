/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.controlador;

import com.example.sodio.datos.ClienteDatos;
import com.example.sodio.error.ErrorResponse;
import com.example.sodio.servicio.ClienteServicio;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author soporte
 */

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {
    @Autowired
    ClienteServicio clienteServicio;
    //private ClienteRepositorio clienteRepositorio;
    
    
    @GetMapping("/get")
    public List<ClienteDatos> findAll(){
        return clienteServicio.getClientes();
    }
    
    //{"nombre":"jose luis", "apellido":"sierra", "direccion":"madrid"}
    /*@PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED) //response 201
    public ClienteDatos addCliente(@Valid @NotNull @RequestBody ClienteDatos cliDat){
        clienteServicio.addCliente(cliDat);
        return cliDat;
    }*/
    
    
   //{"nombre":"jose luis", "apellido":"sierra", "direccion":"madrid"}
    @PutMapping("/put")
    @ResponseStatus(HttpStatus.CREATED) //201
    public ClienteDatos addCliente(@Valid @NotNull @RequestBody ClienteDatos cliDat){
        clienteServicio.addCliente(cliDat);
        return cliDat; //si todo va bien que me muestre los datos que he agregado
    }
    
    
    
    
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handle_InvalidClienteDataException(MethodArgumentNotValidException methodArgumentNotValidException) {
        BindingResult bindingResult = methodArgumentNotValidException.getBindingResult();
        List<ObjectError> validationErrors = bindingResult.getAllErrors();

        return ErrorResponse.fromValidationErrors(validationErrors);
    }
    
    
    
}
