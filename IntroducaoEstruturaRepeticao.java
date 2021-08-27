import java.util.Scanner;

public class IntroducaoEstruturaRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite o Numero Inicial: ");
		int numeroInicial = entrada.nextInt();
		
		System.out.println("Digite o Numero Final: ");
		int numeroFinal = entrada.nextInt();
		
		int numeroAtual = numeroInicial;
		
		// Usando While
		
		while (numeroAtual <= numeroFinal) {
			
			System.out.println("Numero Atual: " + numeroAtual);
			numeroAtual++;			
		}
		
		// Usando For
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("O valor de [ i ] é: "+ i);
		}	
	
	}

}
