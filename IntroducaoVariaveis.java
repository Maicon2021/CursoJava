
public class IntroducaoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Teste");
		
		/*int quantidade; //correto
		int quantidade_alunos;
		int QuantidadeAlunos;// ERRO, errado.
		int quantidadeAlunos; // correto.
		int quantidadeAlunosPorTurmas; //correto
		*/
		
		float valorProduto = 123.55f;// precisa formatar com F
		double valorVenda = 3333.33; // double não nescessita ou se preferir d
		int total = 10;
		System.out.printf("O valor [" + total + "] Somado com 3, é: " + (total + 3));
		total += 3;
		System.out.printf("\nO valor [" + total + "] Subtraindo 2, é: " + (total - 2));
		total -= 2;
		System.out.printf("\nO valor [" + total + "] Multiplicando por 3, é: " + (total *3));
		total *= 3;
		System.out.printf("\nO valor [" + total + "] Dividido por 3, é: " + (total / 3));
		total /= 3;
		System.out.printf("\nO valor [" + total + "] Resto da divisão por 5, é: " + (total % 5));
	}

}
