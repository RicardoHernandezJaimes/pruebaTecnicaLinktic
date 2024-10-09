package com.app.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.dtos.AseguradoDTO;
import com.app.api.dtos.LiquidacionDTO;
import com.app.api.services.LiquidacionAmparoService;

@RestController
@RequestMapping("/api/liquidacion")
public class LiquidacionAmparosController {
	
	@Autowired
	private LiquidacionAmparoService liquidacionAmparoService;
	
	@PostMapping
	public LiquidacionDTO calcularLiquidacion(@RequestBody AseguradoDTO request) {
        return liquidacionAmparoService.calcularLiquidacion(request);
    }

}
