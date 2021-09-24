package br.edu.unidep.bancario.model;

import br.edu.unidep.bancario.interfaces.Operacao;

public class ContaSalario extends Conta implements Operacao {
	
	
	public static final double PORCENTAGEM_JUROS = 0.5;
	private Double juros;
	

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}

	@Override
	public String toString() {
		return "ContaSalario [juros=" + juros + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Double calcularJuros(Double valor) {
		
		return valor * PORCENTAGEM_JUROS / 100;
	}

		
	
}
