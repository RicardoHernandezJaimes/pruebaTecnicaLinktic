package com.app.api.dtos;

import java.math.BigDecimal;

public class AmparoLiquidacionDTO {
	
	private long codigoAmparo;
	private String nombreAmparo;
	private BigDecimal valorPrima;
	
	public long getCodigoAmparo() {
		return codigoAmparo;
	}
	public void setCodigoAmparo(long codigoAmparo) {
		this.codigoAmparo = codigoAmparo;
	}
	public String getNombreAmparo() {
		return nombreAmparo;
	}
	public void setNombreAmparo(String nombreAmparo) {
		this.nombreAmparo = nombreAmparo;
	}
	public BigDecimal getValorPrima() {
		return valorPrima;
	}
	public void setValorPrima(BigDecimal valorPrima) {
		this.valorPrima = valorPrima;
	}
	
	

}
