import java.util.Locale;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//USAR NUMERO COM PONTO
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o quantos Sal�rios voc� recebe? ");
		float quantosSalario = entrada.nextFloat();
		
		double salarioMinimo = 1045.00;
		
		System.out.println("Sal�rio a Receber: " + salarioMinimo * quantosSalario);	
		

	}

}
