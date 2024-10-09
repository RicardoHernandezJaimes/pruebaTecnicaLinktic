package com.app.api.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.api.dtos.AmparoLiquidacionDTO;
import com.app.api.dtos.AseguradoDTO;
import com.app.api.dtos.LiquidacionDTO;
import com.app.api.models.Amparo;
import com.app.api.models.Asegurado;
import com.app.api.models.Prima;
import com.app.api.repositories.AmparoRepository;
import com.app.api.repositories.AseguradoRepository;
import com.app.api.repositories.PrimaRepository;

@Service
public class LiquidacionAmparoService {
	
	  @Autowired
	  private AseguradoRepository aseguradoRepository;
	  @Autowired
	  private AmparoRepository amparoRepository;
	  @Autowired
	  private PrimaRepository primaRepository;


    public LiquidacionDTO calcularLiquidacion(AseguradoDTO aseguradoDTO) {
    	
    	 if (aseguradoDTO.getValor_asegurado() <= 0) {
             throw new IllegalArgumentException("El valor asegurado debe ser mayor que cero.");
         }

         Asegurado asegurado = aseguradoRepository.findByNumeroIdentificacion(aseguradoDTO.getNro_identificacion());

         // Calcular edad
         LocalDate fechaNacimiento = asegurado.getFechaNacimiento();
         int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();

         // Obtener amparos aplicables
         List<Amparo> amparos =  amparoRepository.findAll();
         List<AmparoLiquidacionDTO> liquidacion = new ArrayList<>();
         BigDecimal valorTotal = BigDecimal.ZERO;

         for (Amparo amparo : amparos) {
        	 List<Prima> primas = primaRepository.findByEdadMinimaLessThanEqualAndEdadMaximaGreaterThanEqual(edad, edad);
             for (Prima prima : primas) {
                 if (prima.getCodigo() == amparo.getId()) {
                     BigDecimal valorPrima = BigDecimal.valueOf(prima.getPorcentaje()).multiply(BigDecimal.valueOf(aseguradoDTO.getValor_asegurado()));
                     valorTotal = valorTotal.add(valorPrima);

                     AmparoLiquidacionDTO liquidacionItem = new AmparoLiquidacionDTO();
                     liquidacionItem.setCodigoAmparo(amparo.getId());
                     liquidacionItem.setNombreAmparo(amparo.getDescripcion());
                     liquidacionItem.setValorPrima(valorPrima);

                     liquidacion.add(liquidacionItem);
                 }
             }
         }

         // Crear objeto de respuesta
         LiquidacionDTO liquidacionDTO = new LiquidacionDTO();
         liquidacionDTO.setTipoIdentificacion(aseguradoDTO.getTipo_identificacion());
         liquidacionDTO.setNroIdentificacion(aseguradoDTO.getNro_identificacion());
         liquidacionDTO.setValorAsegurado(aseguradoDTO.getValor_asegurado());
         liquidacionDTO.setLiquidacion(liquidacion);
         liquidacionDTO.setValorTotal(valorTotal);

         return liquidacionDTO;
    }

}
