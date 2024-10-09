package com.app.api.dtos;

public class AseguradoDTO {
	
    private int tipo_identificacion;
    
    private String nro_identificacion;
    
    private int valor_asegurado;

	public int getTipo_identificacion() {
		return tipo_identificacion;
	}

	public void setTipo_identificacion(int tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}

	public String getNro_identificacion() {
		return nro_identificacion;
	}

	public void setNro_identificacion(String nro_identificacion) {
		this.nro_identificacion = nro_identificacion;
	}

	public int getValor_asegurado() {
		return valor_asegurado;
	}

	public void setValor_asegurado(int valor_asegurado) {
		this.valor_asegurado = valor_asegurado;
	}
    
    
    
	
}
