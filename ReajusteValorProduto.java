
public class ReajusteValorProduto {

	public static void main(String[] args) {
		double valorCoca = 2.80;
		double valorAgua = 1.25;
		double valorBrahma = 2.30;
		
		double reajusteCoca = 110;
		double reajusteAgua = 50;
		double reajusteBrahma = 80;
		
		double valorFinalCoca = valorCoca + (valorCoca * (reajusteCoca / 100));
		double valorFinalAgua = valorAgua + (valorAgua * (reajusteAgua / 100));
		double valorFinalBrahma = valorBrahma + (valorBrahma * (reajusteBrahma / 100));
		
		System.out.println("Valor da Coca é: "+ valorFinalCoca);
		System.out.println("Valor da Água é: "+ valorFinalAgua);
		System.out.println("Valor da Brahma é: "+ valorFinalBrahma);
						
	}

}
