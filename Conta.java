package br.edu.unidep.bancario.model;

public class Conta {
	
	private String agencia;
	private String numero;
	private Integer digitoVerificador;
	private Double saldo;
	
	public Conta() {
		super();
		System.out.println("Entrou no Construtor....");
	}

	public Conta(String numero, Integer digitoVerificador) {
		super();
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}
	
	public Conta(String agencia, String numero, Integer digitoVerificador, Double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [Agencia = " + agencia + " Numero = " + numero + "-" + digitoVerificador
				+ " Saldo = " + saldo + "]";
	}
	
		
	
}
