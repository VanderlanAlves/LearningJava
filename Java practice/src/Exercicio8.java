import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		 *percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 *Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 *escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		 *consumidor.
		 */
		
		//VARIÁVEIS
		double custoInicial, custoFinal;
		double PORCENTAGEM_TOTAL=73;
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o valor do custo de fábrica do carro: ");
		custoInicial=kb.nextDouble();
		
		//CONTAS
		PORCENTAGEM_TOTAL=(PORCENTAGEM_TOTAL/100)*custoInicial;
		
		custoFinal=custoInicial+PORCENTAGEM_TOTAL;
		
		//SAÍDA
		System.out.printf("O custo do carro ao consumidor é de: %.2f reais", custoFinal);
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
	}

}
