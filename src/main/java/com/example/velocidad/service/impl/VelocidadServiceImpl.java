package com.example.velocidad.service.impl;

import org.springframework.stereotype.Service;

import com.example.velocidad.controller.VelocidadRequest;
import com.example.velocidad.controller.VelocidadResponse;
import com.example.velocidad.service.VelocidadService;

@Service
public class VelocidadServiceImpl implements VelocidadService{

    @Override
    public VelocidadResponse respuesta(VelocidadRequest velocidadRequest) {
        Integer velocidadInicial = velocidadRequest.getVelocidadInicial();
        Integer xInicial = velocidadRequest.getxInicial();
        Integer aceleracion = velocidadRequest.getAceleracion();
        Integer tiempo = velocidadRequest.getTiempo();
        Double respuesta = xInicial + velocidadInicial * tiempo + 0.5 * aceleracion * tiempo * tiempo;
        return new VelocidadResponse(respuesta);
    }
}