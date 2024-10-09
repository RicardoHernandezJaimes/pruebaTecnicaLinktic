package com.app.api.dtos;

import java.math.BigDecimal;
import java.util.List;

public class LiquidacionDTO {
	
	private int tipoIdentificacion;
    private String nroIdentificacion;
    private int valorAsegurado;
    private List<AmparoLiquidacionDTO> liquidacion;
    private BigDecimal valorTotal;
    
    
	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getNroIdentificacion() {
		return nroIdentificacion;
	}
	public void setNroIdentificacion(String nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}
	public int getValorAsegurado() {
		return valorAsegurado;
	}
	public void setValorAsegurado(int valorAsegurado) {
		this.valorAsegurado = valorAsegurado;
	}
	public List<AmparoLiquidacionDTO> getLiquidacion() {
		return liquidacion;
	}
	public void setLiquidacion(List<AmparoLiquidacionDTO> liquidacion) {
		this.liquidacion = liquidacion;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
    
    

}
