package br.edu.unidep.bancario.model;

public class ContaCorrente extends Conta {
	
	private String gerente;
	private Double limite;
	
	
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		return "ContaCorrente [gerente=" + gerente + ", limite=" + limite + ", toString()=" + super.toString() + "]";
	}
	
	

	

}
