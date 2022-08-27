package com.example.velocidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.velocidad.service.VelocidadService;


@RestController
@RequestMapping("/velocidad")
public class VelocidadController {
        
    private final VelocidadService velocidadService;
    public VelocidadController(@Autowired VelocidadService velocidadService){
        this.velocidadService = velocidadService;
    }

    @PostMapping
    public ResponseEntity<VelocidadResponse> respuesta(@RequestBody VelocidadRequest velocidadRequest){
        return ResponseEntity.ok(velocidadService.respuesta(velocidadRequest));
    }

}
