/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.sodio.datos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



/**
 *
 * @author soporte
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ClienteDatos {
    
    //{"nombre":"jose luis", "apellido":"sierra", "direccion":"madrid"}
    
    @Size(min=10, max=10)
    @NotNull
    //@NotBlank //seria mas correcto usar NotBlank? org.hibernate.validator.constraints
    @Pattern(regexp = "[A-Za-z]+",message="El nombre solo puede tener letras, no puede tener numeros")
    private String nombre;
    
    private String apellido;
    private String direccion;

    
    
    
/*
    {"name":null}

    {
        "errorCode": 1,
        "errorMessage": "no debe ser nulo"
    }
*/

/* si utilizo @Length(min=10, max=10)
    {"name":"abc"}
    //import org.hibernate.validator.constraints.Length;
    {
        "errorCode": 1,
        "errorMessage": "la longitud debe estar entre 10 y 10"
    }
*/

/*
import javax.validation.constraints.Size;
@Size(min=10, max=10)
    {"name":"abc"}

    {
        "errorCode": 1,
        "errorMessage": "el tamaño debe estar entre 10 y 10"
    }
*/


/*        
    {"name":"1234567891"}        
    {
        "errorCode": 1,
        "errorMessage": "El name solo puede tener letras, no puede tener numeros"
    }

*/
    
/*
MUY IMPORTANTE

PARA QUE FUNCIONEN LAS VALIDACIONES

EN EL POM ASEGURARME QUE ESTA ES LA DEPENDENCIA

<dependency>
	  <groupId>org.hibernate.validator</groupId>
	  <artifactId>hibernate-validator</artifactId>
	  <version>6.1.7.Final</version>
	  <type>jar</type>
	 </dependency
<dependency>
*/    
    
    
}
