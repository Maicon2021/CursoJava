package br.edu.unidep.bancario.principal;

import br.edu.unidep.bancario.model.Conta;
import br.edu.unidep.bancario.model.ContaCorrente;
import br.edu.unidep.bancario.model.ContaSalario;

public class Principal {

	public static void main(String[] args) {
		
		Conta contaLucas = new Conta();
		Conta contaAna = new Conta("0495","45953", 5, 100.0);
		Conta contaJoao = new Conta("6", 10);
		
		Conta contaMaria = contaJoao;
		
		
		contaLucas.setAgencia("8452");
		contaLucas.setDigitoVerificador(6);
		contaLucas.setNumero("82632");
		contaLucas.setSaldo(0.9);
		
		System.out.println("Conta Lucas: " + contaLucas.toString());
		System.out.println("Conta Ana: " + contaAna.toString());
		System.out.println("Conta João: " + contaJoao.toString());
		System.out.println("Conta Maria: " + contaMaria.toString());
		
		System.out.println("-----------------------------------------------------------------------");
		
	
		ContaCorrente contaCorrenteLucas = new ContaCorrente();
		
		contaCorrenteLucas.setAgencia("8320");
		contaCorrenteLucas.setDigitoVerificador(5);
		contaCorrenteLucas.setGerente("Marcelo");
		contaCorrenteLucas.setLimite(500.0);
		contaCorrenteLucas.setNumero("278367");
		contaCorrenteLucas.setSaldo(1100.00);
		
		System.out.println("Conta Corrente: " + contaCorrenteLucas);
		
		System.out.println("-----------------------------------------------------------------------");
		
		ContaSalario contaSalarioAna = new ContaSalario();
		
		contaSalarioAna.setAgencia("8320");
		contaSalarioAna.setDigitoVerificador(5);
		contaSalarioAna.setJuros(ContaSalario.PORCENTAGEM_JUROS);		
		contaSalarioAna.setNumero("278367");
		contaSalarioAna.setSaldo(1100.00);
		
		
		System.out.println("Conta Salario Ana: " + contaSalarioAna);
		System.out.println("Juros : " + contaSalarioAna.calcularJuros(5000.00));
	}

}
