/**
 * 
 */
package com.sergiodeluca.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sergio
 *
 */
@RestController
@RequestMapping("/helloworld")
public class HolaMundoControlador {
	
	@GetMapping
	public ResponseEntity<String> helloWorld(){
		return new ResponseEntity("Hola mundo",HttpStatus.OK);
	}

}
