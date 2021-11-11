/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.error;

//import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import lombok.Value;
import org.springframework.validation.ObjectError;


/**
 *
 * @author soporte
 */

@Value
public class ErrorResponse {
    public static final int GENERIC_ERROR_CODE = 0;
    public static final int VALIDATION_ERROR_CODE = 1;

    public static final ErrorResponse GENERIC_ERROR = new ErrorResponse(GENERIC_ERROR_CODE, "Unknown server exception");

    private Integer errorCode;
    private String errorMessage;

    public static ErrorResponse fromValidationErrors(List<ObjectError> validationErrors) {
        return validationErrors.stream()
                .map(ObjectError::getDefaultMessage)
                .findFirst()
                .map(error -> new ErrorResponse(ErrorResponse.VALIDATION_ERROR_CODE, error))
                .orElse(ErrorResponse.GENERIC_ERROR);
    }
    
    /*
    No necesito poner un constructor por esto: @Value, import lombok.Value
    
    public ErrorResponse(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    */
   

    



    
    
    
    
    
    
}
