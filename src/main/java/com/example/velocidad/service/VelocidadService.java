package com.example.velocidad.service;

import com.example.velocidad.controller.VelocidadRequest;
import com.example.velocidad.controller.VelocidadResponse;

public interface VelocidadService {
    VelocidadResponse respuesta(VelocidadRequest velocidadRequest);
}
