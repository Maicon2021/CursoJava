import java.util.Locale;
import java.util.Scanner;

public class IntroducaoEstruturaCondicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);//USAR NUMERO COM PONTO
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("O IMC do " + nome +
				" é: " + imc);
		
		if (imc < 18.5){
			System.out.println("Abaixo do Peso Ideal...");
		} else if (imc < 25) {
			System.out.println("Peso Ideal...");
		} else if (imc < 30) {
			System.out.println("Acima do Peso...");
		} else if (imc < 40) {
			System.out.println("Obsidade...");
		}
		
		//estrutura com controle 'SWITCH'
		
		Scanner placa = new Scanner(System.in);
		
		System.out.println("Digite o Final da Placa: ");
		int finalPlaca = placa.nextInt();
		
		switch(finalPlaca) {
		case 1:
			System.out.println("Pagar IPVA em Janeiro.");
			break;
		case 2:
			System.out.println("Pagar IPVA em Fevereiro.");
			break;
		case 3:
			System.out.println("Pagar IPVA em Março.");
			break;
		case 4:
			System.out.println("Pagar IPVA em Abril.");
			break;
		case 5:
			System.out.println("Pagar IPVA em Maio.");
			break;
		default:
			System.out.println("Vencimento sem data, desculpe!!!");
		}
	}

}
